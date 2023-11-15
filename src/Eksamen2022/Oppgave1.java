package Eksamen2022;

/*
/*Gitt et heltallsarray med følgende tall: -3,41,5,-3,2,49. Bruk dette arrayet for å:
a) Tell opp hvor mange tall som er større enn 10 og skriv ut resultatet
b) Skriv ut annethvert element
c) Skriv ut summen av alle positive tall i arrayet
d) Skriv også ut gjennomsnittet av alle positive tall i arrayet
Bruk løkker og System.out for å skrive ut.
 */

import javax.swing.*;

public class Oppgave1 {
    public static void main(String[] args) {
        int[] liste = {-3, 41, 5, -3, 2, 49};

        int sum =0;
        int teller =0;
        for (int i:liste) {
            if (i > 0){
                sum +=i;
                teller++;

            }
        }
        System.out.println("Summen er: "+sum);
        System.out.println("Gjennomsnitt er: "+(double)sum/teller);
        /*for (int i = 1; i < liste.length; i += 2) {
            System.out.print(liste[i]);

            // Virgül koyma kontrolü
            if (i < liste.length-1) {
                System.out.print(", ");
            }
        }

        // Sona nokta koyma
        System.out.println(".");*/

        }


}













/*Gitt et heltallsarray med følgende tall: -3,41,5,-3,2,49. Bruk dette arrayet for å:
a) Tell opp hvor mange tall som er større enn 10 og skriv ut resultatet
b) Skriv ut annethvert element
c) Skriv ut summen av alle positive tall i arrayet
d) Skriv også ut gjennomsnittet av alle positive tall i arrayet
Bruk løkker og System.out for å skrive ut.


int [] liste = {-3,41,5,-3,2,49};
int teller = 0;
for (int i : liste){
if (i > 10){
teller++;
}
}
System.out.println("Antall tall større enn 10 er "+teller);

for (int i = 0; i < liste.length; i+=2){
System.out.print(liste[i]+" ");
}
c ) og d)
int sum = 0;
teller = 0;
for (int i : liste){
if (i > 0){
sum += i;
teller++;
}
}
System.out.println("Summen av alle heltallene er "+sum);
double gjennomsnitt = (double) sum / teller;
System.out.println("Gjennomsnittet av alle heltallene er "+gjennomsnitt)
*/