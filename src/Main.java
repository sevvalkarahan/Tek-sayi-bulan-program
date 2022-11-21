import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int toplam=0;
        Scanner input=new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int a=input.nextInt();
        while (a%2==0){
            System.out.println("Girdiğiniz sayı çifttir. Tekrar bir sayı giriniz:");
                if (a%4==0)
                toplam=toplam+a;
            a=input.nextInt();
        }

        System.out.println("Girdiğiniz sayı tektir.Tebrikler");
        System.out.println("---------------------VE-----------------------");
        System.out.println("girilen çift ve 4'ün katı olan sayıların toplamı: "+toplam);



    }
}
