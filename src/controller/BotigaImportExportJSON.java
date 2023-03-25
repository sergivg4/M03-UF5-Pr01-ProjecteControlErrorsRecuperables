
package controller;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;

import model.BotigaImportExportable;
import model.Persistable;
import model.Producte;
import model.ProducteAbstract;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

/**@author Sergi Valenzuela García
 * M03-UF4 
 * 10 mar 2023
 */
public class BotigaImportExportJSON implements BotigaImportExportable<ProducteAbstract>{
	
	@Override
	public Map<Integer, ProducteAbstract> importar(String nomFitxer) throws IOException {
		
		HashMap<Integer, ProducteAbstract> productesMap = new HashMap<>();

		try (JsonReader getLocalJsonFile = new JsonReader(new FileReader(nomFitxer))) {
			
			Type mapTokenType = new TypeToken<Map<Integer, Producte>>(){}.getType();

			productesMap = new Gson().fromJson(getLocalJsonFile, mapTokenType);

		}
		return productesMap;
	}

	@Override
	public boolean exportar(String nomFitxer, Persistable<ProducteAbstract> dao) throws IOException{
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		
		try (FileWriter fw = new FileWriter(nomFitxer)){
			
			gson.toJson(dao.getMap(), fw);
			System.out.println("Datos exportados en: " + nomFitxer);
		}
		return false;
	}
	
}
