import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Jak masz na imię?");
        String imie=sc.nextLine();
        System.out.print("Ile masz lat?");
        int number1=sc.nextInt();
        System.out.print("Cześć" + imie + " miło Cię poznać :)");
    }
}