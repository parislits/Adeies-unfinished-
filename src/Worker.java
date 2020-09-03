import java.io.Serializable;
import java.util.ArrayList;

public class Worker implements Serializable{
	private String Name , Surname ,Klados,Eidikotita , Bathmos ;
	private String Afm, Am ,Iban;
	private double Misthos ; 
	private int XrProslipsi ,MinProslipsi,HmProslipsi ,Xronia ;
	public ArrayList<Anarotikes> A= new ArrayList<Anarotikes>();
	public ArrayList<Gonikes> G= new ArrayList<Gonikes>();
	public ArrayList<Kanonikes> K= new ArrayList<Kanonikes>();
	//public ArrayList<Repo> R= new ArrayList<Repo>();
	public ArrayList<Duores> D= new ArrayList<Duores>();
	public ArrayList <Alles> Al = new ArrayList<Alles>();

	public ArrayList<Alles> getAl() {
		return Al;
	}

	public void setAl(Alles al) {
		Al.add(al);
	}
	
	public ArrayList<Anarotikes> getA() {
		return A;
	}
	

	public void setA(Anarotikes a) {
		A.add(a);
	}

	public ArrayList<Gonikes> getG() {
		return G;
	}

	public void setG(Gonikes g) {
		G.add(g);
	}

	public ArrayList<Kanonikes> getK() {
		return K;
	}

	public void setK(Kanonikes k) {
		K.add(k);
	}

	public ArrayList<Duores> getD() {
		return D;
	}

	public void setD(Duores d) {
		D.add(d);
	}



	@Override
	public String toString() {
		return Name + " " + Surname ;
	}

	public Worker(String name, String surname, String klados, String eidikotita, String bathmos, String afm, String am,
			String iban, double misthos, int xrProslipsi, int minProslipsi, int hmProslipsi, int xronia) {
		Name = name;
		Surname = surname;
		Klados = klados;
		Eidikotita = eidikotita;
		Bathmos = bathmos;
		Afm = afm;
		Am = am;
		Iban = iban;
		Misthos = misthos;
		XrProslipsi = xrProslipsi;
		MinProslipsi = minProslipsi;
		HmProslipsi = hmProslipsi;
		Xronia = xronia;
	}

	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public String getSurname() {
		return Surname;
	}


	public void setSurname(String surname) {
		Surname = surname;
	}
	
	public String getKlados() {
		return Klados;
	}

	public void setKlados(String klados) {
		Klados = klados;
	}


	public String getEidikotita() {
		return Eidikotita;
	}


	public void setEidikotita(String eidikotita) {
		Eidikotita = eidikotita;
	}


	public String getBathmos() {
		return Bathmos;
	}


	public void setBathmos(String bathmos) {
		Bathmos = bathmos;
	}


	public String getAfm() {
		return Afm;
	}


	public void setAfm(String afm) {
		Afm = afm;
	}


	public String getAm() {
		return Am;
	}


	public void setAm(String am) {
		Am = am;
	}


	public String getIban() {
		return Iban;
	}


	public void setIban(String iban) {
		Iban = iban;
	}


	public double getMisthos() {
		return Misthos;
	}


	public void setMisthos(double misthos) {
		Misthos = misthos;
	}


	public int getXrProslipsi() {
		return XrProslipsi;
	}


	public void setXrProslipsi(int xrProslipsi) {
		XrProslipsi = xrProslipsi;
	}


	public int getMinProslipsi() {
		return MinProslipsi;
	}


	public void setMinProslipsi(int minProslipsi) {
		MinProslipsi = minProslipsi;
	}


	public int getHmProslipsi() {
		return HmProslipsi;
	}


	public void setHmProslipsi(int hmProslipsi) {
		HmProslipsi = hmProslipsi;
	}


	public int getXronia() {
		return Xronia;
	}


	public void setXronia(int xronia) {
		Xronia = xronia;
	}

	




	
	
	
}
