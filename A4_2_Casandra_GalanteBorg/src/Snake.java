public class Snake extends Animal {
	
	private boolean isPoisonous;

	public Snake(String latinName, boolean isPoisonous) {
		super(latinName);
		this.isPoisonous = isPoisonous;
	}

	@Override
	public String getInfo() {
		String info = "";
		if(isPoisonous) {
			info = "A snake named: " + getFriendlyName() + ", latin: " + getLatinName() +
				" and that is poisonus";
		} else {
			info = "A snake named:  " + getFriendlyName() + ", latin: " + getLatinName() +
				" and that is poisonus";
		}
		
		return info;
	}

	public boolean isPoisonous() {
		return isPoisonous;
	}
	
	

}