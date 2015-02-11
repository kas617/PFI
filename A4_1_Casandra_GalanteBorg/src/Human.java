public class Human {
	
	private Dog dog;
	private String name;
	private boolean hasDog = false;
	
	public Human(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	
	public void buyDog(Dog dog) {
		hasDog = !hasDog;
		this.dog = dog;
	}
	
	public boolean hasDog() {
		return hasDog;
	}
	
	public String getInfo() {
		if(this.dog != null) {
			return getName()+ " �ger en hund som heter " + this.dog.getName();
		} else {
			return getName() + " �ger inte en hund";
		}
	}

}