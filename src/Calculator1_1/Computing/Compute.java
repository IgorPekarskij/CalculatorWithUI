package Calculator1_1.Computing;

public class Compute {

    public static double compute(String firstNumber, String secondNumber,
                                 String operationCharacter, String percent){
        double result = 0;
        double first = Double.parseDouble(firstNumber);
        double second = Double.parseDouble(secondNumber);
        if(operationCharacter.equals("+")){
            if(percent != null)
                second = computePercent(first, second);
            return result = first + second;

        }else if (operationCharacter.equals("-")){
            if(percent != null)
                second = computePercent(first, second);
            return result = first - second;

        }else if (operationCharacter.equals("*")){
            if(percent != null)
                second = computePercent(first, second);
            return result = first * second;

        }else if (operationCharacter.equals("/")){
            if(percent != null)
                second = computePercent(first, second);
            return result = first / second;

        }
        return result;
    }

    private static double computePercent(double number, double percent){
        return number*(percent/100);
    }
}
