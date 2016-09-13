package Calculator1_1.UI.Fields;

import Calculator1_1.UI.Buttons.ButtonsListener;

import javax.swing.*;
import java.awt.*;


public class InputOutputField extends JTextField{
    private static InputOutputField ioField;
    private final int fieldColumns = 20;
    private final String defoultFieldText = "введите число";

   private InputOutputField() {
        super();
    }

   public static InputOutputField createIOField(){
       if(ioField == null)
            ioField = new InputOutputField();
       return ioField;
   }
   public  void setOptions(){
        ioField.setText(defoultFieldText);
        ioField.setColumns(fieldColumns);
        ioField.setForeground(Color.blue);
        ioField.setFont(new Font("", Font.BOLD, 20));
        ioField.setPreferredSize(new Dimension(100, 50));
        ioField.setEditable(false);
        ioField.addActionListener(new ButtonsListener(ioField));
    }
    public static InputOutputField getIoField() {
        return ioField;
    }

    public String getDefoultFieldText() {
        return defoultFieldText;
    }
    //    public void actionPerformed(ActionEvent e) {
//        String currentChar = e.getActionCommand();
//        double number = Double.parseDouble(currentChar);
//
//        StringBuilder appendString = new StringBuilder(enteredString);
//        appendString.append(currentChar);
//
//        ioField.setText(appendString.toString());
//    }
}
