package aventura;

public class Equipamento extends Entidade{
    public Equipamento(String nome, String descricao, int ataque, int armadura){
        super(nome, descricao, ataque, armadura);
    }
    public void descreveEntidade(){
        System.out.println(super.getNome());
        System.out.println(super.getDescricao());
        System.out.println(super.getAtaque());
        System.out.println(super.getArmadura());
    }
}
