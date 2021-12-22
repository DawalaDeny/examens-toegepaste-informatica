# Github repository met nuttige informatie voor de verschillende examenperiodes

## Repo clonen op je eigen computer:
* Klik op de balk bovenaan die je huidige directory toont en typ "powershell" en druk op enter (of ga via powershell zelf naar de directory waar je de repository wil clonen)
* Typ ```git clone git@github.com:PixieMgt/examens-toegepaste-informatica.git```
* Ga naar de nieuwe directory ```cd examens-toegepaste-informatica```

## Nieuwe aanpassingen binnenhalen van github:
* Typ ```git pull origin main```

## Om zelf aanpassingen to pushen naar github:
* Zet je github profiel link in #github-profielen in de klas Discord (zo kan ik je push rechten geven)
* Doe een ```git pull origin main``` om je persoonlijke branch lokaal te krijgen
* Ga naar je persoonlijke branch met ```git checkout <profielnaam>```
* Zorg dat je repository up-to-date is met het ```git pull``` commando
* Gebruik ```git status``` om een lijst te krijgen van alle aangepaste bestanden
* Typ ```git add <lijst met bestanden die je wil toevoegen>``` (om al je aanpassingen toe te voegen, typ ```git add .```)
* Typ ```git commit -m "<commit bericht>"``` (Zorg dat je een duidelijk commit bericht geeft waarin je je aanpassingen kort oplijst)
* Typ ```git push```

## Disclaimers:
* Vragen? Stel ze in de klas Discord (gebruik @Rogue)
* Je kan pas aanpassingen pushen als ik je een eigen branch gegeven heb
* Push nooit vanuit de main branch of een andere persoon zijn/haar branch, enkel uit de jouwe
* Zorg dat je altijd pusht als je klaar bent
* Zorg voor een duidelijk commit bericht, maar hou het kort