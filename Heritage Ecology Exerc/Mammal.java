package exercicio4prog_orient_obj;
//Bruno Garcia de Oliveira Breda 11212702
//Vitor Antonio de Almeida Lacerda 12544761
//Felipe Oliveira Carvalho 14613879
public abstract class Mammal implements Animal, Ecology {
	String name;
	String species;
	public static Animal get(String name, String species) {
		if(species.equals("Elephant")){
			return new Elephant();
		}
		if(species.equals("Lion")) {
			return new Lion();
		}
	}
	
	public void eat() {
		System.out.println("Eats like a mammal");
	}
	
	public abstract void sound();
	public abstract String getHabitat();
	
}
