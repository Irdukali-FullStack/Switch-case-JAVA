import java.util.Scanner;

void main() {
    System.out.println("Введите номер дня недели 1-7");
    Scanner sc = new Scanner(System.in);
    int week = sc.nextInt();

    switch (week){
        case 1: System.out.println("Понедельник"); break;
        case 2: System.out.println("Вторник"); break;
        case 3: System.out.println("Среда"); break;
        case 4: System.out.println("Четверг"); break;
        case 5: System.out.println("Пятница"); break;
        case 6: System.out.println("Суббота"); break;
        case 7: System.out.println("Воскресенье"); break;
        default: System.out.println("Введено неверное значение.");
    }


}

