package Calculator1_1;


import Calculator1_1.UI.Buttons.ControlButton;
import Calculator1_1.UI.Fields.InputOutputField;
import Calculator1_1.UI.Frame.CalculatorFrame;
import Calculator1_1.UI.Panels.ButtonsFieldPanel;
import Calculator1_1.UI.Panels.TextFieldPanel;

import javax.swing.*;
import java.awt.*;

public class StartCalculator1_1 {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    UIManager.setLookAndFeel(new com.jtattoo.plaf.aero.AeroLookAndFeel());
                }catch (UnsupportedLookAndFeelException e) {}

                CalculatorFrame.setDefaultLookAndFeelDecorated(true);

                CalculatorFrame calculator = new CalculatorFrame();

                TextFieldPanel inputOutputPanel = new TextFieldPanel();
                InputOutputField inputOutputField = InputOutputField.createIOField();
                inputOutputField.setOptions();
                inputOutputPanel.getTextPanel().add(inputOutputField);

                ButtonsFieldPanel controlPanel = new ButtonsFieldPanel();
                controlPanel.getCalcPanel().add(ControlButton.createButton("7"));
                controlPanel.getCalcPanel().add(ControlButton.createButton("8"));
                controlPanel.getCalcPanel().add(ControlButton.createButton("9"));
                controlPanel.getCalcPanel().add(ControlButton.createButton("+"));
                controlPanel.getCalcPanel().add(ControlButton.createButton("-"));
                controlPanel.getCalcPanel().add(ControlButton.createButton("4"));
                controlPanel.getCalcPanel().add(ControlButton.createButton("5"));
                controlPanel.getCalcPanel().add(ControlButton.createButton("6"));
                controlPanel.getCalcPanel().add(ControlButton.createButton("*"));
                controlPanel.getCalcPanel().add(ControlButton.createButton("/"));
                controlPanel.getCalcPanel().add(ControlButton.createButton("1"));
                controlPanel.getCalcPanel().add(ControlButton.createButton("2"));
                controlPanel.getCalcPanel().add(ControlButton.createButton("3"));
                controlPanel.getCalcPanel().add(ControlButton.createButton("="));
                controlPanel.getCalcPanel().add(ControlButton.createButton("CLR"));
                controlPanel.getCalcPanel().add(ControlButton.createButton("0"));
                controlPanel.getCalcPanel().add(ControlButton.createButton("00"));
                controlPanel.getCalcPanel().add(ControlButton.createButton("."));


                calculator.getCalculatorFrame().add(inputOutputPanel.getTextPanel(), BorderLayout.NORTH);
                calculator.getCalculatorFrame().add(controlPanel.getCalcPanel(), BorderLayout.CENTER);
            }
        });
    }
}
