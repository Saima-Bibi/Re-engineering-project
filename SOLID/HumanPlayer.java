package SOLID;
import java.util.Scanner;

class HumanPlayer extends Player{
    private Scanner input = new Scanner(System.in);

    public HumanPlayer(String symbol) {
        super(symbol);
    }


    public void makeMove(Board board) {
        boolean validInput = false;
        int spot;
        do {
            System.out.print("Player " + getSymbol() + ", enter [0-8]: ");
            while (!input.hasNextInt()) {
                System.out.println("Please enter a valid number between 0 and 8.");
                input.next(); 
            }
            spot = input.nextInt();
            input.nextLine(); 

            if (board.isValidMove(spot)) {
                board.markSpot(spot, getSymbol());
                validInput = true;
            } else {
                System.out.println("Invalid move, try again.");
            }
        } while (!validInput);
    }
}


