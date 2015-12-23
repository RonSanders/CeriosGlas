package nl.cerios.glaswerk;

/**
 * @author 	Ron Sanders
 * @version 1.0.0
 * @since	22-12-2015
 */
public class BierGlas  {

	private static float vaasje = 1;
	private static float fluitje = 1;
	private static float speciaaltje = 1;
		
	public static float getVaasje() {
		return vaasje;
	}

	public void setVaasje(float vaasje) {
		BierGlas.vaasje = vaasje ;
	}

	public static float getFluitje() {
		return fluitje;
	}

	public void setFluitje(float fluitje) {
		BierGlas.fluitje = fluitje;
	}

	public static float getSpeciaaltje() {
		return speciaaltje;
	}

	public void setSpeciaaltje(float speciaaltje) {
		BierGlas.speciaaltje = speciaaltje;
	}

		
	public static float getContents() {
		float content;
		content = getFluitje()+getVaasje()+getSpeciaaltje();
		//System.out.println(content);
		return content;
	}

	public void breek() throws DiggelenException {
		// TODO Auto-generated method stub
		
	}

	

	
}
