import java.util.Random;

public class nomor1 {
    public static void main(String[] args) {
        // Membuat objek untuk menghasilkan bilangan acak
        Random rand = new Random();
        
        int nomorBulan = rand.nextInt(12) + 1;
        
        String namaBulan = "";
        switch (nomorBulan) {
            case 1:
                namaBulan = "Januari";
                break;
            case 2:
                namaBulan = "Februari";
                break;
            case 3:
                namaBulan = "Maret";
                break;
            case 4:
                namaBulan = "April";
                break;
            case 5:
                namaBulan = "Mei";
                break;
            case 6:
                namaBulan = "Juni";
                break;
            case 7:
                namaBulan = "Juli";
                break;
            case 8:
                namaBulan = "Agustus";
                break;
            case 9:
                namaBulan = "September";
                break;
            case 10:
                namaBulan = "Oktober";
                break;
            case 11:
                namaBulan = "November";
                break;
            case 12:
                namaBulan = "Desember";
                break;
        }
        
        // Menampilkan nama bulan yang dihasilkan
        System.out.println("Nomor bulan: " + nomorBulan);
        System.out.println("Nama bulan: " + namaBulan);
    }
}
