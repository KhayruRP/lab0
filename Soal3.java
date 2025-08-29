package lab0;


import java.util.Scanner;
import java.util.Random;

public class Soal3 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Masukkan sebuah kalimat: ");
        String kalimat = Input.nextLine();

        Random random = new Random();
        int randNum1 = random.nextInt(kalimat.length());
        int randNum2 = random.nextInt(randNum1); // batas terkecil
        
        System.out.print("\nApa substring dari indeks "+ randNum2 + " hingga " + randNum1 + "? ");
        String kalimatBaru = kalimat.substring(randNum2, randNum1+1);
        String jawaban = Input.nextLine();
        if (jawaban.equals(kalimatBaru)){
            System.out.println("\u2714 Benar! Keren, kamu jago string!");
        }
        else{
            System.out.println("\u2717 Kurang tepat. Jawaban yang benar: " + kalimatBaru);
        }

       
		System.out.println(
                        "          ,     ,\n" + //
                        "          )\\___/(\n" + //
                        "         {(@)v(@)}\n" + //
                        "          {|~~~|}\n" + //
                        "          {/^^^\\}\n" + //
                        "           `m-m`");
        System.out.println("---------------------------");
        System.out.println("Khayru P \uD83E\uDD89 (NPM: 2406495893)");


    }
}
