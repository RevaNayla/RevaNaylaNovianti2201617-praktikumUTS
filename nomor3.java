import java.util.Scanner;

public class nomor3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan bilangan bulat: ");
        long bilangan = scanner.nextLong();
        
        int jumlahDigit = sumDigits(bilangan);
        
        System.out.println("Jumlah digit dalam bilangan " + bilangan + " adalah: " + jumlahDigit);
        
        scanner.close();
    }
    
    public static int sumDigits(long n) {
        int sum = 0;
        
        // Menggunakan loop untuk mengekstrak dan menghapus digit berulang kali
        while (n != 0) {
            sum += n % 10; // Menambahkan digit terakhir ke sum
            n /= 10; // Menghapus digit terakhir
        }
        
        return sum;
    }
}
