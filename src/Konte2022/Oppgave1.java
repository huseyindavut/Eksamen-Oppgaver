package Konte2022;

public class Oppgave1 {
    public static void main(String[] args) {

       for (int i =10; i>=-10; i--){
           if (i != -10){
               System.out.print(i+", ");
           }else{
               System.out.print(i+".");
           }
       }
    }


}

/*
a) Skriv kode for å summere hvert 10. tall fra 0 til 1000, dvs. 10,20,30 .... 990, 1000 ved hjelp av en for-løkke.
Skriv ut resultatet på System.out.
b) Gjør det samme som i oppgave a) men med en while-løkke.
c) Skriv på System.out alle tallene fra 10 til -10 i rekkefølge med en for-løkke med komma i mellom (10, 9, 8, ....
-9,-10). Merk : ikke komma etter siste tallet -10.
Skriv ditt svar her
Maks poeng: 15




int sum = 0;
for (int i = 10; i<= 1000; i+=10){
sum = sum + i;
}
System.out.println("Summen er "+sum);
sum = 0;
int i = 10;
while (i <= 1000){
sum = sum + i;
i += 10;
}
System.out.println("Summen er "+sum);
for (int j = 10; j >=-10; j--){
if(j!=-10){
System.out.print(j+",");
}
else{
System.out.print(j);

 */