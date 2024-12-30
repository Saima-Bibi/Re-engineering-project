package TicTacToe;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class GameEngine  {
    private Board board;
    private Player humanPlayer;
    private Player computerPlayer;
    private Player currentPlayer;
    private Scanner input = new Scanner(System.in);

    public GameEngine(Board board, Player humanPlayer, Player computerPlayer) {
        this.board = board;
        this.humanPlayer = humanPlayer;
        this.computerPlayer = computerPlayer;
        this.currentPlayer = humanPlayer; 
    }

    public void startGame() {
        board.printBoard();
        while (true) {
            playTurn();
            board.printBoard();
            if (isGameOver()) {
                System.out.println("Player " + currentPlayer.getSymbol() + " wins!");
                break;
            }
            if (board.isTie()) {
                System.out.println("It's a tie!");
                break;
            }
            switchPlayers();  
        }
    }

    private void playTurn() {
        if (currentPlayer == humanPlayer) {
            getHumanSpot();
        } else {
            System.out.println("Computer's turn...");
            int bestMove = getBestMove();
            board.makeMove(bestMove, computerPlayer.getSymbol());
        }
    }

    
    private void getHumanSpot() {
        boolean validInput;
        System.out.print("Enter [0-8]: ");
        do {
            int spot = input.nextInt();
            if (board.isValidMove(spot)) {
                board.makeMove(spot, humanPlayer.getSymbol());
                validInput = true;
            } else {
                validInput = false;
                System.out.println("Invalid move, Enter Valid Move.");
               
            }
        } while (!validInput);
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

    
    public int getBestMove() {
        ArrayList<String> availableSpaces = new ArrayList<>();
        String[] b = board.getBoard();
        for (String s : b) {
            if (!s.equals("X") && !s.equals("O")) {
                availableSpaces.add(s);
            }
        }

        for (String as : availableSpaces) {
            int spot = Integer.parseInt(as);
            if (canWin("O", spot)) return spot; 
            if (canWin("X", spot)) return spot; 
        }

        int n = ThreadLocalRandom.current().nextInt(0, availableSpaces.size());
        return Integer.parseInt(availableSpaces.get(n));
    }

    
    public boolean canWin(String player, int spot) {
        String[] b = board.getBoard();
        b[spot] = player;
        boolean result = isGameOver();
        b[spot] = String.valueOf(spot); 
        return result;
    }

    
    private void switchPlayers() {
        currentPlayer = (currentPlayer == humanPlayer) ? computerPlayer : humanPlayer;
    }

}
