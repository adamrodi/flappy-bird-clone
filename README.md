# Flappy Bird Clone

This is a simple clone of the popular Flappy Bird game implemented in Java using Swing for the graphical interface.

## Project Structure

## Files

- **src/App.java**: The main entry point of the application. It sets up the game window and starts the game.
- **src/Bird.java**: Represents the bird in the game, including its properties and image.
- **src/FlappyBird.java**: The main game logic and rendering. Handles game initialization, rendering, and user input.
- **src/keyListener.java**: An interface for handling key events.
- **src/Pipe.java**: Represents the pipes in the game, including their properties and image.

## How to Run

1. Compile the Java files:
    ```sh
    javac src/*.java
    ```

2. Run the application:
    ```sh
    java src.App
    ```

## Gameplay

- Press the `SPACE` key to make the bird flap and move upwards.
- Avoid the pipes to keep the bird alive.
- The game ends when the bird collides with a pipe or the ground.
- The score increases as the bird successfully passes through the pipes.

## Dependencies

- Java Development Kit (JDK)
- Swing (part of the JDK)
