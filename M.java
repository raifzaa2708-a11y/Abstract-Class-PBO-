public class M {
    public static void main(String[] args) {
        Karyawan[] daftarKaryawan = new Karyawan[2];
        daftarKaryawan[0] = new KaryawanTetap("Aura", "TIF001", 5000000);
        daftarKaryawan[1] = new KaryawanKontrak("Rosa", "TIF002", 50000, 80);

        for (Karyawan k : daftarKaryawan) {
            k.tampilkanInfo();
            System.out.println("Total Gaji: Rp " + k.hitungGaji());
            System.out.println("---------------------------------");
        }
    }
}