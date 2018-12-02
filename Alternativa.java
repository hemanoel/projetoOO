package form;
import java.awt.Checkbox;

import javax.swing.JCheckBox;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JOptionPane;

public class Alternativa {
    	static  ArrayList<String> opcoes = new ArrayList<String>();

	public static void main(String[] args) {}
            void criar(){
          
		 
          
             
		int  n = 0;
              
		
		
		String alt = JOptionPane.showInputDialog("Informe o número de alternativas");
                 String nomePergunta = JOptionPane.showInputDialog("Informe o nome pergunta");
		n = Integer.parseInt(alt);
                
                 
		for(int i = 1;i<=n;i++)
		{             
                    String nome = JOptionPane.showInputDialog("Informe o nome da alternativa");
                    opcoes.add(nome);
                   
		}
              
         
                    ArrayList<Checkbox> checkboxes = new ArrayList<Checkbox>();
                    for (int p = 0; p < opcoes.size(); p++) 
                    {
                    Checkbox checkbox = new Checkbox(opcoes.get(p));
                    checkboxes.add(checkbox); 
                    }
                    
                    Object[] result = checkboxes.toArray();
                    /*String nomes = "";
                  for(Checkbox nome : checkboxes){
			nomes += nome+"\n";
		}*/
		 int x = JOptionPane.showOptionDialog(null, nomePergunta,
                "nao esqueca de marcar",
                JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE, null, result, result[0]);
                 
            }  
         
            }
            
                    
            
                   
	


      







           
                   
                   
                   
                   
                   
              











