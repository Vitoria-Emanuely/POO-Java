package Guitar_v1;

import java.util.Iterator;
import java.util.List;

public class FindGuitar {

	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		initializeInventory(inventory);
		
		//Teste para ver se encontrou a guitarra
		
		Guitar whatErinLikes = new Guitar(" ", 0, Builder.FENDER, "Stratocastor",
				Type.ELETRIC, Wood.ALDER, Wood.ALDER);
		List<Guitar> matchingGuitars = inventory.search(whatErinLikes);
		if (!matchingGuitars.isEmpty()) {
			System.out.println("Erin, talvez você goste dessas guitarras: ");
			for (Iterator<Guitar> i = matchingGuitars.iterator(); i.hasNext();) {
				Guitar guitar = (Guitar)i.next();
				System.out.println("Temos uma " + guitar.getBuilder() + 
						" " + guitar.getModel() + " " + guitar.getType() + " " + 
						guitar.getBackWood() + " " + guitar.getTopWood() + 
						" no tampo.\n Ela pode ser sua por apenas US$ " + guitar.getPrice() + "!\n-------------");
						
 			}
		} else
			System.out.println("Desculpe, não temos nada pra você!");
	}

	private static void initializeInventory(Inventory inventory) {
		inventory.addGuitar("V95693", 1499.95, Builder.FENDER, "Stratocastor", Type.ELETRIC, Wood.ALDER, Wood.ALDER);
		inventory.addGuitar("V9512", 1549.95, Builder.FENDER, "Stratocastor", Type.ELETRIC, Wood.ALDER, Wood.ALDER);
	}
}
