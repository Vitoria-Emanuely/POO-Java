package Guitar_v2;
import java.util.*;

public class Inventory {
	private List<Guitar> guitars;
	
	public Inventory() {
		guitars = new LinkedList<Guitar>();
	}
	
	public void addGuitar(String serialNumber, double price, Builder builder, String model,
			Type type, Wood backWood, Wood topWood) {
		Guitar guitar = new Guitar(serialNumber, price, builder, model, type, backWood, topWood);
		guitars.add(guitar);
	}
	
	public Guitar getGuitar(String serialNumber) {
		for (Iterator<Guitar> i = guitars.iterator(); i.hasNext();) {
			Guitar guitar = (Guitar)i.next();
			if (guitar.getSerialNumber().equals(serialNumber)) 
				return guitar;
			}
			return null;
		}
	
	public List<Guitar> search(GuitarSpec searchGuitar) {
		List<Guitar> matchingGuitars = new LinkedList<Guitar>();
		for (Iterator<Guitar> i = guitars.iterator(); i.hasNext();) {
			Guitar guitar = (Guitar)i.next();
			GuitarSpec guitarSpec = guitar.getSpec();
			if (searchGuitar.getBuilder() != guitarSpec.getBuilder())
				continue;
			String model = searchGuitar.getModel().toLowerCase();
			if ((model != null) && (!model.equals("")) &&
				(!model.equals(guitarSpec.getModel().toLowerCase())))
					continue;
			if (searchGuitar.getType() != guitarSpec.getType())
				continue;
			if (searchGuitar.getBackWood() != guitarSpec.getBackWood())
				continue;
			if (searchGuitar.getTopWood() != guitarSpec.getTopWood())
				continue;
			matchingGuitars.add(guitar);
		}
		return matchingGuitars;
	}
}
