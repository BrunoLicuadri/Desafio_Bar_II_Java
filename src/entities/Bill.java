package entities;

public class Bill {
	
	public char gender;
	public int beer;
	public int barbecue;
	public int softDrink;
	
	public double consumo = 0.0;
	public double entrada = 0.0;
	public double couver = 0.0;
	public double total = 0.0;
	
	public double feeding() {
		consumo = beer * 5.00 + barbecue  * 7.00 + softDrink * 3.00;
		return consumo;
	}
	
	public double couvert() {
		if (feeding() >= 30.00) {
			couver = 0.00;
		}
		else {
			couver = 4.00;
		}
		
		return couver;
	}
	
	public double ticket() {
		if (gender == 'f') {
			entrada = 8.00;
		}
		else {
			entrada = 10.00;
		}
		return entrada;
	}
	
	public double total() {
		total = consumo + couver + entrada;
		return total;
	}

}
