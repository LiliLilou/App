package main;




import util.InputUtil;
import util.MenuUtil;

public class Main  {

	public static void main(String[] args) {

		System.out.println("Dobro došli u centar za registraciju studenata u školsku biblioteku! ");
		
		while(true) {
		int operation = InputUtil.enterInteger("Izaberite jednu od opcija: " +
		"\n1: Registracija studenta " + 
		"\n2: Prikaz registrovanih studenata " + 
		"\n3: Pronađite studenta " + 
		"\n4: Izmjena podataka o studentu " +
		"\n0: Izlaz");
		
		
		if (operation == 1) {
			MenuUtil.registerStudent();
			
			}
	
		else if(operation == 2) {
			MenuUtil.printAllStudents();
			}
		
		
		else if (operation == 3) {
			MenuUtil.findStudent();
				}
		
		else if(operation == 4) {
			MenuUtil.updateStudent();
		}
		
		
		else if(operation == 0) {
			System.out.println("Prijatno i ugodan dan!");
			break;
		}
		
		else {
			System.out.println("Ne postoji ta opcija!");
			break;
		}
		
			}
		
		}
		}
			
	

