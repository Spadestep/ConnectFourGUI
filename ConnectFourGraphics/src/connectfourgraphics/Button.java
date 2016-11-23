package connectfourgraphics;

import javax.swing.*;

public class Button 
{
    public Button(String fn)
    {
        filename = fn;
    }
    
    private String filename = "";
    
    private enum ButtonState
    {
        EMPTY, X, O
    }
    
    private ButtonState buttonState = ButtonState.EMPTY;
    
    public ButtonState getButtonState()
    {
        return buttonState;
    }
}
