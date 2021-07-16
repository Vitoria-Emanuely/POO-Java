package Guitar_vFinal;

public enum Type {
	ACOUSTIC, ELETRIC, SOPRANO, ALTO, TENOR, BARITONE;
	
	@Override
	public String toString() {
		switch(this) {
		case ACOUSTIC: return "Acoustic";
		case ELETRIC: return "Eletric";
		case SOPRANO: return "Soprano";
		case ALTO: return "Alto";
		case TENOR: return "Tenor";
		case BARITONE: return "Baritone";
		}
		return null;
	}
	
}
