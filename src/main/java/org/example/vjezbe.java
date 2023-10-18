package org.example;
import java.util.Scanner;

public class vjezbe {
    public static void main(String[] args) {
       // Scanner unos = new Scanner(System.in);
       // System.out.println("Upisite svoje ime");
       // String ime = unos.nextLine();
       // System.out.println(" upiste vase godiste ");
       // int godiste = Integer.parseInt(unos.nextLine());

       // System.out.println("hello "+ ime + " " + godiste);//

        Scanner Unos = new Scanner (System.in);
        System.out.println("Unesite prvi broj");
        int prvi = Integer.parseInt(Unos.nextLine());
        System.out.println("Unesite vasse ime");
        String ime = Unos.nextLine();
        System.out.println("Unesite drugi broj");
        int drugi = Integer.parseInt(Unos.nextLine());
        if(prvi>drugi){
            System.out.println("Prvi je veci od drugog");
        }else if (prvi==drugi){
            System.out.println("jednaki su");
        }
        else{
            System.out.println("drugi je veci od prvog");
        }



    }
}
