import javax.swing.ImageIcon;

public class Basketbolcu extends Sporcu{
    private String bastekbolcuAdi;
    private String basketbolcuTakim;
    private int ucluk;
    private int ikilik;
    private int serbestAtis;

    public Basketbolcu() {
    }
    public Basketbolcu(String sporcuIsim, String sporcuTakim, ImageIcon img, int ikilik, int ucluk, int serbestAtis) {
        super(sporcuIsim, sporcuTakim, img);
        this.ucluk = ucluk;
        this.ikilik = ikilik;
        this.serbestAtis = serbestAtis;
    }

    @Override
    public void sporcuPuaniGoster() {
        System.out.println("---Bastekbolcunun Puanlari--- ");
        System.out.println(this.bastekbolcuAdi + "-> Ikilik: " + this.ikilik + "  Ucluk: " + this.ucluk + "  Serbest Atis: " + this.serbestAtis);
    }

    //GETTER SETTER
    public String getBastekbolcuAdi() {
        bastekbolcuAdi = super.getSporcuIsim();
        return bastekbolcuAdi;
    }

    public void setBastekbolcuAdi(String bastekbolcuAdi) {
        this.bastekbolcuAdi = bastekbolcuAdi;
    }

    public String getBasketbolcuTakim() {
        basketbolcuTakim = super.getSporcuTakim();
        return basketbolcuTakim;
    }

    public void setBasketbolcuTakim(String basketbolcuTakim) {
        this.basketbolcuTakim = basketbolcuTakim;
    }

    public int getUcluk() {
        return ucluk;
    }

    public void setUcluk(int ucluk) {
        this.ucluk = ucluk;
    }

    public int getIkilik() {
        return ikilik;
    }

    public void setIkilik(int ikilik) {
        this.ikilik = ikilik;
    }

    public int getSerbestAtis() {
        return serbestAtis;
    }

    public void setSerbestAtis(int serbestAtis) {
        this.serbestAtis = serbestAtis;
    }
}