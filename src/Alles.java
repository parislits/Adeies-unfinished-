import java.io.Serializable;

public class Alles extends Adeies implements Serializable{

		private String text;
		
		public String getText() {
			return text;
		}

		public void setText(String text) {
			this.text = text;
		}

		public Alles(int anHm, int aMinas, int anEtos ,String atext) {
			super(anHm, aMinas, anEtos);
			text=atext;
			
		}

		@Override
		public String toString() {
			return Integer.toString(super.getHm()) +"/" + Integer.toString(super.getMinas()) + "/" + Integer.toString(super.getEtos())+ "  Δικαιολογία :  " +text;
		
		}

		

	}


