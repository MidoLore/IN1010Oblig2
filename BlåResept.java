public class BlåResept extends Resept{

    public BlåResept(Legemiddel legemiddel, Lege utskrivendeLege, int pasientId, int reit) {
        super(legemiddel, utskrivendeLege, pasientId, reit);
    }

    @Override
    public String farge() {
        return "Blå";
    }

    @Override
    public int prisAaBetale() {
        int pris = legemiddel.hentPris()* (100/25);
        pris = Math.round(pris);
        return pris;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", Farge: " + farge();
    }


}
