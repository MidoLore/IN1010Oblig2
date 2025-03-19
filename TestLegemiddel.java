public class TestLegemiddel {
    public static void main(String[] args) {
        Narkotisk narkotisk = new Narkotisk("narkotisk", 150, 10.0, 5);
        Vanedannende vanedannende = new Vanedannende("vanedannende", 120, 5.0, 3);
        Vanlig vanlig = new Vanlig("vanlig", 50, 2.0);

        testLegemiddelId(narkotisk, 0);
        testLegemiddelNavn(narkotisk, "narkotisk");
        testVirkestoff(narkotisk, 10.0);

        testLegemiddelId(vanedannende, 1);
        testLegemiddelNavn(vanedannende, "vanedannende");
        testVirkestoff(vanedannende, 5.0);

        testLegemiddelId(vanlig, 2);
        testLegemiddelNavn(vanlig, "vanlig");
        testVirkestoff(vanlig, 2.0);

        System.out.println(narkotisk.toString());
        System.out.println(vanedannende.toString());
        System.out.println(vanlig.toString());
    }

    private static void testLegemiddelId(Legemiddel legemiddel, int forventetId) {
        if (legemiddel.id == forventetId) {
            System.out.println("Test for Id " + forventetId + " bestått");
        } else {
            System.out.println("Test for Id " + forventetId + " feilet. Forventet: " + forventetId + ", men fikk: " + legemiddel.id);
        }
    }

    private static void testLegemiddelNavn(Legemiddel legemiddel, String forventetNavn) {
        if (legemiddel.navn == forventetNavn) {
            System.out.println("Test for Id " + forventetNavn + " bestått");
        } else {
            System.out.println("Test for Id " + forventetNavn + " feilet. Forventet: " + forventetNavn + ", men fikk: " + legemiddel.navn);
        }
    }

    private static void testVirkestoff(Legemiddel legemiddel, double forventetVirkestoff) {
        if (legemiddel.mengdeVirkestoff == forventetVirkestoff) {
            System.out.println("Test for virkestoff " + forventetVirkestoff + " bestått.");
        } else {
            System.out.println("Test for virkestoff " + forventetVirkestoff + " feilet. Forventet: " + forventetVirkestoff + ", men fikk: " + legemiddel.mengdeVirkestoff);
        }
    }


}
