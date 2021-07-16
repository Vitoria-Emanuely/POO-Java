package Guitar_v3_flex;
import java.util.List;

public class FindInstrument {

	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		initializeInventory(inventory);
		
		//Teste para ver se encontrou a guitarra
		GuitarSpec whatErinLikes = new GuitarSpec(Builder.FENDER, "Stratocastor",
				Type.ELETRIC, Wood.ALDER, Wood.ALDER, 6);
		List<Guitar> matchingGuitars = inventory.search(whatErinLikes);
		if (!matchingGuitars.isEmpty()) {
			System.out.println("Erin, talvez você goste dessas guitarras: ");
			for (Guitar guitar: matchingGuitars) {
				GuitarSpec spec = (GuitarSpec)guitar.getSpec();
				System.out.println("Temos uma " + guitar.getSerialNumber() + " " + spec.getBuilder() + 
						" " + spec.getModel() + " " + spec.getType() + " " + 
						spec.getBackWood() + " " + spec.getTopWood() + 
						" no tampo com " + spec.getNumStrings() + " cordas.\n Ela pode ser sua por apenas US$ " + guitar.getPrice() + "!\n-------------");
						
 			}
		} else
			System.out.println("Desculpe, não temos nada pra você!");

	
	//Teste para ver se encontrou o mandolin
	MandolinSpec whatDeanLikes = new MandolinSpec(Builder.COLLINGS, "Fender",
			Type.ELETRIC, Wood.MAPLE, Wood.ADIRONDACK, Style.A);
	List<Mandolin> matchingMandolins = inventory.search(whatDeanLikes);
	if (!matchingMandolins.isEmpty()) {
		System.out.println("Dean, talvez você goste desses mandolins: ");
		for (Mandolin mandolin:matchingMandolins) {
			MandolinSpec spec = (MandolinSpec)mandolin.getSpec();
			System.out.println("Temos um " + mandolin.getSerialNumber() + " " + spec.getBuilder() + 
					" " + spec.getModel() + " " + spec.getType() + " " + 
					spec.getBackWood() + " " + spec.getTopWood() + 
					" no tampo do estilo " + spec.getStyle() + ".\n Ele pode ser seu por apenas US$ " + mandolin.getPrice() + "!\n-------------");
					
			}
	} else
		System.out.println("Desculpe, não temos nada pra você!");
}


	private static void initializeInventory(Inventory inventory) {
		inventory.addInstrument("V95693", 1499.95, new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELETRIC, Wood.ALDER, Wood.ALDER, 6));
		inventory.addInstrument("V9512", 1549.95, new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELETRIC, Wood.ALDER, Wood.ALDER, 6));
		inventory.addInstrument("V1568", 1255.97, new MandolinSpec(Builder.COLLINGS, "Fender", Type.ELETRIC, Wood.MAPLE, Wood.ADIRONDACK, Style.A));
		inventory.addInstrument("V5289", 2564.99, new MandolinSpec(Builder.COLLINGS, "Fender", Type.ELETRIC, Wood.MAPLE, Wood.ADIRONDACK, Style.A));
		inventory.addInstrument("V6866", 1500.50, new MandolinSpec(Builder.RYAN, "Fender", Type.ACOUSTIC, Wood.COCOBOLO, Wood.SITKA, Style.E));
	}
}

