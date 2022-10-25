import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Podaj pierwszą wartość");
        int number1=sc.nextInt();
        System.out.print("Podaj drugą wartość");
        int number2=sc.nextInt();
        System.out.print("Łączny wynik to " + (number1 + number2));
    }
}