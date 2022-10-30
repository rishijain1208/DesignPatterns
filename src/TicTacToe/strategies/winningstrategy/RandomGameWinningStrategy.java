package TicTacToe.strategies.winningstrategy;

import TicTacToe.models.Board;
import TicTacToe.models.Move;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RandomGameWinningStrategy implements GameWinningStrategy{
    private List<HashMap<Character, Integer>> rowCharCounts;
    private List<HashMap<Character, Integer>> colCharCounts;

    private void initializeCounts(Board board) {
        rowCharCounts = new ArrayList<>();
        colCharCounts = new ArrayList<>();

        for (int i = 0; i < board.getDimension(); ++i) {
            rowCharCounts.add(new HashMap<>());
            colCharCounts.add(new HashMap<>());
        }
    }

    @Override
    public boolean checkVictory(Board board, Move moveCell) {
        if (rowCharCounts == null) {
            initializeCounts(board);
        }

        int row = moveCell.getRow();
        int col = moveCell.getColumn();

        if (!rowCharCounts.get(row).containsKey(moveCell.getPlayer().getSymbol().getCharacter())) {
            rowCharCounts.get(row).put(moveCell.getPlayer().getSymbol().getCharacter(), 0);
        }

        if (!colCharCounts.get(col).containsKey(moveCell.getPlayer().getSymbol().getCharacter())) {
            colCharCounts.get(col).put(moveCell.getPlayer().getSymbol().getCharacter(), 0);
        }

        rowCharCounts.get(row).put(
                moveCell.getPlayer().getSymbol().getCharacter(),
                1 + rowCharCounts.get(row).get(moveCell.getPlayer().getSymbol().getCharacter())
        );

        colCharCounts.get(col).put(
                moveCell.getPlayer().getSymbol().getCharacter(),
                1 + colCharCounts.get(col).get(moveCell.getPlayer().getSymbol().getCharacter())
        );

        if (rowCharCounts.get(row).get(moveCell.getPlayer().getSymbol().getCharacter()).equals(board.getDimension())) {
            return true;
        }

        if (colCharCounts.get(col).get(moveCell.getPlayer().getSymbol().getCharacter()).equals(board.getDimension())) {
            return true;
        }
        return false;
    }
}
