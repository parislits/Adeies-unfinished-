import java.io.Serializable;

public class Gonikes extends Adeies implements Serializable{
	
	@Override
	public String toString() {
		
		return Integer.toString(super.getHm()) +"/" + Integer.toString(super.getMinas()) + "/" + Integer.toString(super.getEtos()) ;
		
	}

	public int getOra() {
		return ora;
	}

	public void setOra(int ora) {
		this.ora = ora;
	}

	public int getLepto() {
		return lepto;
	}

	public void setLepto(int lepto) {
		this.lepto = lepto;
	}

	public int getSynolo() {
		return Synolo;
	}

	public void setSynolo(int synolo) {
		Synolo = synolo;
	}

	private int ora ,lepto;
	private int Synolo=0;
	
	public Gonikes(int anHm, int aMinas, int anEtos) {
		super(anHm, aMinas, anEtos);
		Synolo=+1;
	}
	

}
