package Calculator1_1.UI.Buttons;

import Calculator1_1.UI.Fields.InputOutputField;

import javax.swing.*;
import java.awt.*;

public class ControlButton extends JButton {

    private static JButton controlButton;

    private final int BUTTON_WIDTH = 50;
    private final int BUTTON_HEIGHT = 50;

    private ControlButton(String buttonName) {
        this.controlButton = new JButton(buttonName);
        controlButton.setPreferredSize(new Dimension(BUTTON_WIDTH, BUTTON_HEIGHT));
        controlButton.addActionListener(new ButtonsListener(InputOutputField.getIOField()));
    }

    public static JButton createButton(String buttonName){
        new ControlButton(buttonName);
        return controlButton;

    }
}
