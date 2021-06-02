import java.text.DecimalFormat;

import javax.swing.JOptionPane;
public class Questao04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Total Gasto", "Pedido 01", JOptionPane.QUESTION_MESSAGE);
		String client = JOptionPane.showInputDialog("Nome do Cliente");
		double produto1 = Double.parseDouble(JOptionPane.showInputDialog("Valor: "));
		double produto2 = Double.parseDouble(JOptionPane.showInputDialog("Valor: "));
		double totalPedido = produto1 + produto2;
		double garcon = totalPedido * 0.1;
		DecimalFormat df = new DecimalFormat("###.##");
		JOptionPane.showMessageDialog(null,"Total pedido " + totalPedido + " Garçon: " + df.format(garcon));
		
	}

}
