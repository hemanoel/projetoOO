 
package form;
import javax.swing.JOptionPane;

public class QuestaoFechada {
 public void novaQuestaoFechada() {
		main(null);
		
	}

    public static void main(String[] args) {
        String opcoes[] = {
            "-- Selecione sua opcao --",
            "Lista", 
            "Exclusiva", 
            "Alternativa", 
            "Opcional", 
            "Retornar ao Menu Anterior"  }; 
        
        Object opcao = JOptionPane.showInputDialog(null, "Questoes Fechadas", 
        "Formulario", JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
       
         do {
            switch (opcao.toString()) {
           
             case "Alternativa":
                  Alternativa as = new Alternativa();
                  as.criar();
            break;
    
            case "Exclusiva":  
                 Exclusiva e = new Exclusiva();
                 e.criar();
            break;

            case "Lista":
                  Lista l = new Lista();
                 l.criar();
            break;


            case "Opcional":
                  Opcional o = new Opcional();
                 o.criar();
            break;
	    default:
            break;
				}

	opcao = JOptionPane.showInputDialog(null, "Questoes Fechadas",
        "Opções", JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
            } 
         while (!opcao.toString().equalsIgnoreCase(opcoes[5]));
       
       
       
       
    }
}