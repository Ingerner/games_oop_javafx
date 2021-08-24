package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean rsl = true;
        for(int indexStr=0; indexStr<board.length; indexStr++) {
            for(int indexStl=0; indexStl<board[indexStr].length; indexStl++) {
                if(board[indexStr][indexStl] != 1){
                    rsl = false;
                    break;
                }
                if(indexStl == board[indexStr].length - 1) {
                    return true;
                }
            }
        }
        //boolean rsl = true;
        return rsl;
    }
}
