package Calculator1_1.UI.Panels;

import javax.swing.*;
import java.awt.*;

public class TextFieldPanel extends JPanel {
    private JPanel textPanel;
    private final int PANEL_WIDTH = 100;
    private final int PANEL_HEIGHT = 60;

    public TextFieldPanel() {
//        super(layout);
        this.textPanel = new JPanel();

        textPanel.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
        textPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        FlowLayout enterFieldLayout = new FlowLayout(FlowLayout.CENTER);
        textPanel.setLayout(enterFieldLayout);

    }

       public JPanel getTextPanel() {
        return textPanel;
    }
}
