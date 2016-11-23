package connectfourgraphics;

import connectfourgraphics.Game.*;

public class Play 
{
    public Play()
    {

    }
    
    private static Game game = new Game();
    
    public static void start(int x, int y)
    {
        if (game.getGameState() != GameState.PLAYING)
            game.setGameState(GameState.PLAYING);
        game.createPanel(x, y);
        
    }
}
