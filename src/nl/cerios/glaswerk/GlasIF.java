package nl.cerios.glaswerk;

/**
 * @author rsanders
 *
 *	geen implementatie, geen code > alleen declaraties
 */
public interface GlasIF {

	void setInhoud(float inhoud);
	float getInhoud();
	void breek() throws DiggelenException;
	void was();
	GlasIF copy();

}
