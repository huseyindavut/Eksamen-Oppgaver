package Eksamen2022;


public class Oppgave4 {
    public static void main(String[] args) {

    }
}
/*

Lag en klasse kalt KonverterTemperatur. Denne klassen skal inneholde to statiske metoder kalt
tilCelsius og tilFahrenheiht. Metodene skal regne ut fra Fahernheit til Celsius i den ene metoden
og motsatt i den andre. Metodene skal motta og returnere et desimal tall.
Formelene for konverteringene er:
C = (F - 32) / 1.8
F = C * 1.8 + 32
Skriv så kode i main-metoden for å vise hvordan man benytter seg av klassen / metodene.



class KonverterTemperatur{
public static double tilCelsius(double innFahrenheit){
return (innFahrenheit - 32) / 1.8;
}
public static double tilFahrenheiht(double innCelcius){
return innCelcius * 1.8 + 32;
}
}
public class Oppgave4 {
public static void main (String [] args){
double celisus = 28.6;
System.out.println(celisus+" C blir "+ KonverterTemperatur.tilFahrenheiht(celisus)+" F");
double fahrenheit = 100.5;
System.out.println(fahrenheit+" F blir "+ KonverterTemperatur.tilCelsius(fahrenheit)+" C");
}
}
Oppgave 5

 */