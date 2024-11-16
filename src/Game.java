import java.util.Scanner;

public class Game {
    public void start() {
        System.out.println("Welcome to TicTacToe!");
        new Board().printBoard();
        System.out.println("Do you want to play (Y/N)?");
        Scanner scanner = new Scanner(System.in);
        while (true) {

            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("N")) {
                return;
            }
            if (!input.equalsIgnoreCase("Y")) {
                System.out.println("Write Y/N");
            }
            else {
                break;
            }
        }
        System.out.println("Write Player 1 name (X):");

        String namePlayer1 = scanner.nextLine();
        System.out.println("Write Player 2 name (O):");
        String namePlayer2 = scanner.nextLine();


    }


}
