package aventura.br.com.daviaires;

import java.util.ArrayList;

public class Personagem extends Entidade{
    private int vida;
    private ArrayList<Equipamento> equipamentos = new ArrayList<>();

    public Personagem(String nome, String descricao, int vida, int ataque, int armadura){
        super(nome, descricao, ataque, armadura);
        this.vida = vida;
    }
    public void descreveEntidade(){
        System.out.println(super.getNome());
        System.out.println(super.getDescricao());
        System.out.println(this.getVida());
        System.out.println(super.getAtaque());
        System.out.println(super.getArmadura());
        for(Equipamento equipamento : this.equipamentos){
            System.out.println(equipamento.getNome());
        }
    }

    public void setVida(int vida){
        this.vida = vida;
    }
    public int getVida() {
        return vida;
    }
    public ArrayList<Equipamento> getEquipamentos() {
        return equipamentos;
    }
}
