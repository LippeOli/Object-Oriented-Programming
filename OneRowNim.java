import java.util.Scanner;

public class OneRowNim {
    private int nPieces;

    public OneRowNim(int initialPieces) {
        nPieces = initialPieces;
    }

    public void removePieces(int numToRemove) {
        nPieces -= numToRemove;
    }

    public boolean gameOver() {
        return nPieces <= 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao One Row Nim!");
        System.out.print("Informe o número inicial de peças: ");
        int initialPieces = scanner.nextInt();

        OneRowNim game = new OneRowNim(initialPieces);

        boolean player1Turn = true;

        while (!game.gameOver()) {
            System.out.println("Número de peças restantes: " + game.nPieces);

            String currentPlayer = player1Turn ? "Jogador 1" : "Jogador 2";
            System.out.print(currentPlayer + ", digite o número de peças a serem removidas: ");
            int numToRemove = scanner.nextInt();

            game.removePieces(numToRemove);

            player1Turn = !player1Turn;
        }

        String winner = player1Turn ? "Jogador 2" : "Jogador 1";
        System.out.println("O jogo acabou! " + winner + " venceu!");
    }
}
