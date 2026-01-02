import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Main {
  public static void main(String[] args){
    JFrame frame = new JFrame(); 
frame.setSize(500, 500);
frame.setTitle("Contador");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setResizable(false);
    frame.setVisible(true);
    frame.getContentPane().setBackground(new Color(0x121212));
JButton button = new JButton();
frame.add(button);
button.setBounds(85,80,50,30);

ImageIcon image = new ImageIcon("./e1497514ab168e36120bb64668dbc7af.png");
frame.setIconImage(image.getImage());
}

}
