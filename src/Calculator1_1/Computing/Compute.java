package Calculator1_1.Computing;

import Calculator1_1.UI.Fields.InputOutputField;

public class Compute {

    private static String enteredNumber ="";
    private static String firstNumber = "";
    private static String secondNumber = "";
    private static String operationCharacter = "";
    private static int countMinus = 0;
    private static int countOperationCharacters = 0;

    public void handleButton(String button, InputOutputField field){

        StringBuilder appendChars = new StringBuilder(enteredNumber);
        if(checkNumber(button) ){
            enteredNumber = appendChars.append(button).toString();
            field.setText(enteredNumber);
        }else if (button.equals(".")){
            if(enteredNumber.contains(".")){
                field.setText(enteredNumber);
            }else {
                enteredNumber = appendChars.append(button).toString();
                field.setText(enteredNumber);
            }
        }else if (button.equals("CLR")){
            clear();
            field.setText(field.getDefaultFieldText());

        }else if(button.equals("=")){
            if(firstNumber.equals("")) {
                firstNumber = enteredNumber;
                enteredNumber = "";
            }
            displayResult(null, field);
            operationCharacter = "";
            countOperationCharacters = 0;

        }else if(button.equals("%")){
            displayResult(button, field);
            operationCharacter = "";
            countOperationCharacters = 0;

        }else if(button.equals("minus")){
            if(countMinus == 0 && enteredNumber != "") {
                enteredNumber = "-" + enteredNumber;
                field.setText(enteredNumber);
                countMinus++;
            }else {
                if(enteredNumber.length() > 1) {
                    enteredNumber = enteredNumber.substring(1);
                    field.setText(enteredNumber);
                    countMinus--;
                }
            }
        }
        // If character equals [+||-||*||/]
        else {

            if(enteredNumber != "" && firstNumber == ""){
                firstNumber = enteredNumber;

            }else if(secondNumber == "") {
                secondNumber = enteredNumber;
            }
            if (operationCharacter == "") {
                operationCharacter = button;
            }
            countOperationCharacters++;
            if(countOperationCharacters > 1 && secondNumber != ""){
                displayResult(null, field);
                operationCharacter = button;
            }
            enteredNumber = "";
            countMinus = 0;
        }
    }

    private void displayResult(String percent, InputOutputField field){

        secondNumber = enteredNumber;
        Double result = compute(firstNumber, secondNumber, operationCharacter, percent);
        enteredNumber = "";
        secondNumber = "";
        firstNumber = result.toString();
        field.setText("= " + firstNumber);
    }

    public double compute(String firstNumber, String secondNumber,
                                 String operationCharacter, String percent){
        if (secondNumber.equals(""))
            return Double.parseDouble(firstNumber);
        double first = Double.parseDouble(firstNumber);
        double second = Double.parseDouble(secondNumber);

        if(operationCharacter.equals("+")){
            if(percent != null)
                second = computePercent(first, second);
            return first + second;

        }else if (operationCharacter.equals("-")){
            if(percent != null)
                second = computePercent(first, second);
            return first - second;

        }else if (operationCharacter.equals("*")){
            if(percent != null)
                second = computePercent(first, second);
            return first * second;

        }else if (operationCharacter.equals("/")){
            if(percent != null)
                second = computePercent(first, second);
            return first / second;
        }
        return 0;
    }

    private double computePercent(double number, double percent){
        return number*(percent/100);
    }

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
        firstNumber = "";
        secondNumber = "";
        operationCharacter = "";
        countMinus = 0;
        countOperationCharacters = 0;
    }

}
