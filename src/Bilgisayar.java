import java.util.Random;

public class Bilgisayar extends Oyuncu {
    Random random = new Random();
    static int fpc, bpc;
    
    public Bilgisayar(int oyuncuID, String oyuncuAdi, int Skor) {
        super(oyuncuID, oyuncuAdi, Skor);
    }
    public Bilgisayar(){
    }

    @Override
    public void SkorGoster() {
        System.out.println("Bilgisayarýn Puani: " + getSkor());
    }
    
    @Override
    public void kartSec() {
        if (Test.fb % 2 == 1) {
            bpc = random.nextInt(Oyuncu.pcSecilenBasketbolcular.size());
            System.out.println("Bilgisayarin sectigi basketbolcu karti -> Isim: " + Oyuncu.pcSecilenBasketbolcular.get(bpc).getBastekbolcuAdi() + ", Takim: " + Oyuncu.pcSecilenBasketbolcular.get(bpc).getSporcuTakim() + ", Ikilik: " + Oyuncu.pcSecilenBasketbolcular.get(bpc).getIkilik() + ", Ucluk: " + Oyuncu.pcSecilenBasketbolcular.get(bpc).getUcluk() + ", Serbest Atis: " + Oyuncu.pcSecilenBasketbolcular.get(bpc).getSerbestAtis());
        }
        if (Test.fb % 2 == 0){
            fpc = random.nextInt(pcSecilenFutbolcular.size());
           System.out.println("Bilgisayarin sectigi futbolcu karti -> Isim: " + Oyuncu.pcSecilenFutbolcular.get(fpc).getFutbolcuAdi() + ", Takim: " + Oyuncu.pcSecilenFutbolcular.get(fpc).getSporcuTakim() + ", Penalti: " + Oyuncu.pcSecilenFutbolcular.get(fpc).getPenalti() + ", Serbest Vurus: " + Oyuncu.pcSecilenFutbolcular.get(fpc).getSerbestVurus() + ", Kaleciyle Karsi Karsiya: " + Oyuncu.pcSecilenFutbolcular.get(fpc).getKaleciKarsiKarsiya());
        }
    }
}