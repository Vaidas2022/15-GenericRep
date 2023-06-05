
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

/*Sugalvokime, kad turime klas� Employee, 
 * kuri apib�dina �mon�s darbuotoj� su vardas ir atlyginimo duomenimis. 
 * Jums reikia sukurti EmployeeDatabase, kuris saugot� skirting� tip� darbuotoj� duomenis.

1. Sukurkite generic klas� Employee, 
kurioje bus laukai name ir salary. 
Tai apra�o vieno darbuotojo objekt�.

Sukurkite generic klas� EmployeeDatabase, 
kurios tipas bus parametras, kur� pasirinksite patys. �i klas� tur�t� saugoti s�ra�� Employee objekt�.

Prid�kite konstruktori�, kuris inicializuoja tu��i� s�ra�� darbuotojams.
Prid�kite metod� addEmployee(), kuris leid�ia prid�ti nauj� darbuotoj� � duomen� baz�.
Prid�kite metod� getEmployees(), kuris gr��ina s�ra�� vis� darbuotoj� duomen� baz�je.

*/