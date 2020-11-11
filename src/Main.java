public class Main {

    public static void main(String[] args) {
        Student student = new Student("Hristina", "Mitrovska", 20);
        student.setOcenka(new Ocenka(10, "ASP", "10.11.2020"));
        student.setOcenka(new Ocenka(8, "OPP", "23.11.2020"));
        student.setOcenka(new Ocenka(7, "Angliski Jazik", "25.11.2020"));
        student.setOcenka(new Ocenka(8, "PKM", "28.11.2020"));

        System.out.println(student.getProsek());
    }
}