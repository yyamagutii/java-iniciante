### Padronização

- Classes: devem começar com letra MAIUSCULA
- Métodos: devem começar com letra MINUSCULA
- Constantes: letras maiúsculas e palavras separadas por underline
- Variáveis: devem começar com letra MINUSCULA

## ⇒ Tipos primitivos

### **boolean**

O tipo boolean é utilizado para representar valores lógicos, podendo assumir apenas dois valores: true ou false. É utilizado em expressões condicionais, loops e outros casos onde se deseja avaliar se uma determinada condição é verdadeira ou falsa.

### **byte**

O tipo byte é utilizado para representar valores numéricos inteiros de 8 bits. Ele possui uma faixa de valores de -128 a 127.

### **char**

O tipo char é utilizado para representar caracteres individuais. Ele pode armazenar qualquer caractere Unicode e é representado por aspas simples ('').

### **short**

O tipo short é utilizado para representar valores numéricos inteiros de 16 bits. Ele possui uma faixa de valores de -32.768 a 32.767.

### **int**

O tipo int é utilizado para representar valores numéricos inteiros de 32 bits. É um dos tipos de dados mais utilizados para representar números inteiros em Java e possui uma faixa de valores de -2.147.483.648 a 2.147.483.647.

### **long**

O tipo long é utilizado para representar valores numéricos inteiros de 64 bits. Ele é utilizado para representar valores inteiros muito grandes e possui uma faixa de valores de -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807.

### **float**

O tipo float é utilizado para representar valores numéricos de ponto flutuante, ou seja, valores com casas decimais, sendo que ocupa 32 bits de memória. Ele pode representar números decimais com até sete dígitos e tem uma precisão limitada, o que significa que ele pode arredondar os números se eles forem muito grandes ou muito pequenos.

### **double**

O tipo double é similar o float, entretanto ele ocupa 64 bits de memória e pode representar números decimais com até 15 dígitos.

## ⇒ Text Box

```yaml
String texto;
texto = """
				xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
				xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
				""";
```

## ⇒ Formatar texto

Em Java, é possível formatar textos e números de diversas maneiras. Isso pode ser útil em diversas situações, como ao exibir valores para o usuário de uma maneira mais legível.

Uma das maneiras mais comuns de se formatar textos em Java é utilizando o método `format()`, da classe String. Esse método permite formatar um texto utilizando diversos placeholders, que são representados pelo caractere `%` seguido de uma letra que indica o tipo de dado que será inserido no placeholder. Por exemplo, `%s` indica que uma String será inserida no placeholder, `%d` indica um valor inteiro e `%f` indica um valor de ponto flutuante. Vamos ver um exemplo:

```csharp
String nome = "Maria";
int idade = 30;
double valor = 55.9999;
System.out.println(String.format("Meu nome é %s, eu tenho %d anos e hoje gastei %.2f reais", nome, idade, valor));
Copiar código
```

Nesse exemplo, os valores das variáveis nome, idade e valor são passados como parâmetros para o método `String.format`, substituindo os placeholders `%s`, `%d` e `%.2f`, respectivamente. O resultado impresso será "Meu nome é Maria, eu tenho 30 anos e hoje gastei 55,99 reais". Perceba também que o placeholder `%.2f` indica que o valor deve ser formatado com duas casas decimais.

Esse exemplo do que foi feito para o `String.format` também pode ser usado com Text Block, onde usa-se o método que citei em aula, o formatted, para informar as variáveis que deverão ser utilizadas no lugar dos placeholders. Veja esse exemplo:

```python
String nome = "João";
int aulas = 4;

String mensagem = """
                  Olá, %s!
                  Boas vindas ao curso de Java.
                  Teremos %d aulas para te mostrar o que é preciso para você dar o seu primeiro mergulho na linguagem!
                  """.formatted(nome, aulas);

System.out.println(mensagem);
Copiar código
```

O resultado impresso será:

> Olá, João!
> 
> 
> Boas vindas ao curso de Java.
> 
> Teremos 4 aulas para te mostrar o que é preciso para você dar o seu primeiro mergulho na linguagem!
> 

## ⇒ Converter valores (casting)

```yaml
double numero1 = 1;
int numero2 = (int) (numero+1);
```

Casting é um recurso utilizado em Java para converter um tipo de dado em outro. Essa conversão pode ser feita de forma automática pelo compilador (conversão implícita), quando o tipo de dado de destino é compatível com o tipo de dado de origem, ou de forma manual (conversão explícita), utilizando o operador de casting.

O casting é utilizado para permitir que tipos de dados incompatíveis possam ser utilizados em uma mesma operação ou expressão. Por exemplo, se um método espera um parâmetro do tipo int e o valor que se deseja passar é do tipo double, é necessário fazer um casting para converter o valor em int.

### **Casting implícito**

O casting implícito é realizado automaticamente pelo compilador quando o tipo de dado de origem é compatível com o tipo de dado de destino. Por exemplo, é possível atribuir um valor de tipo int a uma variável do tipo double, pois o tipo double é maior e suporta todos os valores que o tipo int pode armazenar:

```cpp
int x = 10;
double y = x; // casting implícitoCopiar código
```

### **Casting explícito**

O casting explícito é realizado quando o tipo de dado de origem é incompatível com o tipo de dado de destino. Nesse caso, devemos utilizar o operador de casting para realizar a conversão:

```cpp
double x = 10.5;
int y = (int) x; // casting explícitoCopiar código
```

No exemplo anterior, o valor da variável x é convertido em um valor inteiro utilizando o casting explícito. É importante notar que, neste caso, a parte decimal será descartada e o valor atribuído à variável y será 10.

Abaixo tem uma tabela, onde você pode visualizar mais facilmente as conversões que são implícitas e as que necessitam ser feitas de forma explícita.

![](https://cdn3.gnarususercontent.com.br/2858-java-criando-primeira-aplicacao/imagem21.png)
