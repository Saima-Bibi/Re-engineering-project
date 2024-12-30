package SOLID;

class GameRules {
    private Board board;

    public GameRules(Board board) {
        this.board = board;
    }

    public boolean isGameOver() {
        String[] b = board.getBoard();
        return (b[0].equals(b[1]) && b[1].equals(b[2])) ||
                (b[3].equals(b[4]) && b[4].equals(b[5])) ||
                (b[6].equals(b[7]) && b[7].equals(b[8])) ||
                (b[0].equals(b[3]) && b[3].equals(b[6])) ||
                (b[1].equals(b[4]) && b[4].equals(b[7])) ||
                (b[2].equals(b[5]) && b[5].equals(b[8])) ||
                (b[0].equals(b[4]) && b[4].equals(b[8])) ||
                (b[2].equals(b[4]) && b[4].equals(b[6]));
    }

    public boolean isTie() {
        String[] b = board.getBoard();
        for (int i = 0; i < b.length; i++) {
            if (b[i].equals(String.valueOf(i))) {
                return false;
            }
        }
        return true;
    }
}

