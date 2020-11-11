public class Chovek {
    protected int godini;
    protected String ime;
    protected String prezime;

    @Override
    public String toString() {
        return "Chovek: {" +
                "godini='" + godini + '\'' +
                ", ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                '}';
    }

    public Chovek(int godini, String ime, String prezime) {
        this.godini = godini;
        this.ime = ime;
        this.prezime = prezime;
    }

    public Chovek() {

    }

    public void setGodini(int godini) {
        this.godini = godini;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public int getGodini() {
        return godini;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

}