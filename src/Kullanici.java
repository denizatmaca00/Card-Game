import java.util.Random;

public class Kullanici extends Oyuncu{
    Random random = new Random();
    protected static int fsecim, bsecim;
       
    public Kullanici(int oyuncuID, String oyuncuAdi, int Skor) {
        super(oyuncuID, oyuncuAdi, Skor);
    }

    public Kullanici(){
    }

    @Override
    public void kartSec(){
    	while(Kart.kartKullanildiMi==false) {
    		try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
    	Kart.kartKullanildiMi = false;
      
    	if(Test.fb % 2 == 1) {
            System.out.print("Hangi basketbolcu kartini sececeksiniz?\n");
            System.out.print("Sectiginiz basketbolcu karti -> ");
            System.out.println("Isim: " + Test.basketbolcular.get(bsecim).getBastekbolcuAdi() + ", Takim: " + Test.basketbolcular.get(bsecim).getBasketbolcuTakim() + ", Ikilik: " + Test.basketbolcular.get(bsecim).getIkilik() + ", Ucluk: " + Test.basketbolcular.get(bsecim).getUcluk() + ", Serbest Atis: " + Test.basketbolcular.get(bsecim).getSerbestAtis());
        }

        if(Test.fb % 2 == 0) {
            System.out.print("Hangi futbolcu kartini sececeksiniz?\n");
            System.out.print("Sectiginiz futbolcu karti -> ");
            System.out.println("Isim: " + Test.futbolcular.get(fsecim).getFutbolcuAdi() + ", Takim: " + Test.futbolcular.get(fsecim).getSporcuTakim() + ", Penalti: " + Test.futbolcular.get(fsecim).getPenalti() + ", Serbest Vurus: " + Test.futbolcular.get(fsecim).getSerbestVurus() + ", Kaleciyle Karsi Karsiya: " + Test.futbolcular.get(fsecim).getKaleciKarsiKarsiya());
        }
    }

    @Override
    public void SkorGoster(){
        System.out.println("Kullanicinin Puani: " + getSkor());
    }
}