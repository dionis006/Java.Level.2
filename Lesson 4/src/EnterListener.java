import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EnterListener implements ActionListener {

    private final JTextField outText;
    private final JTextArea chatText;

    public EnterListener(JTextField outText, JTextArea chatText) {
        this.outText = outText;
        this.chatText = chatText;
    }

    @Override
    public void actionPerformed(ActionEvent e) { //действия при перехвате
        String val = outText.getText();
        outText.setText(null);
        writer(val);
    }

    public void writer (String val){ // запись в текст чата
        chatText.append(val + "\n");
    }

}
