import java.util.Scanner;

public class nomor2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int nilai, jumlahPositif = 0, jumlahNegatif = 0;
        double total = 0;
        int count = 0;
        
        System.out.println("Masukkan bilangan integer (jika menginputkan bilangan 0 maka program akan berhenti):");
        
        do {
            nilai = scanner.nextInt();
            if (nilai > 0) {
                jumlahPositif++;
                total += nilai;
                count++;
            } else if (nilai < 0) {
                jumlahNegatif++;
                total += nilai;
                count++;
            }
        } while (nilai != 0);
        
        if (count == 0) {
            System.out.println("Tidak ada bilangan yang dimasukkan kecuali 0.");
        } else {
            double rataRata = total / count;
            
            System.out.println("Jumlah bilangan positif adalah " + jumlahPositif);
            System.out.println("Jumlah bilangan negatif adalah " + jumlahNegatif);
            System.out.println("Nilai total adalah " + total);
            System.out.println("Nilai rata-rata adalah " + rataRata);
        }
        
        scanner.close();
    }
}
