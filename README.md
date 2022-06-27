## Visibilidade (Encapsulamento)

Um exemplo de encapsulamento presente no projeto é o atributo operando que é privado, só o agente tem acesso a essa informação. Desta forma, se precisamos de determinado agente, fazemos a chamada dos métodos operar(), cancelarOp() ou FinalizarOp() e estes métodos fazem a modificação do atributo operando. 


## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
