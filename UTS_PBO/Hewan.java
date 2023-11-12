package UTS_PBO;
class Hewan {
    // Atribut jenisSuara
    protected String jenisSuara;

    // Konstruktor
    public Hewan(String jenisSuara) {
        this.jenisSuara = jenisSuara;
    }

    // Metode bersuara()
    public void bersuara() {
        System.out.println(jenisSuara);
    }
}