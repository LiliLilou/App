package util;


import main.Configuration;
import main.Student;

public class MenuUtil implements InputUtil {

	public static void printAllStudents() {
		if(Configuration.students==null) {
			System.out.println("Nema registrovanih studenata!");
			return;
		}
		System.out.println("Registrovani studenti: ");
		for(int i = 0;i<Configuration.students.length;i++) {
			Student st= Configuration.students[i];
			 System.out.println((1+i)+".Student \n "  + st.getInfo());	
	}
	
}
	public static void registerStudent() {
		int count = InputUtil.enterInteger("Koliko studenata želite da registrujete?");
		 Configuration.students = new Student[count];
		 
		 for (int i=0;i<count;i++) {
			 System.out.println((i+1)+". Registracija");
		Student st =	InputUtil.fill();
		Configuration.students[i]=st;
		
	}

		 
	}
	
				
public static void findStudent() {
	 String find = InputUtil.enterString("Ukucajte ime ili prezime koje želite pronaći: ");
		for (int i = 0;i<Configuration.students.length;i++) {
			Student st = Configuration.students[i];
			if(st.getName().equalsIgnoreCase(find) || st.getSurname().equalsIgnoreCase(find)) {
				 System.out.println(st.getInfo());
				 
		 }
			else {
				 System.out.println("Podaci koje ste unijeli ne odgovaraju opisu nijednog registrovanog studenta!");
			 }
			
			
		 
	
	
	}
		}
public static void updateStudent() {
	if(Configuration.students==null) {
		System.out.println("Nema registrovanih studenata!");
		return;}
	int student_place = InputUtil.enterInteger("Broj studenta čije podatke želite da izmenite: ");
	System.out.println("Unesite nove podatke");
	Student st = InputUtil.fill();
	Configuration.students[student_place-1] = st;
	System.out.println(st.getInfo());
}




}
