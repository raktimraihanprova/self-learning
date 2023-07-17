import java.util.*;

public class ValidNineByNineSuduku {

    public static void main(String[] args) {
        char[][] board =
                {
                          {'8', '3', '.', '.', '7', '.', '.', '.', '.'}
                        , {'6', '.', '2', '1', '9', '5', '.', '.', '.'}
                        , {'.', '9', '5', '.', '.', '.', '.', '6', '.'}
                        , {'9', '.', '.', '.', '6', '.', '.', '.', '3'}
                        , {'4', '.', '.', '8', '.', '3', '.', '.', '1'}
                        , {'7', '.', '.', '.', '2', '.', '.', '.', '6'}
                        , {'.', '6', '.', '.', '.', '.', '2', '8', '.'}
                        , {'.', '.', '.', '4', '1', '9', '.', '.', '5'}
                        , {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
                };

        System.out.println(isValidSudoku(board));
    }


    public static boolean isValidSudoku(char[][] board) {

        HashSet<String> finalSet = new HashSet<>();

        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[i].length; j++){
                if(board[i][j] != '.'){
                    if(!finalSet.add(i/3+"("+board[i][j]+")"+j/3) ||
                            !finalSet.add(i+"("+board[i][j]+")") ||
                                    !finalSet.add("("+board[i][j]+")"+j)
                    ){
                        return false;
                    }
                }
            }
        }

        return true;
    }
}
