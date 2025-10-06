import java.util.Scanner;

void main() {
    System.out.println("Введите номер масти 1-4:");
    Scanner sc = new Scanner(System.in);
    int m = sc.nextInt();

    switch (m){
        case 1: System.out.println("Пики "); break;
        case 2: System.out.println("Трефы"); break;
        case 3: System.out.println("Бубны"); break;
        case 4: System.out.println("Червы"); break;
        default: System.out.println("Неверный номер масти");
       }

    }

