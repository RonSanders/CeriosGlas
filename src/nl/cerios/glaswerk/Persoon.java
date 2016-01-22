package nl.cerios.glaswerk;

/**
 * @author 	Ron Sanders
 * @version 1.0.0
 * @since	22-12-2015
 */
public class Persoon {

	public static void main(String[] args) {
		TafelService tafeltjedekjeservice = new TafelService();
		tafeltjedekjeservice.dek();
		
		float inhoudTotaalGlazen = TafelService.inhoudTotaalGlazen;			
		System.out.println("De totale inhoud van alle glazen: "+inhoudTotaalGlazen);
	}

}
