import javax.swing.JPanel;

import java.awt.*;
import javax.swing.*;
public class MyDrawPanel extends JPanel{
    public void paintComponent(Graphics g){
        g.setColor(getRandomColor());
        g.fillRect(0,0,this.getWidth(), this.getHeight());
        g.setColor(getRandomColor());
<<<<<<< HEAD
        g.fillOval(50, 70, 100, 100);
=======
        g.fillOval(80, 70, 100, 100);
>>>>>>> 6a0502c0bfd062aea8fa014c2c1d927c4b95e66c
    }
    public Color getRandomColor(){
        int red = (int) (Math.random() * 255);
        int green = (int) (Math.random() * 255);
        int blue = (int) (Math.random() * 255);
        Color randomColour = new Color(red, green, blue);
        return randomColour;
    }
}
