package mirepositorio;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import mirepositorio.modelo.Empleado;

public class LeerEmpleados {
private ArrayList<Empleado> empleados = new ArrayList<Empleado>();
	
	public ArrayList<Empleado> leerFichero(String fichero){
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
		
		return empleados;
	}

	private void procesarLinea(String linea) {
		Scanner scanner = new Scanner(linea);
				scanner.useDelimiter("\\s*,\\s*");
				
				String id = scanner.next();
				String firtsname = scanner.next();
				String lastname = scanner.next();
				String email = scanner.next();
				String phone = scanner.next();
				String hireDate = scanner.next();
				String jobID = scanner.next();
				int salary = scanner.nextInt();
				int managerID = scanner.nextInt();
				int departamentID = scanner.nextInt();
		
				this.empleados.add(new Empleado(id, firtsname, lastname, email, phone, hireDate, jobID, salary, managerID, departamentID));
				scanner.close();

	}
	
	public void imprimir() {
		for(Empleado empleado:empleados) {
			System.out.println(empleado);
		}
	}

}
