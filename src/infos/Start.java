package infos;

public class Start {

	public static void main(String[] args) {
		
		Student stud;
		stud = new Student();
		
		stud.setMatrikelnr(12345);
		stud.setNachname("mueller");
		stud.setVorname("doris");
		
		System.out.println(stud.getMatrikelnr());
		System.out.println(
				stud.getVorname() +
				", " +stud.getNachname()
				);
		
	}
}
