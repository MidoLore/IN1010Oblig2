public class TestResept {
    public static void main(String[] args) {
        HvitResept hvitResept = new HvitResept(null, null, 0, 0);
        BlåResept blåResept = new BlåResept(null, null, 0, 0);
        MilitærResept militærResept = new MilitærResept(null, null, 0, 0);
        PResept pResept = new PResept(null, null, 0, 0);

        Narkotisk narkotisk = new Narkotisk("narkotisk", 150, 10.0, 5);
        Vanedannende vanedannende = new Vanedannende("vanedannende", 120, 5.0, 3);
        Vanlig vanlig = new Vanlig("vanlig", 50, 2.0);

        

    }


}
