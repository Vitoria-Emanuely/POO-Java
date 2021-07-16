package Guitar_v3;

public enum Type {
	ACOUSTIC, ELETRIC;
	
	@Override
	public String toString() {
		switch(this) {
		case ACOUSTIC: return "Acoustic";
		case ELETRIC: return "Eletric";
		}
		return null;
	}
	
}
