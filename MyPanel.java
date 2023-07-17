import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyPanel extends JPanel implements ActionListener 
{
   
   final int PANEL_WIDTH = 1000;
   final int PANEL_HEIGHT = 1000;
   Image image;
   Image background;
   Timer timer;
   int xVelocity = 5;
   int yVelocity = 1;
   int x = 0;
   int y = 0;
   
   public MyPanel()
   {
      this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
      image = new ImageIcon("cat.png").getImage();
      background = new ImageIcon("background.png").getImage();
      timer = new Timer(1, this);
      timer.start();
   }
   
   public void paint(Graphics g)
   {
      super.paint(g); //paint background
      
      Graphics2D g2D = (Graphics2D) g;
      
      g2D.drawImage(background, 0, 0, null);
      g2D.drawImage(image, x, y, null);
   }
   
   @Override
   public void actionPerformed(ActionEvent e)
   {
      if (x >= PANEL_WIDTH - image.getWidth(null) || x < 0)
      {
         xVelocity *= -1;
      }
      x += xVelocity;
      
      if (y >= PANEL_HEIGHT - image.getHeight(null) || y < 0)
      {
         yVelocity *= -1;
      }
      y += yVelocity;
      
      repaint();
   }
}