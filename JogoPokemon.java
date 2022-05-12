//Alunas: Luísa Pedrolli, Gabriela Sena, Gabrieli Aoki Gestal
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JogoPokemon {
    public static Scanner input;
    

    public static void menu(){
        System.out.println("Menu:");
        System.out.println("1. Cadastrar Pokemon");
        System.out.println("2. Listar Pokemon");
        System.out.println("3. Batalhar");
        System.out.println("4. Sair");
    }

    public static void PokemonsIniciais(ArrayList<Pokemon> pokemons, ArrayList<Treinador> treinadores){

        pokemons.add(new Pokemon("Pikachu", 180, 180, 94, "Eletrico",  new Ataque[] 
        {new Ataque("Ataque Rapido", 20, 10), new Ataque("Investida trovao", 35, 5), new Ataque("Cauda de ferro", 40, 3) , new Ataque("Choque de trovao", 60, 1)} ));

        pokemons.add(new Pokemon("Scorbunny", 140, 140, 98, "Vento", "Fogo" , new Ataque[] 
        {new Ataque("Ataque Rapido", 20, 3), new Ataque("Chute duplo", 40, 5), new Ataque("Brasas", 15, 4) , new Ataque("Ataque fofo", 65, 1)} ));

        treinadores.add(new Treinador("Ethan", 12));
        
    } 

    public static void CadastrarPokemons(ArrayList<Pokemon> pokemons){

        System.out.println("Digite o nome do pokemon: ");
        String nomes = input.nextLine(); 

        System.out.println("Digite o HP total: ");
        int hPTotal = input.nextInt();

        System.out.println("Digite a iniciativa do pokemon: ");
        int iniciativa = input.nextInt();
        input.nextLine();
        System.out.println("Digite o ataque: \n ");
    
        Ataque[] ataques = new Ataque[4];
        for(int i = 0; i <= 3; i++){ 
            
            System.out.println("Digite o nome do ataque: ");
            String nome = input.nextLine();
            System.out.println("Digite o valor do ataque: ");
            int valorAtaque  = input.nextInt();
            System.out.println("Digite o ap do ataque: ");
            int ap = input.nextInt();
            input.nextLine();
            ataques[i] = new Ataque(nome, valorAtaque, ap);
        }

        System.out.println("O pokemon possui 1 ou 2 tipos? ");
        int tipos = input.nextInt();
        input.nextLine();

        if(tipos==1){
            System.out.println("Digite o tipo do pokemon: ");
            String tipo1 = input.nextLine();

            pokemons.add(new Pokemon(nomes, hPTotal, hPTotal, iniciativa, tipo1, ataques));
        }
        else{
            System.out.println("Digite o tipo 1 do pokemon: ");
            String tipo1 = input.nextLine();

            System.out.println("Digite o tipo 2 do pokemon: ");
            String tipo2 = input.nextLine();

            pokemons.add(new Pokemon(nomes, hPTotal, hPTotal, iniciativa, tipo1, tipo2, ataques));
        }
    }

    private static void listarPokemons(List<Pokemon> pokemons) {
        final StringBuilder builder = new StringBuilder();

        for (int i = 0; i < pokemons.size(); i++) {
            builder.append(i + 1);
            builder.append(". ");
            builder.append(pokemons.get(i).toString());
            builder.append('\n');
        }

        System.out.println(builder.toString());
    }

    public static void Batalhar(ArrayList<Pokemon> pokemons, ArrayList<Treinador> treinadores){

        int x;
        int y;
        int ataque1;
        int a = 0; //para ajudar nos IFs que trocam os pokemons

        System.out.println(treinadores); //apresenta treinador 

        System.out.println("\nEscolha 2 pokemons: ");//escolher pokemons
        //menu de nomes de pokemon 

        for(int i = 0; i < pokemons.size(); i++){ //for para listar nomes de pokemon

            System.out.printf("%d. %s\n", i, pokemons.get(i).getNome());
        }
        int poke1 = input.nextInt();//armazena os pokemons escolhidos
        int poke2 = input.nextInt();

        System.out.println("-------------------------------------------------");
        System.out.println("\nCOMECO DE BATALHA:\n");
        System.out.println("-------------------------------------------------");

        //IFs pra ver qual pokemon tem a maior iniciativa
        if(pokemons.get(poke1).getIniciativa() > pokemons.get(poke2).getIniciativa()){
            x = poke1; //x sempre eh quem ataca
            y = poke2; //y sempre eh quem apanha
        }
        
        else if(pokemons.get(poke2).getIniciativa() > pokemons.get(poke1).getIniciativa()){
            x = poke2;
            y = poke1;
        }
        else {
            x = poke1;
            y = poke2;
        }
        do{ //laco para executar o jogo ate que um pokemon morra


        System.out.println("\nEscolha o ataque do pokemon: ");
        for(int i = 0; i < 4; i++ ){
        System.out.printf("%d. %s\n", i, pokemons.get(x).getAtaque()[i].toString()); //x pq pode ser qualquer um dos 2
        }
        ataque1 = input.nextInt();//le o ataque escolhido
        if(pokemons.get(x).getAtaque()[ataque1].getAp() <= 0){ //para nao deixar escolher um ap que ja acabou
            System.out.println("Digite novamente! ");
            ataque1 = input.nextInt();//le o ataque escolhido
        }
        
        //tira a vida do pokemon que perdeu
        pokemons.get(y).setHPAtual(pokemons.get(y).getHPAtual() - pokemons.get(x).getAtaque()[ataque1].getValorAtaque());
        
        //tira um numero do ap
        pokemons.get(x).getAtaque()[ataque1].setAp(pokemons.get(x).getAtaque()[ataque1].getAp() - 1);

        if(a > 0){
        System.out.println("\nEntrou para inverter");
        if(poke1 == x){ //if para inverter os pokemons
            y = poke1;
            x = poke2;
            System.out.println("\nInverteu ");
        }
        if(poke2 == x){
            y = poke2;
            x = poke1;
            System.out.println("\ninverteu2");
        }
        }
        a++;
        System.out.printf("\nNome pokemon: %s\nHP Atual: %s", pokemons.get(x).getNome(), pokemons.get(x).getHPAtual());       
        System.out.printf("\n\nNome pokemon: %s\nHP Atual: %s", pokemons.get(y).getNome(), pokemons.get(y).getHPAtual());

        
        }while((pokemons.get(x).getHPAtual() > 0) && (pokemons.get(y).getHPAtual() > 0));

        System.out.println("Jogo encerrado! ");

    }
    public static void main(String[] args){


        input = new Scanner(System.in);
        ArrayList<Pokemon> pokemons = new ArrayList<Pokemon>();
        ArrayList<Treinador> treinadores = new ArrayList<Treinador>();
        PokemonsIniciais(pokemons, treinadores);

        int menu = 1;
        while((menu>=1)&(menu<4)){
            System.out.println("-------------------------------------------------");
            menu();
            menu = input.nextInt();
            input.nextLine();
            System.out.println("-------------------------------------------------");
            switch(menu){

                case 1:
                CadastrarPokemons(pokemons);
                    break;
                
                case 2:
        
                    System.out.println("Lista de pokemons:");
                    listarPokemons(pokemons);
                    break;

                case 3:
                
                    Batalhar(pokemons, treinadores);
                    break;

                case 4:
                
                System.out.println("-------------------------------------------------");
                System.out.println("Jogo encerrado!");
                System.out.println("-------------------------------------------------");
                    break;
            }
        }
    }
}