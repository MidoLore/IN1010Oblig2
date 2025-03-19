public class Spesialist extends Lege implements Godkjenningsfritak{
    private String kontrollkode;
    public Spesialist(String legeNavn, String kontrollkode) {
        super(legeNavn);
        this.kontrollkode = kontrollkode;
    }

    @Override
    public String hentKontrollkode() {
        return kontrollkode;
    }

    @Override
    public String toString() {
        return super.toString() + ", Spesialist, Kontrollkode: " + kontrollkode;
    }
}
