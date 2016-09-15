package Calculator1_1.UI.Buttons;

import Calculator1_1.Computing.Compute;
import Calculator1_1.UI.Fields.InputOutputField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonsListener implements ActionListener {

    private InputOutputField field;
    private static String enteredNumber ="";
    private static String firstNumber = "0";
    private static String secondNumber = "0";
    private static String operationCharacter = "!";
    private static int countMinus = 0;

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
            field.setText(field.getDefaultFieldText());

        }else if(button.equals("=")){
                displayResult(null);

        }else if(button.equals("%")){
            displayResult(button);

        }else if(button.equals("minus")){
            if(countMinus == 0) {
                enteredNumber = "-" + enteredNumber;
                field.setText(enteredNumber);
                countMinus++;
            }else {
                enteredNumber = enteredNumber.substring(1);
                field.setText(enteredNumber);
                countMinus --;
            }
        }
        // If character equals [+||-||*||/]
        else {
            if(enteredNumber != ""){
                firstNumber = enteredNumber;
            }
                operationCharacter = button;
                enteredNumber = "";
                countMinus = 0;
        }
    }
    // Method checked is current clicked button with number or not
    private boolean checkNumber(String button){
        try {
            Integer.parseInt(button);
            return true;
        }catch (NumberFormatException ignore){
            return false;
        }
    }
    //Method resets all calculation
    private void clear(){
        enteredNumber ="" ;
        firstNumber = "0";
        secondNumber = "0";
        operationCharacter = "!";
        countMinus = 0;
    }

    private void displayResult(String percent){
        secondNumber = enteredNumber;
        Double result = Compute.compute(firstNumber, secondNumber, operationCharacter, percent);
        enteredNumber = "";
        firstNumber = result.toString();
        field.setText("= " + firstNumber);
    }
}
