package nl.cerios.glaswerk;

/**
 * @author rsanders
 *
 *geen implementatie, geen code > alleen declaraties
 */
public interface GlasIF {
	float getContents();
	void breek() throws DiggelenException;
	void was();
	GlasIF copy();

}
