package connectfourgraphics;

import java.awt.*;
import javax.swing.*;
import java.lang.Enum;


public class Game 
{
    public Game()
    {
        
    }
    
    public enum GameState 
    {
        PAUSED, PLAYING, ENDING
    }
    
    private static GameState gameState = GameState.PAUSED;
    private static GridLayout gl;
    
    public static GameState getGameState()
    {
        return gameState;
    }
    
    public static void setGameState(GameState gs)
    {
        gameState = gs;
    }
    
    public static void move()
    {
        
    }
    
    public static int checkWin()
    {
        return 0; //TODO: change return
    }
    
    public static void createPanel(int x, int y)
    {
        gl = new GridLayout(x, y);
       JPanel window = new JPanel(gl);
    }
}
