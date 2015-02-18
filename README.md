# PFI

 Comments
 -----------
Assignment 5

Din klocka funkar som den ska. Bra jobbat. Genom att köra klockan i bakgrunden med SwingWorker i ClockLogic har du kondenserat koden eftersom du varken använder dig av ClockThread eller ClockInterface alls(!).
Tanken med veckans uppgift var att tydliggöra hur Thread och Interface används, men framförallt att introducera dem och därför är modifikationer ok så länge du kan redogöra för dem.
Din bakgrundsprocess kör dock utan uppehåll eftersom du inte använder Thread.sleep(900), vilket gör den mer prestandakrävande (inget som spelar roll för en så här liten sak, men kan vara värt att tänka på).
Du har väldigt många variabler för att hämta och hantera tiden som du skriver in, dessa kan omstruktureras (ett alternativ är att använda ett annat input-element i windowbuilder än TextArea som gör det lättare att hantera texten).
Ditt GUI är tydligt, men det hade varit bra om man som användare fick feedback i programmet istället för printlines. Jag får också errors om jag lämnar ett fält tomt innan jag sätter larmet - de skulle kunna vara 00 by default kanske?
Världigt bra progress över lag!
/CW
