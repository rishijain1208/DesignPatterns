package TicTacToe.factories;

import TicTacToe.models.GameWinningStrategyName;

public class GameWinningStrategyNameEnumFactory {

    public static GameWinningStrategyName getGameWinningStrategyNameFromString(String name)
    {
        if(name.equals("ROW"))
        {
            return GameWinningStrategyName.ROW;
        }
        return GameWinningStrategyName.CORNER;
    }
}
