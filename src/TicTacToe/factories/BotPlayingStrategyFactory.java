package TicTacToe.factories;

import TicTacToe.models.BotDifficultyLevel;
import TicTacToe.strategies.botplayingstrategy.BotPlayingStrategy;
import TicTacToe.strategies.botplayingstrategy.RandomBotPlayingStrategy;

public class BotPlayingStrategyFactory {

    public static BotPlayingStrategy getBotPlayingStrategyByDifficultyLevel(BotDifficultyLevel botDifficultyLevel)
    {
        //TODO : SWITCH CASE
        return new RandomBotPlayingStrategy();
    }
}
