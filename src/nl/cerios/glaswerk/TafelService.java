package nl.cerios.glaswerk;

import java.util.List;

public class TafelService { // geen implements want het is geen type glas!!!!
	
	GlasFabriek glasFabriek = new GlasFabriek();
	
	public float dek() {
		List<GlasIF> dienblad = glasFabriek.maakDienblad();
		//dienblad.size(); object. functienaam en kijken wat een functie kan doen!
		for (GlasIF glas: dienblad) {
			float inhoudGlas = glas.getContents();
			//optellen van de inhoud!
			System.out.println(inhoudGlas);
		}
		return 0;
	}

	
	//Implementatie: vraagt de GlasFabriek een dienblad te maken en telt de inhoud van de glazen op.

	/**
	 * Uitleg diagram:
	 * - Op tafel worden glazen gebruikt. De interne werking is niet van belang. 
	 * Dat is te zien aan de uses-relations van class Tafel met de interfaces van Glas.
	 * - De GlasFabriek moet wel weten hoe glazen worden gemaakt. 
	 * GlasFabriek heeft uses-relations met de classes (implementaties) van Glas. Hoewel het diagram deze toont.
	 * 
	 */
}
