package nl.cerios.glaswerk;

import java.util.ArrayList;
import java.util.List;

/**
 * @author rsanders
 *
 * Clone methode http://stackoverflow.com/questions/869033/how-do-i-copy-an-object-in-java
 */
public class BierGlas extends Glas implements GlasIF, Cloneable  {

	@Override
	public float getContents() {
		setInhoud(0.3f);
		return getInhoud();
	}
	
	@Override
	public void breek() throws DiggelenException {
				
	}

	@Override
	public void was() {
		setInhoud(0.001f);
		
	}

	/**
	 * Hij kopieert nu een leeg biertje object, deze moet gekoppeld worden 
	 * aan de inhoud van het dienblad dacht ik. Echter snap ik niet goed welk
	 * object bedoeld wordt die gekopieerd moet worden?
	 * Is dit de goed richting?
	 * Waarom wil je dit doen? BierGlazen worden gemaakt in de Glasfabriek?
	 * Is er ipv de clone methode ook een andere manier om objecten te kopieren?
	 * @return 
	 */
	@Override
	public GlasIF copy() {
				
		GlasFabriek glasFabriek = new GlasFabriek();
		
		List<GlasIF> bierlijst = new ArrayList<GlasIF>();	
		bierlijst.addAll(glasFabriek.maakDienblad());
		List<GlasIF> dienblad = glasFabriek.maakDienblad();
		
		
		return (GlasIF) dienblad;
		//return (GlasIF) bierlijst;	
		
		//Krijg constant een ClassCastException, maar weet niet waar ik verkeerd zit? Heb je een tip?
		//Exception in thread "main" java.lang.ClassCastException: java.util.ArrayList cannot be cast to nl.cerios.glaswerk.GlasIF
		//at nl.cerios.glaswerk.BierGlas.copy(BierGlas.java:49)
		//at nl.cerios.glaswerk.TafelService.dek(TafelService.java:32)
		//at nl.cerios.glaswerk.Persoon.main(Persoon.java:12)

	}
}
