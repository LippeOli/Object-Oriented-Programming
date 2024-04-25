package exercicio4prog_orient_obj;

// Classe que representa um leão, estendendo a classe abstrata Mammal e implementando as interfaces Animal e Ecology.
class Lion extends Mammal implements Animal, Ecology {
    
    // Construtor padrão que define o nome e a espécie do leão.
    public Lion() {
        name = "Simba";
        species = "Lion";
    }
    
    // Método para descrever o som emitido pelo leão.
    public void sound() {
        System.out.println("Roars");
    }
    
    // Método para obter o habitat do leão.
    public String getHabitat() {
        return "Lions habitat";
    }
    
    // Método para obter o nome do leão.
    public String getName() {
        return name;
    }
    
    // Método para obter a espécie do leão.
    public String getSpecies() {
        return species;
    }
}
