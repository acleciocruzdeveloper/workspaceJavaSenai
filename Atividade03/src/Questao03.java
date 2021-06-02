import javax.swing.JOptionPane;
public class Questao03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Qual a média do Aluno", "Notas", JOptionPane.QUESTION_MESSAGE);
		String aluno = JOptionPane.showInputDialog("Nome do Aluno");
		double soma1 = Double.parseDouble(JOptionPane.showInputDialog("Nota prova 1"));
		double soma2 = Double.parseDouble(JOptionPane.showInputDialog("Nota prova 2"));
		double result = (soma1 + soma2) / 2;
		JOptionPane.showMessageDialog(null,"O Aluno " + aluno + " teve média: " + result);
			
	}

}
