import java.util.Scanner;

public class BoxDemo {
	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		//System.out.println("Saissisez un nombre : ");
		//int nb = sc.nextInt();
		//System.out.println("Vous avez saisi : " + nb);
		Thread t = Thread.currentThread();
		System.out.println("Thread actuel : " + t);
		t.setName("Thread Demo1");
		System.out.println("Thread renommé ! " +t);
	}
}
