package nl.cerios.glaswerk;

/**
 * @author rsanders
 *
 *	Opmerking: niet groeperen het WijnGlas is een los onderdeel met eigenschappen en die staan hier in!
 *	Opmerking Rutger: waarom maak je van de class Glas en GlasIF geen absta=racte class Glas en laat je de rest weg?
 */
public class WijnGlas extends Glas implements GlasIF {
	public WijnGlas(){
		setInhoud( 0.025f);
	}

	/**
	 * Wanneer je niet zoveel dorst hebt kun je ook zelf de hoeveel bepalen! De else is de default in dit geval.
	 * @param inhoud
     */
	public WijnGlas(float inhoud){
		if (inhoud <= 0.025f) {
			setInhoud(inhoud);
		}else{
			setInhoud(0.025f);
		}
	}


	@Override
	public void breek() throws DiggelenException {
				
	}

	@Override
	public void was() {
		setInhoud(0.001f);
		
	}

	@Override
	public GlasIF copy() {
		WijnGlas wijntje = new WijnGlas();
		//copy.setInhoud( origineel.getInhoud())
		return wijntje;

	}
	
	
}
