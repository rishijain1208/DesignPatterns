package TicTacToe.strategies.botplayingstrategy;

import TicTacToe.models.Board;
import TicTacToe.models.Cell;
import TicTacToe.models.Move;
import TicTacToe.models.Player;

import java.util.List;

public class RandomBotPlayingStrategy implements BotPlayingStrategy{

    @Override
    public Move makeMove(Board board, Player player) {
        for(List<Cell> row: board.getBoard())
        {
            for(Cell cell:row)
            {
                if(cell.getPlayer() == null)
                {
                    return new Move(cell.getRow(),cell.getColumn(),player);
                }
            }
        }
        return null;
    }
}
