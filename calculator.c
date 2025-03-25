#include <stdio.h>
#include <math.h>

int main() {
    char operator;
    int number1, number2;
    float result;
    
    printf("Welcome to Simple Calculator!\n");

    while(1) {
        printf("First input an operator (+, -*./, ^) ...then two integer numbers and i will calculate the result\n");
        printf("An empty operator terminates the program!\n");
        
        printf("Operator (+, -, *, /, ^, x for exit): ");
        scanf(" %c", &operator);
        
        // Hier prüfen wir auf einen speziellen Wert wie 'q' oder 'x' zum Beenden
        if (operator == 'q' || operator == 'x') {
            printf("Program terminated.\n");
            break;
        }
        
        printf("Number 1:");
        scanf("%d", &number1);
        
        printf("Number 2:");
        scanf("%d", &number2);
        
        if (operator == '+') {
            result = number1 + number2;
        } else if (operator == '-') {
            result = number1 - number2;
        } else if (operator == '*') {
            result = number1 * number2;
        } else if (operator == '/') {
            result = (float)number1 / number2;
        } else if (operator == '^') {
            result = pow(number1, number2);
        } else {
            printf("Invalid operator\n");
            // Eingabepuffer leeren
            while (getchar() != '\n');
            continue;
        }
        
        printf("%d %c %d = %.2f\n", number1, operator, number2, result);
        
        // Eingabepuffer leeren
        while (getchar() != '\n');
    }
    
    return 0;
}