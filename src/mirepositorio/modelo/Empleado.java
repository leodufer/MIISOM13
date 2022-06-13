package mirepositorio.modelo;

public class Empleado {
	private String id;
	private String firtsname;
	private String lastname;
	private String email;
	private String phone;
	private String hireDate;
	private String jobID;
	private int salary;
	private int managerID;
	private int departamentID;
	
	public Empleado(String id, String firtsname, String lastname, String email, String phone, String hireDate,
			String jobID, int salary, int managerID, int departamentID) {
		this.id = id;
		this.firtsname = firtsname;
		this.lastname = lastname;
		this.email = email;
		this.phone = phone;
		this.hireDate = hireDate;
		this.jobID = jobID;
		this.salary = salary;
		this.managerID = managerID;
		this.departamentID = departamentID;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirtsname() {
		return firtsname;
	}
	public void setFirtsname(String firtsname) {
		this.firtsname = firtsname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getHireDate() {
		return hireDate;
	}
	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}
	public String getJobID() {
		return jobID;
	}
	public void setJobID(String jobID) {
		this.jobID = jobID;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getManagerID() {
		return managerID;
	}
	public void setManagerID(int managerID) {
		this.managerID = managerID;
	}
	public int getDepartamentID() {
		return departamentID;
	}
	public void setDepartamentID(int departamentID) {
		this.departamentID = departamentID;
	}

	@Override
	public String toString() {
		return "Empleado [id=" + id + ", firtsname=" + firtsname + ", lastname=" + lastname + ", email=" + email
				+ ", phone=" + phone + ", hireDate=" + hireDate + ", jobID=" + jobID + ", salary=" + salary
				+ ", managerID=" + managerID + ", departamentID=" + departamentID + "]";
	}
}
