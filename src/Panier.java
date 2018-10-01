import java.util.HashMap;

public class Panier {
	static final double chevre = 199.98; 
	static final double yeti = 6128.0;
	private final String[] taxesCode = {"DE", "DK", "HR", "IS", "CH", "FR"};
	private final double[] taxes = {1.29, 1.25, 1.25, 1.255, 1.08, 1.196};
	private int taxe = -1;
	
	HashMap<String,Integer> quantities = new HashMap<String,Integer>();
	
	public Panier(int chevre, int yeti){
		quantities.put("chevre", chevre);
		quantities.put("yeti", yeti);
	}

	public double getPrice(String taxeCode) {
		double price = ((double) quantities.get("chevre"))*chevre + ((double) quantities.get("yeti"))*yeti ;
		
		if(taxeCode != "NULL") {
			for(int i=0; i<taxesCode.length; i++)
				if(taxesCode[i].equals(taxeCode))
					this.taxe = i;
			if(taxe >= 0)
				price *= taxes[taxe];
		}
		
		return price * reduction();
	}
	
	private double reduction() {
		int totalQuantity = 0;
		
		for(String s : quantities.keySet())
			totalQuantity += quantities.get(s);
		
		if(totalQuantity >= 50000)
			return 0.85;
		else if(totalQuantity >= 10000)
			return 0.9;
		else if(totalQuantity >= 7000)
			return 0.93;
		else if(totalQuantity >= 5000)
			return 0.95;
		else if(totalQuantity >= 1000)
			return 0.97;
		
		return 1.0;
	}
}
