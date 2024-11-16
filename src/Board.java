
public class Board {
    public Board() {
        int k = 1;
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                board[row][col] =Integer.toString(k++);
            }
        }
    }

    public void printBoard() {
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

    public void set (int index, String marker){
        board[]
    }
    private String[][] board = new String[3][3];


}


