package Eksamen2022;
import static javax.swing.JOptionPane.*;
public class Oppgave3 {
    public static void main(String[] args) {
        double vekt, høyde2;
        String innVekt = showInputDialog("Skriv vekten din i kg: ");
        String innHøyd2 = showInputDialog("Skriv høyden din i cm: ");


        try {
            vekt = Double.parseDouble(innVekt);
            høyde2 = Double.parseDouble(innHøyd2);
        } catch (Exception e) {
            vekt = 0 ;
            høyde2 = 0;
        }

        if (vekt <=0 || høyde2 <=0){
            System.out.println("Det er ikke gyldig");
        }else{

           double BMI = (double)( 1.3 * vekt) / (Math.pow ( (høyde2/100), 2.5 ));
            showMessageDialog(null, String.format("%.2f",BMI));
        }



    }
}

/* Det skal lages et program som regner ut BMI (Body Mass Index). Det skal brukes input-
        dialogbokser og meldingsboks fra Swing- biblioteket.

        Først skal det leses inn vekten (i kg) og deretter høyden (i cm).

        Så skal BMI'en regnes ut med følgende formel:
        ( 1,3 * vekt) / ( høyde/100)^ 2,5 )
        ^2,5 står for "opphøyd i". Bruk Math.pow(a,b) der a er grunntallet og b eksponenten.
        Resultatet skal så skrives ut i en meldingsboks med passende ledetekst.
        Dersom det skrives inn noe annet enn tall skal det skrives ut en feilmelding i meldingsboksen
        isteden for beregningen

* import static javax.swing.JOptionPane.*;
public class Oppgave2 {
public static void main(String[] args) {
double vekt,høyde;
String innVekt = showInputDialog("Skriv inn vekten din i kg:");
String innHøyde = showInputDialog("Skriv inn høyden din i cm.");
try{
vekt = Double.parseDouble(innVekt);
høyde = Double.parseDouble(innHøyde);
}
catch(Exception e){
vekt = 0;
høyde = 0;
}
if(vekt <= 0 || høyde <= 0){
showMessageDialog(null,"Går ut av programmet. Ikke gyldig input");
}
else{
// ( 1,3 * vekt) / ( høyde/100]^ 2,5 ).
double BMI = (1.3*vekt)/(Math.pow(høyde/100,2.5));
showMessageDialog(null,"BMIen din er : "+String.format("%.2f",BMI));
}
}
}
* */