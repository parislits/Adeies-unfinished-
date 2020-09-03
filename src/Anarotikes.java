import java.io.Serializable;

public class Anarotikes extends Adeies implements Serializable{
	private Boolean Ypeuthini_dilosi , Iatrikes , Gnomateuseis;
	
	public Anarotikes(int anHm, int aMinas, int anEtos ,Boolean anYpeuthini_dilosi ,Boolean anIatrikes , Boolean aGnomateuseis) {
		super(anHm, aMinas, anEtos);
		Ypeuthini_dilosi = anYpeuthini_dilosi;
		Iatrikes = anIatrikes;
		Gnomateuseis =aGnomateuseis;
		
		
	}
	@Override
	public String toString() {
		
		if(Ypeuthini_dilosi) {
			return Integer.toString(super.getHm()) +"/" + Integer.toString(super.getMinas()) + "/" + Integer.toString(super.getEtos()) + " Υπεύθυνη Δήλωση";
		}
		if(Iatrikes) {
			return Integer.toString(super.getHm()) +"/" + Integer.toString(super.getMinas()) + "/" + Integer.toString(super.getEtos()) + " Ιατρική γνωμάτευση";
		}
		else {
			return Integer.toString(super.getHm()) +"/" + Integer.toString(super.getMinas()) + "/" + Integer.toString(super.getEtos()) + " Γνωματεύσεις";
		}
	}
	
	public Boolean getYpeuthini_dilosi() {
		return Ypeuthini_dilosi;
	}
	public Boolean getIatrikes() {
		return Iatrikes;
	}
	public Boolean getGnomateuseis() {
		return Gnomateuseis;
	}
	

	public void setYpeuthini_dilosi(Boolean ypeuthini_dilosi) {
		Ypeuthini_dilosi = ypeuthini_dilosi;
	}

	public void setIatrikes(Boolean iatrikes) {
		Iatrikes = iatrikes;
	}

	public void setGnomateuseis(Boolean gnomateuseis) {
		Gnomateuseis = gnomateuseis;
	}
	

	

}
