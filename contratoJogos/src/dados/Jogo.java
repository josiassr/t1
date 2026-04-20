package dados;

public class Jogo {
    private int codigo;
    private String nome;
    private int ano;
    private double valorMinuto;
    private Categoria categoria;

    public Jogo(int codigo, String nome, int ano, double valorMinuto, Categoria categoria){
        this.codigo = codigo;
        this.nome = nome;
        this.ano = ano;
        this.valorMinuto = valorMinuto;
        this.categoria = categoria;
    }

    public int getCodigo(){return codigo;}
    public String getNome() {return nome;}
    public int getAno(){return ano;}
    public double getValorMinuto(){return valorMinuto;}
    public Categoria getCategoria(){return categoria;}
    
    public String descrever(){
        return codigo + ";" + nome + ";" + ano + ";" + valorMinuto + ";" + categoria.getNome();
    }
}
