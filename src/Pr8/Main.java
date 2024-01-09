package Pr8;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        // Окно с случайными фигурами
        JFrame randomShapesFrame = new JFrame("Random Shapes");
        randomShapesFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        randomShapesFrame.add(new RandomShapesWindow());
        randomShapesFrame.setSize(500, 500);
        randomShapesFrame.setVisible(true);

        // Окно с изображением из аргументов командной строки
        if (args.length > 0) {
            JFrame imageFrame = new JFrame("C:\\Users\\User\\Desktop\\Pictures\\p2.jpg");
            imageFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            imageFrame.add(new ImageWindow(args[0]));
            imageFrame.setSize(500, 500);
            imageFrame.setVisible(true);
        }

        // Окно с анимацией
        ImageIcon[] animationFrames = {
                new ImageIcon("C:\\Users\\User\\Desktop\\Pictures\\p1.png"),
                new ImageIcon("C:\\Users\\User\\Desktop\\Pictures\\Frame2.jpg"),
                new ImageIcon("C:\\Users\\User\\Desktop\\Pictures\\Frame3.jpg"),
        };
        JFrame animationFrame = new JFrame("Animation");
        animationFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        animationFrame.add(new AnimationWindow(animationFrames));
        animationFrame.setSize(500, 500);
        animationFrame.setVisible(true);



            // Замените "путь_к_изображению.jpg" на фактический путь к изображению
            String imagePath = "C:\\Users\\User\\Desktop\\Pictures\\p1.png";

            try {
                // Загрузить изображение из файла
                BufferedImage image = ImageIO.read(new File(imagePath));

                // Отобразить изображение в диалоговом окне
                JOptionPane.showMessageDialog(null, new ImageIcon(image));
            } catch (IOException e) {
                e.printStackTrace();
            }
    }
}



