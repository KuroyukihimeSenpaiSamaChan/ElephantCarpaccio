import java.util.HashMap;

public class Panier {
	static final double chevre = 199.98; 
	HashMap<String,Integer> quantities = new HashMap<String,Integer>();
	public Panier(int chevre){
		quantities.put("chevre", chevre);
	}

	public double getPrice() { 
		return ((double) quantities.get("chevre"))*chevre;
	}
}
