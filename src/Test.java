public class Test {
	
	static double calcNote(double valeur[]) {
		return (valeur [0] / valeur[1]) * 100;
	}
	static int calcSum(int nb1, int nb2) {
		return nb1 + nb2;
	}
	static int calcSum(int nb1, int nb2, int nb3) {
		return nb1 + nb2 + nb3;
	}
	static int calcSum(int nb1, int nb2, int nb3, int nb4) {
		return nb1 + nb2 + nb3 + nb4;
	}
	public static void main(String[] args) {
		int mesNotes[][]= {{90,70}, {80, 60}};
		int i, j;
		
		for(i =0; i < 2; i++){
		
			for(j =0; j < 2; j++) {
				System.out.println("a l'adresse " +i+ " et " +j+ " se trouve la note : " + mesNotes[i][j]);

			}
		}	
		int nb1 = 4, nb2 = 7, nb3 = 9, nb4 = 13;
		System.out.println(calcSum(nb1, nb2, nb3, nb4));
	}
}
