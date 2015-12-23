package nl.cerios.glaswerk;

/**
 * @author 	Ron Sanders
 * @version 1.0.0
 * @since	22-12-2015
 */
public class BierGlas extends Glas implements GlasIF  {

	private float inhoud = 0.3f;

	public float getContents() {
		return inhoud;
	}

	public void breek() throws DiggelenException {
				
	}

	

	
}
