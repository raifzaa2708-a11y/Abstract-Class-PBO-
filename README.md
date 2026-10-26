# Tugas PBO  Java: Abstract Class, Interface, Inheritance, & Polymorphism
## Topik PBO yang Diimplementasikan

### 1. Abstract Class & Abstract Method (`Karyawan.java`)
- Class `Karyawan` bertindak sebagai Abstract Class yang mendefinisikan struktur asas bagi semua jenis pekerja.
- Mengandungi abstract method `hitungGaji()`. Method ini wajib di-override oleh setiap kelas anak (subclass) mengikut formula pengiraan gaji masing-masing.

### 2. Interface (`BonusCalculable.java`)
- `BonusCalculable` merupakan sebuah Interface yang menyediakan kontrak kaedah `hitungBonus()`.
- Digunakan secara khusus oleh kelas pekerja yang layak menerima elaun atau bonus tambahan.

### 3. Inheritance / Pewarisan (`KaryawanTetap.java` & `KaryawanKontrak.java`)
- `KaryawanTetap` dan `KaryawanKontrak` mewarisi (extends) sifat serta atribut `nama` dan `id` daripada kelas induk `Karyawan`.
- Masing-masing mempunyai atribut khusus (contohnya `gajiPokok` untuk pekerja tetap, serta `upahPerJam` dan `jamKerja` untuk pekerja kontrak).

### 4. Polymorphism (`Main.java`)
- Pemanggilan kaedah `hitungGaji()` dilakukan secara dinamik melalui objek bertipe induk `Karyawan` (runtime polymorphism).
- Atur cara akan secara automatik menjalankan pengiraan gaji yang sesuai bergantung kepada jenis objek asal (`KaryawanTetap` atau `KaryawanKontrak`).

## Struktur File

- `Karyawan.java` - Abstract Class (Induk)
- `BonusCalculable.java` - Interface
- `KaryawanTetap.java` - Subclass 1 (Pekerja Tetap)
- `KaryawanKontrak.java` - Subclass 2 (Pekerja Kontrak)
- `M.java` - Main Class untuk menjalankan program
- `class-diagram.png` 
