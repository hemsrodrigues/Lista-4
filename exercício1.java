
package ldp5Switch;

import javax.swing.JOptionPane;

public class exercício1 {
    public static void main(String[] args) {
          String dado;
          char opcao;
         
         dado = JOptionPane.showInputDialog("Escolha um turno: \n"
            +"M- Matutino \n"
            +"V- Vespertino \n"
            +"N- Noturno \n");
         
         opcao=dado.charAt(0);
         
         switch(opcao){
             case'M': 
                 JOptionPane.showMessageDialog(null,"Bom dia, jovem!\n");
                 break;
             case'V': 
                 JOptionPane.showMessageDialog(null,"Boa tarde, jovem!\n");
                 break;
             case'N': 
                 JOptionPane.showMessageDialog(null,"Boa noite, jovem!\n");
                 break;
             default:
                 JOptionPane.showMessageDialog(null,"Opção inválida, jovem.\n");
                     
         }
         
    }
}