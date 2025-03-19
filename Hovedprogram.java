public class Hovedprogram {
    public static void main(String[] args) {
        // Opprettelse av legemiddeler
        Legemiddel vanlig = new Vanlig("Vanlig", 150, 500);
        Legemiddel narkotisk = new Narkotisk("Narkotisk", 400, 250, 80);
        Legemiddel vanedannende = new Vanedannende("Vanedannende", 350, 300, 60);

        // Opprettelse av leger
        Lege lege1 = new Lege("Dr. John");
        Spesialist spesialist1 = new Spesialist("Dr. Sarah", "AB1234");

        // Opprettelse av pasient ID
        int pasientId = 1;

        // Opprettelse av resepter
        Resept hvitResept = new HvitResept(vanlig, lege1, pasientId, 3);
        Resept blaResept = new BlåResept(narkotisk, lege1, pasientId, 2);
        Resept pResept = new PResept(vanlig, lege1, pasientId, 5);
        Resept militærResept = new MilitærResept(vanedannende, spesialist1, pasientId, 6);

        // Skriver ut informasjon om legemidler
        System.out.println("Legemidler:");
        System.out.println(vanlig);
        System.out.println(narkotisk);
        System.out.println(vanedannende);

        // Skrive ut informasjon om leger
        System.out.println("\nLeger:");
        System.out.println(lege1);
        System.out.println(spesialist1);

        // Skrive ut informasjon om resepter
        System.out.println("\nResepter:");
        System.out.println(hvitResept);
        System.out.println(blaResept);
        System.out.println(pResept);
        System.out.println(militærResept);

        // Bruke reseptene
        System.out.println("\nBruk av resept:");
        System.out.println("Bruk av HvitResept: " + hvitResept.bruk());  // Bruk en hvit resept
        System.out.println("Bruk av BlåResept: " + blaResept.bruk());    // Bruk en blå resept
        System.out.println("Bruk av PResept: " + pResept.bruk());      // Bruk PResept
        System.out.println("Bruk av MilitærResept: " + militærResept.bruk());
    }
}
