class KaryawanKontrak extends Karyawan {
    private double upahPerJam;
    private int jamKerja;

    public KaryawanKontrak(String nama, String id, double upahPerJam, int jamKerja) {
        super(nama, id);
        this.upahPerJam = upahPerJam;
        this.jamKerja = jamKerja;
    }

    @Override
    public double hitungGaji() {
        return upahPerJam * jamKerja;
    }
}