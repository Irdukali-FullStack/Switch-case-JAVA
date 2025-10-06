import java.util.Scanner;

void main() {
    System.out.println("Введите номер времени года");
    Scanner sc = new Scanner(System.in);
    int year = sc.nextInt();

    switch (year){
        case 1: System.out.println("Декабрь, Январь, Февраль."); break;
        case 2: System.out.println("Март, Апрель, Май."); break;
        case 3: System.out.println("Июнь, Июль, Август."); break;
        case 4: System.out.println("Сентябрь, Октябрь, Ноябрь."); break;
        default: System.out.println("Такогомвремени года не существует.");
    }


}

