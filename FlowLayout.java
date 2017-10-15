import java.awt.Button;
import java.awt.FlowLayout;
import javax.swing.JFrame;

public class FlowLayout extends JFrame {

    public static void main(String[] args) {
        FlowLayoutExample a = new FlowLayoutExample();
    }

    public FlowLayout() {

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        FlowLayout g = new FlowLayout();
        setLayout(g);
        setTitle("Flow Layout");
        setSize(300, 300);
        add(new Button("Button 1"));
        add(new Button("Button 2"));
        add(new Button("Button 3"));
        add(new Button("Button 4"));
        add(new Button("Button 5"));
        add(new Button("Button 6"));

    }
