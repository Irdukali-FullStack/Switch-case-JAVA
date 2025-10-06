import java.util.Scanner;

void main() {
    System.out.println("Введите номер ноты");
    Scanner sc = new Scanner(System.in);
    int note = sc.nextInt();

    switch (note){
        case 1: System.out.println("До"); break;
        case 2: System.out.println("Ре"); break;
        case 3: System.out.println("Ми"); break;
        case 4: System.out.println("Фа"); break;
        case 5: System.out.println("Соль"); break;
        case 6: System.out.println("Ля"); break;
        case 7: System.out.println("Си"); break;
        case 8: System.out.println("До"); break;
        default: System.out.println("Такой ноты не существует.");
    }


}

