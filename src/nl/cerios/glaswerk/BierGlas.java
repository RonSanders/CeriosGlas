package nl.cerios.glaswerk;

/**
 * @author rsanders
 *
 * Clone methode http://stackoverflow.com/questions/869033/how-do-i-copy-an-object-in-java
 */
public class BierGlas extends Glas implements GlasIF, Cloneable  {

	private float inhoud = 0.3f;

	public float getContents() {
		return inhoud;
	}
	
	public void setContents(float inhoud){
		this.inhoud += inhoud;
	}

	public void breek() throws DiggelenException {
				
	}

	@Override
	public void was() {
		setContents(0.001f);
		
	}

	/**
	 * Hij kopieert nu een leeg biertje object, deze moet gekoppeld worden 
	 * aan de inhoud van het dienblad dacht ik. Echter snap ik niet goed welk
	 * object bedoeld wordt die gekopieerd moet worden?
	 * Is dit de goed richting?
	 * Waarom wil je dit doen? BierGlazen worden gemaakt in de Glasfabriek?
	 * Is er ipv de clone methode ook een andere manier om objecten te kopieren?
	 */
	@Override
	public GlasIF copy() {
		BierGlas biertje = new BierGlas(); 
		
		try {
			biertje.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}   
		return biertje;
	}
}
