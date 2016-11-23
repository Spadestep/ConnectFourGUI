package connectfourgraphics;

import java.util.Scanner;

public class ConnectFour {

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        
        int x = in.nextInt();
        int y = in.nextInt();
        
        Play.start(x, y);
    }
}
