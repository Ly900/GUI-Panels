import javax.swing.*;
import java.awt.*;

public class Panel1 {

  public static void main(String[] args) {
    Panel1 gui = new Panel1();
    gui.go();
  }

  public void go() {
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    panel.setBackground(Color.darkGray);
    panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

    JButton button = new JButton("First!");
    panel.add(button);

    JButton button2 = new JButton("Hi.");
    panel.add(button2);

    JButton button3 = new JButton("Ho.");
    panel.add(button3);

    frame.getContentPane().add(BorderLayout.EAST, panel);
    frame.setSize(250,200);
    frame.setVisible(true);
  }

}
