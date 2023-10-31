public class Montre {
    private int heure = 0;
    private int minute = 0;

    public Montre(int heure, int minute) {
        this.heure = heure;
        this.minute = minute;
    }

    public Montre(Montre montre) {
        this.heure = montre.getHeure();
        this.minute = montre.getMinute();
    }

    public int getHeure() {
        return this.heure;
    }

    public int getMinute() {
        return this.minute;
    }

    public void avancer() {
        if (this.minute == 59) {
            this.minute = 0;
            if (this.heure == 23) {
                this.heure = 0;
            } else {
                this.heure++;
            }
        } else {
            this.minute++;
        }
    }
}
