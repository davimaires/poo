package aventura;

public class Heroi extends Personagem{
    private String classe;

    public Heroi(String nome, String descricao, String classe, int vida, int ataque, int armadura){
        super(nome, descricao, vida, ataque, armadura);
        this.classe = classe;
    }
    public void descreveEntidade(){
        System.out.println(super.getNome());
        System.out.println(this.getClasse());
        System.out.println(super.getDescricao());
        System.out.println(super.getVida());
        System.out.println(super.getAtaque());
        System.out.println(super.getArmadura());
        for(Equipamento equipamento : super.getEquipamentos()){
            System.out.println(equipamento.getNome());
        }
    }
    public String getClasse() {
        return classe;
    }
    public void setClasse(String classe) {
        this.classe = classe;
    }
}
