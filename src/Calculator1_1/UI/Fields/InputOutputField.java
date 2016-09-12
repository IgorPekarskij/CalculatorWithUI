package Calculator1_1.UI.Fields;

import javax.swing.*;
import java.awt.*;

public class InputOutputField extends JTextField {
    private JTextField ioField;
    private final int fieldColumns = 20;
    private final String fieldText = "введите число";

    public InputOutputField() {
        ioField = new JTextField(fieldText, fieldColumns);
        ioField.setForeground(Color.blue);
        ioField.setFont(new Font("", Font.BOLD, 20));
        ioField.setPreferredSize(new Dimension(100, 50));

    }

    public JTextField getIoField() {
        return ioField;
    }
}
