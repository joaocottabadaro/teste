/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estoque;

/**
 *
 * @author ice
 */
public class TesteEstoque {
    
   

    
public static void main(String[]args)
{
      Estoque  produto1 = new Estoque("Impressora Jato de tinta",13,6);
      produto1.dados();
      Estoque produto2 = new Estoque("Monitor LCD 17 polegadas",11,13);
      produto2.dados();
      Estoque produto3 = new Estoque("Mouse óptico",6,2);
      produto3.dados();
      Estoque produto4 = new Estoque("TV SAMSUNG LED 60 polegadas",8,2);
      produto1.baixarEstoque(5);
      produto2.aumentarEstoque(7);
      produto3.baixarEstoque(4);
      
      
}
    
}
