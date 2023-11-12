package UTS_No_2;
class Buku {
    private String genre;
    private String judul;
    public Buku(String genre, String judul) {
        this.genre = genre;
        this.judul = judul;
    }
    public String getGenre() {
        return genre;
    }
    public String getJudul() {
        return judul;
    }
}