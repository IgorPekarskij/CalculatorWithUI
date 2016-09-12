package Calculator1_1.UI.Frame;

import javax.swing.*;
import java.awt.*;

public class CalculatorFrame extends JFrame {
    private JFrame calculatorFrame;
    private final int FRAME_WIDTH = 470;
    private final int FRAME_HEIGHT = 370;

    public CalculatorFrame(){
        calculatorFrame = new JFrame("Calculator");
        calculatorFrame.setDefaultCloseOperation(CalculatorFrame.EXIT_ON_CLOSE);
        calculatorFrame.setSize(new Dimension(FRAME_WIDTH, FRAME_HEIGHT));
        BorderLayout borderFame = new BorderLayout(0, 7);
        calculatorFrame.setLayout(borderFame);
        calculatorFrame.setResizable(false);
        calculatorFrame.setLocationRelativeTo(null);
        calculatorFrame.setVisible(true);

    }

    public JFrame getCalculatorFrame() {
        return calculatorFrame;
    }
}
