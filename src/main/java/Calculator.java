import javax.swing.*;
import java.awt.*;

public class Calculator extends JFrame {

    public Calculator() {

        setLocation(600, 300);
        setSize(500, 600);
        setName("C A L C U L A T O R");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        ButtonPanel bp = new ButtonPanel();
        add(bp.screen, BorderLayout.NORTH);
        add(bp, BorderLayout.CENTER);
        setVisible(true);

    }
}