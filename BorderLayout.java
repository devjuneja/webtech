import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Label;
import javax.swing.JFrame;

public class BorderLayout extends JFrame {

    public static void main(String[] args) {
        BorderLayoutExample a = new BorderLayoutExample();
    }

    public BorderLayout() {

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        BorderLayout b = new BorderLayout();
        setTitle("Border Layout");

        setSize(300, 300);
        add(new Button("North"), BorderLayout.NORTH);
        add(new Button("South"), BorderLayout.SOUTH);
        add(new Button("East"), BorderLayout.EAST);
        add(new Button("West"), BorderLayout.WEST);
        add(new Button("Center"), BorderLayout.CENTER);

    }
}