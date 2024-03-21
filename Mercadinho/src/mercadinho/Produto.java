package mercadinho;

public class Produto {
    private int id;
    private float preco;
    private String nome;
    private String desc;
    private static int nextId = 1;
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
    
    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Produto(float preco, String nome, String desc) {
        this.id = nextId;
        nextId++;
        this.preco = preco;
        this.nome = nome;
        this.desc = desc;
    }
    
    
    
    
    
}
