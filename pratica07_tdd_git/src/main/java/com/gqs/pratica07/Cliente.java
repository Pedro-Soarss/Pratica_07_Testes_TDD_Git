
package com.gqs.pratica07;

/**
 * Representa um cliente do sistema.
 */
public class Cliente {

    private int id;
    private String nome;
    private int desconto;
    private String genero;

    /**
     * Cria um cliente com identificador, nome e desconto.
     *
     * @param id identificador do cliente
     * @param nome nome do cliente
     * @param desconto percentual de desconto
     */
    public Cliente(int id, String nome, int desconto) {
        this.id = id;
        this.nome = nome;
        this.desconto = desconto;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getDesconto() {
        return desconto;
    }

    public String getGenero() {
        return genero;
    }

    public void setDesconto(int desconto) {
        this.desconto = desconto;
    }

    @Override
    public String toString() {
        return nome + "(" + id + ")(" + desconto + "%)";
    }
}
