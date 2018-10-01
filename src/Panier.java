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

	public double getPrice(int taxe) {
		for(int i=0; i<taxesCode.length; i++)
			if(taxesCode[i].equals(taxe))
				this.taxe = i;
		double ret = ((double) quantities.get("chevre"))*chevre + ((double) quantities.get("yeti"))*yeti ;
		if(taxe >= 0)
			ret *= taxes[taxe];
		
		return (double)Math.round(ret * 100d) / 100d;
	}
}
