public class LimasSegiEmpat {
    private double luasAlas;
    private double luasSelubungLimas;
    private double tinggi;

    public LimasSegiEmpat(double luasAlas, double luasSelubungLimas, double tinggi) {
        this.luasAlas = luasAlas;
        this.luasSelubungLimas = luasSelubungLimas;
        this.tinggi = tinggi;
    }

    public double getLuasAlas() {
        return luasAlas;
    }

    public double getLuasSelubungLimas() {
        return luasSelubungLimas;
    }

    public double getTinggi() {
        return tinggi;
    }

    public double getVolume() {
        return (1.0 / 3.0) * luasAlas * tinggi;
    }

    public double getLuas() {
        return luasAlas + luasSelubungLimas;
    }

    public void setLuasAlas(double luasAlasBaru) {
        this.luasAlas = luasAlasBaru;
    }

    public void setLuasSelubungLimas(double luasSelubungLimasBaru) {
        this.luasSelubungLimas = luasSelubungLimasBaru;
    }

    public void setTinggi(double tinggiBaru) {
        this.tinggi = tinggiBaru;
    }
}
