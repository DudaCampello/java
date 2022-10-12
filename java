# Aprendendo Java :construction:
## Resumo para entender JAVA


##### **Tipos de Dados**:

. Numéricos: inteiro (byte, short, int, long), ponto flutuante (float, double)

. Lógico: boolean (True ou False)

. Alfanumerico: caractere (char), String

. Operações Básicas

<br />

📌 Variável começa com letra minúscula ex: double numero; se for palavra composta modelo camelCase

📌 Dica: Java Maiúsculas são diferenciadas de minúsculas

📌 Constante deve ser representada com toda palavra em letra maiúscula.

📌 Os tipos referenciados: podem ser criados, usados como referência, começam com letra maiúscula.

<br />

📌 **Operadores lógicos**

&& = and

|| = or

! = not


##### **CONTROLE DE FLUXO**

###### **ESTRUTURA CONDICIONAL**

- If - Else (não tem elif)

Uma opção para escrever if-else é a condição ternária: 

ex: int nota = 3;

String resultado = nota>=7 ? "Aprovado" : nota>=5 && nota<7 ? "Recuperação" : "Reprovado"

- Switch - Case ou escolha-caso - o último é executado somente quando todos os outros cases falham. Seleção múltipla escolha. Usar o break para encerrar a operação.

###### **ESTRUTURA DE REPETIÇÃO**

Permite que o comando seja repetido várias vezes (loops)

- For : variável testada e incrementada. O comando será executado até que a expressão de validação se torne falsa.

Em For o X é muito usado para representar índide de um array e lenght = tamanho.

- For - Each: muito usado para arrays.

- While : o teste é feito no início, se a condição já começar sendo falsa já interrompe.

- Do - While : o teste é feito no final. Primeiro faz, depois testa. Testa o bloco ao menos 1 vez.

###### **ESTRUTURA DE EXCEÇÃO**

- Try - Todo erro codigo entra no try, será tratado no catch, sendo usado para prevenir erros 
- Catch - código executado caso o try estoure uma exceção
- Finally - o código é sempre executado, tendo exceção ou não

<br />

:warning: **JAVA É UMA PROGRAMAÇÃO ORIENTADA PARA OBJETO**


Modelo de análise, projeto e programação baseado na aproximação entre o mundo real e o virtual, através da criação e interação entre:

> CLASSES | OBJETOS | MÉTODOS | ATRIBUTOS  | OUTROS 

**OBJETO** - item, produto, característica; a partir do mesmo molde, da mesma classe.

ex.: Cliente é o molde, nome-endereço-idade é o molde a ser seguido, Nina e Pedro é o objeto.

INSTANCIAR - é criar. Para isso usa o termo **NEW**

**CLASSE** - representa o todo; é o molde. SUBSTANTIVO: Carro, Viagem  

O nome da classe deve começar sempre com letra Maiúscula, se tiver uma segunda palavra também escrever com letra Maiúscula ex: PessoaFisica, e evitar abreviações. 

Dentro da classe adotamos os atributos, métodos e construtores.

Numa classe juntamos 3 coisas que precisam para rodar um programa: dados, ações e materialização do conceito (atributos, métodos e construtores)

**ATRIBUTO** - conceito do mundo real. CARACTERÍSTICA: cor, distância

*O nome do atributo deve começar com letra minúscula, segue o padrão camelCase, deve evitar abreviações e não pode ter caracter especial.*

**MÉTODO** - tudo o que queremos que aconteça vai estar dentro do método. VERBO: são as **ações**, o comportamento da nossa classe. 

**MENSAGEM** - o código é executado quando é feita uma requisição. CHAMADA ex: carro.método


📌 Usamos um ponto **.** :black_circle: para chamada do método.


VISIBILIDADE = Modificadores de acesso ou controle de acesso.

- :heavy_plus_sign: public é pública, e pode ser acessada por qualquer pessoa. Visível no universo.

- #️⃣ protected é protegida, sendo permitida acesso apenas da classe, pacote e subtipos.

- :heavy_minus_sign: private acesso apenas da classe. FAZER GET E SET.

- :wavy_dash: default: visível no pacote.


Classe **MAIN** - quando uma classe tem o método MAIN, cria os objetos e imprime na tela; 

Método **CONSTRUTOR** - constrói objetos, provê valores aos atributos.

Método **SET** seta valor para um atributo.


###### **HERANÇA** - uma extensão, ideia de referência pai - filho. 

O objeto filho herda características dos pais, mas o pai não herda a característica do filho;

Classe B extend Classe A -> B é um subtipo, herda informações, mas nem tudo que está pode ser visto em B.

**POLIFORMISMO** - A mesma ação, o mesmo método, *se comportando* de forma diferente. 

Ex: Pagamento, pode ser processado() de forma diferente, se for boleto, débito, cartão de crédito ou PIX. 


**SOBRESCRITA** A mesma ação, o mesmo método, *podendo se comportar* de forma diferente. 

Ex: Uma conta pode ser corrente, poupança, universitária  ou especial. O campo *exibir saldo()* se comporta da mesma forma em Corrente e Universitária, mas se comporta de forma diferente em Especial e Poupança.

###### **ASSOCIAÇÃO** - relação entre classes e objetos. Um usa o outro, interagem entre si. Tipos de associação:
 
> Estrutural

. Composição: "Com parte todo". ex: pessoa e endereço. Se a pessoa deixa de existir o endereço também deixa de existir.

. Agregação: "Sem parte todo". ex: Disciplina e aluno. Se a disciplina ou o aluno deixar de existir o outro nao deixa.

> Comportamental: "Depende de". 

Está nos métodos. ex: existe um método na parte compra que usa cupom, finalizar(). Classe compra depende de cupom. 

###### **INTERFACE** - quando uma classe implementa uma interface ela se compromete a realizar todos os comportamentos que a interface disponibiliza. ex: impressora/computador. No lugar da palavra class aparece interface.


###### **PACKAGE** - criado para separar classes com responsabilidades distintas. Na sua criação é indicado usar um lógica de acordo com a responsabilidade de cada classe.

###### **FUNÇÕES**

Um exemplo de funções é Math. Se digitar MATH. aparece várias funções

ex: int menor = math.min(1, 2);
indica o menor nr.

###### **COLLECTION** é um objeto que agrupa múltiplos elementos (variáveis primitivas ou objeto) dentro de uma unidade. Serve para armazenar e processar conjuntos de dados de forma eficiente.

**Listas** são coleções com iterações ordenadas. ex.: java.util.List

Lista permite elemento duplicado e garante a ordem de inserção. Numa lista de alunos pode ter nomes repetidos e a sequência em que foi inserido será impresso.

Podemos fazer lista com ArrayList, Vector e LinkedList. Como escolher? De forma geral ArrayList.

ArrayList - quando demandar > volume de pesquisa
LinkedList - quando demandar grande volume de inserção e exclusão.

Ao criar uma lista usar imports (ALT+ENTER)

ex.: List <Double> notas = nem ArrayList <Double>();
notas.add(7.0) - repete 7 vezes se tiver nota 7 notas

método add: repete o trecho 7 vezes

método add: para adicionar notas = notas.add(4, 8d), onde 4 é a posição e 8 é o elemento. Na posição 4 foi adicionado a nota 8.

método toString: imprime de duas formas - sout(notas.toString)

método IndexOf - imprime uma posição dentro de uma lista sout("exiba posição nota 5.0: " + notas.indexOf(5d);

método set: para substituir um elemento - notas.set(posição que quero substituir, elemento)

método contains: confere se um elemento está presente. sout("confira se a nota 5.0 está na lista" + notas.contains(5d)); A resposta será true or false.

método for: para imprimir um elemento embaixo do outro, ex: for(Double nota : notas) sout (nota); 

###### **PARA QUE USAR UML?**

Pensar antes de codificar

Apresentar nossas ideias ao grupo

Aumentar a participação e envolvimento do time

Documentar as ideias quando já consolidadas

Atender ao requisitos

Reduzir esforço de manutenção

Facilitar a alteração do software

Reduzir retrabalho: reparos ocorrem a nível de projeto

O Diagrama de Classe é o mais importante: 

Descreve os vários tipos de objetivo

mostra quem se relaciona com quem, como as classes se relacionam, complementam e transmitem informação. 

- Descrever os vários tipos de objetivos no sistema e o relacionamento entre eles.
- Permitir a visualização das classes que irão compor o sistema com seus respectivos atributos e métodos.
- Demonstrar como as classes se relacionam, complementam e transmitem informações entre si.

É composto de 3 partes: Superior, meio e inferior

Parte superior: contém o nome da classe. Esta parte é sempre necessária, seja falando do classificador ou de um objeto.

Parte do meio: contém os atributos da classe. Use esta parte para descrever as qualidades da classe. É necessário somente quando se descreve uma instância específica de uma classe.

Parte inferior: inclui as operações da classe (métodos). Exibido em formato de lista, cada operação ocupa sua própria linha. As operações descrevem como uma classe interage com dados.

< br / >

##### **DIAGRAMA DE CLASSE**

Ajuda a um sistema. A utilização de uma modelagem visual facilita a visualização, e, por conseguinte, a criação de um melhor modelo

Objetivo:

Descrever os vários tipos de objetivos no sistema e o relacionamento entre eles.

Permitir a visualização das classes que irão compor o sistema com seus respectivos atributos e métodos.

Demonstrar como as classes se relacionam, complementam e transmitem informações entre si.

Apresenta 03 partes:

> Parte superior: contém o nome da classe.
> Parte do meio: contém os atributos da classe. 
> Parte inferior: inclui as operações da classe (métodos). As operações descrevem como uma classe interage com dados.

ASSOCIAÇÃO DE CLASSE - Descrevem um vínculo que ocorre entre os objetos de uma classe. São representadas por uma linha/seta que liga as classes envolvidas

:construction: **PASSO A PASSO PARA PRIMEIRO PROGRAMA**

1. No IDE escolhido, optei pelo Intellij, abra um novo projeto;

 📌 ALT + INSERT - atalho para criar package, classe, construtor, get, set...
 
 2. **Crie um package** (ex: br.com.dio)
 
 3. Clica em package e digita ALT + INSERT para **criar a classe** (Java Class). Sugestão de nome ex: PrimeiroPrograma. 
 
 Nesse primeiro programa não deve aparecer o main. Para chamar escreve main embaixo de *public class PrimeiroPrograma* {
 
 4. **Para imprimir um dado** precisa informar System.out.println();, ou escreve apenas **sout**, que puxa o mesmo dado
 
 5. Para rodar o programa pela primeira vez CTRL + SHIFT + F10. A partir da 2o vez, basta clicar SHIFT + F10
 
 6. Informa os atributos da class, para depois cria o construtor. ex.: private String nome; ou private Integer idade;
 
 7. Para **criar um construtor** digita em qualquer lugar do corpo ALT + INSERT, aparece uma lista de opções, selecionar construtor
 
 Se clicar apenas no campo superior (:m:) e escolher select none será criado um construtor vazio.
 
 Para criar um construtor com atributos dentro seleciona as opções apresentadas.
 
 8. **Criar Get and setter** digita ALT + INSERT, marca as opções
 
 9. **Criar equals and hashCode()** digita ALT + INSERT, seleciona NEXT. Dependendo do caso não marca nada e no final FINISH.
 
 10. **Criar toString()** digita ALT + INSERT, com todos os atributos. Aqui pode escolher o template. Nesse caso vamos selecionar String concat(+) + ok
 
 11. Depois vai no 'PrimeiroPrograma' e comenta o bloco {}
 
 ex: Cliente cliente = new Cliente ();
 
 Se o sistema reclamar é porque precisa fazer o **import ALT+ENTER**
 
 12. Para imprimir SOUT - System.out.println(cliente);
 
 13. Para rodar SHIFT + F10
 
 14. Para **passar os dados para o GitHub**. Cria um novo repositório para subir o código fonte. No GitHub seleciona New Repository, informa o nome ex: teste-curso-dio, na descrição informa o que acha necessario, marca publico ou privado, verifica as demais opções e CRIA
 
 15. Copia o link "https://github..."
 
 16. Volta para o intelijj, vai em GIT, depois COMMIT, vai aparecer os arquivos criados. Seleciona o 1o. que sobe tudo, tem um campo para escrever a mensagem co commit, depois COMMIT and PUSH
 
 17. Aparece uma aba, marcar master - Define remote. Na URL pressiona CTRL V para copiar o endereço http e OK.
 
 18. Marcar o projeto do lado direito - PUSH TAGS - PUSH - LOG In Via GitHub - Autoriza.
 
 19. Se fzer alguma alteração no programa precisa ir em commit, que fica do lado esquerdo da tela. Depois PUSH - GIT - PUSH
 
 
 ### DICAS DE ATALHO INTELLIJ
 
 - Organizar a tela CTRL ALT L
 
 - Para andar entre as linhas  CTRL SHIFT e setas
 
 - Duplicar linha CTRL D
 
 - Apagar linha CTRL Y
 
 - Cometar um bloco CTRL SHIFT /
 
 - Comentar uma linha CTRL /
 
 - Para renomear uma classe SHIFT F6
 
 - Apagar imports que não estao sendo usados CTRL ALT O
 
 - ALT + INSERT para criar Package, classe, construtor, set, get...
 
 - SOUT para System.out.println();
 
 - Rodar programa pela primeira vez CTRL + SHIFT + F10
 
 - Rodar programa pela segunda vez SHIFT + F10
