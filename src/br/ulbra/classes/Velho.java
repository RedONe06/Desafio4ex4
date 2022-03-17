package br.ulbra.classes;

public class Velho extends Imovel{
    
    private double desconto;

    public Velho(double desconto, String endereco, double preco) {
        super(endereco, preco);
        this.desconto = desconto;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
    
    public String Desconto(){
        if (this.desconto > 100){
            return "Somente valor menores ou iguais a cem";
        } else if (this.desconto < 0){
            return "Somente valores maiores que 0";
        } else {
            return "" + (this.preco - (this.preco * (this.desconto/100)));
        }
    }
    
    
}
