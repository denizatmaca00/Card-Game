import javax.swing.ImageIcon;

public abstract class Sporcu {
    private String sporcuIsim;
    private String sporcuTakim;
	private ImageIcon img;
   
    public Sporcu(String sporcuIsim, String sporcuTakim, ImageIcon img) {
    	this.img = img;
        this.sporcuIsim = sporcuIsim;
        this.sporcuTakim = sporcuTakim;
    }

    public Sporcu(){
    }

    public abstract void sporcuPuaniGoster();

    //GETTER SETTER
    public String getSporcuIsim() {
        return sporcuIsim;
    }

    public void setSporcuIsim(String sporcuIsim) {
        this.sporcuIsim = sporcuIsim;
    }

    public String getSporcuTakim() {
        return sporcuTakim;
    }

    public void setSporcuTakim(String sporcuTakim) {
        this.sporcuTakim = sporcuTakim;
    }
    
    public ImageIcon getImg() {
		return img;
	}

	public void setImg(ImageIcon img) {
		this.img = img;
	}
}