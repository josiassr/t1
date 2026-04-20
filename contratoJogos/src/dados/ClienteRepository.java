package dados;

import java.util.ArrayList;

public class ClienteRepository {
    ArrayList <Cliente> clientes;

    public ClienteRepository(){
        clientes = new ArrayList<Cliente>();
    }

    public void adicionarCliente(Cliente c){
        clientes.add(c);
    }

    public Cliente encontrarClienteNumero(int numero){
        for (Cliente c : clientes){
            if (numero == c.getNumero()) 
                return c;
        }
        return null;
    }

    public Cliente encontrarClienteNome(String nome){
        for (Cliente c : clientes){
            if (nome.equals(c.getNome())) 
                return c;
        }
        return null;
    }

    public Cliente encontrarClienteEmail(String email){
        for (Cliente c : clientes){
            if (email.equals(c.getEmail())) 
                return c;
        }
        return null;
    }

    public Cliente encontrarClienteCpf(String cpf){
        Individual cliente;
        for (Cliente c : clientes){
            if (c instanceof Individual){
                cliente = (Individual) c;
                if (cpf.equals(cliente.getCpf())) 
                    return c;
            }
        }
        return null;
    }

    public Cliente encontrarClienteCnpj(String cnpj){
        Corporativo cliente;
        for (Cliente c : clientes){
            if (c instanceof Corporativo){
                cliente = (Corporativo) c;
                if (cnpj.equals(cliente.getCnpj())) 
                    return c;
            }
        }
        return null;
    }

    public ArrayList<Cliente> listarClientes(){
        ArrayList<Cliente> aux = new ArrayList<Cliente>();
        for (Cliente cliente : clientes){
            aux.add(cliente);
        }
        return aux;
    }

    public boolean removerCliente(Cliente cliente){
        for (Cliente c : clientes){
            if (cliente == c){
                clientes.remove(c);
                return true;
            }
        }
        return false;
    }
}
