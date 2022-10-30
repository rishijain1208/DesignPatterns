package TicTacToe.factories;

import TicTacToe.models.*;

public class PlayerFactory {

    public static Player createHumanPlayer(String name,Character character)
    {
        Player player = new Player();
        player.setPlayerType(PlayerType.HUMAN);
        player.setName(name);
        player.setSymbol(new Symbol(character));
        return player;
    }

    public static Player createBot(String name, Character character, BotDifficultyLevel botDifficultyLevel)
    {
        Bot bot = new Bot(botDifficultyLevel);
        bot.setPlayerType((PlayerType.BOT));
        bot.setName(name);
        bot.setSymbol(new Symbol(character));

        return bot;
    }
}
