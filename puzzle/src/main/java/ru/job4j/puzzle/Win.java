package ru.job4j.puzzle;

public class Win {

    public static boolean Horizontal(int[][] board) {
        boolean rsl = true;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] != 1) {
                    rsl = false;
                    break;
                }
                if (j == board[i].length - 1) {
                    return true;
                }
            }
        }
        return rsl;
    }

    public static boolean Vertical(int[][] board) {
        boolean rsl=true;
        for (int i=0; i<board.length; i++) {
            for (int j=0; j<board[i].length; j++) {
                if(board[i][j]==1){
                    //перебераем строки и проверяем их на 1
                    for (int n=i+1; n<board.length; n++) {
                        if(board[n][j]!=1) {
                            return false;
                        }
                    }
                    return true;
                }
            }
            return false; //если 1 в строке нет значит столюца быть не может завершаем метод
        }
        return rsl;
    }

    public static boolean check(int[][] board) {

        boolean rez = Horizontal(board) || Vertical(board);

        return rez;

    }
}
