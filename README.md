# Calculadora de IMC - Programação Orientada a Objetos

Este projeto realiza o cálculo do Índice de Massa Corporal (IMC) de um usuário com base no peso e altura informados pelo terminal. O sistema também classifica o resultado conforme as faixas de IMC e faz o cadastro de pessoas comuns e atletas.

---
## Pré-requisitos
Para compilar e executar este projeto, você precisará ter instalado em sua máquina:
* **Java JDK:** Versão 21 (ou superior)
* **Apache Maven:** Versão 3.9.16 (ou superior)
---

## Como Compilar

Para baixar as dependências e gerar o arquivo executável do projeto a partir do zero, abra o terminal na pasta raiz do projeto (onde está o arquivo `pom.xml`) e execute o seguinte comando:

```bash
mvn clean package 
```` 
---
## Como executar 
Após realizar a compilação, você pode rodar o programa direto pelo terminal utilizando o comando:
```bash
java -jar target/calculadora-imc-1.0.0.jar 
````

## Demonstração de uso
```text
-----------------------------------------
       SISTEMA CALCULADORA DE IMC
-----------------------------------------
| 1 - Calcular IMC (Pessoa)        |
| 2 - Calcular IMC (Atleta)        |
| 3 - Exibir histórico (Pessoa)    |
| 4 - Exibir histórico (Atleta)    |
| 5 - Exibir Todo o Histórico      |
| 0 - Sair                         |

Escolha uma opção: 1

---------- CADASTRO: PESSOA ----------
Nome: Joao
Idade: 25
Peso (kg): 85
Altura: 1,80

Joao (25 anos) --> IMC: 26,23 (Sobrepeso)
-----------------------------------------
````
---

## Estrutura do Projeto
Abaixo está a organização e o papel de cada arquivo no sistema
```text
ProjetoCalculadoraIMC/
│
├── pom.xml                              # Configuração do Maven e dependências do projeto.
│
└── src/
    └── main/
        └── java/
            │
            ├── Atleta.java               # Herda Pessoa e altera a classificação do IMC conforme atleta.
            │
            ├── CalculadoraIMC.java        # Interface que define os métodos de cálculo e classificação do IMC.
            │
            ├── CalculadoraRecursiva.java  # Classe auxiliar responsável pelo cálculo usando recursão.
            │
            ├── EntradaInvalidaException.java # Exceção personalizada para tratar entradas inválidas.
            │
            ├── Historico.java            # Armazena e exibe os registros de pessoas comuns e atletas.
            │
            ├── Main.java                # Inicia o sistema, exibe o menu e recebe entradas do usuário.
            │
            ├── PessoaBase.java           # Classe abstrata com nome e idade, servindo como base para herança.
            │
            ├── Pessoa.java               # Representa uma pessoa comum, calcula e classifica o IMC padrão.
            │
            └──  SistemaIMC.java          # Controla o processamento do IMC e possui um Historico por composição.
```
---
## Conceitos aplicados
O projeto foi organizado em diferentes classes para colocar os conceitos de orientação a objetos na prática.
A classe PessoaBase serve como estrutura principal e é utilizada como base para a classe Pessoa, que posteriormente é estendida pela classe Atleta através de herança. 
A classe SistemaIMC é responsável pelo funcionamento do sistema e possui um objeto da classe Historico para armazenar os registros, utilizando o conceito de composição. 
A interface CalculadoraIMC define os métodos que devem ser implementados pelas classes responsáveis pelo cálculo e classificação do IMC.
