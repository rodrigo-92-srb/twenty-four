# Twenty Four

![img](https://upload.wikimedia.org/wikipedia/commons/thumb/3/33/24-Logo.svg/250px-24-Logo.svg.png)

Aplicação baseada na série 24 horas, para aplicar conceitos básicos de orientação a objetos com a linguagem Java. 

## Visibilidade

Um exemplo de visibilidade presente no projeto é o atributo operando que é privado, só o agente tem acesso a essa informação. Desta forma, se precisamos de determinado agente, fazemos a chamada dos métodos operar( ), cancelarOp( ) ou finalizarOp( ) e estes métodos fazem a modificação do atributo operando. 


## Getter, Setter e Construtor

Os métodos getters e setters auxiliam na proteção dos atributos da classe uma vez que os atributos privados não podem ser acessados 
e/ou alterados diretamente, só através de métodos.


## Encapsulamento

A classe Operation implementa a interface CenterOp. Desta forma os métodos abstratos da interface são implementados na classe, conseguindo desta forma proteger os atributos e métodos privados da classe. Uma vez que os estes só poderão ser acessados ou alterados através da interface. Como podemos ver no exemplo abaixo: 

```
    Operation op1 = new Operation("Presa Quebrada", 1, "Secreta");
    op1.statusOp();
    op1.iniciarOp();
    op1.finalizarOp();
    op1.statusOp();
```

No exemplo citado acima vemos que uma operação não pode ter seu atributo estadoOp alterado diretamente através do método this.setEstadoOp( ), ela só pode ter seu estado alterado através dos métodos iniciarOp( ) e finalizarOp( ).

## Abstração

Um exemplo de abstração pode ser visto na classe Unit onde os métodos e atributos são usados pela classe filha UCT e não é necessário saber como esses métodos funcionam internamente para utilizá-los na classe UCT. Além disso uma classe abstrata, no caso Unit não pode ser instanciada, pode apenas gerar classes filha.

## Herança

O conceito de herança foi aplicado na classe UCT em que a mesma herda os atributos e métodos da classe Unit. Além disso a classe UCT possui o atributo bombasDesarmadas e os métodos desarmarBomba.

## Polimorfismo


