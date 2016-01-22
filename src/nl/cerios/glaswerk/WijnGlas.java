package nl.cerios.glaswerk;

/**
 * @author rsanders
 *
 *	Opmerking: niet groeperen het WijnGlas is een los onderdeel met eigenschappen en die staan hier in!
 */
public class WijnGlas extends Glas implements GlasIF {
	private float inhoud = 0.25f;

	@Override
	public float getContents() {
		return inhoud;
	}

	@Override
	public void breek() throws DiggelenException {
				
	}

	@Override
	public void was() {
		inhoud += 0.001f;//Dit mag niet maar werkt wel! Vond het grappig als andere optie...
		
	}

	@Override
	public GlasIF copy() {
		return null;
	}
	
	
}
