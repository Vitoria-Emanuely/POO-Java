package Guitar_v3;

public class GuitarSpec {
	private Builder builder;
	private String model;
	private Type type;
	private Wood backWood, topWood;
	private int numStrings;
	
	public GuitarSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood, int numStrings) {
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.backWood = backWood;
		this.topWood = topWood;
		this.numStrings = numStrings;
	}
	
	public Builder getBuilder() {
		return this.builder;
	}
	
	public String getModel() {
		return this.model;
	}
	
	public Type getType() {
		return this.type;
	}
	
	public Wood getBackWood() {
		return this.backWood;
	}
	
	public Wood getTopWood() {
		return this.topWood;
	}
	
	public int getNumStrings() {
		return this.numStrings;
	}
	
	public boolean matches(GuitarSpec otherSpec) {
		if(this.builder != otherSpec.builder)
			return false;
		if ((otherSpec.model != null) && (!otherSpec.model.equals("")) &&
		(!this.model.contentEquals(otherSpec.model)))
		return false;
		if (this.type != otherSpec.type)
			return false;
		if (this.backWood != otherSpec.backWood)
			return false;
		if (this.topWood != otherSpec.topWood)
			return false;
		if (this.numStrings != otherSpec.numStrings)
			return false;
		return true;
	}
}
