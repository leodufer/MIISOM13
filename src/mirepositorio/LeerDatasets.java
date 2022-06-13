package mirepositorio;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import mirepositorio.modelo.Dataset;

public class LeerDatasets {
	private ArrayList<Dataset> datasets = new ArrayList<Dataset>();
	
	public ArrayList<Dataset> leerFichero(String fichero){
		String linea;
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader(fichero));
			linea = bufferedReader.readLine();
			while(linea != null) {
				procesarLinea(linea);
				linea = bufferedReader.readLine();
			}
			bufferedReader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return datasets;
	}

	private void procesarLinea(String linea) {
		Scanner scanner = new Scanner(linea);
		scanner.useDelimiter("\\s*,\\s*");
		String name = scanner.next();
		String description = scanner.next();
		String link = scanner.next();
		String category = scanner.next();
		String cloud = scanner.next();
		String vintage = scanner.next();
		this.datasets.add(new Dataset(name, description, link, category, cloud, vintage));
		scanner.close();
	}
	
	public void imprimir() {
		for(Dataset dataset:datasets) {
			System.out.println(dataset);
		}
	}
}
