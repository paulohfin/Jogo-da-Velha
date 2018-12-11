import java.awt.*;

import javax.swing.*;
import javax.swing.border.*;

public class JogoDaVelha {
	JFrame janela;
	JLabel[][] label;
	JButton iniciar, sair;
	JLabel resultado;
	
	/*
	 * Construtor
	 * define o tamanho do JFrame
	 * define o tamanho das JLabel
	 * define os botões
	 * define posição dos objetos 
	 */
	public JogoDaVelha(){
		janela = new JFrame();
		label = new JLabel[3][3];
		
		resultado = new JLabel();
		Border border = LineBorder.createGrayLineBorder();
		
		for(int i = 0; i < 3; i++)
			for(int j = 0; j < 3; j++)
				label[i][j] = new JLabel();
		iniciar = new JButton("INICIAR");
		sair = new JButton("SAIR");

		for(int i = 0; i < 3; i++)
			for(int j = 0; j < 3; j++)
				label[i][j].setBounds((2 * i + 1) * 50, (2 * j + 1) * 50 + 10, 100, 100);
		
		iniciar.setBounds(100, 10, 200, 40);
		sair.setBounds(100, 400, 200, 40);

		resultado.setBounds(100,370,200,20);
		resultado.setHorizontalAlignment(SwingConstants.CENTER);
		resultado.setOpaque(true);
		resultado.setBackground(new Color(238, 230, 133));
		resultado.setFont(new Font("Serif", Font.PLAIN, 18));
		resultado.setBorder(border);
		
		for(int i = 0; i < 3; i++)
			for(int j = 0; j < 3; j++){
				label[i][j].setHorizontalAlignment(SwingConstants.CENTER);
				label[i][j].setVerticalAlignment(SwingConstants.CENTER);
				label[i][j].setOpaque(true);
				label[i][j].setBackground(new Color(238, 230, 133));
				label[i][j].setFont(new Font("Serif", Font.PLAIN, 34));
				label[i][j].setBorder(border);
			}
		
		for(int i = 0; i < 3; i++)
			for(int j = 0; j < 3; j++)
				janela.add(label[i][j]);
		
		janela.add(resultado);
		janela.add(iniciar);
		janela.add(sair);
		
		janela.setSize(400,500);
		janela.setLayout(null);
        janela.setVisible(true);
	}
	/*
	 * Limpa texto de Labels
	 */
	public void Iniciar(){
		for(int i = 0; i < 3; i++)
			for(int j = 0; j < 3; j++)
				label[i][j].setText("");
	}
	/*
	 * Verifica se há jogada
	 */
	public boolean verificaJogada(){
		return (label[0][0].getText().equals("") ||
				label[0][1].getText().equals("") ||
				label[0][2].getText().equals("") ||
				label[1][0].getText().equals("") ||
				label[1][1].getText().equals("") ||
				label[1][2].getText().equals("") ||
				label[2][0].getText().equals("") ||
				label[2][1].getText().equals("") ||
				label[2][2].getText().equals(""));
	}
	/*
	 * Verifica se há vencedor
	 */
	public boolean verificaVencedor(){
        return (!label[0][0].getText().equals("") && label[0][0].getText().equals(label[0][1].getText()) && label[0][1].getText().equals(label[0][2].getText()) ) ||
        		(!label[1][0].getText().equals("") && label[1][0].getText().equals(label[1][1].getText()) && label[1][1].getText().equals(label[1][2].getText()) ) ||
        		(!label[2][0].getText().equals("") && label[2][0].getText().equals(label[2][1].getText()) && label[2][1].getText().equals(label[2][2].getText()) ) ||
        		(!label[0][0].getText().equals("") && label[0][0].getText().equals(label[1][0].getText()) && label[1][0].getText().equals(label[2][0].getText()) ) ||
        		(!label[0][1].getText().equals("") && label[0][1].getText().equals(label[1][1].getText()) && label[1][1].getText().equals(label[2][1].getText()) ) ||
        		(!label[0][2].getText().equals("") && label[0][2].getText().equals(label[1][2].getText()) && label[1][2].getText().equals(label[2][2].getText()) ) ||
        		(!label[0][0].getText().equals("") && label[0][0].getText().equals(label[1][1].getText()) && label[1][1].getText().equals(label[2][2].getText()) ) ||
        		(!label[0][2].getText().equals("") && label[0][2].getText().equals(label[1][1].getText()) && label[1][1].getText().equals(label[2][0].getText()) );
    }
	/*
	 * Preenche labeis com 'O' ou 'X'
	 */
	public void Preencher(int pos, String p, Color cor){
		switch(pos){
		case 0:
			label[0][0].setText(p);
			label[0][0].setForeground(cor);
			break;
		case 1:
			label[0][1].setText(p);
			label[0][1].setForeground(cor);
			break;
		case 2:
			label[0][2].setText(p);
			label[0][2].setForeground(cor);
			break;
		case 3:
			label[1][0].setText(p);
			label[1][0].setForeground(cor);
			break;
		case 4:
			label[1][1].setText(p);
			label[1][1].setForeground(cor);
			break;
		case 5:
			label[1][2].setText(p);
			label[1][2].setForeground(cor);
			break;
		case 6:
			label[2][0].setText(p);
			label[2][0].setForeground(cor);
			break;
		case 7:
			label[2][1].setText(p);
			label[2][1].setForeground(cor);
			break;
		case 8:
			label[2][2].setText(p);
			label[2][2].setForeground(cor);
			break;
		}
	}
}
