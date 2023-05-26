package view;

import model.Arvore;

public class main {
	public static void main(String[] args) {
	char[] vetor = {'M', 'F', 'S', 'D', 'J', 'B', 'L', 'A', 'E', 'H','Q', 'H', 'W', 'K'};
	Arvore arvore = new Arvore();
	
	for (char i : vetor) {
		arvore.insert(i);
	}
	try {
		arvore.prefixSearch();
		System.out.println();
		arvore.infixSearch();
		System.out.println();
		arvore.postfixSearch();
		System.out.println();
		System.out.println("==================");
		arvore.search('B');
		arvore.remove('D');
		arvore.remove('H');
		arvore.remove('L');
		arvore.remove('S');
		System.out.println("========================");
		arvore.infixSearch();
	} catch (Exception e) {
		e.printStackTrace();
	}

	System.out.println();
}

}
