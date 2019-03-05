 
package ldp5Switch;

import javax.swing.JOptionPane;

public class exercício3 {
    public static void main(String[] args) {
          double a;
          String dado;
          char opcao;
          
         dado=JOptionPane.showInputDialog("Digite um preço:");
         a= Float.parseFloat(dado);
                  
         dado = JOptionPane.showInputDialog("Escolha um tamanho: \n"
            +"P- Pequena  \n"
            +"M- Média \n"
            +"G- Grande \n");
           
         double p=a*0.3;
         double m=a*0.2;
         double g=a*0.1;
         
         opcao=dado.charAt(0);
         
         switch(opcao){
             case'P': 
                 JOptionPane.showMessageDialog(null,"Sua camisa,com desconto, custa:\n" +p);
                 break;
             case'M': 
                 JOptionPane.showMessageDialog(null,"Sua camisa, com desconto, custa:\n" +m);
                 break;
             case'G': 
                 JOptionPane.showMessageDialog(null,"Sua camisa, com desconto, custa:\n" +g);
                 break;
             default:
                 JOptionPane.showMessageDialog(null,"Opção inválida, jovem.\n");
                     
         }
         
    }
    
}
