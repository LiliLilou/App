package main;

public class Student {

	private String name;
	private String surname;
	private int age;
	private String className;
	private int balanceBook = 0;
	;
	
	
	
	
	
	public Student(String name, String surname, int age, String className) {
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.className = className;
		
	}

	public Student(String name, String surname, int age, String className, int balanceBook) {
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.className = className;
		this.balanceBook = balanceBook;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public int getBalanceBook() {
		return balanceBook;
	}

	public void setBalance(int balanceBook) {
		this.balanceBook = balanceBook;
	}

	@Override
	public String toString() {
		return "Podaci o studentu - ime= " + name + ", prezime=" + surname + ", starosna dob=" + age + ", smjer=" + className
				+ ", balance=" + balanceBook;
	}
	
	public String getInfo() {
		return "Ime: " + getName()+ ", prezime: " + getSurname() + ", starosna dob:  " + getAge() + " , smjer: " + getClassName()+", broj knjiga koje student duži: "+balanceBook;
 	}
	
	
	
	
	
	
}
