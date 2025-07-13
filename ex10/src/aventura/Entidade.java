package aventura;

import java.util.ArrayList;

public class Entidade {
    private String nome;
    private String descricao;
    private int ataque, armadura;

    public Entidade(String nome, String descricao, int ataque, int armadura){
        this.nome = nome;
        this.descricao = descricao;
        this.ataque = ataque;
        this.armadura = armadura;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setAtaque(int ataque){
        this.ataque = ataque;
    }
    public int getAtaque() {
        return ataque;
    }
    public void setArmadura(int armadura){
        this.armadura = armadura;
    }
    public int getArmadura() {
        return armadura;
    }
}
