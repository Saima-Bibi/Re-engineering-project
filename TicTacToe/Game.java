package TicTacToe;

public class Game {
    private static Board board;
    private static GameEngine engine;
    private static Player humanPlayer;
    private static Player computerPlayer;

    public static void main(String[] args) {
        initializeGame();
        engine.startGame();  
    }

   
    public static void initializeGame() {
        board = new Board();
        humanPlayer = new Player("X");
        computerPlayer = new Player("O");
        engine = new GameEngine(board, humanPlayer, computerPlayer);
    }

}
