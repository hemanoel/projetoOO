 
package form;

import javax.swing.JOptionPane;

public class Questao {
 	public void novaQuestao()  {
		main(null);
		
	}

    public static void main(String[] args)  {
        String opcoes[] = {
        "-- Selecione sua opcao --",
        "Questao Aberta", 
        "Questao Fechada", 
        "Retornar ao Menu Anterior"  }; 
        
        Object opcao = JOptionPane.showInputDialog(null, "Menu Questoes", 
        "Formulario", JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
       
         do {
            switch (opcao.toString()) {
            case "Questao Aberta":
             QuestaoAberta qa = new QuestaoAberta();
             qa.novaQuestaoAberta();
            break;
	
            case "Questao Fechada":	
             QuestaoFechada qf = new QuestaoFechada();
             qf.novaQuestaoFechada();
            break;
        
	    default:
            break;
				}

	opcao = JOptionPane.showInputDialog(null, "Menu Questoes",
        "Opções", JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
            } 
         while (!opcao.toString().equalsIgnoreCase(opcoes[3]));
       
       
       
       
    }
}