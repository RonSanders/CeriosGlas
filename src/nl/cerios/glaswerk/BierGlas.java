package nl.cerios.glaswerk;

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
	 *	Derek Banas T16
	 * @return 
	 */
	@Override
	public GlasIF copy() {
		BierGlas biertje;
		
		try{
			biertje = (BierGlas)super.clone();
			
		}catch(CloneNotSupportedException e){	
			return null;
		}
		return biertje;
	}
}
