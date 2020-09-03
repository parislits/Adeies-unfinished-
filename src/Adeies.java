import java.io.Serializable;

public class Adeies implements Serializable{
	    


	private int Hm , Minas ,Etos;
	
	public int getMinas() {
		return Minas;
	}

	public void setMinas(int minas) {
		Minas = minas;
	}

	public int getEtos() {
		return Etos;
	}

	public void setEtos(int etos) {
		Etos = etos;
	}

	public Adeies(int anHm ,int aMinas ,int anEtos) {
		setHm(anHm);
		setMinas(aMinas);
		setEtos(anEtos);
	}

	public int getHm() {
		return Hm;
	}

	public void setHm(int hm) {
		Hm = hm;
	}
}
