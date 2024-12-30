package SOLID;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
       
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Welcome to Tic Tac Toe!");
            System.out.print("Choose game mode (1 - Single Player, 2 - Two Player): ");
            int mode = scanner.nextInt();

            Board board = new Board();
            Player player1 = new HumanPlayer("X");
            GameEngine gameEngine;

            if (mode == 1) {
                Player computerPlayer = new ComputerPlayer("O");
                gameEngine = new GameEngine(board, player1, computerPlayer);
            } else {
                Player player2 = new HumanPlayer("O");
                gameEngine = new GameEngine(board, player1, player2);
            }

            gameEngine.startGame();
        } 
    }
}
