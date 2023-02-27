package application;

import data.*;

public class AbsensiApp {
    public static void main(String[] args) {

        User guru1 = new Guru("Budi", "123");
        ((Guru) guru1).setNamaGuru("Budi Budiman");
        ((Guru) guru1).setNIP("103942239423");
        ((Guru) guru1).setGender(Gender.PRIA);
        System.out.println("Nama Guru1: " + ((Guru) guru1).getNamaGuru());
        System.out.println("NIP Guru1: " + ((Guru) guru1).getNIP());
        System.out.println("Gender: " + ((Guru) guru1).getGender() + "\n");

        User guru2 = new Guru("Chika", "982");
        ((Guru) guru2).setNamaGuru("Chika Sucika");
        ((Guru) guru2).setNIP("103942230833");
        ((Guru) guru2).setGender(Gender.WANITA);
        System.out.println("Nama Guru2: " + ((Guru) guru2).getNamaGuru());
        System.out.println("NIP Guru2: " + ((Guru) guru2).getNIP());
        System.out.println("Gender: " + ((Guru) guru2).getGender() + "\n");

        User admin = new Admin("admin01", "000");

        Admin.Mapel mapel1 = ((Admin) admin).new Mapel();
        mapel1.setNameMapel("Fisika");
        mapel1.setKodeMapel(102);
        System.out.println("Nama mapel: " + mapel1.getNameMapel());
        System.out.println("Kode mapel: " + mapel1.getKodeMapel() + "\n");

        Admin.Mapel mapel2 = ((Admin) admin).new Mapel();
        mapel2.setNameMapel("Matematika");
        mapel2.setKodeMapel(103);
        System.out.println("Nama mapel: " + mapel2.getNameMapel());
        System.out.println("Kode mapel: " + mapel2.getKodeMapel() + "\n");

        Admin.Mapel mapel3 = ((Admin) admin).new Mapel();
        mapel3.setNameMapel("Biologi");
        mapel3.setKodeMapel(101);
        System.out.println("Nama mapel: " + mapel3.getNameMapel());
        System.out.println("Kode mapel: " + mapel3.getKodeMapel() + "\n");


        Admin.RuanganKelas kelas1 = ((Admin) admin).new RuanganKelas();
        kelas1.setNamaKelas("MIPA 1-1");
        kelas1.setCapacity(20);
        System.out.println("Nama Kelas: " + kelas1.getNamaKelas());
        System.out.println("Kapasitas: " + kelas1.getCapacity() + "\n");

        Admin.RuanganKelas kelas2 = ((Admin) admin).new RuanganKelas();
        kelas2.setNamaKelas("MIPA 1-2");
        kelas2.setCapacity(30);
        System.out.println("Nama Kelas: " + kelas2.getNamaKelas());
        System.out.println("Kapasitas: " + kelas2.getCapacity() + "\n");

        Admin.RuanganKelas kelas3 = ((Admin) admin).new RuanganKelas();
        kelas3.setNamaKelas("MIPA 1-3");
        kelas3.setCapacity(40);
        System.out.println("Nama Kelas: " + kelas3.getNamaKelas());
        System.out.println("Kapasitas: " + kelas3.getCapacity() + "\n");

        Siswa siswa1 = new Siswa();
        siswa1.setNamaSiswa("Joko");
        siswa1.setNISN("1709247389");
        siswa1.setGender(Gender.PRIA);
        System.out.println("Nama Siswa: " + siswa1.getNamaSiswa());
        System.out.println("NISN: " + siswa1.getNISN());
        System.out.println("Gender: " + siswa1.getGender() + "\n");

        Siswa siswa2 = new Siswa();
        siswa2.setNamaSiswa("Tania");
        siswa2.setNISN("1709247002");
        siswa2.setGender(Gender.WANITA);
        System.out.println("Nama Siswa: " + siswa2.getNamaSiswa());
        System.out.println("NISN: " + siswa2.getNISN());
        System.out.println("Gender: " + siswa2.getGender() + "\n");

        Siswa siswa3 = new Siswa();
        siswa3.setNamaSiswa("Katherine");
        siswa3.setNISN("1709240015");
        siswa3.setGender(Gender.WANITA);
        System.out.println("Nama Siswa: " + siswa3.getNamaSiswa());
        System.out.println("NISN: " + siswa3.getNISN());
        System.out.println("Gender: " + siswa3.getGender());

    }
}
