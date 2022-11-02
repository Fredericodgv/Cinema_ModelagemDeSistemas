import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Genero aventura = new Genero("Aventura");

        Ator tomHolland = new Ator("Tom Holland", "Spider-Man", 24, 'm', "British");
        Ator samuelLJackson = new Ator("Samuel L. Jackson", "Nick Fury", 40, 'm', "United States");

        Direcao russoBrothers = new Direcao("Irmãos Russo", "Diretor", "Dirigir");

        Producao prod1 = new Producao("Ana", "Produção", "Animadora");

        Producao prod2 = new Producao("Carlos", "Produção", "Trilha Sonora");
        
        Filme spiderMan = new Filme("Homem-Aranha: De Volta ao Lar", 2017, "Hollywood", "USA", "2:15");

        Sala sala1 = new Sala(1, "Pipoqueiros", 100);

        Sessao sessao1 = new Sessao(new Date(2017, 6, 30), "14:00", "Disponível", 100, 0, 100);

    }
}