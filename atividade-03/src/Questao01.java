import javax.swing.*;

public class Questao01 {	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "N�meors Vizinhos", "Localizar", JOptionPane.QUESTION_MESSAGE);
		int number_1 = Integer.parseInt(JOptionPane.showInputDialog("Insira um n�mero"));
		int vizinho1 = number_1 + 1;
		int vizinho2 = number_1 - 1; 
		JOptionPane.showMessageDialog(null,"Os n�meros vizinhos s�o  "+vizinho1+ " e " +vizinho2);
	}
}

