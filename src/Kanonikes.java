import java.io.Serializable;

public class Kanonikes extends Adeies implements Serializable{
	private int Synolo=0;
	

	@Override
	public String toString() {
		return Integer.toString(super.getHm()) +"/" + Integer.toString(super.getMinas()) + "/" + Integer.toString(super.getEtos());
	
	}

	public Kanonikes(int anHm, int aMinas, int anEtos) {
		super(anHm, aMinas, anEtos);
		Synolo=+1;
		
	}

	public int getSynolo() {
		return Synolo;
	}

	public void setSynolo(int synolo) {
		Synolo = synolo;
	}

}
