package exercicio4prog_orient_obj;
//Bruno Garcia de Oliveira Breda 11212702
//Vitor Antonio de Almeida Lacerda 12544761
//Felipe Oliveira Carvalho 14613879
// Classe abstrata representando um mamífero, implementando as interfaces Animal e Ecology.
// Fornece um método de fábrica para criar instâncias de animais com base na espécie.
public abstract class Mammal implements Animal, Ecology {
    String name;
    String species;

    // Método de fábrica estático para criar instâncias de animais com base na espécie fornecida.
    // Retorna uma instância do animal especificado ou lança uma exceção se a espécie fornecida for desconhecida.
    public static Animal get(String name, String species) {
        if (species.equals("Elephant")) {
            return new Elephant();
        } else if (species.equals("Lion")) {
            return new Lion();
        } else {
            throw new IllegalArgumentException("Unknown species: " + species);
        }
    }

    // Descreve a ação de comer do animal.
    public void eat() {
        System.out.println("Eats like a mammal");
    }

    // Método abstrato para descrever o som emitido pelo animal.
    public abstract void sound();

    // Método abstrato para obter o habitat do animal.
    public abstract String getHabitat();
}