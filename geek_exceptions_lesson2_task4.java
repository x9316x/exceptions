import java.util.Scanner;

public class EmptyStringException extends Exception {
    public EmptyStringException(String message) {
        super(message);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");

        try {
            String input = scanner.nextLine();
            if (input.trim().isEmpty()) {
                throw new EmptyStringException("Пустые строки вводить нельзя!");
            }
            System.out.println("Вы ввели: " + input);
        } catch (EmptyStringException e) {
            System.out.println(e.getMessage());
        }
    }
}
