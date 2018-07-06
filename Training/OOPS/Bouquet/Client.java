
public class Client {
	
	public static void main(String[] args) {
		Bouquet myBouquet= new Bouquet();
		
		myBouquet.add(new Rose());
		myBouquet.add(new Jasmine());
		myBouquet.add(new Lily());
		myBouquet.add(new Rose(),5);
		
		System.out.println("Cost of the Bouquet is "+getCostOfBouquet(myBouquet));
	}
	
	private static final int getCostOfBouquet(Bouquet myBouquet) {
		int costOfBouquet=0;
		for(Flower flower : myBouquet.getCollection())
		{
			costOfBouquet+=flower.getCost();
		}
		return costOfBouquet;
	}

}
