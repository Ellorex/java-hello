import java.io.*;

public class Interaction {
	public static void main(String[] args) {
		File fichier1 = new File("\\divers\\test");
		System.out.println("Nom : " + fichier1.getName());
		System.out.println("Chemin : " + fichier1.getPath());
		System.out.println("Chemin absolu : " + fichier1.getAbsolutePath());
		System.out.println("Parent " + fichier1.getParent());
		System.out.println("Exist " + fichier1.exists());
		System.out.println("Ecriture " + fichier1.canWrite());
		System.out.println("Lecture " + fichier1.canRead());
		System.out.println("Répertoire " + fichier1.isDirectory());
		System.out.println("Fichier " + fichier1.isFile());
		System.out.println("Taille " + fichier1.length());
		if(fichier1.isDirectory() == true) {
			System.out.println("ceci est répertoire");
		} else {
			System.out.println("pas un répertoire");
		}
	}
}
