import java.text.DecimalFormat;

import javax.swing.JOptionPane;
public class Questao05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Total de Horas", "Folha de Pagamento", JOptionPane.QUESTION_MESSAGE);
		String funcionario = JOptionPane.showInputDialog("Nome do Funcion�rio");
		double totalHoras = Double.parseDouble(JOptionPane.showInputDialog("Horas Trabalhadas: "));
		double valorHora = Double.parseDouble(JOptionPane.showInputDialog("Valor da Hora Trabalhada: "));
		double totalSalario = totalHoras * valorHora;
		
		DecimalFormat formato = new DecimalFormat("####,##"); 
		JOptionPane.showMessageDialog(null,"O funcion�rio:  " + funcionario + " Receber� " +  formato.format(totalSalario) + " De sal�rio");
		
	}

}
