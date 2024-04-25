package exercicio4prog_orient_obj;

// Classe que representa um elefante, estendendo a classe abstrata Mammal e implementando as interfaces Animal e Ecology.
class Elephant extends Mammal implements Animal, Ecology {
    
    // Construtor padrão que define o nome e a espécie do elefante.
    public Elephant() {
        name = "Jumbo";
        species = "Elephant";
    }
    
    // Método para descrever o som emitido pelo elefante.
    public void sound() {
        System.out.println("Trumpets");
    }
    
    // Método para obter o habitat do elefante.
    public String getHabitat() {
        return "Elephants habitat";
    }
    
    // Método para obter o nome do elefante.
    public String getName() {
        return name;
    }
    
    // Método para obter a espécie do elefante.
    public String getSpecies() {
        return species;
    }
}
