import javax.swing.*;
import java.awt.*;

public class Chat {
    private JFrame mainFrame;
    private JScrollPane scroll;

    public Chat() {
        mainFrame = new JFrame(); // Графика
        mainFrame.setTitle("Chat"); // Название окна
        mainFrame.setBounds(350, 250, 400, 600); // Начальная точка, размер окна
        mainFrame.setResizable(false); // Запретить изменение размера окна
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // Закрытие программы при закрытии окна

        JPanel panel = new JPanel(null); //Панель для расположения элементов
        panel.setBackground(Color.BLACK); // Черный фон панели
        mainFrame.add(panel, BorderLayout.CENTER); // Добавить панель во frame

        JTextArea chatText = new JTextArea(); // Поле для текста чата
        chatText.setEditable(false); // Запретить редактировать окно текста чата
        chatText.setLineWrap(true); // Автоматический перенос слов
        panel.add(chatText); // Добавить поле в panel

        JTextField outText = new JTextField("Your text..."); // Поля для ввода
        outText.setBounds(4, 500, 376, 30); // Координаты и размер

        panel.add(outText); // Добавить поле в panel

        scroll = new JScrollPane(chatText);
        scroll.setBounds(4,4, 377, 490);
        scroll.setAutoscrolls(true);
        scroll.setForeground(Color.BLUE);
        scroll.setViewportView(chatText);
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);


        JButton enterBtn = new JButton("Enter"); // создание кнопки Enter
        enterBtn.setLayout(new GridLayout(1, 1)); // положение кнопки
        EnterListener abListener = new EnterListener(outText, chatText); // создание листенера

        enterBtn.addActionListener(abListener); // отправка в листенер
        outText.addActionListener(abListener);

        panel.add(scroll);
        mainFrame.add(enterBtn, BorderLayout.PAGE_END); // добавить, расстановка
        mainFrame.setVisible(true); // отрисовка
    }

}
