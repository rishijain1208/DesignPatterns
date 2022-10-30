package TicTacToe.models;

public class Move {
    private int row;

    private int column;

    private Player player;

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public int getColumn() {
        return column;
    }

    public Player getPlayer() {
        return player;
    }

    public Move(int row, int column, Player player)
    {
        this.row = row;
        this.column = column;
        this.player = player;
    }

}
