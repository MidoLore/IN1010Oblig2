public class MilitærResept extends HvitResept{
    
    public MilitærResept(Legemiddel legemiddel, Lege utskrivendeLege, int pasientId, int reit){
        super(legemiddel, utskrivendeLege, pasientId, reit);
    }   

    public int prisAaBetale() {
        return 0;
    }

    @Override
    public String toString() {
        return super.toString() + ", Farge: Militær";
    }

}
