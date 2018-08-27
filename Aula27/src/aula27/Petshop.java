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
public class Petshop {
    int numCachorros;
    int numVendidos;
    Cachorro dog1;
    

    public Petshop(int numCachorros, int numVendidos) {
        this.numCachorros = numCachorros;
        this.numVendidos = numVendidos;
    }
       
       void venda(Cachorro dog)
       {
       
           
          dog =null;
   
           numVendidos++;
           
           
       }
       
       void comprar(Cachorro dog1)
       {
        this.dog1 =dog1;
        numCachorros++;
       }
        

}