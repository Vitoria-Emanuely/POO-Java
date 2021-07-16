package Guitar_v3_flex;

public enum Style {
	A, E;
	
	@Override
	public String toString() {
		switch(this) {
		case A: return "A";
		case E: return "E";
		}
		return null;
	}

}
