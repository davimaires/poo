//Modelar um sistema simples para um jogo de aventura.
//- Crie uma classe Equipamento que represente os itens utilizados por um personagem (arma e armadura).
//- Crie um construtor para inicializar os atributos e um método para retornar uma descrição do equipamento.
//- Crie a classe Personagem que contenha o atributo nome, o equipamento e
//um método que mostre a descrição completa do personagem.
//- Crie a classe jogo que cotenha o nome do jogo, a lista de personagens, um método para
//- adicionar os personagens ao jogo e um método para exibir todos os personagens cadastrados
//- Crie a classe Main onde você deve instanciar o jogo. Crie pelo menos 3 personagens com equipamentos distintos e
//exiba os dados do jogo e dos personagens na tela.

package aventura.br.com.daviaires;

public class Launcher {
    public static void main (String[] args){
        Jogo jogo = new Jogo("Maple Tale");

        jogo.criaHeroi();
    }
}
