import java.util.Scanner;

void main() {
    System.out.println("Введите номер цвета радуги");
    Scanner sc = new Scanner(System.in);
    int LGBT = sc.nextInt();

    switch (LGBT){
        case 1: System.out.println("Красный"); break;
        case 2: System.out.println("Оранжевый"); break;
        case 3: System.out.println("Жёлтый"); break;
        case 4: System.out.println("Зелёный"); break;
        case 5: System.out.println("Голубой"); break;
        case 6: System.out.println("Синий"); break;
        case 7: System.out.println("Фиолетовый"); break;
        default: System.out.println("В радуге такого цвета в радуге нет.");
    }


}

