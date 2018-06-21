
abstract class Personne {
	private String name;
	abstract void afficher();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

 class Etudiant extends Demo1 {
	 int noEtudiant;
	 Etudiant() {
		 noEtudiant = 43;
	 }
	 void afficher() {
		 System.out.println("numéro Etudiant : " + noEtudiant);
	 }
}
 
 class EtudiantC2 extends Etudiant {
	 void afficher() {
		 System.out.println("etudiantC2");
	 }
 }
 class Demo1 {
	 public static void main(String[] args) {
		 Etudiant e = new Etudiant();
		 EtudiantC2 c2 = new EtudiantC2();
		 e.afficher();
		 c2.afficher();
	 }
 }
 