# Loggboks projekt
Marcus nylund 2022-02-28
## Inledning
Syftet med projektet var att skapa en loggbok som man skulle kunna spara som en fil. Filen skulle kunna laddas in i 
programmet när det började och användaren skulle kunna välja vilken fil de ville visa och skapa ny loggar och redigera 
de gamla. När användaren skapar eller redigerar en logg sparas det direkt ner i filen.

Vi jobbade under vad jag vill säga var 5 lektions tillfällen där jag spenderade den första på att få min objekt klass 
att fungera samt att spara ner det som en fil samt hämta den. Efter det spenderade jag ungefär 3 lektioner för att 
förstå och använda en JList i min form, när jag fick det att fungera spendera jag resten av tiden att få mina knappar 
att koplas till de olika funktioner jag behövde i min model för att kunna spara, redigera och skapa i mitt program. 
Jag Hann inte med alla functioner jag villa ha i projectet som tex en delete knapp eftersom det tog mig en så lång tid 
att förstå JList samt hann jag inte testa mitt program för fel/bugs.
## Bakgrund
### OOP
I mitt Obejekt har jag 2 Dates och 2 String för när loggen var skappad och redigerad samt vem som skapade loggen och 
innehålet.
När en logg skapas skickar man in vem som skapade loggen samt innehålet och datumen sätts automatist. Man kan hämta all
data i filen genom getters och när man updaterar innehålet skickar man bara in den nya Stringen och redigerings datumet 
sätts automatiskt.
### MVC
Ja, vad ska man säga.

Jag delar up mit program i tre delar; view, model och controller. I model har jag allting som har med min lista med 
logs att göra. jag både hämtar och sparar filen i modelen och skapar nya loggar samt håller jag loggarna som en 
arraylist av loggar i modelen. Jag valde att ha min temporära arraylist i min model eftersom det skulle vara jobbigt att 
alltid säta en fil till en arraylist som skulle vara i view. I min controller startar jag programet samt min view och model. 
jag hämtar knappar ifrån mi view och gör så att de kopplar sig till functioner i modelen.
I min view sätter jag innhålet i min Jlist till det controllern får ifrån modelen och har en TextArea med text där användaren 
kan välja att visa en logg eller redigera innehålet i en. Jag hade tänkt att man behövde trycka på en knapp innan man skulle 
kunna redigera en lågg för att göra det mer klart om vad man gjorde men hade inte riktigt tid för det.
### filformat
Jag sparade min fil som text istället för binärdata eftersom effektiviteten av mitt program är inte riktigt ett problem 
och jag har haft det enklare att jobba med text.


## Positiva erfarenheter
Det har gått väldigt bra att jobba med att spara mina Objekt.
## Negativa erfarenheter
Jag hade det väldigt svårt att förstå hur jag skulle använda en JList och för framtiden borde jag borde försöka förstå hur en component fungerar innan jag börjar experimentera med den.
Jag hade inte riktigt några andra problem i projektet.
## Sammanfattning
Jag tycker det har gått bra, jag han få all functioner i programmet att fungera men han inte få in några extra functioner eller tid för att 
fixa bugs i mitt program.
Om jag skulle fortsätta jobba på mitt project skulle jag lägga till en delete knapp och en logg-history för att hålla reda på vad för 
ändringar som har hänt i min loggbok samt fixa några bugs i mitt program.

