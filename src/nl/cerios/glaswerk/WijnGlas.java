package nl.cerios.glaswerk;

/**
 * @author rsanders
 *
 *	Opmerking: niet groeperen het WijnGlas is een los onderdeel met eigenschappen en die staan hier in!
 */
public class WijnGlas extends Glas implements GlasIF {
	
	@Override
	public float getContents() {
		setInhoud(0.25f);
		return getInhoud();
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
		return wijntje;

	}
	
	
}
