package Guitar_vFinal;

public enum Builder {
	FENDER, MARTIN, GIBSON, COLLINGS, OLSON, RYAN, PRS, YAMAHA, SELMER_PARIS, ANY;

	@Override
	public String toString() {
		switch(this) {
		case FENDER: return "Fender";
		case MARTIN: return "Martin";
		case GIBSON: return "Gibson";
		case COLLINGS: return "Collings";
		case OLSON: return "Olson";
		case RYAN: return "Ryan";
		case PRS: return "Prs";
		case YAMAHA: return "Yamaha";
		case SELMER_PARIS: return "Selmer Paris";
		case ANY: return "Any";
		}
		return null;	
	}
}
