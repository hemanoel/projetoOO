 
package form;
import java.io.IOException;
import java.io.File;
import javax.swing.JOptionPane;
public class Formulario {
 

    public static void main(String[] args) {
        String opcoes[] = {
        "-- Selecione sua opcao --",
        "Titulo e Descricao", 
        "Perguntas", 
        "Responder",
        "Sair"  }; 
        
        Object opcao = JOptionPane.showInputDialog(null, "Escolha", 
        "Formulario", JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
       
         do {
            switch (opcao.toString()) {
            case "Perguntas":
            Questao q = new Questao();
            q.novaQuestao();
            break;
	
            case "Responder":
        
            break;
            
            case "Titulo e Descricao":	
             
		String nome = JOptionPane.showInputDialog("Informe o Titulo do formulário:");
		
		String nomedapasta = String.format("C:\\Users\\hemanoel\\Desktop\\arquivos\\%s", nome); //cria uma variavel com o caminho do arquivo e o nome especifico do formulario
		//é tipo o sprintf em C
		
		
		File pasta = new File(nomedapasta);
        pasta.mkdir();											//Cria uma pasta para guardar as perguntas
		
								//Laço infinito para criar quantas perguntas o usuário desejar
		
		
			String texto = JOptionPane.showInputDialog("Informe a descricao desejado:");
		
		
			String nomedoarquivo = String.format("C:\\Users\\hemanoel\\Desktop\\arquivos\\%s_Questao.txt", nome); //cria uma variavel com o caminho do arquivo e o nome especifico do formulario
			//é tipo o sprintf em C
		
		
			File file = new File(nomedoarquivo);				//Cria o arquivo com o nome escolhido
			
			
			try {												//O eclipse que sugeriu colocar isso aqui pró código rodar
				if (file.createNewFile())						//Checa se existe um arquivo com esse nome				
					{
						System.out.println("Arquivo Criado");
					} else {
						System.out.println("Já existe um arquivo com esse nome");
					}
			} catch (IOException e) {
			e.printStackTrace();							//Eclipse tb sugeriu isso aqui
			}
		 
			Escreve arquivo = new Escreve();					//Cria uma referência pra classe que escreve
			arquivo.escreve(texto, nomedoarquivo);				//Escreve no arquivo
			
	
                
                 
            break;
	    default:
            break;
	}

	opcao = JOptionPane.showInputDialog(null, "Menu Principal",
        "Opções", JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
            } 
         while (!opcao.toString().equalsIgnoreCase(opcoes[3]));
       
       
       
       
    }
}
