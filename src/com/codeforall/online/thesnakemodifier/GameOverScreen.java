package com.codeforall.online.thesnakemodifier;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;
import javax.swing.*;

/**
 * The GameOverScreen class represents the game over screen.
 * It provides options to restart the game or quit.
 */
public class GameOverScreen {

    /**
     * Rectangle covering the game over area
     */
    private Rectangle rectangle;

    /**
     * Picture button displayed for restarting the game
     */
    private Picture restartButton;

    /**
     * Picture button displayed for quitting the game
     */
    private Picture quitButton;

    /**
     * Picture for game over background
     */
    private Picture background;

    /**
     * Picture for game over letters
     */
    private Picture youLose;

    /**
     * Picture for snake head
     */
    private Picture snakeHead;

    /**
     * Picture for snakeBody
     */
    private Picture snakeBody;

    /**
     * Picture for snake end
     */
    private Picture snakeEnd;

    /**
     * Picture for fruit
     */
    private Picture fruit;

    /**
     * To indicate if the game is over
     */
    private boolean gameOver;

    /**
     * Picture for score button
     */
    private Picture scoreButton;


    /**
     * Constructs a GameOverScreen
     * Initializes and draws the rectangle and pictures for the game over screen
     */
    public GameOverScreen() {
        // Initialize and draw the rectangle
        this.rectangle = new Rectangle(10, 10, 800, 700);
        this.rectangle.draw();

        // Initialize and draw the background for the game over screen
        this.background = new Picture(10, 10, Game.PREFIX + "DarkerBackground.png");
        this.background.draw();

        // Initialize and draw the quit button
        this.quitButton = new Picture(325, 450, Game.PREFIX + "Exit.png");
        this.quitButton.draw();

        // Initialize and draw the restart button
        this.restartButton = new Picture(300, 300, Game.PREFIX + "Reset.png");
        this.restartButton.draw();

        // Initialize and draw the game over letters
        this.youLose = new Picture(10,10, Game.PREFIX + "GameOver.png");
        this.youLose.draw();

        // Initialize a snake body and fruit for visual
        this.snakeHead = new Picture(450,200,Game.PREFIX + "SnakeHead.png");
        this.snakeHead.draw();

        this.snakeBody = new Picture(400,200,Game.PREFIX + "SnakeBody.png");
        this.snakeBody.draw();
        this.snakeBody = new Picture(350,200,Game.PREFIX + "SnakeBody.png");
        this.snakeBody.draw();
        this.snakeBody = new Picture(300,200,Game.PREFIX + "SnakeBody.png");
        this.snakeBody.draw();
        this.snakeBody = new Picture(250,200,Game.PREFIX + "SnakeBody.png");
        this.snakeBody.draw();
        this.snakeBody = new Picture(200,200,Game.PREFIX + "SnakeBody.png");
        this.snakeBody.draw();
        this.snakeBody = new Picture(200,240,Game.PREFIX + "SnakeBody.png");
        this.snakeBody.draw();
        this.snakeBody = new Picture(200,290,Game.PREFIX + "SnakeBody.png");
        this.snakeBody.draw();

        this.snakeEnd = new Picture(200,340,Game.PREFIX + "SnakeEnd.png");
        this.snakeEnd.draw();

        this.fruit = new Picture(520,200,Game.PREFIX + "Fruit.png");
        this.fruit.draw();

        // Initialize and draw the score button
        this.scoreButton = new Picture(350, 570, Game.PREFIX + "Score.png");
        this.scoreButton.draw();

        // Set gameOver to true initially
        this.gameOver = true;
    }

    /**
     * Get the top coordinate of the restart button
     * @return the top of the restart button
     */
    public int getRestartTop() {
        return restartButton.getY();
    }

    /**
     * Get the left coordinate of the restart button
     * @return the left of the restart button
     */
    public int getRestartLeft() {
        return restartButton.getX();
    }

    /**
     * Get the right coordinate of the restart button
     * @return the right of the restart button
     */
    public int getRestartRight() {
        return restartButton.getX() + restartButton.getWidth();
    }

    /**
     * Get the bottom coordinate of the restart button
     * @return the bottom of the restart button
     */
    public int getRestartBottom() {
        return restartButton.getY() + restartButton.getHeight();
    }

    /**
     * Get the top coordinate of the quit button
     * @return the top of the quit button
     */
    public int getQuitTop() {
        return quitButton.getY();
    }

    /**
     * Get the left coordinate of the quit button
     * @return the left of the quit button
     */
    public int getQuitLeft() {
        return quitButton.getX();
    }

    /**
     * Get the right coordinate of the quit button
     * @return the right of the quit button
     */
    public int getQuitRight() {
        return quitButton.getX() + quitButton.getWidth();
    }

    /**
     * Get the bottom coordinate of the quit button
     * @return the bottom of the quit button
     */
    public int getQuitBottom() {
        return quitButton.getY() + quitButton.getHeight();
    }

    /**
     * Get the top coordinate of the score button
     * @return the top of the score button
     */
    public int getScoreButtonTop() {
        return scoreButton.getY();
    }

    /**
     * Get the left coordinate of the score button
     * @return the left of the score button
     */
    public int getScoreButtonLeft() {
        return scoreButton.getX();
    }

    /**
     * Get the right coordinate of the score button
     * @return the right of the score button
     */
    public int getScoreButtonRight() {
        return scoreButton.getX() + scoreButton.getWidth();
    }

    /**
     * Get the bottom coordinate of the score button
     * @return the bottom of the score button
     */
    public int getScoreButtonBottom() {
        return scoreButton.getY() + scoreButton.getHeight();
    }

    /**
     * Displays the high score in a message
     */
    public void showHighScores() {
        Score scoreInstance = Score.getInstance();
        int highScore = scoreInstance.getHighScore();
        String highScoresText = "High Score: " + highScore;
        JOptionPane.showMessageDialog(null, highScoresText);
    }

    /**
     * Checks if the game is over
     * @return true if the game is over, else false
     */
    public boolean isGameOver() {
        return gameOver;
    }

    /**
     * Restart the game by creating a new Game instance
     */
    public void restartGame() {

        this.rectangle.delete();
        this.background.delete();
        this.quitButton.delete();
        this.restartButton.delete();
        this.scoreButton.delete();
        this.youLose.delete();
        this.snakeHead.delete();
        this.snakeBody.delete();
        this.snakeBody.delete();
        this.snakeBody.delete();
        this.snakeBody.delete();
        this.snakeBody.delete();
        this.snakeBody.delete();
        this.snakeBody.delete();
        this.snakeEnd.delete();
        this.fruit.delete();

        // Create a new Game instance to restart the game
        Game newGame = new Game();
        newGame.startGameLoop();

        // Initialize keyboard controls for the new game
        MyKeyboard myKeyboard = new MyKeyboard();
        myKeyboard.setSnake(newGame.getSnake());
        myKeyboard.init();
    }

    /**
     * Quit the game by exiting the system
     */
    public void quitGame() {
        System.exit(0); // Exit the program
    }
}
