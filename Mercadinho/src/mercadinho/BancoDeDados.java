package mercadinho;

import java.util.ArrayList;

public class BancoDeDados {
    private static ArrayList<Produto> listaProdutos = new ArrayList<>();
    
    public void addProduto(Produto produto){
        listaProdutos.add(produto);
    }
    
    public ArrayList<Produto> getListaProdutos(){
        return listaProdutos;
    }
    
    public float getPrecoByName(String nomeProduto){
        for(Produto produto : listaProdutos){
            if(produto.getNome().equals(nomeProduto)){
                return produto.getPreco();
            }
        }
        return -1;
    }
}
