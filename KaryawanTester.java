import java.util.Scanner;

public class KaryawanTester {
    public static void main(String[] args) {
        // object
        // class object
        Karyawan Tia = new Karyawan();
        Karyawan Rudi = new Karyawan();
        Karyawan Alex = new Karyawan();

         Scanner input = new Scanner(System.in);
        System.out.println("Inputkan Nama Siswa:");
        String nama = input.nextLine();
        System.out.println("Inputkan ID Siswa:");
        int id = input.nextInt();
        System.out.println("Inputkan IPK:");
        double ipk = input.nextDouble();


        Tia.id = 23;
        Tia.nama = "tia";
        Tia.unit = "TU";
        Tia.alamat = "Malang";

        System.out.println(Tia.nama);
        System.out.println(Tia.id);
        System.out.println(Tia.unit);
        System.out.println(Tia.alamat);

        Rudi.id = 9;
        Rudi.nama = "rudi";
        Rudi.unit = "Kurikulum";
        Rudi.alamat = "Jember";

        System.out.println(Rudi.nama);
        System.out.println(Rudi.id);
        System.out.println(Rudi.unit);
        System.out.println(Rudi.alamat);

        Alex.id = 87;
        Alex.nama = "alex";
        Alex.unit = "Kesiswaan";
        Alex.alamat = "alex";

        System.out.println(Alex.nama);
        System.out.println(Alex.id);
        System.out.println(Alex.unit);
        System.out.println(Alex.alamat);

        Tia.print();                                                                                                                                                                                                                                                
        Rudi.print();
        Alex.print();
        input.close();

    }
}