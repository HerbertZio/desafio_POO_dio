# Desafio de Programação Orientada a Objetos com Java

Este projeto foi desenvolvido como parte de um desafio para praticar conceitos fundamentais de Programação Orientada a Objetos (POO) utilizando a linguagem Java. O objetivo principal foi implementar e demonstrar os quatro pilares da POO: Abstração, Encapsulamento, Herança e Polimorfismo.

## Funcionalidades Implementadas

- **Classes Principais:**
    - `Curso`: Representa um curso com título, descrição e carga horária. Implementa a interface `Conteudo`.
    - `Mentoria`: Representa uma mentoria com título, descrição e data. Implementa a interface `Conteudo`.
    - `Bootcamp`: Representa um bootcamp com nome, descrição, data inicial e final, além de conter uma lista de `Conteudo` inscritos e devs inscritos.
    - `Dev`: Representa um desenvolvedor com nome, lista de `Conteudo` inscritos e concluídos, além de métodos para inscrever em bootcamp, progredir em conteúdos e calcular XP total.

- **Interfaces e Herança:**
    - `Conteudo`: Interface que define o contrato para classes como `Curso` e `Mentoria`, com métodos para calcular XP.
    - `Conteudo`: Classe abstrata base para `Curso` e `Mentoria`, encapsulando título e descrição.

- **Funcionalidades Adicionais:**
    - Métodos para inscrever devs em bootcamps e progredir em conteúdos.
    - Cálculo de XP com base nos conteúdos concluídos.

## Exemplo de Uso (Main.java)

O arquivo `Main.java` exemplifica a interação com as classes e funcionalidades implementadas. Nele, são criados cursos, mentoria, bootcamp, devs, e demonstrada a inscrição, progressão em conteúdos e cálculo de XP.