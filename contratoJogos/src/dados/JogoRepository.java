package dados;

import java.util.ArrayList;

public class JogoRepository{
    ArrayList<Jogo> jogos;

    public JogoRepository(){
        jogos = new ArrayList<Jogo>();
    }

    public void adicionarJogo(Jogo j){
        jogos.add(j);
    }

    public Jogo encontrarJogoCodigo(int codigo){
        for (Jogo j : jogos){
            if (codigo == j.getCodigo()) 
                return j;
        }
        return null;
    }

    public ArrayList<Jogo> encontrarJogoCategoria(String nomeCategoria){
        if (!nomeCategoria.equals("AVENTURA") && !nomeCategoria.equals("ESTRATEGIA") && !nomeCategoria.equals("CORRIDA")){
            System.out.println("6:erro-categoria inexistente.");
            return null;
        }
        Categoria cat;
        if (nomeCategoria.equals("AVENTURA"))
            cat = Categoria.AVENTURA;
        else if (nomeCategoria.equals("ESTRATEGIA"))
            cat = Categoria.ESTRATEGIA;
        else
            cat = Categoria.CORRIDA;
        
        ArrayList<Jogo> aux = new ArrayList<Jogo>();
        for (Jogo j : jogos){
            if (j.getCategoria() == cat) 
                aux.add(j);
        }

        if (aux.size() <= 0)
            System.out.println("6:erro-nenhum jogo encontrado");

        return aux;
    }

    public ArrayList<Jogo> listarJogosAno(int ano){
        ArrayList<Jogo> aux = new ArrayList<Jogo>();
        for (Jogo j : jogos){
            if (j.getAno() == ano) 
                aux.add(j);
        }
        return aux;
    }

    public ArrayList<Jogo> jogosAcimaValorMinuto(double valorMinuto){
        ArrayList<Jogo> aux = new ArrayList<Jogo>();
        for (Jogo j : jogos){
            if (j.getValorMinuto() >= valorMinuto) 
                aux.add(j);
        }
        return aux;
    }

    public ArrayList<Jogo> jogosAbaixoValorMinuto(double valorMinuto){
        ArrayList<Jogo> aux = new ArrayList<Jogo>();
        for (Jogo j : jogos){
            if (j.getValorMinuto() <= valorMinuto) 
                aux.add(j);
        }
        return aux;
    }

    public ArrayList<Jogo> listarjogos(){
        ArrayList<Jogo> aux = new ArrayList<Jogo>();
        for (Jogo j : jogos){
            aux.add(j);
        }
        return aux;
    }

    public boolean removerJogo(Jogo jogo){
        for (Jogo j : jogos){
            if (jogo == j){
                jogos.remove(j);
                return true;
            }
        }
        return false;
    }

}