package Calculator1_1.UI.Buttons;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonsListener implements ActionListener {

    private ControlButton controlButton;
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton pressedButton =(JButton) e.getSource();

        switch (determineButton(pressedButton)){
            case "0":

                break;
            case "1":

                break;
            case "2":

                break;
            case "3":

                break;
            case "4":

                break;
            case "5":

                break;
            case "6":

                break;
            case "7":

                break;
            case "8":

                break;
            case "9":

                break;
            case "00":

                break;

        }
    }

    public String determineButton(JButton button){
        String currentButton = button.getText();

        return currentButton.trim();
    }
}
