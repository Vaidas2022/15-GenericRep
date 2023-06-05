import java.util.ArrayList;
import java.util.List;

public class EmployeeDatabase<T extends Employee> {

	List<T> list;
	
	public EmployeeDatabase(){
		list = new ArrayList<T>();
		
	}
	
	public void addEmployee(T empl) {
		list.add(empl);
		System.out.println("Pridetas darbuotojas " + empl.getName());
		System.out.println("Gaus alga " + empl.getSalary());
	}
	
	public List<T> getEmployees(){
		return list;
	}
	
}
