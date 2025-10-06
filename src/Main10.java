import java.util.Scanner;

void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите признак животного (г, а, с, м, з) ");
        char animal = scanner.next().charAt(0);

        switch (animal) {
            case 'г': System.out.println("Скорость: 120 км/ч"); break;
            case 'а': System.out.println("Скорость: 80 км/ч"); break;
            case 'с': System.out.println("Скорость: 70 км/ч"); break;
            case 'м': System.out.println("Скорость: 50 км/ч"); break;
            case 'з': System.out.println("Скорость: 60 км/ч"); break;
            default: System.out.println("Неизвестное животное");
        }
    }