import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.text.JTextComponent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.event.ActionEvent;

public class Kart extends JFrame {
	static ArrayList<JButton> fButon = new ArrayList<>();
	static ArrayList<JButton> bButon = new ArrayList<>();
	static boolean kartKullanildiMi;
	private static JPanel contentPane;

	public static void kartlar() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Kart frame = new Kart();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	

	public Kart() {
		kartKullanildiMi = false;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1200, 900);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		getContentPane().setBackground(new java.awt.Color(193, 205, 205));

		JButton b1 = new JButton("");
		b1.setBounds(90, 15, 215, 255);
		contentPane.add(b1);

		JButton b2 = new JButton("");
		b2.setBounds(350, 15, 215, 255);
		contentPane.add(b2);

		JButton b3 = new JButton("");
		b3.setBounds(610, 15, 215, 255);
		contentPane.add(b3);

		JButton b4 = new JButton("");
		b4.setBounds(870, 15, 215, 255);
		contentPane.add(b4);

		JButton b5 = new JButton("");
		b5.setBounds(90, 550, 215, 255);
		contentPane.add(b5);

		JButton b6 = new JButton("");
		b6.setBounds(350, 550, 215, 255);
		contentPane.add(b6);

		JButton b7 = new JButton("");
		b7.setBounds(610, 550, 215, 255);
		contentPane.add(b7);

		JButton b8 = new JButton("");
		b8.setBounds(870, 550, 215, 255);
		contentPane.add(b8);

		JButton vs1 = new JButton("");
		vs1.setBackground(new Color(192, 192, 192));
		vs1.setBounds(324, 280, 215, 255);
		contentPane.add(vs1);

		JButton vs2 = new JButton("");
		vs2.setBackground(new Color(192, 192, 192));
		vs2.setBounds(664, 280, 215, 255);
		contentPane.add(vs2);

		fButon.add(b1);
		fButon.add(b2);
		fButon.add(b3);
		fButon.add(b4);
		bButon.add(b5);
		bButon.add(b6);
		bButon.add(b7);
		bButon.add(b8);

		JLabel Ozellik = new JLabel(" KARSILASTIRILAN OZELLIK");
		Ozellik.setForeground(new Color(128, 0, 0));
		Ozellik.setFont(new Font("Rockwell", Font.PLAIN, 22));
		Ozellik.setBounds(20, 322, 294, 36);
		Ozellik.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		contentPane.add(Ozellik);

		JLabel Skor = new JLabel("SKOR");
		Skor.setForeground(new Color(139, 0, 0));
		Skor.setFont(new Font("Rockwell", Font.PLAIN, 27));
		Skor.setBounds(922, 331, 126, 27);
		contentPane.add(Skor);

		JLabel KullaniciSkor = new JLabel("KULLANICI: 0");
		KullaniciSkor.setFont(new Font("Dubai Medium", Font.PLAIN, 22));
		KullaniciSkor.setBounds(922, 392, 163, 25);
		contentPane.add(KullaniciSkor);

		JLabel BilgisayarSkor = new JLabel("BILGISAYAR: 0");
		BilgisayarSkor.setFont(new Font("Dubai Medium", Font.PLAIN, 22));
		BilgisayarSkor.setBounds(922, 441, 178, 27);
		contentPane.add(BilgisayarSkor);

		JLabel Pozisyon = new JLabel();
		Pozisyon.setFont(new Font("Dubai Medium", Font.PLAIN, 18));
		Pozisyon.setBounds(70, 350, 330, 100);

		for (int i = 0; i < 4; i++) {
			fButon.get(i).setIcon(Test.futbolcular.get(i).getImg());
			contentPane.add(fButon.get(i));
		}
		for (int i = 0; i < 4; i++) {
			bButon.get(i).setIcon(Test.basketbolcular.get(i).getImg());
			contentPane.add(bButon.get(i));
		}
		fButon.get(0).addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (Test.fb % 2 == 0) {
					Kullanici.fsecim = 0;
					vs1.setIcon(Test.futbolcular.get(Kullanici.fsecim).getImg());
					kartKullanildiMi = true;
					fButon.get(0).setEnabled(false);
					vs2.setIcon(Oyuncu.pcSecilenFutbolcular.get(Bilgisayar.fpc).getImg());
					contentPane.add(Pozisyon);
				}
			}
		});

		fButon.get(1).addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (Test.fb % 2 == 0) {
					Kullanici.fsecim = 1;
					vs1.setIcon(Test.futbolcular.get(Kullanici.fsecim).getImg());
					kartKullanildiMi = true;
					fButon.get(1).setEnabled(false);
					vs2.setIcon(Oyuncu.pcSecilenFutbolcular.get(Bilgisayar.fpc).getImg());
					contentPane.add(Pozisyon);

				}
			}
		});

		fButon.get(2).addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (Test.fb % 2 == 0) {
					Kullanici.fsecim = 2;
					vs1.setIcon(Test.futbolcular.get(Kullanici.fsecim).getImg());
					kartKullanildiMi = true;
					fButon.get(2).setEnabled(false);
					vs2.setIcon(Oyuncu.pcSecilenFutbolcular.get(Bilgisayar.fpc).getImg());
					contentPane.add(Pozisyon);
				}
			}
		});

		fButon.get(3).addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (Test.fb % 2 == 0) {
					Kullanici.fsecim = 3;
					vs1.setIcon(Test.futbolcular.get(Kullanici.fsecim).getImg());
					kartKullanildiMi = true;
					fButon.get(3).setEnabled(false);
					vs2.setIcon(Oyuncu.pcSecilenFutbolcular.get(Bilgisayar.fpc).getImg());
					contentPane.add(Pozisyon);
				}
			}
		});

		bButon.get(0).addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (Test.fb % 2 == 1) {
					Kullanici.bsecim = 0;
					vs1.setIcon(Test.basketbolcular.get(Kullanici.bsecim).getImg());
					kartKullanildiMi = true;
					bButon.get(0).setEnabled(false);
					vs2.setIcon(Oyuncu.pcSecilenBasketbolcular.get(Bilgisayar.bpc).getImg());
					contentPane.add(Pozisyon);
				}
			}
		});

		bButon.get(1).addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (Test.fb % 2 == 1) {
					Kullanici.bsecim = 1;
					vs1.setIcon(Test.basketbolcular.get(Kullanici.bsecim).getImg());
					kartKullanildiMi = true;
					bButon.get(1).setEnabled(false);
					vs2.setIcon(Oyuncu.pcSecilenBasketbolcular.get(Bilgisayar.bpc).getImg());
					contentPane.add(Pozisyon);
				}
			}
		});

		bButon.get(2).addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (Test.fb % 2 == 1) {
					Kullanici.bsecim = 2;
					vs1.setIcon(Test.basketbolcular.get(Kullanici.bsecim).getImg());
					kartKullanildiMi = true;
					bButon.get(2).setEnabled(false);
					vs2.setIcon(Oyuncu.pcSecilenBasketbolcular.get(Bilgisayar.bpc).getImg());
					contentPane.add(Pozisyon);
				}
			}
		});

		bButon.get(3).addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (Test.fb % 2 == 1) {
					Kullanici.bsecim = 3;
					vs1.setIcon(Test.basketbolcular.get(Kullanici.bsecim).getImg());
					kartKullanildiMi = true;
					bButon.get(3).setEnabled(false);
					vs2.setIcon(Oyuncu.pcSecilenBasketbolcular.get(Bilgisayar.bpc).getImg());
					contentPane.add(Pozisyon);
				}
			}
		});

		Timer timer = new Timer();
		TimerTask task = new TimerTask() {
			@Override
			public void run() {
				if (Test.berabereMi) {
					if (Test.fb % 2 == 0 && Bilgisayar.pcSecilenBasketbolcular.size() != 0)
						bButon.get(Kullanici.bsecim).setEnabled(true);
					else if (Test.fb % 2 == 0 && Bilgisayar.pcSecilenBasketbolcular.size() == 0)
						fButon.get(Kullanici.fsecim).setEnabled(true);
					else if (Test.fb % 2 == 1 && Bilgisayar.pcSecilenFutbolcular.size() != 0)
						fButon.get(Kullanici.fsecim).setEnabled(true);
					else if (Test.fb % 2 == 1 && Bilgisayar.pcSecilenFutbolcular.size() == 0)
						bButon.get(Kullanici.bsecim).setEnabled(true);
					Test.berabereMi = false;
				}

				if (Test.fb % 2 == 1) {
					switch (Test.pozisyon) {
					case 1:
						Pozisyon.setText("PENALTI");
						break;
					case 2:
						Pozisyon.setText("SERBEST VURUS");
						break;
					case 3:
						Pozisyon.setText("KALECI ILE KARSI KARSIYA");
						break;
					}
				}
				if (Test.fb % 2 == 0) {
					switch (Test.pozisyon) {
					case 1:
						Pozisyon.setText("IKILIK");
						break;
					case 2:
						Pozisyon.setText("UCLUK");
						break;
					case 3:
						Pozisyon.setText("SERBEST ATIS");
						break;
					}
				}

				KullaniciSkor.setText("KULLANICI : " + Test.kullanici.getSkor());
				BilgisayarSkor.setText("BILGISAYAR : " + Test.bilgisayar.getSkor());

				if (Bilgisayar.pcSecilenBasketbolcular.size() == 0 && Bilgisayar.pcSecilenFutbolcular.size() == 0) {
					if (Test.kullanici.getSkor() > Test.bilgisayar.getSkor()) {
						JOptionPane.showMessageDialog(null, "KAZANDINIZ");
					} else if (Test.kullanici.getSkor() < Test.bilgisayar.getSkor()) {
						JOptionPane.showMessageDialog(null, "KAYBETTINIZ");
					} else {
						JOptionPane.showMessageDialog(null, "BERABERE. SON KARTLAR YENIDEN OYNANACAKTIR.");
						if (Test.fb % 2 == 1) {
							if ((Test.futbolcular.get(Kullanici.fsecim).getPenalti() > Bilgisayar.pcSecilenFutbolcularYedek.get(Bilgisayar.fpc).getPenalti())) {
								Pozisyon.setText("PENALTI");
								Test.kullanici.setSkor(10);
								KullaniciSkor.setText("KULLANICI : " + Test.kullanici.getSkor());
								JOptionPane.showMessageDialog(null, "KAZANDINIZ");
							} else if ((Test.futbolcular.get(Kullanici.fsecim).getPenalti() < Bilgisayar.pcSecilenFutbolcularYedek.get(Bilgisayar.fpc).getPenalti())) {
								Pozisyon.setText("PENALTI");
								Test.bilgisayar.setSkor(10);
								BilgisayarSkor.setText("BILGISAYAR : " + Test.bilgisayar.getSkor());
								JOptionPane.showMessageDialog(null, "KAYBETTINIZ");
							} else {
								if ((Test.futbolcular.get(Kullanici.fsecim).getSerbestVurus() > Bilgisayar.pcSecilenFutbolcularYedek.get(Bilgisayar.fpc).getSerbestVurus())) {
									Pozisyon.setText("SERBEST VURUS");
									Test.kullanici.setSkor(10);
									KullaniciSkor.setText("KULLANICI : " + Test.kullanici.getSkor());
									JOptionPane.showMessageDialog(null, "KAZANDINIZ");
								} else if ((Test.futbolcular.get(Kullanici.fsecim).getSerbestVurus() < Bilgisayar.pcSecilenFutbolcularYedek.get(Bilgisayar.fpc).getSerbestVurus())) {
									Pozisyon.setText("SERBEST VURUS");
									Test.bilgisayar.setSkor(10);
									BilgisayarSkor.setText("BILGISAYAR : " + Test.bilgisayar.getSkor());
									JOptionPane.showMessageDialog(null, "KAYBETTINIZ");
								} else {
									JOptionPane.showMessageDialog(null, "BERABERE");
								}
							}
						}
						if (Test.fb % 2 == 0) {
							if ((Test.basketbolcular.get(Kullanici.bsecim).getIkilik() > Bilgisayar.pcSecilenBasketbolcularYedek.get(Bilgisayar.bpc).getIkilik())) {
								Pozisyon.setText("IKILIK");
								Test.kullanici.setSkor(10);
								KullaniciSkor.setText("KULLANICI : " + Test.kullanici.getSkor());
								JOptionPane.showMessageDialog(null, "KAZANDINIZ");
							} else if ((Test.basketbolcular.get(Kullanici.bsecim).getIkilik() < Bilgisayar.pcSecilenBasketbolcularYedek.get(Bilgisayar.bpc).getIkilik())) {
								Pozisyon.setText("IKILIK");
								Test.bilgisayar.setSkor(10);
								BilgisayarSkor.setText("BILGISAYAR : " + Test.bilgisayar.getSkor());
								JOptionPane.showMessageDialog(null, "KAYBETTINIZ");
							} else {
								if ((Test.basketbolcular.get(Kullanici.bsecim).getUcluk() > Bilgisayar.pcSecilenBasketbolcularYedek.get(Bilgisayar.bpc).getUcluk())) {
									Pozisyon.setText("UCLUK");
									Test.kullanici.setSkor(10);
									KullaniciSkor.setText("KULLANICI : " + Test.kullanici.getSkor());
									JOptionPane.showMessageDialog(null, "KAZANDINIZ");
								} else if ((Test.basketbolcular.get(Kullanici.bsecim).getUcluk() < Bilgisayar.pcSecilenBasketbolcularYedek.get(Bilgisayar.bpc).getUcluk())) {
									Pozisyon.setText("UCLUK");
									Test.bilgisayar.setSkor(10);
									BilgisayarSkor.setText("BILGISAYAR : " + Test.bilgisayar.getSkor());
									JOptionPane.showMessageDialog(null, "KAYBETTINIZ");
								} else {
									JOptionPane.showMessageDialog(null, "BERABERE");
								}
							}
						}
					  }
					timer.cancel();
					setVisible(false);
				}
			}
		};
		timer.schedule(task, 0, 100);
	}
}

