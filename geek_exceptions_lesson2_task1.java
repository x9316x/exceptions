import java.util.InputMismatchException;
import java.util.Scanner;

public class FloatInput {

    public static void main(String[] args) {
        // Запрос у пользователя числа
        System.out.println("Введите дробное число:");
        float userInput = getFloatInput();
        System.out.println("Вы ввели: " + userInput);
    }

    public static float getFloatInput() {
        Scanner scanner = new Scanner(System.in);
        float result;

        // Бесконечный цикл до тех пор, пока пользователь не введет корректное число
        while (true) {
            try {
                // Попытка считать введенное пользователем число
                result = scanner.nextFloat();
                break; // Выход из цикла, если число было введено корректно
            } catch (InputMismatchException e) {
                // Если пользователь ввел не число, то выводим ошибку
                System.out.println("Это не дробное число. Пожалуйста, введите дробное число снова:");
                scanner.next(); // Очистка буфера сканера от неверного ввода
            }
        }

        return result; // Возвращаем корректно введенное число
    }
}
