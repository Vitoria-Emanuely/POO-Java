 package Guitar_vFinal;

public enum InstrumentType {
	GUITAR, BANJO, DOBRO, FIDDLE, BASS, MANDOLIN, SAXOPHONE;
	
	public String toString() {
		switch(this) {
			case GUITAR: return "Guitar";
			case BANJO: return "Banjo";
			case DOBRO: return "Dobro";
			case FIDDLE: return "Fiddle";
			case BASS: return "Bass";
			case MANDOLIN: return "Mandolin";
			case SAXOPHONE: return "Saxophone";
			default: return "Unspecified";
		}
	}

}
