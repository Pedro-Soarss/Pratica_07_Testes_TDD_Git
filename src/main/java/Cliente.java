public class Cliente {
    private int id;
    private String nome;
    private int desconto;
    private String genero;

    public Cliente(int id, String nome, int desconto) {
        this.id = id;
        this.nome = nome;
        this.desconto = desconto;
    }

    public int getId() { return id; }
    public String getNome() { return nome; }
    public int getDesconto() { return desconto; }
    public String getGenero() { return genero; }
    public void setDesconto(int desconto) { this.desconto = desconto; }

    @Override
    public String toString() {
        return nome + " (" + id + ") (" + desconto + "%)";
    }
}