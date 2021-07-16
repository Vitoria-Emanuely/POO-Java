package Guitar_vFinal;
import java.util.List;
import java.util.Map;
import java.util.Iterator;
import java.util.HashMap;

public class FindInstrument {

	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		initializeInventory(inventory);
		
		Map properties = new HashMap();
		properties.put("Builder", Builder.GIBSON);
		//Aqui que dá o erro ao adicionar um saxofone (se descomentar aqui precisa comentar as linhas 126 a 134)
		//properties.put("BackWood", Wood.MAPLE);
		InstrumentSpec clientSpec = new InstrumentSpec(properties);
		
		List<Instrument> matchingInstruments = inventory.search(clientSpec);
		if (!matchingInstruments.isEmpty()) {
			System.out.println("Talvez você goste desses instrumentos: ");
			for (Iterator<Instrument> i = matchingInstruments.iterator(); i.hasNext();) {
				Instrument instrument = (Instrument)i.next();
				InstrumentSpec spec = instrument.getSpec();
				System.out.println("Temos um(a) " + spec.getProperty("InstrumentType") + 
						" com as seguintes propriedades: ");
				for (Iterator j = spec.getProperties().keySet().iterator(); j.hasNext();) {
					String propertyName = (String)j.next();
					if (propertyName.equals("instrumentType"))
						continue;
					System.out.println(" " + propertyName + ": " + spec.getProperty(propertyName));
				}
				System.out.println("Você pode ter esse(a) " + spec.getProperty("InstrumentType") + " por apenas $" +
				instrument.getPrice() + "\n-------------------------------------------------------------");		
 			}
		} else {
			System.out.println("Desculpe, não temos nada pra você!");
		}
	}

	
	private static void initializeInventory(Inventory inventory) {
		Map properties = new HashMap();
		
		properties.put("InstrumentType", InstrumentType.GUITAR);
		properties.put("Builder", Builder.COLLINGS);
		properties.put("Model", "CJ");
		properties.put("Type", Type.ACOUSTIC);
		properties.put("NumStrings", 6);
		properties.put("TopWood", Wood.SITKA);
		properties.put("BackWood", Wood.INDIAN_ROSEWOOD);
		properties.remove("Style");
		inventory.addInstrument("11277", 3999.95, new InstrumentSpec(properties));
		
		properties.put("InstrumentType", InstrumentType.GUITAR);
		properties.put("Builder", Builder.MARTIN);
		properties.put("Model", "D-18");
		properties.put("Type", Type.ACOUSTIC);
		properties.put("NumStrings", 6);
		properties.put("TopWood", Wood.ADIRONDACK);
		properties.put("BackWood", Wood.MAHOGANY);
		properties.remove("Style");
		inventory.addInstrument("122784", 5495.95, new InstrumentSpec(properties));
		
		properties.put("InstrumentType", InstrumentType.GUITAR);
		properties.put("Builder", Builder.FENDER);
		properties.put("Model", "Stratocastor");
		properties.put("Type", Type.ELETRIC);
		properties.put("NumStrings", 6);
		properties.put("TopWood", Wood.ALDER);
		properties.put("BackWood", Wood.ALDER);
		properties.remove("Style");
		inventory.addInstrument("V95693", 1499.95, new InstrumentSpec(properties));
		
		properties.put("InstrumentType", InstrumentType.GUITAR);
		properties.put("Builder", Builder.FENDER);
		properties.put("Model", "Stratocastor");
		properties.put("Type", Type.ELETRIC);
		properties.put("NumStrings", 6);
		properties.put("TopWood", Wood.ALDER);
		properties.put("BackWood", Wood.ALDER);
		properties.remove("Style");
		inventory.addInstrument("V9512", 1549.95, new InstrumentSpec(properties));
		
		properties.put("InstrumentType", InstrumentType.GUITAR);
		properties.put("Builder", Builder.GIBSON);
		properties.put("Model", "SG'61 Reissue");
		properties.put("Type", Type.ELETRIC);
		properties.put("NumStrings", 6);
		properties.put("TopWood", Wood.MAHOGANY);
		properties.put("BackWood", Wood.MAHOGANY);
		properties.remove("Style");
		inventory.addInstrument("82765501", 1890.95, new InstrumentSpec(properties));
		
		properties.put("InstrumentType", InstrumentType.GUITAR);
		properties.put("Builder", Builder.GIBSON);
		properties.put("Model", "Les Paul");
		properties.put("Type", Type.ELETRIC);
		properties.put("NumStrings", 6);
		properties.put("TopWood", Wood.MAPLE);
		properties.put("BackWood", Wood.MAPLE);
		properties.remove("Style");
		inventory.addInstrument("70108276", 2295.95, new InstrumentSpec(properties));
		
		properties.put("InstrumentType", InstrumentType.MANDOLIN);
		properties.put("Builder", Builder.GIBSON);
		properties.put("Model", "F5-G");
		properties.put("Type", Type.ACOUSTIC);
		properties.remove("NumStrings");
		properties.put("TopWood", Wood.MAPLE);
		properties.put("BackWood", Wood.MAPLE);
		properties.put("Style", Style.A);
		inventory.addInstrument("9019920", 5495.99, new InstrumentSpec(properties));
		
		properties.put("InstrumentType", InstrumentType.BANJO);
		properties.put("Builder", Builder.GIBSON);
		properties.put("Model", "RB-3");
		properties.put("Type", Type.ACOUSTIC);
		properties.put("NumStrings", 5);
		properties.remove("TopWood");
		properties.put("BackWood", Wood.MAPLE);
		properties.remove("Style");
		inventory.addInstrument("8900231", 2945.95, new InstrumentSpec(properties));
		
		//Comentar as linhas abaixo para testar sem o saxofone
		properties.put("InstrumentType", InstrumentType.SAXOPHONE);
		properties.put("Builder", Builder.SELMER_PARIS);
		properties.put("Model", "Series III");
		properties.put("Type", Type.ALTO);
		properties.remove("NumStrings");
		properties.remove("TopWood");
		properties.remove("BackWood");
		properties.remove("Style");
		inventory.addInstrument("156845", 4999.00, new InstrumentSpec(properties));
		
	}
}
