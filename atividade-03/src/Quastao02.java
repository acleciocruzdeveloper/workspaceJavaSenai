import javax.swing.*;
public class Quastao02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Vamos somar", "Soma", JOptionPane.QUESTION_MESSAGE);
		double soma1 = Double.parseDouble(JOptionPane.showInputDialog("Insira um n�mero"));
		double soma2 = Double.parseDouble(JOptionPane.showInputDialog("Insira outro n�mero"));
		double result = soma1 + soma2;
		JOptionPane.showMessageDialog(null, "O Resultado entre " +soma1 +" e " +soma2 + " � = " + result);
			
	}

}
