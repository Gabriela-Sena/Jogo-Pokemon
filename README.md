# Jogo-Pokemon

Desenvolvimento de um jogo do universo Pokémon.
Inicialmente este é um esboço do jogo, sem interface gráfica,
possui somente as classes básicas do jogo. 

### Classes:

- Classe Animal = possui o atributo Nome, com métodos get, set e construtor.
- Classe Treinador = herda de Animal, possui o atributo Idade, com métodos get, set e construtor.
- Classe Pokemon = herda de Animal, possui os atributos HPTotal, HPAtual, Iniciativa, Tipo1, Tipo2, e Ataque, com métodos get, set e dois métodos Construtor ( para Pokémon que possui somente um tipo, e para os que possuem dois tipos).
- Classe Ataque = possui 3 atributos, nome, valorAtaque e AP (pontos de ação), com métodos get, set e construtor.
- JogoPokemon = deve permitir cadastrar Pokémons, lista-los e fazer uma batalha entre 2 Pokémons da escolha do treinador.

### Atributos:

- HPTotal = se refere aos pontos de vida máximo do Pokémon; 
- HPAtual = se refere aos pontos de vida atuais que podem ter sido afetados por dano; 
- Iniciativa = é utilizada para definir quem ataca primeiro; 
- Tipo1 e Tipo2 = são os tipos do Pokémon (fogo, água, psíquico,
dentre outros);
- Ataque = será do tipo da classe Ataque, que é utilizado para atacar e fazer dano ao outro Pokémon.
- AP = define o número de vezes que um ataque pode ser
usado, ao acabar o AP o jogo não deve permitir que ele seja usado novamente);

### Considerações:

- Cada Pokémon deve ser inserido em um ArrayList para permitir que eles sejam escolhidos para a batalha. 
- Durante as batalhas, o treinador deve poder escolher o ataque que seu Pokémon irá fazer.
- Pré-cadastro do treinador e pelo menos 2 Pokémon no ArrayList. 
- O nome e idade do treinador deve aparecer sempre que iniciar o jogo.
- Para o menu de batalha, os Pokémons devem intercalar seus ataques até que um deles seja nocauteado. 
- A ordem dos ataques deve ser definida pela iniciativa, o Pokémon com maior iniciativa é quem ataca primeiro.
-  A cada turno deverá ser apresentado o status de ambos os Pokémons.