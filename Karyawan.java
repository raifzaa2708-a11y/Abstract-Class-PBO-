abstract class Karyawan {
    protected String nama;
    protected String id;

    public Karyawan(String nama, String id) {
        this.nama = nama;
        this.id = id;
    }

    public abstract double hitungGaji();

    public void tampilkanInfo() {
        System.out.println("ID: " + id + " | Nama: " + nama);
    }
}