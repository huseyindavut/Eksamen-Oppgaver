package Eksamen2022;

public class Oppgave5 {
}



/*


DIAGRAM

Det skal lages et program som registrer bøker i en boksamling. Klassene, attributtene og
metodene som skal implementeres illustreres i overstående klasse-diagram. Lydbok og Papirbok
arver Bok-klassen. Det er bare metodene illustrert i klasse-diagrammet som skal
implementeres.
I main-metoden skal det så opprettes et objekt av hver type (Lydbok og Papirbok). Disse skal så
legges inn i en ArrayList av type Bok. Deretter skal attributtene skrives ut i en løkke ved hjelp av
toString()-metodene.
Skriv ditt svar her1




import java.util.ArrayList;
class Bok {
private String tittel;
private String forfatter;
private double pris;
public Bok(String tittel, String forfatter, double pris) {
this.tittel = tittel;
this.forfatter = forfatter;
this.pris = pris;
}
@Override
public String toString() {
return "Tittel=" + tittel + ", Forfatter=" + forfatter + ", Pris=" + pris;
}
}
class Lydbok extends Bok {
private int lengdeIminutter;
public Lydbok(String tittel, String forfatter, double pris, int lengdeIminutter) {
super(tittel, forfatter, pris);
this.lengdeIminutter = lengdeIminutter;
}
@Override
public String toString() {
return super.toString() + ", LengdeIminutter=" + lengdeIminutter;
}
}
class Papirbok extends Bok {
private int ISBN;
public Papirbok(String tittel, String forfatter, double pris, int ISBN) {
super(tittel, forfatter, pris);this.ISBN = ISBN;
}
@Override
public String toString() {
return super.toString()+ ", ISBN=" + ISBN;
}
}
public class Oppgave5 {
public static void main(String [] args){
ArrayList<Bok> bokSamling = new ArrayList<>();
Lydbok enLydbok = new Lydbok("Kniv","Nesbæ",90.50,120);
Papirbok enPapirbok = new Papirbok("Kniv","Nesbø",345.50,123456789);
bokSamling.add(enLydbok);
bokSamling.add(enPapirbok);
for (Bok enBok : bokSamling){
System.out.println(enBok);
}
}
}

 */