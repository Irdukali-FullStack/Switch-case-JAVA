import java.util.Scanner;

void main() {
    System.out.println("Расписание занятий");
    Scanner sc = new Scanner(System.in);
    int para = sc.nextInt();

    switch (para){
        case 1: System.out.println("8:30-10:00"); break;
        case 2: System.out.println("10:10-11:40"); break;
        case 3: System.out.println("12:10-13:40"); break;
        case 4: System.out.println("13:50-15:20"); break;
        case 5: System.out.println("15:30-17:00"); break;
        case 6: System.out.println("17:10-18:40"); break;
        default: System.out.println("Неизвестный номер занятия");
    }


}

