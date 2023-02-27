package data;

public class Admin extends User {

    public Admin(String username, String password) {
        super(username, password);
    }

    public class Mapel {
        private String nameMapel;
        private int kodeMapel;

        public String getNameMapel() {
            return nameMapel;
        }

        public void setNameMapel(String nameMapel) {
            this.nameMapel = nameMapel;
        }

        public int getKodeMapel() {
            return kodeMapel;
        }

        public void setKodeMapel(int kodeMapel) {
            this.kodeMapel = kodeMapel;
        }
    }

    public class RuanganKelas {

        private String namaKelas;
        private int capacity;

        public String getNamaKelas() {
            return namaKelas;
        }

        public void setNamaKelas(String namaKelas) {
            this.namaKelas = namaKelas;
        }

        public int getCapacity() {
            return capacity;
        }

        public void setCapacity(int capacity) {
            this.capacity = capacity;
        }
    }

}
