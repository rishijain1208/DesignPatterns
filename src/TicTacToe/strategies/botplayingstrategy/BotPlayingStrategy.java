package TicTacToe.strategies.botplayingstrategy;

import TicTacToe.models.Board;
import TicTacToe.models.Move;
import TicTacToe.models.Player;

public interface BotPlayingStrategy {

    Move makeMove(Board board, Player player);
}
