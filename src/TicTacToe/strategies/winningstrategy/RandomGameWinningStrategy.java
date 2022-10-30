package TicTacToe.strategies.winningstrategy;

import TicTacToe.models.Board;
import TicTacToe.models.Move;

public class RandomGameWinningStrategy implements GameWinningStrategy{

    @Override
    public boolean checkVictory(Board board, Move lastMove) {
        return false;
    }
}
