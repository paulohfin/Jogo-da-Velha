import java.awt.Color;
import java.awt.event.*;

public class Controler {
	JogoDaVelha jogo;
	int cont = 0;
	boolean vencedor = false;
	
	public Controler(){
		jogo = new JogoDaVelha();
		jogo.resultado.setText("Player 1");
		jogar();
	}
	public void verJogada(int i){
		if(jogo.verificaJogada())
			if(!vencedor){
				if(cont % 2 == 0){
					jogo.Preencher(i, "O", Color.RED);
					jogo.resultado.setText("Player 2");
				}
				else {
					jogo.Preencher(i, "X", Color.BLUE);
					jogo.resultado.setText("Player 1");
				}
				vencedor = jogo.verificaVencedor();
				if(vencedor)
					if(cont %2 == 0)
						jogo.resultado.setText("Player 1: VENCEDOR");
					else
						jogo.resultado.setText("Player 2: VENCEDOR");
				if(!jogo.verificaJogada())
					jogo.resultado.setText("DEU VELHA");
				cont++;
			}
	}
	public void jogar(){
		jogo.label[0][0].addMouseListener(new MouseAdapter(){
	        public void mouseClicked(MouseEvent e){
	        	if(jogo.label[0][0].getText().equals(""))
	        		verJogada(0);
	        }   
		});
		jogo.label[0][1].addMouseListener(new MouseAdapter(){
	        public void mouseClicked(MouseEvent e){   
	        	if(jogo.label[0][1].getText().equals(""))
	              verJogada(1);
	        }   
		});
		jogo.label[0][2].addMouseListener(new MouseAdapter(){
	        public void mouseClicked(MouseEvent e){ 
	        	if(jogo.label[0][2].getText().equals(""))  
	              verJogada(2);
	        }   
		});
		jogo.label[1][0].addMouseListener(new MouseAdapter(){
	        public void mouseClicked(MouseEvent e){ 
	        	if(jogo.label[1][0].getText().equals(""))  
	              verJogada(3);
	        }   
		});
		jogo.label[1][1].addMouseListener(new MouseAdapter(){
	        public void mouseClicked(MouseEvent e){  
	        	if(jogo.label[1][1].getText().equals("")) 
	              verJogada(4);
	        }   
		});
		jogo.label[1][2].addMouseListener(new MouseAdapter(){
	        public void mouseClicked(MouseEvent e){  
	        	if(jogo.label[1][2].getText().equals("")) 
	              verJogada(5);
	        }   
		});
		jogo.label[2][0].addMouseListener(new MouseAdapter(){
	        public void mouseClicked(MouseEvent e){  
	        	if(jogo.label[2][0].getText().equals("")) 
	              verJogada(6);
	        }   
		});
		jogo.label[2][1].addMouseListener(new MouseAdapter(){
	        public void mouseClicked(MouseEvent e){   
	        	if(jogo.label[2][1].getText().equals(""))
	              verJogada(7);
	        }   
		});
		jogo.label[2][2].addMouseListener(new MouseAdapter(){
	        public void mouseClicked(MouseEvent e){  
	        	if(jogo.label[2][2].getText().equals("")) 
	              verJogada(8);
	        }   
		});
		jogo.iniciar.addActionListener((ActionEvent e) -> {
            cont = 0;
            vencedor = false;
            jogo.resultado.setText("Player 1");
            jogo.Iniciar();
        });
		jogo.sair.addActionListener((ActionEvent e) -> {
			jogo.janela.setVisible(false);
			jogo.janela.dispose();
		});
	}
}
