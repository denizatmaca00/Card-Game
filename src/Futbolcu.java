import javax.swing.ImageIcon;

public class Futbolcu extends Sporcu {
    private String futbolcuAdi;
    private String futbolcuTakim;
    private int penalti;
    private int serbestVurus;
    private int kaleciKarsiKarsiya;

    public Futbolcu(String sporcuIsim, String sporcuTakim, ImageIcon img  , int penalti, int serbestVurus, int kaleciKarsiKarsiya) {
        super(sporcuIsim,sporcuTakim,img);
        this.penalti = penalti;
        this.serbestVurus = serbestVurus;
        this.kaleciKarsiKarsiya = kaleciKarsiKarsiya;
    }

    public Futbolcu(){
    }

    @Override
    public void sporcuPuaniGoster() {
        System.out.println("---Futbolcunun Puanlari--- ");
        System.out.println(getFutbolcuAdi() + "-> Penalti: " + this.penalti + "  Serbest Vurus: " + this.serbestVurus + "  Kaleciyle Karsi Karsiya: " + this.kaleciKarsiKarsiya);
    }

    //GETTER SETTER
    public String getFutbolcuAdi() {
        futbolcuAdi = super.getSporcuIsim();
        return futbolcuAdi;
    }

    public void setFutbolcuAdi(String futbolcuAdi) {
        this.futbolcuAdi = futbolcuAdi;
    }

    public String getFutbolcuTakim() {
        futbolcuTakim = super.getSporcuTakim();
        return futbolcuTakim;
    }

    public void setFutbolcuTakim(String futbolcuTakim) {
        this.futbolcuTakim = futbolcuTakim;
    }

    public int getPenalti() {
        return penalti;
    }

    public void setPenalti(int penalti) {
        this.penalti = penalti;
    }

    public int getSerbestVurus() {
        return serbestVurus;
    }

    public void setSerbestVurus(int serbestVurus) {
        this.serbestVurus = serbestVurus;
    }

    public int getKaleciKarsiKarsiya() {
        return kaleciKarsiKarsiya;
    }

    public void setKaleciKarsiKarsiya(int kaleciKarsiKarsiya) {
        this.kaleciKarsiKarsiya = kaleciKarsiKarsiya;
    }
}