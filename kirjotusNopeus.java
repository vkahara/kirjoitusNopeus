import java.util.Scanner;

public class kirjotusNopeus {
    public static void main(String[] args) {

        int oikeatSanat = 0;
        int vaaratSanat = 0;
        Scanner lukija = new Scanner(System.in);

        long ajastinLoppuAika = System.currentTimeMillis() + 60000;

        while (System.currentTimeMillis() < ajastinLoppuAika) {

            String kirjoitettavaSana = satunnainenSana.randomSanat();
            System.out.println("Kirjoitettava sana: " + kirjoitettavaSana);
            
            String kayttajanSyote = lukija.nextLine();

            if (kayttajanSyote.equals(kirjoitettavaSana)) {
                oikeatSanat++;
            } else {
                vaaratSanat++;
            }
        }

        lukija.close();
        System.out.println("Oikeita sanoja minuutissa: " + oikeatSanat);
        System.out.println("Väärät sanat: " + vaaratSanat);

    }
}