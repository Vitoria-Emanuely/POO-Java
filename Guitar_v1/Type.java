package Guitar_v1;

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
