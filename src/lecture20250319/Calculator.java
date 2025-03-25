package lecture20250319;

public class Calculator {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        char operator;
        int number1, number2;
        double result;
        
        System.out.println("Welcome to Simple Calculator!");
        
        while(true) {
            System.out.println("First input an operator (+, -*./, ^) ...then two integer numbers and i will calculate the result");
            System.out.println("An empty operator terminates the program!");
            
            System.out.print("Operator: ");
            String input = scanner.nextLine();
            
            // Prüfe auf leere Eingabe
            if (input.isEmpty() || input.trim().isEmpty()) {
                System.out.println("Program terminated.");
                break;
            }
            
            operator = input.charAt(0);
            
            System.out.print("Number 1:");
            number1 = scanner.nextInt();
            
            System.out.print("Number 2:");
            number2 = scanner.nextInt();
            
            // Verbrauche das verbleibende Zeilenende
            scanner.nextLine();
            
            if (operator == '+') {
                result = number1 + number2;
            } else if (operator == '-') {
                result = number1 - number2;
            } else if (operator == '*') {
                result = number1 * number2;
            } else if (operator == '/') {
                result = (double)number1 / number2;
            } else if (operator == '^') {
                result = Math.pow(number1, number2);
            } else {
                System.out.println("Invalid operator");
                continue;
            }
            
            System.out.printf("%d %c %d = %.2f\n", number1, operator, number2, result);
        }
        
        scanner.close();
    }
}