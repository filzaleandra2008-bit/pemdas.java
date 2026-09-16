import java.util.Scanner;

public class presensi {
     public static void main (String[] args)
    {
        Scanner inp = new Scanner(System.in);
        String Nama, Kamar;
        int NIM, jamPresensi;

        System.out.print("Masukkan nama anda: ");
        Nama = inp.nextLine();

        System.out.print("Masukkan nomor kamar anda: ");
        Kamar = inp.nextLine();

        System.out.print("Masukkan NIM anda: ");
        NIM = inp.nextInt();
        
        System.out.print("Masukkan jam presensi: ");
        jamPresensi = inp.nextInt();

        if (jamPresensi<11) {
            System.out.println("Presensi telah diterima");

        }else{
            System.out.println("Presensi anda melewati batas waktu");
   
            inp.close();
    }   }

}


