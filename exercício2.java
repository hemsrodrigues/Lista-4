
package ldp5Switch;

import static java.lang.Math.pow;
import javax.swing.JOptionPane;

public class exercício2 {
    
    public static void main(String[] args) {
          float a;
          float b;
          String dado;
          char opcao;
          
         dado=JOptionPane.showInputDialog("Digite um número:");
         a= Float.parseFloat(dado);
         dado=JOptionPane.showInputDialog("Digite outro número:");
         b= Float.parseFloat(dado);
         
         dado = JOptionPane.showInputDialog("Escolha uma operação a ser realizada: \n"
            +"A- Adição \n"
            +"S- Subtração \n"
            +"D- Divisão \n"
            +"M- Multiplicação \n"     
            +"P- Potenciação \n");
         
         float adi=a+b;
         float sub=a-b;
         float div=a/b;
         float mult=a*b;
         float pot= (float) pow(a, b);
         
         opcao=dado.charAt(0);
         
         switch(opcao){
             case'A': 
                 JOptionPane.showMessageDialog(null,"Seu resultado é:\n" +adi);
                 break;
             case'S': 
                 JOptionPane.showMessageDialog(null,"Seu resultado é:\n" +sub);
                 break;
             case'D': 
                 JOptionPane.showMessageDialog(null,"Seu resultado é:\n" +div);
                 break;
             case'M': 
                 JOptionPane.showMessageDialog(null,"Seu resultado é:\n" +mult);
                 break;
             case'P': 
                 JOptionPane.showMessageDialog(null,"Seu resultado é:\n" +pot);
                 break;
             default:
                 JOptionPane.showMessageDialog(null,"Opção inválida, jovem.\n");
                     
         }
         
    }
}
