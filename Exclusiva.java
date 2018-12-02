package form;

import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class Exclusiva {
    	static  ArrayList<String> opcoes = new ArrayList<String>();

	public static void main(String[] args) {}
            void criar(){
          
		 

             
		int  n = 0;
              
		
                String opcao = null;
		
		String alt = JOptionPane.showInputDialog("Informe o número de alternativas");
                String nomePergunta = JOptionPane.showInputDialog("Informe o nome pergunta");
		n = Integer.parseInt(alt);
                
                 
		for(int i = 1;i<=n;i++)
		{             
                    String nome = JOptionPane.showInputDialog("Informe o nome da alternativa");
                    opcoes.add(nome);
               
		}
              
         
                    ArrayList<JRadioButton> jradiobotoes = new ArrayList<JRadioButton>();
                    for (int p = 0; p < opcoes.size(); p++) 
                    {
                    JRadioButton jradiobotao = new JRadioButton(opcoes.get(p));
                    jradiobotoes.add(jradiobotao); 
                    }
                    
                    Object[] result = jradiobotoes.toArray();
                    /*String nomes = "";
                  for(Checkbox nome : checkboxes){
			nomes += nome+"\n";
		}*/
		 int x = JOptionPane.showOptionDialog(null, nomePergunta,
                "nao esqueca de marcar",
                JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE, null, result, result[0]);
                 
            }  
         
            }
            
                    
            
                   
	