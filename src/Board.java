
public class Board {
    public Board() {
        for (int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                this.board[i][j] = " ";
            }
        }
    }

        public void printBoard () {
            System.out.println("+---+---+---+");
            for (int row = 0; row < 3; row++) {

                System.out.print("|");
                for (int col = 0; col < 3; col++) {

                    System.out.print(" " + board[row][col] + " |");
                }
                System.out.println();
                System.out.println("+---+---+---+");
            }


        }
        private String[][] board = new String[3][3];


    }

