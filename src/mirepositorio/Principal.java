package mirepositorio;

public class Principal {
	
	public static void main(String[] args) {
		
		LeerDatasets leerDatasets = new LeerDatasets();
		leerDatasets.leerFichero("/home/virux/eclipse-workspace/MIISO/src/datasets.csv");
		leerDatasets.imprimir();
		
		LeerEmpleados leerEmpleados = new LeerEmpleados();
		leerEmpleados.leerFichero("/home/virux/eclipse-workspace/MIISO/src/employees.csv");
		leerEmpleados.imprimir();
		
	}
}
