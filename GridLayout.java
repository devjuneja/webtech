import java.awt.Button;
import java.awt.GridLayout;
import javax.swing.JFrame;

public class GridLayout extends JFrame {

    public static void main(String[] args) {
        GridLayoutExample a = new GridLayoutExample();
    }

    public GridLayout() {

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        GridLayout g = new GridLayout(3, 2);
        setLayout(g);
        setTitle("Grid Layout");
        setSize(300, 300);
        add(new Button("Button 1"));
        add(new Button("Button 2"));
        add(new Button("Button 3"));
        add(new Button("Button 4"));
        add(new Button("Button 5"));
        add(new Button("Button 6"));

    }

}