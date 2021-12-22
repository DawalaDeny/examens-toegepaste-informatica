/* **************************
 * 1-dim arrays
 * **************************
 */
// - vaste grootte
// - efficient raadplegen en wegschrijven van en naar index
// - Kan objecten en primitieve types bevatten
// - iets andere syntax
// - toevoegen en verwijderen betekent eigenlijk overschrijven

// Declareren -> variabelen verwijzen naar null
Persoon[] personen;
double[] temperaturen;
int[] getallen;

// Initialiseren
personen = new Persoon[10];  // object - alle waardes in array == null
temperaturen = new double[100]; // prim type - alle waardes in array default value
getallen = new int[]{4,9,2,4,8,3,1};

// Declareren en initialiseren ineen
double[] gemiddelden = {1.2, 1.7, 1.9, 0.8};

// Toevoegen
temperaturen[0] = 7.53; // 0-index-based
personen[9] = new Persoon("Joe");

// Aanpassen
temperaturen[0] = 8.53;
personen[9] = new Persoon("Jack");
personen[9].setFirstName("William");

// Verwijderen (cel 'leeg' maken)
personen[9] = null;
// een element in een array van primitieve types verwijderen kan niet
// een primitief type kan niet null zijn
getallen[0] = 0;
getallen[1] = 0;

// Opvragen
double temp = temperaturen[0];
Persoon joe = personen[9];

// De lengte van de array opvragen
// .length -> Geen methode (geen haakjes)
int grootteArray = temperaturen.length;

String[] woorden = new String[10];
woorden[0] = "one";
woorden[3] = "four";
woorden[4] = "five";
System.out.println(woorden.length); // ?????

// Overlopen
// - for-loop
for(int i = 0; i<personen.length; i++){
	Persoon persoon = personen[i];
	if(persoon != null){
		persoon.addCredits(5);
	}
	else {
		personen[i] = new Persoon();
	}
}

for(int i = 0; i<getallen.length; i++){
	int straal = getallen[i];
	int oppervlakte = straal * straal * Math.PI;
	getallen[i] = oppervlakte;
}

// - for-each -> enkel gebruiken om op te vragen
for(Persoon persoon : personen){
	System.out.println(persoon.getName());
}

// - while-lus: vroegtijdig stoppen
int i = 0;
while(i < temperaturen.length && temperaruren[i] <= 20){
	i++;
}
double eersteTempBoven20 = temperaturen[i];

// Exceptions?
// - ArrayIndexOutOfBoundsException
//     -> index >= 0 && index < array.length

// Enkele (static) utility methodes in de klasse Arrays
Arrays.sort(getallen);
String tekst = Arrays.toString(getallen); // [1,2,3,4,4,8,9]

/* **************************
 * 2-dim arrays
 * **************************
 */

// Declareren
String[][] speelveld;
Persoon[][] personen;
double[][] temperaturen;
int[][] getallen;

// Initialiseren
speelveld = new String[10][10];  // object - alle waardes in array == null
personen = new Persoon[10][50];
temperaturen = new double[52][7]; // prim type - alle waardes in array default value
getallen = {{4,9,2],{4,8,3},{1,7,6}};

String[][] woorden = new String[30]; // 30 regels op een blad
woorden[0] = new String[7]; // 7 woorden op regel 1
woorden[1] = new String[11]; // 11 woorden op regel 2
woorden[2] = new String[14]; // 14 woorden op regel 3
// ...
woorden[29] = new String[12]; // 12 woorden op regel 29

// Toevoegen
temperaturen[0][0] = 7.53; // 0-index-based
speelveld[4][6] = "^";
personen[7][13] = new Persoon("Joe");

// Aanpassen
temperaturen[0][0] = 8.53;
speelveld[4][6] = "*";
personen[7][13] = new Persoon("Jack");
personen[7][13].setFirstName("William");

// Verwijderen (cel 'leeg' maken)
personen[7][13] = null;
// een element in een array van primitieve types verwijderen kan niet
// een primitief type kan niet null zijn
temperaturen[0][0] = 0;
temperaturen[0][1] = 0;

// Opvragen
double temp = temperaturen[0][0];
Persoon persoon = personen[7][13];
Persoon[] rijPersonen = persoon[5]; // een 1-dim array

// De lengte van de array opvragen (#rijen)
int aantalRijen = temperaturen.length

// De lengte van een rij opvragen (#kolommen)
int aantalKolommenInRijNul = temperaturen[0].length

// Overlopen
// for-loop: volledig overlopen
for(int i = 0; i<personen.length; i++){
	for(int j = 0; i<personen[i].length; j++){
		Persoon persoon = personen[i][j];
		if(persoon != null){
			persoon.setCredits(5);
		}
		else {
			personen[i][j] = new Persoon();
		}
	}
}


