package nl.cerios.glaswerk;

import java.util.List;

/**
 * @author rsanders
 * 
 * R23: mijn lijst is hier dienblad een verzameling! Enhanced forloop gaat door de verzameling heen
 * R23: links is altijd wat voor object erin zit : rechts is de collectie/verzameling/lijst!
 * R23-R31: Enhanced forloop gaat altijd door de hele lijst en voor elk element in de lijst doet hij {alles hier tussen}! Lijst 0 tot ...
 * R26:	inhoudTotaalGlazen += inhoudGlas; > is het optellen van de inhoud!
 * 
 * @Todo dienblad.size(); object. functienaam en kijken wat een functie kan doen!
 * ?Implementatie: vraagt de GlasFabriek een dienblad te maken en telt de inhoud van de glazen op.
 */
public class TafelService { // geen implements want het is geen type glas!!!!
	
	GlasFabriek glasFabriek = new GlasFabriek();
	
	public float dek() {
		List<GlasIF> dienblad = glasFabriek.maakDienblad();
		
		for (GlasIF glas: dienblad) {
			float inhoudGlas = glas.getContents();
			float inhoudTotaalGlazen = 0;
			inhoudTotaalGlazen += inhoudGlas;

			System.out.println("Het inhoud per glas: "+inhoudGlas);
			System.out.println("De totale inhoud van alle glazen: "+inhoudTotaalGlazen);
		}
		return 0;
	}


	/**
	 * Uitleg diagram:
	 * - Op tafel worden glazen gebruikt. De interne werking is niet van belang. 
	 * Dat is te zien aan de uses-relations van class Tafel met de interfaces van Glas.
	 * - De GlasFabriek moet wel weten hoe glazen worden gemaakt. 
	 * GlasFabriek heeft uses-relations met de classes (implementaties) van Glas. 
	 * Hoewel het diagram deze toont.
	 * 
	 */
}
