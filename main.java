// Dimas Maulana Ishaq 202043500788 X5G
package pbo;

class koperasi {
    private int simpan, pinjam, jual;
    private String nama;

    koperasi(int a, int b, int c, String n) {
        simpan = a;
        pinjam = b;
        jual = c;
        nama = n;

    }

    koperasi() {
        System.out.println(simpan);
        System.out.println(pinjam);
        System.out.println(jual);
        System.out.println(nama);
    }

    private int jual(int nominal, int jumlah) {
        int total = nominal * jumlah;
        return this.jual = total;
    }

    private int simpan(int nominal, int jumlah) {
        int total = nominal * jumlah;
        return this.simpan = total;
    }

    private int pinjam(int nominal, int jumlah) {
        int total = nominal * jumlah;
        return this.pinjam = total;
    }

    public void getPinjam() {
        System.out.println(this.pinjam + " " + this.nama);
    }

    protected void setPinjam(int biaya, int jumlah, String nama) {
        pinjam(biaya, jumlah);
        this.nama = nama;
    }

    public void getSimpan() {
        System.out.println(this.simpan + " " + this.nama);
    }

    protected void setSimpan(int biaya, int jumlah, String nama) {
        simpan(biaya, jumlah);
        this.nama = nama;
    }

    public void getJual() {
        System.out.println(this.jual + " " + this.nama);
    }

    protected void setJual(int biaya, int jumlah, String nama) {
        jual(biaya, jumlah);
        this.nama = nama;
    }

}

public class main {
    public static void main(String[] args) {
        koperasi alfa = new koperasi(1, 2, 3, "dimas");
        alfa.setPinjam(100, 2000, "Dimas");
        alfa.getPinjam();

    }
}