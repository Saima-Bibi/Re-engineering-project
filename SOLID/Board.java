package SOLID;

class Board {
    private String[] board;

    public Board() {
        board = new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8"};
    }

    public void printBoard() {
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2] +
                "\n===+===+===\n" +
                " " + board[3] + " | " + board[4] + " | " + board[5] +
                "\n===+===+===\n" +
                " " + board[6] + " | " + board[7] + " | " + board[8] + "\n");
    }

    public boolean isValidMove(int spot) {
        return !board[spot].equals("X") && !board[spot].equals("O");
    }

    public void markSpot(int spot, String symbol) {
        board[spot] = symbol;
    }

    public String[] getBoard() {
        return board;
    }
}
