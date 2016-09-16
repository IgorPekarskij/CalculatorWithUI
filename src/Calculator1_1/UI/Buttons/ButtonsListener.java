package Calculator1_1.UI.Buttons;

import Calculator1_1.Computing.Compute;
import Calculator1_1.UI.Fields.InputOutputField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonsListener implements ActionListener {

    private InputOutputField field;
    private Compute compute;

    public ButtonsListener(InputOutputField field) {
        this.field = field.getIOField();
        this.compute = new Compute();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String button = e.getActionCommand();
        compute.handleButton(button, field);
    }
}
