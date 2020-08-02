package ru.gb.catch_the_ddop;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class GameWindow extends JFrame {

    private static GameWindow gameWindow;
    //Создаем переменные для изображений
    private static Image background;
    private static Image drop;
    private static Image game_over;

    public static void main(String[] args) throws IOException {
        background = ImageIO.read(GameWindow.class.getResourceAsStream("background.png"));/* Добавляем
        *возможность читать изображения */
        gameWindow = new GameWindow();
        gameWindow.setTitle("Catch The Drop!");
        gameWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//При закрытии окна, программа завершится
        gameWindow.setLocation(500, 300); // изначальное размещение окна при запуске
        gameWindow.setSize(906, 478); //размер окна
        gameWindow.setResizable(false); //запрет на изменение размера окна
        GameField gameField = new GameField(); //создали новый объект и присвоили его переменной gameField
        gameWindow.add(gameField); // по сути добавили в наше окно возможность использовать onRepaint
        gameWindow.setVisible(true); // сделать окно видимым (по умолчанию невидимое)
    }

    /**GameField это подкласс JPanel, переопределил метод (paintComponent) родителя, потом супером использовал
     * его метод paintComponent, внеся все в переменную b И можно уже рисовать b.fillOvall и т.д.
     * Но мы еще создали метод onRepaint и записали теперь в его переменную возможность рисовать */
    private static class GameField extends JPanel { //метод который находится в Jpanel переопределили

        @Override
        protected void paintComponent (Graphics b) {
            super.paintComponent(b); //метод отрисует нашу панель JPanel, а ниже выполнится метод onRepaint
            onRepaint(b);
            //b.fillOval(10, 10, 200, 100);

        }
        private static void onRepaint(Graphics g) {
            g.fillOval(10, 10, 200, 100);
            g.drawLine(300, 300, 200, 100);
        }
    }
}
