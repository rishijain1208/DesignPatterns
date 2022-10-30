package TicTacToe.factories;

import TicTacToe.models.GameWinningStrategyName;
import TicTacToe.strategies.winningstrategy.GameWinningStrategy;
import TicTacToe.strategies.winningstrategy.RandomGameWinningStrategy;

public class GameWinningStrategyFactory {

    public static GameWinningStrategy getGameWinningStrategyByName(GameWinningStrategyName gameWinningStrategyName)
    {
        return new RandomGameWinningStrategy();
    }
}
