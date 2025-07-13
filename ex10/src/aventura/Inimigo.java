package aventura;

public class Inimigo extends Personagem{
    private String tipo;

    public Inimigo(String nome, String descricao, String tipo, int vida, int ataque, int armadura){
        super(nome, descricao, vida, ataque, armadura);
        this.tipo = tipo;
    }
    public void descreveEntidade(){
        System.out.println(super.getNome());
        System.out.println(this.getTipo());
        System.out.println(super.getDescricao());
        System.out.println(super.getVida());
        System.out.println(super.getAtaque());
        System.out.println(super.getArmadura());
        for(Equipamento equipamento : super.getEquipamentos()){
            System.out.println(equipamento.getNome());
        }
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
