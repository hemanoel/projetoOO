package form;

import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class Lista {
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
              
         
                    ArrayList<String> jradiobotoes = new ArrayList<String>();
                    for (int p = 0; p < opcoes.size(); p++) 
                    {
                    String jradiobotao = new String(opcoes.get(p));
                    jradiobotoes.add(jradiobotao); 
                    }
                    
                    Object[] result = jradiobotoes.toArray();
                    /*String nomes = "";
                  for(Checkbox nome : checkboxes){
			nomes += nome+"\n";
		}*/
		   Object x = JOptionPane.showInputDialog(null, nomePergunta, 
        "Formulario", JOptionPane.QUESTION_MESSAGE, null, result, result[0]);
                 
            }  
         
            }
            
                    
            
                   
	