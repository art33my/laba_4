import java.util.Scanner;

// Класс для пользовательского исключения
class CustomAgeException extends Exception {
    public CustomAgeException(String message) {
        super(message);
    }
}

public class AgeValidator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ваш возраст: ");
        
        try {
            int age = scanner.nextInt();
            validateAge(age);
            System.out.println("Ваш возраст: " + age);
        } catch (CustomAgeException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Ошибка: Пожалуйста, введите корректное число.");
        } finally {
            scanner.close();
        }
    }

    // Метод для проверки возраста
    public static void validateAge(int age) throws CustomAgeException {
        if (age < 0 || age > 120) {
            throw new CustomAgeException("Недопустимый возраст. Возраст должен быть в диапазоне от 0 до 120.");
        }
    }
}
