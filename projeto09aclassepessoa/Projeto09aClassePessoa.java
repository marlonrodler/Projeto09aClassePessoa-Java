/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto09aclassepessoa;

/**
 *
 * @author marlo
 */
public class Projeto09aClassePessoa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i;
        
        //Instanciando Pessoa como vetor para o obj "p"
        Pessoa[] p = new Pessoa[4];
        p[0] = new Pessoa(1,"Rodler",   "999999999", "ex1@ex.com", "R. Exemplo 1");
        p[1] = new Pessoa(2,"Mendonça", "888888888", "ex2@ex.com", "R. Exemplo 2");
        p[2] = new Pessoa(3,"Candido",  "777777777", "ex3@ex.com", "R. Exemplo 3");
        p[3] = new Pessoa(4,"Moraes",   "666666666", "ex4@ex.com", "R. Exemplo 4");
        
        System.out.println("*** TESTANDO CLASSE PESSOA COM CONSTRUTOR CHEIO ***");
        
        //Usando FOR para numerar e buscar a posição do vetor do objeto Pessoa (p)
        for(i = 0; i < 4; i++){
            System.out.println("\n"+ (i+1) +"ª Lista:");
            System.out.println("Código Pessoa: " + p[i].getCodPessoa());
            System.out.println("Nome         : " + p[i].getNome());
            System.out.println("Celular      : " + p[i].getCelular());
            System.out.println("Email        : " + p[i].getEmail());
            System.out.println("Endereço     : " + p[i].getEndereco());
        }
        
        System.out.println("\n\n*** TROCANDO E MOSTRANDO ALGUNS VALORES PARA O USUÁRIO COM GET E SET ***");
        
        //Usando SET para mudar os valores dos atributos dos objetos na posição [i] e GET para mostra-los
        p[0].setNome("Malon");
        p[1].setCelular("707070707");
        p[2].setEmail("trocou@trocou.com");
        p[3].setEndereco("R. Trocada com Sucesso");
        System.out.println("\nCódigo: "+ p[0].getCodPessoa() +"\nNome    : " + p[0].getNome());
        System.out.println("\nCódigo: "+ p[1].getCodPessoa() +"\nCelular : " + p[1].getCelular());
        System.out.println("\nCódigo: "+ p[2].getCodPessoa() +"\nEmail   : " + p[2].getEmail());
        System.out.println("\nCódigo: "+ p[3].getCodPessoa() +"\nEndereço: " + p[3].getEndereco() + "\n\n");
        
    }
    
}
