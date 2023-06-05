
public class Program {
	
	public static void main(String[] args) {
		
		EmployeeDatabase<Programmer> programuotojai = new EmployeeDatabase<>();
		EmployeeDatabase<Designer> dizaineriai = new EmployeeDatabase<>();
		
		programuotojai.addEmployee(new Programmer("Alice", 3200d));
		programuotojai.addEmployee(new Programmer("Bob", 2400d));
		programuotojai.addEmployee(new Programmer("Clare", 5200d));
		
		for(Programmer p : programuotojai.getEmployees()) {
			System.out.println(p);
		}
	}
	
	
	
}

/*Sugalvokime, kad turime klasæ Employee, 
 * kuri apibûdina ámonës darbuotojà su vardas ir atlyginimo duomenimis. 
 * Jums reikia sukurti EmployeeDatabase, kuris saugotø skirtingø tipø darbuotojø duomenis.

1. Sukurkite generic klasæ Employee, 
kurioje bus laukai name ir salary. 
Tai apraðo vieno darbuotojo objektà.

Sukurkite generic klasæ EmployeeDatabase, 
kurios tipas bus parametras, kurá pasirinksite patys. Ði klasë turëtø saugoti sàraðà Employee objektø.

Pridëkite konstruktoriø, kuris inicializuoja tuðèià sàraðà darbuotojams.
Pridëkite metodà addEmployee(), kuris leidþia pridëti naujà darbuotojà á duomenø bazæ.
Pridëkite metodà getEmployees(), kuris gràþina sàraðà visø darbuotojø duomenø bazëje.

*/