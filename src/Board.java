

public class Board {
    private int count = 0;
    //Adds numbers to board (1-9).
    public Board() {
        int k = 1;
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                board[row][col] =Integer.toString(k++);
            }
        }
    }
    //Print board
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

    //Set marker to board
    public void set (int index, String marker){
        index--;
        board[index/3][index%3] = marker;
    }

    //Create board
    private String[][] board = new String[3][3];

    //Check if chosen number is available.
    public Boolean availableNumber(int index){
        index--;
        if (board[index/3][index%3] == "X" || board[index/3][index%3] == "O"){
            return false;
        }
        else return true;
    }
    private String result = "";

    public String getResult() {
        return result;
    }


    //Check if someone has won.
    public void endGame(){

        if (board[0][0] == board[0][1] && board [0][0]== board[0][2]){
            result = "Win";
        }
        else if (board[1][0] == board[1][1] && board [1][1]== board[1][2]){
            result = "Win";
        }
        else if (board[2][0] == board[2][1] && board [2][1]== board[2][2]){
            result = "Win";
        }
        else if (board[0][0] == board[1][0] && board[1][0]== board[2][0]){
            result = "Win";
        }
        else if (board[0][1] == board[1][1] && board[1][1]== board[2][1]){
            result = "Win";
        }
        else if (board[0][2] == board[1][2] && board[1][2]== board[2][2]){
            result = "Win";
        }
        else if (board[0][0] == board[1][1] && board[1][1]== board[2][2]){
            result = "Win";
        }
        else if (board[0][2] == board[1][1] && board[1][1]== board[2][0]){
            result = "Win";
        }
        else {
            //Check if all positions are filled/taken without a win (hence tie).
            count = 0;
            for (int row = 0; row < 3; row++) {
                for (int col = 0; col < 3; col++) {
                    if(board[row][col] == "X" || board[row][col] == "O"){
                        count++;
                    }
                }
            }
            if (count == 9){
                result = "Tie";
            }
            else {
                result = "no win";
            }
        }
        }

}


