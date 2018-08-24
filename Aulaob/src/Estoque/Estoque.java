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
public class Estoque {
    
    private String nome;
  private int quantidadeAtual;
   private  int quantidadeMinima;

    public Estoque(String nome, int quantidadeAtual, int quantidadeMinima) {
        this.nome = nome;
        this.quantidadeAtual = quantidadeAtual;
        this.quantidadeMinima = quantidadeMinima;
    }
    void alterarNome(String nome)
    {
        this.nome = nome;
    }
    
    void alterarQuantidadeMinima(int quantidadeMinima)
    {
        this.quantidadeMinima=quantidadeMinima;
    }

    void almentarEstoque(int estoqueNovo)
    {
        this.quantidadeAtual+=estoqueNovo;
    }
   
    
    void baixarEstoque(int estoque)
    {
        this.quantidadeAtual-=estoque;
    }
    
    
    void dados()
    {
        System.out.println("Nome do produto = "+this.nome);
        System.out.println("Quantidade de Estoque ="+this.quantidadeAtual);
        System.out.println("Quantidade minima = "+this.quantidadeMinima);
        
    }
}
