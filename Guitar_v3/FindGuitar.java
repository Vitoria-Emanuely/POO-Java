package Guitar_v3;
import java.util.Iterator;
import java.util.List;

public class FindGuitar {

	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		initializeInventory(inventory);
		
		//Teste para ver se encontrou a guitarra
		
		GuitarSpec whatErinLikes = new GuitarSpec(Builder.FENDER, "Stratocastor",
				Type.ELETRIC, Wood.ALDER, Wood.ALDER, 6);
		List<Guitar> matchingGuitars = inventory.search(whatErinLikes);
		if (!matchingGuitars.isEmpty()) {
			System.out.println("Erin, talvez você goste dessas guitarras: ");
			for (Iterator<Guitar> i = matchingGuitars.iterator(); i.hasNext();) {
				Guitar guitar = (Guitar)i.next();
				GuitarSpec spec = guitar.getSpec();
				System.out.println("Temos uma " + guitar.getSerialNumber() + " " + spec.getBuilder() + 
						" " + spec.getModel() + " " + spec.getType() + " " + 
						spec.getBackWood() + " " + spec.getTopWood() + 
						" no tampo com " + spec.getNumStrings() + " cordas.\n Ela pode ser sua por apenas US$ " + guitar.getPrice() + "!\n-------------");
						
 			}
		} else
			System.out.println("Desculpe, não temos nada pra você!");
	}

	private static void initializeInventory(Inventory inventory) {
		GuitarSpec spec = new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELETRIC, Wood.ALDER, Wood.ALDER, 6);
		inventory.addGuitar("V95693", 1499.95, spec);
		inventory.addGuitar("V9512", 1549.95, spec);
	}
}
