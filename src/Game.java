import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Game {
    private String player;
    private String namePlayer1;
    private String namePlayer2;
    private Boolean continuePlay = true;
    private int numberOfWinPlayer1;
    private int numberOfWinPlayer2;

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
            } else {
                break;
            }
        }
        System.out.println("Write Player 1 name (X):");
        namePlayer1 = scanner.nextLine();

        System.out.println("Do you want to play with computer (Y/N)?");
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("N")) {
                System.out.println("Write Player 2 name (O):");
                namePlayer2 = scanner.nextLine();
                break;

            }
            if (!input.equalsIgnoreCase("Y")) {
                System.out.println("Write Y/N");
            } else {
                namePlayer2 = "Computer";
                break;
            }

        }
        play(0,0, namePlayer1, namePlayer2);
    }

    public void play(int numberOfWinPlayer1, int numberOfWinPlayer2, String player1, String player2) {
        Board board = new Board();
        this.namePlayer1 = player1;
        this.namePlayer2 = player2;
        player = namePlayer1;
        this.numberOfWinPlayer1= numberOfWinPlayer1;
        this.numberOfWinPlayer2 = numberOfWinPlayer2;
        continuePlay = true;


        while (continuePlay) {
            if (player == namePlayer1) {
                System.out.println(namePlayer1 + " to play, pick a number:");
                board.printBoard();
                Scanner scanner = new Scanner(System.in);
                String input = scanner.next();
                if (Integer.parseInt(input) != 0) {
                    if (board.availableNumber(Integer.parseInt(input))) {
                        if (Integer.parseInt(input) >= 1 && Integer.parseInt(input) <= 9) {
                            board.set(Integer.parseInt(input), "X");
                            board.endGame();


                            if (board.getResult() == "Win") {
                                System.out.println(namePlayer1 + " " + board.getResult());
                                numberOfWinPlayer1++;
                                System.out.println(namePlayer1 + " has won " + numberOfWinPlayer1 + " time(s).");
                                if (numberOfWinPlayer1 == 3) {
                                    System.out.println(namePlayer1 + " came first to 3 won games!");
                                    break;
                                }
                                continuePlay = false;

                                new Game().play(numberOfWinPlayer1, numberOfWinPlayer2, namePlayer1, namePlayer2);
                            } else if (board.getResult() == "Tie") {
                                System.out.println("Tie");
                                continuePlay = false;
                            }
                            player = namePlayer2;
                        } else {
                            System.out.println("pick a number:");
                        }
                    } else {
                        System.out.println("pick an available number:");
                    }

                }
                else {
                    System.out.println("pick an available number:");
                }
            }

            else if (player == namePlayer2) {
                String input;

                if(namePlayer2 != "Computer") {
                    System.out.println(namePlayer2 + " to play, pick a number:");
                    board.printBoard();
                    Scanner scanner = new Scanner(System.in);
                    input = scanner.next();
                }
                else {
                    Random rand = new Random();
                    Integer n = rand.nextInt(9);
                    input = Integer.toString(n);
                    System.out.println(input);

                }
                if(Integer.parseInt(input) != 0) {
                    if (board.availableNumber(Integer.parseInt(input))) {
                        if (Integer.parseInt(input) >= 1 && Integer.parseInt(input) <= 9) {
                            board.set(Integer.parseInt(input), "O");
                            board.endGame();


                            if (board.getResult() == "Win") {
                                System.out.println(namePlayer2 + " " + board.getResult());
                                numberOfWinPlayer2++;
                                System.out.println(namePlayer2 + " has won " + numberOfWinPlayer2 + " time(s).");
                                if (numberOfWinPlayer2 == 3) {
                                    System.out.println(namePlayer2 + " came first to 3 won games!");
                                    break;
                                }
                                continuePlay = false;
                                new Game().play(numberOfWinPlayer1, numberOfWinPlayer2, namePlayer1, namePlayer2);
                            } else if (board.getResult() == "Tie") {
                                System.out.println("Tie");
                            }
                            player = namePlayer1;
                        } else {
                            if(namePlayer2 != "Computer") {
                                System.out.println("pick a number:");
                            }

                        }
                    } else {
                        if(namePlayer2 != "Computer") {
                            System.out.println("pick an available number:");
                        }
                    }
                }
                else {
                    if(namePlayer2 != "Computer") {
                        System.out.println("pick an available number:");
                    }
                }
            }

            }
        }


    }



