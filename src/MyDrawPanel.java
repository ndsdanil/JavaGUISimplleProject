import javax.swing.JPanel;

import java.awt.*;
import javax.swing.*;
public class MyDrawPanel extends JPanel{
    public void paintComponent(Graphics g){
        g.setColor(getRandomColor());
        g.fillRect(0,0,this.getWidth(), this.getHeight());
        g.setColor(getRandomColor());
        g.fillOval(70, 90, 100, 100);}
    public Color getRandomColor(){
        int red = (int) (Math.random() * 255);
        int green = (int) (Math.random() * 255);
        int blue = (int) (Math.random() * 255);
        Color randomColour = new Color(red, green, blue);
        return randomColour;
    }
}
