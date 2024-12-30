package SOLID;

class GameEngine implements Game {
    private Board board;
    private Player player1;
    private Player player2;
    private Player currentPlayer;
    private GameRules gameRules;

    public GameEngine(Board board, Player player1, Player player2) {
        this.board = board;
        this.player1 = player1;
        this.player2 = player2;
        this.currentPlayer = player1; 
        this.gameRules = new GameRules(board);
    }

   
    public void startGame() {
        board.printBoard();
        while (true) {
            currentPlayer.makeMove(board);
            board.printBoard();

            if (gameRules.isGameOver()) {
                System.out.println("Player " + currentPlayer.getSymbol() + " wins!");
                break;
            }

            if (gameRules.isTie()) {
                System.out.println("It's a tie!");
                break;
            }

            switchPlayers(); 
        }
    }

   
    public void switchPlayers() {
        currentPlayer = (currentPlayer == player1) ? player2 : player1;
    }
}



