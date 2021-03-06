import java.util.Date;
import java.util.Vector;

public class Manager extends Employee {

	private Vector<Employee> employees;
	private double bonus;
	public Manager() 
	{
		bonus = 0;
	}

	public Manager(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public Manager(String name, double salary) {
		super(name, salary);
		// TODO Auto-generated constructor stub
	}

	public Manager(String name, double salary, Date hireDate) {
		super(name, salary, hireDate);
		// TODO Auto-generated constructor stub
	}

	public Manager(String name, double salary, Date hireDate, String insuranceNumber) {
		super(name, salary, hireDate, insuranceNumber);
		// TODO Auto-generated constructor stub
	}
	
	public Manager(String name, double salary, Date hireDate, String insuranceNumber, Vector<Employee> employees)
	{
		super(name, salary, hireDate, insuranceNumber);
		this.employees = employees;
	}
	
	public double getBonus()
	{
		return bonus;
	}
	
	public void setBonus(double bonus)
	{
		this.bonus = bonus;
	}
	
	public boolean equals(Object o)
	{
		if(this.getClass() != o.getClass())
			return false;
		if(o == this)
			return true;
		
		Manager m = (Manager)o;
		
		return m.employees.equals(employees) && m.getName().equals(getName());
	}
	
	public String toString()
	{
		String result = "I'am Manager and " + super.toString() + " and these people work for me: \n";
		for(Employee e: employees)
			result += e + "\n";
		return result;
	}
	
	public int compareTo(Object o)
	{
		int compRes = super.compareTo(o);
		if(compRes != 0)
			return compRes;
		Manager m = (Manager)o;
		if(bonus > m.bonus)
			return 1;
		if(bonus < m.bonus)
			return -1;
		return 0;
	}
	
	public Manager clone()
	{
		Manager cloned = new Manager();
		cloned.employees = (Vector<Employee>) employees.clone();
		cloned.bonus = bonus;
		cloned.hireDate = (Date)hireDate.clone();
		cloned.insuranceNumber = new String(insuranceNumber);
		cloned.salary = salary;
		return cloned;
	}
}
