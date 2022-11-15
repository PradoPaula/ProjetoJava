/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package provaleticiaepaula;

/**
 *
 * @author Leticia Emily de Oliveira e Paula Karoline Baleeiro Prado
 */
public class Cliente {
    private int id;
    private String nome;
    private String telefone;
    private String login;
    private String senha;
    private int quantidadedecompras;

    public Cliente(int id, String nome, String telefone, String login, String senha, int quantidadedecompras) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.login = login;
        this.senha = senha;
        this.quantidadedecompras = quantidadedecompras;
    }
    
    public Cliente(String id, String nome, String telefone, String login, String senha, String quantidadedecompras) {
        this.id = Integer.parseInt(id);
        this.nome = nome;
        this.telefone = telefone;
        this.login = login;
        this.senha = senha;
        this.quantidadedecompras = Integer.parseInt(quantidadedecompras);
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setQuantidadedecompras(int quantidadedecompras) {
        this.quantidadedecompras = quantidadedecompras;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }

    public int getQuantidadedecompras() {
        return quantidadedecompras;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ",nome=" + nome + ", telefone=" + telefone + ", login=" + login + ", senha=" + senha + ", quantidadedecompras=" + quantidadedecompras + '}' +"\n";
    }
    
    
    
    
}
