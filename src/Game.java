import java.util.Scanner;

public class Game {

    private String namePlayer1="dan";
    private String namePlayer2 ="jos";

    public void start() {
        System.out.println("Welcome to TicTacToe!");

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

        namePlayer1 = scanner.nextLine();
        System.out.println("Write Player 2 name (O):");
        namePlayer2 = scanner.nextLine();


    }

    public void play() {
        System.out.println(namePlayer1 + " to play, pick a number:");
        new Board().printBoard();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

    }

}
