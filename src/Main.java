import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;
        double total = 0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("harmonik sayı serisini hesaplamak istediğiniz sayıyı giriniz.");
        number= scanner.nextInt();
        for (int i=1;i<=number;i++){
            total+=1.0/i;
        }
        System.out.println("harmonik seri toplamı:"+total);
    }
}