import java.awt.*;
import javax.swing.*;

public class MyFrame extends JFrame
{

   private MyPanel panel;
   
   public MyFrame()
   {
      panel = new MyPanel();
      
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.add(panel);
      this.pack();
      this.setLocationRelativeTo(null); //appear in middle of screen
      this.setVisible(true);
   }

}