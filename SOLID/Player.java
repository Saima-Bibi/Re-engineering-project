package SOLID;


public abstract class Player {
    protected String symbol;

    public Player(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }

    public abstract void makeMove(Board board);
}
