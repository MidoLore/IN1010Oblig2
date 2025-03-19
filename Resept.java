abstract class Resept {
    private static int teller = 0;
    protected int id;
    Legemiddel legemiddel;
    Lege utskrivendeLege;
    int pasientId; 
    int reit;
    
    public Resept(Legemiddel legemiddel, Lege utskrivendeLege, int pasientId, int reit){
        this.legemiddel = legemiddel;
        this.utskrivendeLege = utskrivendeLege;
        this.pasientId = pasientId;
        this.reit = reit;
        this.id += teller;
    }

    public int hentId(){
        return id;
    }

    public Legemiddel hentLegemiddel(){
        return legemiddel;
    }

    public Lege hentLege(){
        return utskrivendeLege;
    }

    public int hentPasientId(){
        return pasientId;
    }

    public int hentReit(){
        return reit;
    }

    public boolean bruk(){
        if (reit > 0){
            reit -= 1;
            return true;
        } else{
            return false;
        }

    }

    abstract public String farge();

    abstract public int prisAaBetale();

    @Override
    public String toString() {
        return "Resept ID: " + id + ", Legemiddel: " + legemiddel + ", Lege: " + utskrivendeLege.hentNavn() + ", Pasient ID: " + pasientId + ", Reit: " + reit;
    }


}
