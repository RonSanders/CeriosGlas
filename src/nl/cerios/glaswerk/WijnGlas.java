package nl.cerios.glaswerk;

public class WijnGlas extends Glas implements GlasIF {

	private float witwijnglas = 1;
	private float rodewijnglas = 1;
	private float champagneglas;

	public float getWitwijnglas() {
		return witwijnglas;
	}

	public void setWitwijnglas(float witwijnglas) {
		this.witwijnglas = witwijnglas;
	}

	public float getRodewijnglas() {
		return rodewijnglas;
	}

	public void setRodewijnglas(float rodewijnglas) {
		this.rodewijnglas = rodewijnglas;
	}

	public float getChampagneglas() {
		return champagneglas;
	}

	public void setChampagneglas(float champagneglas) {
		this.champagneglas = champagneglas;
	}

	@Override
	public float getContents() {
		float content;
		content = getWitwijnglas()+getRodewijnglas();
		return content;
	}

	@Override
	public void breek() throws DiggelenException {
		// TODO Auto-generated method stub
		
	}
}
