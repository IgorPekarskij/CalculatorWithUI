package Calculator1_1.UI.Buttons;

import Calculator1_1.Computing.Comput;
import Calculator1_1.UI.Fields.InputOutputField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonsListener implements ActionListener {

    private InputOutputField field;
    private static String enteredNumber ="";
    private static String firstNumber = "0";
    private static String secondNumber = "0";
    private static String operationCharacter = "!";

    public ButtonsListener(InputOutputField field) {
        this.field = field.getIoField();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String button = e.getActionCommand();
        StringBuilder appendChars = new StringBuilder(enteredNumber);
        if(checkNumber(button) ){
            enteredNumber = appendChars.append(button).toString();
            field.setText(enteredNumber);
        }else if (button.equals(".")){
            if(enteredNumber.contains(".")){
                enteredNumber = appendChars.append("").toString();
                field.setText(enteredNumber);
            }else {
                enteredNumber = appendChars.append(button).toString();
                field.setText(enteredNumber);
            }
        }else if (button.equals("CLR")){
            clear();
            field.setText(field.getDefoultFieldText());

        }else if(button.equals("=")){
                secondNumber = enteredNumber;
                Double result = Comput.compute(firstNumber, secondNumber, operationCharacter);
                enteredNumber = "";
                firstNumber = result.toString();
                field.setText("= " + firstNumber);

        }else {
            if(enteredNumber != ""){
                firstNumber = enteredNumber;
            }
                operationCharacter = button;
                enteredNumber = "";
        }

    }
    private boolean checkNumber(String button){
        try {
            Integer.parseInt(button);
            return true;
        }catch (NumberFormatException ignore){
            return false;
        }
    }

    private void clear(){
        enteredNumber ="" ;
        firstNumber = "0";
        secondNumber = "0";
        operationCharacter = "!";
    }
}
