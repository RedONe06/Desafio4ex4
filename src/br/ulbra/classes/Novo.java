package br.ulbra.classes;

public class Novo extends Imovel{
    
    public double adicionalImovel;

    public Novo(double adicionalImovel, String endereco, double preco) {
        super(endereco, preco);
        this.adicionalImovel = adicionalImovel;
    }

    public double getAdicionalImovel() {
        return adicionalImovel;
    }

    public void setAdicionalImovel(double adicionalImovel) {
        this.adicionalImovel = adicionalImovel;
    }
    
    public String imprimirValorAdicionalImovel(){
        return "Valor adicional: " + this.adicionalImovel;
    }


    
    
}
