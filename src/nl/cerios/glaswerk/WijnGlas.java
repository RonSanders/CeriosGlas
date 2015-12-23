package nl.cerios.glaswerk;

public class WijnGlas extends Glas implements GlasIF {

	  //niet groeperen het WijnGlas is een los onderdeel met eigenschappen en die staan hier in!
	private float inhoud = 0.25f;

	@Override
	public float getContents() {
		return inhoud;
	}

	@Override
	public void breek() throws DiggelenException {
				
	}
}
