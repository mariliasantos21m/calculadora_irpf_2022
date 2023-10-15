# Calculadora IRPF 2022

## Índice

* [Desenvolvedores e disciplina](#sobre-os-devs)
* [Sobre](#sobre)
* [Dependências](#dependencies)

## Desenvolvedores e disciplina:

* Alunos: Dimas Lima, Marília Santos, Daniel Lira, Nathyane de Oliveira, José Josimário e Thiago Maia;
* Disciplina: Programação Orientada a Objetos;
* Professor: Jeofton Costa Melo;
* Ano letivo: 2023.1

## Sobre:

* Esse projeto é um simulador de cálculo de imposto de renda mensal do ano de 2022, utilizando as seguintes regras:
* Alíquotas: salário de até R$1903.98 - 0% (Isento), até 2826.65 - 7.5%, até 3751.05 - 15%, até 4665 -  22.5%, acima de 4665 - 27.5%;
* Deduções: quantidade de dependentes * 189,59 + valor da contribuição previdenciária;
* As deduções são reduzidas do salário, resultando no salário tributável. De acordo com o salário, ele se encaixará num intervalo de taxação, fragmentando-se em pedaços que serão tributados por cada taxa específica;
* Ao todo, são 5 faixas de tributação, começando da faixa de isenção e chegando até os 27.5%.

## Dependências:

* Desenvolvido em java (JDK 17), maven (4.0.0) com o springbootframework (versão 6.0.9). Mais informações sobre as dependências podem ser encontradas no arquivo "pom.xml" dentro do projeto.
* Observação: caso baixe o projeto para testar em sua máquina, se utilizar o intelij, clique com o botão direito em cima da pasta do projeto e clique em "Open Folder as Intelij Project", clique em "Confio nos autores"
e, caso apareça uma mensagem no canto inferior direito indicando a utilização das mesmas configurações, clique em aceitar, pois dessa forma o Intelij irá simular as mesmas configurações utilizadas no desenvolvimento
do projeto, evitando assim problemas na hora de buildar e de dar run no projeto.
  

  
