/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula27;

/**
 *
 * @author ice
 */
public class Aula27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cachorro  dog1= new Cachorro("rottweiller",3,'m');
        Cachorro dog2= new Cachorro("golden",4,'f');
        Cachorro dog3 = new Cachorro("husky siberiano",5,'m');
        Petshop LosAngeles=new Petshop(0,0);
       LosAngeles.comprar(dog1);
       LosAngeles.comprar(dog2);
       LosAngeles.venda(dog1);
        System.out.println(dog1.raça);
        System.out.println(dog2.raça);
        
        
    }
    
}
