
package modullatihan1;

import java.util.Scanner;

public class BiodataDiri {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner scan=new Scanner(System.in);
       
        String nama,Almt, Lahir, Tgl, Jeniskelamin, Nis, Mottohidup;
       
        System.out.println();
        System.out.println("--------------------------------------");
        System.out.println("Bidodata Diri Anda                             ");
        System.out.println("--------------------------------------");
        System.out.println();
        System.out.println("Masukkan data anda dengan benar!");
        System.out.println();
        System.out.print("Nama           :");
        nama=scan.nextLine();
        System.out.print("Alamat         :");
        Almt=scan.nextLine();
        System.out.print("Tempat Lahir   :");
        Lahir=scan.nextLine();
        System.out.print("Tanggal Lahir  :");
        Tgl=scan.nextLine();
        System.out.print("Jenis Kelamin  :");
        Jeniskelamin=scan.nextLine();
        System.out.print("NIS            :");
        Nis=scan.nextLine();
        System.out.print("Motto Hidup    :");
        Mottohidup=scan.nextLine();
        System.out.println();
        System.out.println("======================================");
        System.out.println("          Biodata           ");
        System.out.println("======================================");
        System.out.println("Nama Lengkap   :"+nama);
        System.out.println("Alamat         :"+Almt);
        System.out.println("Tmpat/Tgl      :"+Lahir+", "+Tgl);
        System.out.println("Jenis Kelamin  :"+Jeniskelamin);
        System.out.println("NIS            :"+Nis);
        System.out.println("Motto Hidup    :"+Mottohidup);
        System.out.println("======================================");
             
       
    }
}