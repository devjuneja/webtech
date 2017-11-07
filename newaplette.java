import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author Kartik Sinha
 */
public class NewApplet extends Applet implements ActionListener {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    
    TextField t1 = new TextField(15);
    TextField t2 = new TextField(15);
    Checkbox c1 = new Checkbox("Sum");
    Checkbox c2 = new Checkbox("Sub");
    Checkbox c3 = new Checkbox("Mul");
    Checkbox c4 = new Checkbox("Div");
    Button b1 = new Button("Calculate");
    TextArea ta = new TextArea(" ");
   // CheckboxGroup g = new CheckboxGroup();
    public void init(){
        add(new Label("First Number: "));
        add(t1);
        add(new Label("Second Number: "));
        add(t2);
        add(c1);
        add(c2);
        add(c3);
        add(c4);
       /* c1.setCheckboxGroup(g);
        c2.setCheckboxGroup(g);
        c4.setCheckboxGroup(g);
        c3.setCheckboxGroup(g);*/
        /*add(b1);
        b1.addActionListener(this);
        add(new Label("Result: "));
        add(ta);*/
    }