class KaryawanTetap extends Karyawan implements BonusCalculable {
    private double gajiPokok;

    public KaryawanTetap(String nama, String id, double gajiPokok) {
        super(nama, id);
        this.gajiPokok = gajiPokok;
    }

    @Override
    public double hitungGaji() {
        return gajiPokok + hitungBonus();
    }

    @Override
    public double hitungBonus() {
        return gajiPokok * 0.10;
    }
}