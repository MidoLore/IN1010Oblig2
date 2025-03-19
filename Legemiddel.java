abstract class Legemiddel {
    
    public final String navn;
    private int pris;
    public final double mengdeVirkestoff;
    private static int teller;
    public final int id;

    public Legemiddel(String navn, int pris, double mengdeVirkestoff){
        this.navn = navn;
        this.pris = pris;
        this.mengdeVirkestoff = mengdeVirkestoff;
        this.id = teller++;
    }
    public int hentPris(){
        return pris;
    }

    public void settNyPrris(int pris){
        this.pris = pris;
    }

    @Override
    public String toString(){
        return "ID: " + id + ", Navn: " + navn + ", Pris: " + pris + " kr, Virkestoff: " + mengdeVirkestoff + " mg";
    }
}