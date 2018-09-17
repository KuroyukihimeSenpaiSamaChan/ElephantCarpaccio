import java.util.HashMap;

public class Panier {
	static final double chevre = 199.98; 
	static final double yeti = 6128.0;
	HashMap<String,Integer> quantities = new HashMap<String,Integer>();
	public Panier(int chevre, int yeti){
		quantities.put("chevre", chevre);
		quantities.put("yeti", yeti);
	}

	public double getPrice() { 
		return ((double) quantities.get("chevre"))*chevre + ((double) quantities.get("yeti"))*yeti ;
	}
}
