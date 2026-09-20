# Lista 02 - Programação Imperativa (Vetores e Matrizes)

Prof. Daniel Bezerra

Resolução das questões da Lista 02, em Java.

## Estrutura

```
src/main/java/
├── vetores/    -> q1.java ... q13.java   (questões 1 a 13 de Vetores)
└── matrizes/   -> q1.java ... q14.java   (questões 1 a 14 de Matrizes)
```

Cada questão está em seu próprio arquivo (`qN.java`), dentro do pacote da sua seção
(`vetores` ou `matrizes`).

## Como executar

Na raiz do repositório:

```bash
# compilar tudo
javac -d out src/main/java/vetores/*.java src/main/java/matrizes/*.java

# rodar uma questão (exemplo: questão 3 de vetores)
java -cp out vetores.q3
```

Ou abra a pasta em uma IDE (IntelliJ, Eclipse, VS Code) e execute o `main` do arquivo desejado.
