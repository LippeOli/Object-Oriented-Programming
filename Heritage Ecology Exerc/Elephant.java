package exercicio4prog_orient_obj;

class Elephant extends Mammal implements Animal, Ecology{
	public Elephant() {
		name = "Jumbo";
		species = "Elephant";
	}
	public void sound() {
		System.out.println("Trumpets");
	}
	
	public String getHabitat() {
		return "Elephants habitat";
	}
	
	public String getName() {
		return name;
	}
	
	public String getSpecies() {
		return species;
	}
	
	
	
}
