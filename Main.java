public class Main {
    public static void main(String[] args) {
        Montre montre1 = new Montre(23, 59);
        Montre montre2 = new Montre(montre1);

        System.out.println(montre1.getHeure() + " " + montre1.getMinute());
        System.out.println(montre2.getHeure() + " " + montre2.getMinute());
        montre1.avancer();
        System.out.println(montre1.getHeure() + " " + montre1.getMinute());

    }
}
