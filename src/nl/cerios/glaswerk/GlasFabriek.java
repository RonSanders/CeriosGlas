package nl.cerios.glaswerk;

import java.util.ArrayList;
import java.util.List;

/**
 * @author rsanders
 *
 *Implementeer de functie door een lijst te maken van 3 bierglazen en 2 wijnglazen.
 */
public class GlasFabriek {
	
	public List<GlasIF> maakDienblad() {
		
		List<GlasIF> dienblad = new ArrayList<GlasIF>();
		WijnGlas witWijnglas = new WijnGlas();
		WijnGlas roodWijnglas = new WijnGlas();
		BierGlas vaasje = new BierGlas();
		BierGlas fluitje = new BierGlas();
		BierGlas speciaaltje = new BierGlas();
		
		dienblad.add(witWijnglas); // 1 per keer toevoegen
		dienblad.add(roodWijnglas);
		dienblad.add(vaasje);
		dienblad.add(fluitje);
		dienblad.add(speciaaltje);
		
		return dienblad;
	}
}
