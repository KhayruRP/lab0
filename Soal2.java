package lab0;


import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        


        System.out.print("Input angka pertama: ");
        int a = input.nextInt();
        System.out.print("Input angka kedua: ");
        int b = input.nextInt();
        System.out.print("Input angka ketiga: ");
        int c = input.nextInt();
        System.out.print("Input angka keempat: ");
        int d = input.nextInt();


        // terbesar
        int terbesar = a;
        if (b>terbesar){
            terbesar = b;
        }
        if (c>terbesar){
            terbesar = c;
        }
        if (d>terbesar){
            terbesar=d;
        }

        //terkecil
        int terkecil = a;
        if (b<terkecil){
            terkecil = b;
        }
        if (c<terkecil){
            terkecil = c;
        }
        if (d<terkecil){
            terkecil=d;
        }

        System.out.println("\n");
        System.out.println("Input terbesar adalah: " + terbesar);
        System.out.println("Input terbesar adalah: "+ terkecil);

        System.out.println("\n");

        System.out.println(
                        "          ,     ,\n" + //
                        "          )\\___/(\n" + //
                        "         {(@)v(@)}\n" + //
                        "          {|~~~|}\n" + //
                        "          {/^^^\\}\n" + //
                        "           `m-m`");
        System.out.println("---------------------------");
        System.out.println("Khayru P 🦉 (NPM: 2406495893)");

    }
}
