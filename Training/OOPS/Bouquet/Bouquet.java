import java.util.ArrayList;
import java.util.List;

public class Bouquet {

	private List<Flower> collection = new ArrayList();

	public void add(Flower flower) {
		collection.add(flower);
	}

	public void add(Flower flower, int quantity) {
		for (int index = 0; index < quantity; index++) {
			collection.add(flower);

		}
	}
	
	public List<Flower> getCollection()
	{
		return collection;
	}

}
