package swing;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Observador {
	
	public static void gerarEvento() {
		System.out.println("Olá");
	}
	
	public static void main(String[] args) {
		
		JFrame janela = new JFrame("Observador"); // criar janela ("Nome da Janela")
		janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // fechar aplicação
		janela.setSize(600, 200); // definir tamanho da janela
		janela.setLayout(new FlowLayout());  // ajustar botao
		janela.setLocationRelativeTo(null); // centralizar componente no meio da tela
		janela.setVisible(true); // tornar janela visível
		
		JButton botao = new JButton("Clicar"); // adicionar botão
		janela.add(botao);
		
/*		botao.addActionListener((ActionListener) new ActionListener() {
*			
*			public void actionPerformed(ActionEvent e) {
*				System.out.println("Evento ocorreu");
*			}
*		});
*/	
		botao.addActionListener(e -> { // utilizando lambda
			System.out.println("Evento ocorreu!");
		});
	}
}

