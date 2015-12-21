package nl.cerios.glaswerk;

public class TafelService extends GlasFabriek implements GlasIF{
	public float dek() {
		return 0;
	}

	@Override
	public float getContents() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void breek() throws DiggelenException {
		// TODO Auto-generated method stub
		
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
