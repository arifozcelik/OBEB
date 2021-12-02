package kitapSonuOrnekleri;

import java.util.Scanner;

public class OBEB {
    public static void main(String[] args) {
        Scanner gir = new Scanner(System.in);
        int s1,s2,Enk;
        System.out.printf("1.sayı:");
        s1 = gir.nextInt();
        System.out.printf("2.sayı:");
        s2 = gir.nextInt();

        if(s1<s2) Enk = s1;
        else Enk = s2;
        while ((s1 % Enk != 0 || s2 % Enk !=0))
        {
            Enk = Enk - 1;
        }
        if (Enk == 1)
            System.out.println("Sayılar aralarında asaldır.");
        else
            System.out.println("Obeb...: " + Enk);
    }
}
