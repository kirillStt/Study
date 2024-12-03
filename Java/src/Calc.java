import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        System.out.println("Введите первое число");
        double a = new Scanner(System.in).nextDouble();

        System.out.println("Введите арифметическое действие");
        char d = new Scanner(System.in).nextLine().charAt(0);

        System.out.println("Введите второе число");
        double b = new Scanner(System.in).nextDouble();

        switch(d) {
            case('+'):
                System.out.println("Сложение - " + (a+b));
                break;
            case('-'):
                System.out.println("Вычитание - " + (a-b));
                break;
            case('*'):
                System.out.println("Умножение - " + (a*b));
                break;
            case('/'):
                System.out.println("Деление - " + (a/b));
                break;
        }

    }
}
