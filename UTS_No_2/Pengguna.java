package UTS_No_2;

abstract class Pengguna {
    protected String nama;
    public Pengguna(String nama) {
        this.nama = nama;
    }
    abstract void lihatBuku();
}