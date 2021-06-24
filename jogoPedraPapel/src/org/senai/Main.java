package org.senai;

import javax.swing.JOptionPane;

public class Main {
	public static int aleatorio() {
		
		return (int) (Math.random() * 3);
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Object[] opcoesJogo = {"Pedra", "Papel", "Tesoura"};
		Object[] opcoesContinuar = {"Sim", "Não"};
		int continuar = 0;
		int v = 0;
		int e = 0;
		int d = 0;		   
		
		do {
		
		int cpu = aleatorio();		
		int escolha = JOptionPane.showOptionDialog(null, "Escolha uma opção!", "Jogo", 0,
				JOptionPane.QUESTION_MESSAGE, null, opcoesJogo, opcoesJogo[1]);
		
		//System.out.println(escolha); 
		
		String resultado = "";		
		
		if((escolha == 0 && cpu == 2)||(escolha == 1 && cpu == 0 ) || (escolha == 2 && cpu == 1)) {
			resultado = "Vitória";
			v++;
		}else if (escolha == cpu) {
			resultado = "Empate";
			e++;
		}else {
			resultado = "Derrota";
			d++;
		}
		continuar = JOptionPane.showOptionDialog(null, "Eu(" + opcoesJogo[escolha] + ") X CPU(" +opcoesJogo[cpu] + ")" + "\nResultado: "+ resultado
				+"\nJogar Novamente?",
				"Jogo", 0,JOptionPane.QUESTION_MESSAGE,null, opcoesContinuar, opcoesContinuar[0]);
		 
	}
		while(continuar == 0 );{
				JOptionPane.showMessageDialog(null,
			"Placa Final" + "\nVitórias: " + v + "\nDerrotas: " + d + "\nEmpate: "+e);	
		}
	}
}