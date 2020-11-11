import java.util.Arrays;

public class Student extends Chovek{
    private Ocenka[] niza = {};

    public float getProsek() {
        int br=0;
        for(int i=0; i<this.niza.length; i++)
            br+=this.niza[i].getOcenka();
        return (float)br/this.niza.length;
    }

    public Student(String ime, String prezime, int godini) {
        this.godini = godini;
        this.ime = ime;
        this.prezime = prezime;
    }

    public Student(){

    }

    @Override
    public String toString() {
        return "Student: {" +
                "godini='" + godini + '\'' +
                ", ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                ", ocenki='" + niza + '\'' +
                '}';
    }

    public Ocenka[] getOcenki(){
        return this.niza;
    }

    public void setOcenka(Ocenka o) {
        int dolzina = this.niza.length;
        int nova_dolzina = this.niza.length + 1;
        this.niza = Arrays.copyOf(this.niza, nova_dolzina);
        this.niza[dolzina] = o;
    }

}