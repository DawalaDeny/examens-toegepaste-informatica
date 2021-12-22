Github repository met een hoop nuttige informatie voor de verschillende examenperiodes

Repo clonen op je eigen computer:
-Op github, klik op de groene knop "Code", zorg dat als optie SSH aangekozen staat, en kopieer de link
-Ga via file explorer naar de map waarin je de repository wil clonen
-Klik op de balk bovenaan die je huidige directory toont en typ "powershell" en druk op enter 
	(of ga via powershell zelf naar de directory waar je de repository wil clonen)
-Typ "git clone <gekopieerde link>"

Nieuwe aanpassingen binnenhalen van github:
-Typ "git pull origin main"

Om zelf aanpassingen to pushen naar github:
-Zet je github profiel link in #github-profielen in de klas Discord
	(zo kan ik je push rechten geven)
-Doe een "git pull origin main" om je persoonlijke branch lokaal te krijgen
-Ga naar je persoonlijke branch met "git checkout <profielnaam>"
-Zorg dat je repository up-to-date is met het "git pull" commando
-Gebruik "git status" om een lijst te krijgen van alle aangepaste bestanden
-Typ "git add <lijst met bestanden die je wil toevoegen>"
	(als je al je aanpassingen wil toevoegen, typ "git add .")
-Typ "git commit -m "<commit bericht>""
	Zorg dat je een duidelijk commit bericht geeft waarin je je aanpassingen kort oplijst
-Typ "git push"