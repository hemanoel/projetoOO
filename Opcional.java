package form;
import java.awt.Checkbox;

import javax.swing.JCheckBox;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JOptionPane;

public class Opcional {
    	static  ArrayList<String> opcoes = new ArrayList<String>();

	public static void main(String[] args) {}
            void criar(){
          
	
             
		int  n = 0;
              
		//int i = 1;
                String opcao = null;
		
		String alt = JOptionPane.showInputDialog("Informe o número de alternativas");
		n = Integer.parseInt(alt);
                
                 
		for(int i = 1;i<=n;i++)
		{             
                    String nome = JOptionPane.showInputDialog("Informe o nome da pergunta");
                    opcoes.add(nome);
                    //System.out.println(opcoes);
		}
              
         
                    ArrayList<String> yes_no = new ArrayList<String>();
                    for (int p = 0; p < opcoes.size(); p++) 
                    {
                    String alternativa = new String(opcoes.get(p));
                    yes_no.add(alternativa); //for further use you add it to the list
                     int input = JOptionPane.showConfirmDialog(null, alternativa, "Escolha uma opcao",
				JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
                  
                    }
                    
                    Object[] result = yes_no.toArray();
                  
                
}
               
               
            }  
         
            
            
                    
            
                   
	