import java.util.Scanner;

void main() {
    System.out.println("Определить достоинство карты: ");
    Scanner sc = new Scanner(System.in);
    int month = sc.nextInt();

    switch (month){
        case 14: System.out.println("Туз"); break;
        case 13: System.out.println("Король"); break;
        case 12: System.out.println("Дама"); break;
        case 11: System.out.println("Валет"); break;
        case 10: System.out.println("Десятка"); break;
        case 9: System.out.println("Девятка"); break;
        case 8: System.out.println("Восьмёрка"); break;
        case 7: System.out.println("Семёрка"); break;
        case 6: System.out.println("Шестёрка"); break;
        default: System.out.println("Такой карты нет.");
    }


}

