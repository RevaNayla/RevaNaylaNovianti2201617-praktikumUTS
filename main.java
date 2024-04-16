public class main {
    public static void main(String[] args) {
        LimasSegiEmpat limas1 = new LimasSegiEmpat(1.0, 1.0, 1.0);
        LimasSegiEmpat limas2 = new LimasSegiEmpat(30.0, 40.0, 50.0);
        LimasSegiEmpat limas3 = new LimasSegiEmpat(25.0, 35.0, 45.0);

        displayLimas(limas1);
        displayLimas(limas2);
        displayLimas(limas3);
    }

    public static void displayLimas(LimasSegiEmpat limas) {
        System.out.println("Limas segi empat dengan luas alas: " + limas.getLuasAlas() +
                ", luas selubung limas: " + limas.getLuasSelubungLimas() +
                " dan tinggi: " + limas.getTinggi() + ". Luasnya: " + limas.getLuas() +
                ", sedangkan volumenya: " + limas.getVolume());
    }
}
