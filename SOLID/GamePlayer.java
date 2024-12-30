package SOLID;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;


class ComputerPlayer extends Player {
    public ComputerPlayer(String symbol) {
        super(symbol);
    }

    
    public void makeMove(Board board) {
        System.out.println("Computer's turn...");
        int bestMove = getBestMove(board);
        board.markSpot(bestMove, getSymbol());
    }

    private int getBestMove(Board board) {
        
        ArrayList<String> availableSpaces = new ArrayList<>();
        String[] b = board.getBoard();
        for (String s : b) {
            if (!s.equals("X") && !s.equals("O")) {
                availableSpaces.add(s);
            }
        }
        int n = ThreadLocalRandom.current().nextInt(0, availableSpaces.size());
        return Integer.parseInt(availableSpaces.get(n));
    }
}

