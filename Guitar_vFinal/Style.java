package Guitar_vFinal;

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
