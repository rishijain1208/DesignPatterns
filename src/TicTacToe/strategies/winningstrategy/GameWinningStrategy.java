package TicTacToe.strategies.winningstrategy;

import TicTacToe.models.Board;
import TicTacToe.models.Move;

public interface GameWinningStrategy {

    boolean checkVictory(Board board, Move lastMove);
}
