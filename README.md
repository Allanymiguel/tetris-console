# tetris-console

A simple Tetris implementation in Java, running in the console.

## Project structure

- `model` — game data (`Shapes`, `TetrisBoard`).
- `controller` — game logic and loop (`Game`).
- `app` — entry point (`Main`).

## How to run

```bash
javac -d out $(find . -name "*.java" -not -path "./app/Teste.java")
java -cp out app.Main
```

## Controls

- `a` — move left
- `d` — move right
- `s` — move down
- `w` — rotate
