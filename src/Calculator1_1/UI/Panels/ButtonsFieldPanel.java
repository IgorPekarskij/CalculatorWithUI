package Calculator1_1.UI.Panels;

import javax.swing.*;
import java.awt.*;

public class ButtonsFieldPanel extends JPanel{

    private JPanel calcPanel;
    private final int PANELE_WIDTH = 300;
    private final int PANELE_HEIGHT = 220;

    public ButtonsFieldPanel() {
//        super(layout);
        this.calcPanel = new JPanel();

        calcPanel.setSize(new Dimension(PANELE_WIDTH, PANELE_HEIGHT));
        calcPanel.setBorder(BorderFactory.createLineBorder(Color.BLUE));

        GridLayout buttonsGrid = new GridLayout(4,5,5,5);
        calcPanel.setLayout(buttonsGrid);
    }


    public JPanel getCalcPanel() {
        return calcPanel;
    }
}
