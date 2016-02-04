package nl.cerios.glaswerk;

/**
 * @author rsanders
 *
 * Clone methode http://stackoverflow.com/questions/869033/how-do-i-copy-an-object-in-java
 */
public class BierGlas extends Glas implements GlasIF, Cloneable  {
	public BierGlas(){
		setInhoud(0.3f);
	}

	public void breek() throws DiggelenException {
				
	}

	public void was() {
		setInhoud(0.001f);
		
	}
	
	/**
	 *	De methode maakt een kopie van een biertje die vol is. Als het biertje half vol is,
	 *	is er geen kopie van, maar komt er opnieuw een vol biertje!
	 *	
	 * @return 
	 */

	public GlasIF copy() {
		BierGlas biertje = new BierGlas();
		return biertje;

	}
	
	/**
	 * 	Als 
	 * 
	 *	Derek Banas T16
	 * @return 
	 */
	public Object clone() {
		BierGlas biertje;
		
		try{
			biertje = (BierGlas)super.clone();
			
		}catch(CloneNotSupportedException e){	
			return null;
		}
		return biertje;
	}
}
