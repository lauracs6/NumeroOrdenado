public class NumeroOrdenado {
      
    public static boolean tidyNumber(int number) {
        int[] numbers = Integer.toString(number).chars()    //conversión de int a String y de String a array de caracteres
                          .map(Character::getNumericValue)
                          .toArray();
  
        for (int i = 0; i < numbers.length - 1; i++) { 
            if (numbers[i] > numbers[i + 1]) {
                return true;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int number1 = 12;
        int number2 = 102;
        System.out.println(tidyNumber(number1)); // true
        System.out.println(tidyNumber(number2)); // false
    }
}
