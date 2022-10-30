package TicTacToe.factories;

import TicTacToe.models.BotDifficultyLevel;

public class BotDifficultyLevelFactory {

    public static BotDifficultyLevel getBotDifficultyLevelByName(String name)
    {
        if(name.equals("EASY"))
        {
            return BotDifficultyLevel.EASY;
        }
        return BotDifficultyLevel.MEDIUM;
    }
}
