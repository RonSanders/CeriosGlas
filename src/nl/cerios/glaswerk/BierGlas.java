package nl.cerios.glaswerk;

import java.util.List;

/**
 * @author rsanders
 *
 * Clone methode http://stackoverflow.com/questions/869033/how-do-i-copy-an-object-in-java
 */
public class BierGlas extends Glas implements GlasIF, Cloneable  {

	private List<GlasIF> inhoud;

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

	
	@Override
	public GlasIF copy() {
		List<GlasIF> inhoud;
		inhoud=this.inhoud;
		return (GlasIF) inhoud;

	}
	
	/**
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
