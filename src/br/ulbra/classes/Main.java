package br.ulbra.classes;

public class Main {
    public static void main(String[] args) {
        
        Imovel imovel = new Imovel("25 de Juho", 3000);
        System.out.println(imovel.imprimirImovel());
        
        Novo novo = new Novo(100, imovel.getEndereco(), imovel.getPreco());
        System.out.println(novo.imprimirValorAdicionalImovel());
        System.out.println("Valor "+ imovel.getPreco());
       
        Velho velho = new Velho(40, imovel.getEndereco(), imovel.getPreco());
        System.out.println("Desconto " + velho.getDesconto());
        System.out.println(velho.Desconto());
    }
    
}
