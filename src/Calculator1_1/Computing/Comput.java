package Calculator1_1.Computing;

public class Comput {

    public static double compute(String firstNumber, String secondNumber, String operationCharacter){
        double result = 0;
        double first = Double.parseDouble(firstNumber);
        double second = Double.parseDouble(secondNumber);
        if(operationCharacter.equals("+")){
            result = first + second;
        }else if (operationCharacter.equals("-")){
            result = first - second;
        }else if (operationCharacter.equals("*")){
            result = first * second;
        }else if (operationCharacter.equals("/")){
            result = first / second;
        }

        return result;
    }
}
