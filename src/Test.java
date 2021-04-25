import java.util.ArrayList;
import java.util.Random;
import javax.swing.ImageIcon;

public class Test {
    static ArrayList<Futbolcu> futbolcular = new ArrayList<Futbolcu>();
    static ArrayList<Basketbolcu> basketbolcular = new ArrayList<Basketbolcu>();
    static Kullanici kullanici;
    static Bilgisayar bilgisayar;
    static Random random = new Random();
    static int fb;
    static int pozisyon;
    static boolean berabereMi;

    public static void main(String[] args) {
        Oyuncu oyuncu = new Kullanici();
        kullanici = new Kullanici(1, "Insan", 0);
        bilgisayar = new Bilgisayar(2, "PC", 0);

        futbolcular.add(new Futbolcu("Pepe", "Porto",new ImageIcon("pepe.PNG"), 90, 80, 75));
        futbolcular.add(new Futbolcu("Quaresma", "Besiktas",new ImageIcon("quaresma.PNG"), 90, 95, 65));
        futbolcular.add(new Futbolcu("Neymar", "Paris",new ImageIcon("neymar.PNG"), 90, 85, 90));
        futbolcular.add(new Futbolcu("Atiba", "Besitas",new ImageIcon("atiba.PNG"), 90, 85, 80));
        futbolcular.add(new Futbolcu("Henderson", "Liverpool",new ImageIcon("henderson.PNG"), 90, 75, 85));
        futbolcular.add(new Futbolcu("Ramos", "Real Madrid", new ImageIcon("ramos.PNG"),90, 90, 80));
        futbolcular.add(new Futbolcu("Ozyakup", "Besiktas", new ImageIcon("ozyakup.PNG"),90, 70, 60));
        futbolcular.add(new Futbolcu("Dorukhan", "Besitas",new ImageIcon("dorukhan.PNG"), 90, 75, 70));
        
     /*  //System.out futbolcular.get(5).getFutbolcuTakim()

        Basketbolcu basketbolcu4 = new Basketbolcu();
        basketbolcu4.setBastekbolcuAdi("Ali);
        */
        
        basketbolcular.add(new Basketbolcu("Griffin", "Pistons",new ImageIcon("griffin.PNG"), 90, 85, 70));
        basketbolcular.add(new Basketbolcu("Derozan", "San Antonio",new ImageIcon("derozan.PNG"), 95, 95, 100));
        basketbolcular.add(new Basketbolcu("Kyle", "Philadelphia", new ImageIcon("kyle.PNG"),65, 75, 90));
        basketbolcular.add(new Basketbolcu("Leonard", "Clippers",new ImageIcon("leonard.PNG"), 100, 80, 95));
        basketbolcular.add(new Basketbolcu("Mason", "Bucks",new ImageIcon("mason.PNG"), 75, 90, 80));
        basketbolcular.add(new Basketbolcu("Mccaw", "Toronto",new ImageIcon("mccaw.PNG"), 70, 85, 85));
        basketbolcular.add(new Basketbolcu("Olynyk", "Miami Heat",new ImageIcon("olynyk.PNG"), 75, 65, 95));
        basketbolcular.add(new Basketbolcu("Curry", "Golden State Warriors",new ImageIcon("curry.PNG"), 80, 90, 75));

        oyuncu.kartListesi();
        System.out.println("\n");
        Kart.kartlar(); 
        fb = 0;
        Oynanis();
        Sonuc();
    }
    
    public static void Oynanis(){
    	while (Bilgisayar.pcSecilenFutbolcular.size() != 0 || Bilgisayar.pcSecilenBasketbolcular.size() != 0) {
            	if (Bilgisayar.pcSecilenFutbolcular.size() == 0)
                    fb = 1;
            	else if (Bilgisayar.pcSecilenBasketbolcular.size() == 0)
                    fb = 0;
            bilgisayar.kartSec();
            kullanici.kartSec();
            fb++;
            pozisyonBilgisi();
            bilgisayar.SkorGoster();
            kullanici.SkorGoster();
            System.out.println(); 
        }
    }
    
    public static void Sonuc(){
        if (kullanici.getSkor() > bilgisayar.getSkor()) {
            System.out.println("KAZANDINIZ!");
        } else if (kullanici.getSkor() < bilgisayar.getSkor()) {
            System.out.println("KAYBETTINIZ!");
        } else {
            System.out.println("Berabere. Son kartlar tekrar oynanacaktýr.");
        }
    }    

    public static void pozisyonBilgisi() {
        pozisyon = random.nextInt(3) + 1;
        if (fb % 2 == 1) {
            switch (pozisyon) {
                case 1:
                    System.out.println("Karsilastirilacak Ozellik: Penalti");
                    if ((futbolcular.get(Kullanici.fsecim).getPenalti() > Bilgisayar.pcSecilenFutbolcular.get(Bilgisayar.fpc).getPenalti())) {
                        System.out.println("Kullanici bu eli kazandi.");
                        kullanici.setSkor(10);
                        Bilgisayar.pcSecilenFutbolcular.remove(Bilgisayar.fpc);
                    } else if ((futbolcular.get(Kullanici.fsecim).getPenalti() < Bilgisayar.pcSecilenFutbolcular.get(Bilgisayar.fpc).getPenalti())) {
                        System.out.println("Bilgisayar bu eli kazandi.");
                        bilgisayar.setSkor(10);
                        Bilgisayar.pcSecilenFutbolcular.remove(Bilgisayar.fpc);
                    } else {
                        System.out.println("Penalti ozellikleri esittir. Kartlar geri dagitildi.");
                        berabereMi = true;
                    }
                    break;
                case 2:
                    System.out.println("Karsilastirilacak Ozellik: Serbest vurus");
                    if ((futbolcular.get(Kullanici.fsecim).getSerbestVurus() > Bilgisayar.pcSecilenFutbolcular.get(Bilgisayar.fpc).getSerbestVurus())) {
                        System.out.println("Kullanici bu eli kazandi.");
                        kullanici.setSkor(10);
                        Bilgisayar.pcSecilenFutbolcular.remove(Bilgisayar.fpc);
                    } else if ((futbolcular.get(Kullanici.fsecim).getSerbestVurus() < Bilgisayar.pcSecilenFutbolcular.get(Bilgisayar.fpc).getSerbestVurus())) {
                        System.out.println("Bilgisayar bu eli kazandi.");
                        bilgisayar.setSkor(10);
                        Bilgisayar.pcSecilenFutbolcular.remove(Bilgisayar.fpc);
                    } else {
                        System.out.println("Serbest vurus ozellikleri esittir. Kartlar geri dagitildi.");
                        berabereMi = true;
                    }
                    break;
                case 3:
                    System.out.println("Karsilastirilacak Ozellik: Kaleci");
                    if ((futbolcular.get(Kullanici.fsecim).getKaleciKarsiKarsiya() > Bilgisayar.pcSecilenFutbolcular.get(Bilgisayar.fpc).getKaleciKarsiKarsiya())) {
                        System.out.println("Kullanici bu eli kazandi.");
                        kullanici.setSkor(10);
                        Bilgisayar.pcSecilenFutbolcular.remove(Bilgisayar.fpc);
                    } else if ((futbolcular.get(Kullanici.fsecim).getKaleciKarsiKarsiya() < Bilgisayar.pcSecilenFutbolcular.get(Bilgisayar.fpc).getKaleciKarsiKarsiya())) {
                        System.out.println("Bilgisayar bu eli kazandi.");
                        bilgisayar.setSkor(10);
                        Bilgisayar.pcSecilenFutbolcular.remove(Bilgisayar.fpc);
                    } else {
                        System.out.println("Kaleci ile karsi karsiya ozellikleri esittir. Kartlar geri dagitildi.");
                        berabereMi =true;
                    }
                    break;
                default:
                    break;
            }
        }
        if (fb % 2 == 0) {
            switch (pozisyon) {
                case 1:
                    System.out.println("Karsilastirilacak Ozellik: Ikilik");
                    if ((basketbolcular.get(Kullanici.bsecim).getIkilik() > Bilgisayar.pcSecilenBasketbolcular.get(Bilgisayar.bpc).getIkilik())) {
                        System.out.println("Kullanici bu eli kazandi.");
                        kullanici.setSkor(10);
                        Bilgisayar.pcSecilenBasketbolcular.remove(Bilgisayar.bpc);
                    } else if ((basketbolcular.get(Kullanici.bsecim).getIkilik() < Bilgisayar.pcSecilenBasketbolcular.get(Bilgisayar.bpc).getIkilik())) {
                        System.out.println("Bilgisayar bu eli kazandi.");
                        bilgisayar.setSkor(10);
                        Bilgisayar.pcSecilenBasketbolcular.remove(Bilgisayar.bpc);
                    } else {
                        System.out.println("Ikilik ozellikleri esittir. Kartlar geri dagitildi.");
                        berabereMi = true;
                    }
                    break;
                case 2:
                    System.out.println("Karsilastirilacak Ozellik: Ucluk");
                    if ((basketbolcular.get(Kullanici.bsecim).getUcluk() > Bilgisayar.pcSecilenBasketbolcular.get(Bilgisayar.bpc).getUcluk())) {
                        System.out.println("Kullanici bu eli kazandi.");
                        kullanici.setSkor(10);
                        Bilgisayar.pcSecilenBasketbolcular.remove(Bilgisayar.bpc);
                    } else if ((basketbolcular.get(Kullanici.bsecim).getUcluk() < Bilgisayar.pcSecilenBasketbolcular.get(Bilgisayar.bpc).getUcluk())) {
                        System.out.println("Bilgisayar bu eli kazandi.");
                        bilgisayar.setSkor(10);
                        Bilgisayar.pcSecilenBasketbolcular.remove(Bilgisayar.bpc);
                    } else {
                        System.out.println("Ucluk ozellikleri esittir. Kartlar geri dagitildi.");
                        berabereMi = true;
                    }
                    break;
                case 3:
                    System.out.println("Karsilastirilacak Ozellik: Serbest Atis");
                    if ((basketbolcular.get(Kullanici.bsecim).getSerbestAtis() > Bilgisayar.pcSecilenBasketbolcular.get(Bilgisayar.bpc).getSerbestAtis())) {
                         System.out.println("Kullanici bu eli kazandi.");
                         kullanici.setSkor(10);
                         Bilgisayar.pcSecilenBasketbolcular.remove(Bilgisayar.bpc);
                    } else if ((basketbolcular.get(Kullanici.bsecim).getSerbestAtis() < Bilgisayar.pcSecilenBasketbolcular.get(Bilgisayar.bpc).getSerbestAtis())) {
                        System.out.println("Bilgisayar bu eli kazandi.");
                        bilgisayar.setSkor(10);
                        Bilgisayar.pcSecilenBasketbolcular.remove(Bilgisayar.bpc);
                    } else {
                        System.out.println("Serbest atis ozellikleri esittir. Kartlar geri dagitildi.");
                        berabereMi = true;
                    }
                    break;
                default:
                    break;
            }
        }
    }
}