 
package form;

import javax.swing.JOptionPane;

public class QuestaoAberta {
    public void novaQuestaoAberta() {
		main(null);
		
	}
    public static void main(String[] args)  {
        String opcoes[] = {
            "-- Selecione sua opcao --",
            "Resposta Curta", 
            "Paragrafo", 
            "Retornar ao Menu Anterior"  }; 
        
        Object opcao = JOptionPane.showInputDialog(null, "Questoes Abertas", 
        "Formulario", JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
       
         do {
            switch (opcao.toString()) {
            case "Resposta Curta":
             QuestaoCurta qc = new QuestaoCurta();
             qc.criar();
            break;
	
            case "Paragrafo":
             QuestaoLonga ql = new QuestaoLonga();
             ql.criar();
            break; 
	    default:
            break;
				}

	opcao = JOptionPane.showInputDialog(null, "Questoes Abertas",
        "Opções", JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
            } 
         while (!opcao.toString().equalsIgnoreCase(opcoes[3]));
       
       
       
       
    }
}