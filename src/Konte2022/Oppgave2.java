package Konte2022;

import java.util.ArrayList;

class Valuta {
    private String valuta;
    private double kurs;

    public Valuta(String valuta, double kurs) {
        this.valuta = valuta;
        this.kurs = kurs;
    }

    public String getValuta() {
        return valuta;
    }

    public double getKurs() {
        return kurs;
    }

}

class ValutaKalkulator {
    private ArrayList<Valuta> valutakurser = new ArrayList<>();

    public ValutaKalkulator() {

        Valuta USD = new Valuta("USD", 10.9);
    }

    public double beregnKurs(String valuta) {
        for (Valuta kurs : valutakurser){
            if (kurs.getValuta().equals(valuta)){
                return kurs.getKurs();
            }
        }
        return 0;
    }
}


public class Oppgave2 {
    public static void main(String[] args) {
        ValutaKalkulator youCanDoIt = new ValutaKalkulator();
        System.out.println("USD = " + String.format("%.2f", youCanDoIt.beregnKurs("USD")));
        System.out.println("SEK = " + String.format("%.2f", youCanDoIt.beregnKurs("SEK")));
        System.out.println("EUR = " + String.format("%.2f", youCanDoIt.beregnKurs("EUR")));

    }

}



/*
2 Oppgave 2 (25%)
Det skal lages et oppslag for valuta hvor man skal kunne finne en valutasort (som USD, DKK, EUR) for så vise
kursen til valutaen. Feks:
100 norske kroner vill gi 11.5 amerikanske dollar (USD)
100 norske kroner vil gi 75 danske kroner (DKK)
Disse verdiene skal lagres i en ArrayList via en klasse Valuta som inneholder valuta og kurs.
Her er koden for Valuta-klasen:
class Valuta{
private String valuta;
private double kurs;
public Valuta(String valuta, double kurs) {
this.valuta = valuta;
this.kurs = kurs;

public String getValuta() {
return valuta;
}
public double getKurs() {
return kurs;
}
}
Kopier skall-koden under og fullfør denne. La konstruktøren initsiere arrayet med verdier.
class ValutaKalkulator {
private ArrayList<Valuta> valutakurser = new ArrayList<>();
public ValutaKalkulator(){
// kode her
}
public double beregnKurs(String valuta) {
// kode her
}
}
Skriv så en main-metode for å opprette kalkulatoren og beregne de relevante kursene. Dette skal vises på
System.out. En tom main-metode vises under.
public static void main(String[] args) {
}
1
 */