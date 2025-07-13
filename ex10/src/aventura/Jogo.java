package aventura;

import java.util.ArrayList;
import java.util.Scanner;

public class Jogo {
    private String nome;
    private ArrayList<Heroi> herois = new ArrayList();
    private ArrayList<Inimigo> inimigos = new ArrayList();
    private ArrayList<Equipamento> equipamentos = new ArrayList();

    public Jogo(String nome){
        setNome(nome);
    }
    public void criaHeroi(){
        Scanner scanner = new Scanner(System.in);
        String nome = scanner.nextLine();
        String descricao = scanner.nextLine();
        String classe = scanner.nextLine();
        Heroi heroi = new Heroi(nome, descricao, classe,100,10,5);
    }

    public void statusJogo(){
        System.out.println(this.nome);
        for (Heroi heroi : this.herois){
            System.out.println(heroi);
        }
        for (Inimigo inimigo : this.inimigos){
            System.out.println(inimigo);
        }
        for (Equipamento equipamento : this.equipamentos){
            System.out.println(equipamento);
        }
    }

    public void setNome(String nome){
        this.nome = nome;
    }
}
