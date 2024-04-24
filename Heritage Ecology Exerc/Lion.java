package exercicio4prog_orient_obj;

class Lion extends Mammal implements Animal, Ecology{
	public Lion() {
		name = "Simba";
		species = "Lion";
	}
	public void sound() {
		System.out.println("Roars");
	}
	
	public String getHabitat() {
		return "Lions habitat";
	}
	
	public String getName() {
		return name;
	}
	
	public String getSpecies() {
		return species;
	}
	
}
