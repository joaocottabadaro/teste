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
public class Cachorro {
    
    String raça;
    int idade;
    char sexo;
    private static int quantidadeCachorro =0;

   
    
    public Cachorro(String raça,int idade,char sexo)
    {
        this.raça=raça;
        this.idade=idade;
        this.sexo=sexo;
        this.quantidadeCachorro++;
    }
    
    public Cachorro venderCachorro()
    {
        this.quantidadeCachorro--;
    return null;
    }
}
