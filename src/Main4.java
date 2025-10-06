import java.util.Scanner;

void main() {
    System.out.println("Признак транспортного средства (а, в, м, с, п)");
    Scanner sc = new Scanner(System.in);
    char transport = sc.next().charAt(0);

    switch (transport){
        case 'а': System.out.println("MAX: 250 км/ч"); break;
        case 'в': System.out.println("MAX: 50 км/ч"); break;
        case 'м': System.out.println("MAX: 300 км/ч"); break;
        case 'с': System.out.println("MAX: 950 км/ч"); break;
        case 'п': System.out.println("MAX: 350 км/ч"); break;
        default: System.out.println("Неверный тип транспорта.");
    }


}

