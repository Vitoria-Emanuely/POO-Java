package Guitar_v3_flex;

public abstract class InstrumentSpec {
	private Builder builder;
	private String model;
	private Type type;
	private Wood backWood, topWood;
	
	public InstrumentSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood) {
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.backWood = backWood;
		this.topWood = topWood;
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
	
	public boolean matches(InstrumentSpec otherSpec) {
		if(this.builder != otherSpec.builder)
			return false;
		if ((this.model != null) && (!this.model.equals("")) &&
		(!this.model.equals(otherSpec.model)))
		return false;
		if (this.type != otherSpec.type)
			return false;
		if (this.backWood != otherSpec.backWood)
			return false;
		if (this.topWood != otherSpec.topWood)
			return false;
		return true;
	}

}
