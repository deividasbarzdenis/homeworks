package awt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Uzd1AWT extends Frame implements ActionListener {
    private Label label;
    private TextField text;
    Button button;
    private int count = 0;

    public Uzd1AWT() {
        setLayout(new FlowLayout());

        label = new Label("Counter");
        add(label);

        text = new TextField(count + "",10);
        text.setEditable(false);
        add(text);

        button = new Button("Count");
        add(button);

        button.addActionListener(this);

        setTitle("Counter");
        setSize(300,100);

        setVisible(true);
    }


    public static void main(String[] args) {
        Uzd1AWT counter = new Uzd1AWT();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ++count;
        text.setText(count + "");
    }
}
