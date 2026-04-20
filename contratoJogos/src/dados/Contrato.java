package dados;

public class Contrato {
    private int id;
    private int periodo;
    private Cliente cliente;
    private Jogo jogo;

    public Contrato(int id, int periodo, Cliente cliente, Jogo jogo){
        this.id = id;
        this.periodo = periodo;
        this.cliente = cliente;
        this.jogo = jogo;
    }

    public int getId(){return id;}
    public int getPeriodo(){return periodo;}
    public Cliente getCliente(){return cliente;}
    public Jogo getJogo(){return jogo;}

    public String descrever(){
        return id + ";" + periodo + ";" + cliente.getNumero() + ";" + jogo.getCodigo();
    }

}
