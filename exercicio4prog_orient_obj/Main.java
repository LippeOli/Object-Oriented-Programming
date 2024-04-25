import exercicio4prog_orient_obj.Animal;
import exercicio4prog_orient_obj.Ecology;
import exercicio4prog_orient_obj.Mammal;

/**
 * Classe principal que demonstra o comportamento das classes de animais.
 */
public class Main {
    

    public static void main(String[] args) {
        // Criando objetos de Elephant e Lion usando o método de fábrica na classe Mammal
        Animal elephant = Mammal.get("Jumbo", "Elephant");
        Animal lion = Mammal.get("Simba", "Lion");

        // Demonstrando o comportamento dos objetos de Elephant 
        System.out.println("Elephant:");
        System.out.println("Name: " + elephant.getName());
        System.out.println("Species: " + elephant.getSpecies());
        elephant.sound();
        System.out.println("Habitat: " + ((Ecology) elephant).getHabitat());
        elephant.eat();
        System.out.println();

        // Demonstrando o comportamento dos objetos do Lion    
        System.out.println("Lion:");
        System.out.println("Name: " + lion.getName());
        System.out.println("Species: " + lion.getSpecies());
        lion.sound();
        System.out.println("Habitat: " + ((Ecology) lion).getHabitat());
        lion.eat();
    }
}
