package game;
import javax.swing.JFrame;
import java.awt.Color;
public class Main
{
    public static void main(String[] args)
    {
        JFrame jframe = new JFrame();
        jframe.setTitle("Snake Game");
        jframe.setResizable(true);
        jframe.setSize(900,700);
        jframe.setLocationRelativeTo(null);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setBackground(Color.DARK_GRAY);

        Gameplay gameplay = new Gameplay();
        jframe.add(gameplay);
        jframe.setVisible(true);
    }
}
