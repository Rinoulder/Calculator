import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String result = calc(input);
        System.out.println(result);
    }

public static String calc(String input) {
    String[] data = input.split(" ");
    if (data.length != 3) {
        throw new IllegalArgumentException("throws Exception //Формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
    }
    int a = Integer.parseInt(data[0]);
    if ((a < 1 || a > 10)) {
        throw new IllegalArgumentException("throws Exception //Вводимые значения должны быть от 1 до 10");
    }
    int b = Integer.parseInt(data[2]);
    if (b < 1 || b > 10) {
        throw new IllegalArgumentException("throws Exception //Вводимые значения должны быть от 1 до 10");
    }
    int result;
    switch (data[1]) {
        case "+":
            result = a + b;
            break;
        case "-":
            result = a - b;
            break;
        case "*":
            result = a * b;
            break;
        case "/":
            result = a / b;
            break;
        default:
            throw new IllegalArgumentException("throws Exception //Формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
    }
    return String.valueOf(result);
}
}







