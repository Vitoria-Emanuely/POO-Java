package Guitar_v3_flex;

public class GuitarSpec extends InstrumentSpec{
	private int numStrings;
	
	public GuitarSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood, int numStrings) {
		super(builder, model, type, backWood, topWood);
		this.numStrings = numStrings;
	}
	
	public int getNumStrings() {
		return this.numStrings;
	}
	
	@Override
	public boolean matches(InstrumentSpec otherSpec) {
		if(!super.matches(otherSpec))
			return false;
		if (!(otherSpec instanceof GuitarSpec))
		return false;
		GuitarSpec spec = (GuitarSpec)otherSpec;
		if (this.numStrings != spec.numStrings)
			return false;
		return true;
	}
}
