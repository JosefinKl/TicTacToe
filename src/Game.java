import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    private String player;
    private String namePlayer1="dan";
    private String namePlayer2 ="jos";
    private int itter = 0;
   // private ArrayList<Integer> availableNumbers = [1,2,3,4,5,6,7,8,9];

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
        Board board = new Board();
        player = namePlayer1;

        while (itter<9) {
            if(player == namePlayer1) {
                System.out.println(namePlayer1 + " to play, pick a number:");
                board.printBoard();
                Scanner scanner = new Scanner(System.in);
                String input = scanner.next();
                if(board.availableNumber(Integer.parseInt(input))){
                    if(Integer.parseInt(input)>=1 && Integer.parseInt(input) <=9) {
                        board.set(Integer.parseInt(input), "X");
                        board.printBoard();
                        player = namePlayer2;
                    }
                    else{
                        System.out.println("pick a number:");
                    }
                }
                else{
                    System.out.println("pick an available number:");
                }

            }
            else if (player == namePlayer2) {
                System.out.println(namePlayer2 + " to play, pick a number:");
                board.printBoard();
                Scanner scanner = new Scanner(System.in);
                String input = scanner.next();
                if(board.availableNumber(Integer.parseInt(input))){
                    if(Integer.parseInt(input)>=1 && Integer.parseInt(input) <=9) {
                        board.set(Integer.parseInt(input), "O");
                        board.printBoard();
                        player = namePlayer1;
                    }
                    else{
                        System.out.println("pick a number:");
                    }
                }
                else{
                    System.out.println("pick an available number:");
                }

            }
            }
            itter++;
        }


    }


