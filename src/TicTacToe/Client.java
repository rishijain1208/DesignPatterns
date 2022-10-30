package TicTacToe;

import TicTacToe.factories.BotDifficultyLevelFactory;
import TicTacToe.factories.GameWinningStrategyFactory;
import TicTacToe.factories.GameWinningStrategyNameEnumFactory;
import TicTacToe.factories.PlayerFactory;
import TicTacToe.models.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many players?");
        int numberOfPlayers = scanner.nextInt();

        System.out.println("How many bots?");
        int numberOfBots = scanner.nextInt();
        List<Player> players = new ArrayList<>();
        for(int i=0;i<numberOfBots;i++)
        {
            System.out.println("Name of Bot " +(i+1));
            String botName = scanner.next();

            System.out.println("Symbol of Bot " + (i+1));
            Character character = scanner.next().charAt(0);

            System.out.println("Difficulty of Bot " + (i+1));
            String difficultyLevel = scanner.next();
            BotDifficultyLevel botDifficultyLevel = BotDifficultyLevelFactory.getBotDifficultyLevelByName(difficultyLevel);

            players.add(PlayerFactory.createBot(botName,character,botDifficultyLevel));
        }

        for(int i=numberOfBots;i<numberOfPlayers;i++)
        {
            System.out.println("Name of Player " +(i-numberOfBots+1));
            String playerName = scanner.next();

            System.out.println("Symbol of Player " + (i-numberOfBots+1));
            Character character = scanner.next().charAt(0);

            players.add(PlayerFactory.createHumanPlayer(playerName,character));
        }

        System.out.println("How many winning strategies?");
        Integer winningStrategiesCount = scanner.nextInt();

        List<GameWinningStrategyName> gameWinningStrategyNames = new ArrayList<>();
        for(int i=0;i<winningStrategiesCount;i++)
        {
            System.out.println("Name Strategy " + i);
            gameWinningStrategyNames.add(GameWinningStrategyNameEnumFactory.getGameWinningStrategyNameFromString(scanner.next()));
        }
        Game game = Game.getBuilder().setGameWinningStrategies(gameWinningStrategyNames).setPlayers(players).build();

        while(game.getGameStatus().equals(GameStatus.IN_PROGRESS))
        {
            game.makeMove();
        }
    }
}
