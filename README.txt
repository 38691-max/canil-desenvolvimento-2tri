========================================
README — Classe Cat e Enum FurColor
========================================

1. O QUE EU ENTENDI DA ATIVIDADE
----------------------------------------

A atividade tinha como objetivo praticar conceitos de
Programação Orientada a Objetos em Java.

Os principais conceitos utilizados foram:

- Herança
- Encapsulamento
- Sobrescrita de métodos (Override)
- Sobrecarga de métodos (Overload)
- Uso de enums
- Construtores
- Getters

A classe Cat foi criada seguindo o modelo da classe Dog,
herdando características da classe Animal.

Também foi necessário criar o enum FurColor para representar
as possíveis cores de pelo do gato.

========================================

2. ENUM FurColor
----------------------------------------

O enum FurColor foi criado para representar cores fixas
de pelo de gatos.

As cores implementadas foram:

- BLACK
- WHITE
- ORANGE
- GRAY
- BROWN
- MIXED

Cada constante possui um displayName para mostrar o nome
formatado corretamente ao usuário.

Foi implementado o método getDisplayName() para retornar
esse texto formatado.

Isso foi feito para evitar usar Strings soltas no código
e aumentar a organização e segurança dos tipos.

========================================

3. CLASSE Cat
----------------------------------------

A classe Cat estende a classe Animal utilizando herança.

Foram implementados os atributos privados:

- lives
- furColor
- isIndoor
- favoriteFood
- purringFrequency
- isNeutered

No construtor:

- Foi utilizado super(...) para chamar o construtor da
  superclasse Animal.
- O habitat foi definido utilizando operador ternário:
  se isIndoor for true:
      Habitat.DOMESTIC
  senão:
      Habitat.URBAN

- O valor de isWild foi definido como o oposto de isIndoor.

- O campo lives foi iniciado com valor 7.

========================================

4. OVERRIDE
----------------------------------------

Os métodos makeSound(), sleep() e displayInfo()
foram sobrescritos utilizando @Override.

Isso foi feito para personalizar o comportamento do gato
em relação ao comportamento padrão da classe Animal.

Exemplos:

- makeSound():
  O gato faz "Meow" e mostra a frequência do ronronar.

- sleep():
  O gato procura o lugar mais quente e dorme por 14 horas.

- displayInfo():
  Primeiro chama super.displayInfo()
  e depois mostra os atributos específicos da classe Cat.

========================================

5. OVERLOAD
----------------------------------------

Foram criadas duas sobrecargas do método move():

- move(int distance, int speed)
- move(int distance, String target)

Isso permite utilizar o mesmo método com comportamentos
diferentes dependendo dos parâmetros recebidos.

========================================

6. MÉTODOS EXTRAS
----------------------------------------

Foi criado o método purr() para representar o ronronar
do gato.

Também foi criado o método loseLife(), que reduz a quantidade
de vidas do gato até chegar em zero.

========================================

7. GETTERS
----------------------------------------

Foram implementados getters para todos os atributos privados
para manter o encapsulamento da classe.

========================================

8. COMO TESTEI A IMPLEMENTAÇÃO
----------------------------------------

A implementação foi testada criando objetos da classe Cat
e chamando todos os métodos implementados.

Foram realizados testes para:

- makeSound()
- sleep()
- move()
- purr()
- loseLife()
- displayInfo()

Também foi verificado:

- Se o enum FurColor funcionava corretamente
- Se o construtor inicializava os valores corretamente
- Se o número de vidas diminuía corretamente
- Se os métodos sobrescritos exibiam as mensagens esperadas

========================================

9. CONCLUSÃO
----------------------------------------

A atividade ajudou a praticar conceitos importantes
de Programação Orientada a Objetos em Java,
principalmente herança, polimorfismo,
encapsulamento e enums.