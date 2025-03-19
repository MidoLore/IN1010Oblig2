public class Lege {
    String legeNavn;

    public Lege(String legeNavn){
        this.legeNavn = legeNavn;
    }

    public String hentNavn() {
        return legeNavn;
    }

    @Override
    public String toString() {
        return "Lege: " + legeNavn;
    }
}
