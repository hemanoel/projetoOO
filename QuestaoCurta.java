package form;


import java.io.File;
import javax.swing.JOptionPane;

public class QuestaoCurta {
    
  public void novaQuestaoCurta() {
		main(null);
		
	}

	public static void main(String[] args) {}
	
		void criar() {
		
                    
		
		for (int i = 1; i < 10000; i++) 						//Laço infinito para criar quantas perguntas o usuário desejar
		{
		
			String texto = JOptionPane.showInputDialog("Informe a questão desejada:");
		
			if(texto.equals("fim"))									//Condicional que quebra o laço
			{
				break;
			}
		
			String nomedoarquivo = String.format("C:\\Users\\hemanoel\\Desktop\\arquivos\\_Questao_%d.txt", i); //cria uma variavel com o caminho do arquivo e o nome especifico do formulario
			//é tipo o sprintf em C
		
			Escreve arquivo = new Escreve();					//Cria uma referência pra classe que escreve
			arquivo.escreve(texto, nomedoarquivo);				//Escreve no arquivo
		}	
	}
}