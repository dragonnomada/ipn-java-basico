package ipn.cic.chatapp;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class NewConversationUI {

    private JPanel panelMain = new JPanel();

    protected JLabel labelPhoneTo = new JLabel("Phone To");
    protected JTextField textFieldPhoneTo = new JTextField();

    protected JLabel labelMessage = new JLabel("Message");
    protected JTextArea textAreaMessage = new JTextArea();

    protected JButton buttonCreateConversation = new JButton("Create");

    protected ConversationsUI conversationsUI;

    protected ActionListener onCreateConversation = null;

    public NewConversationUI(ConversationsUI conversationsUI) {
        this.conversationsUI = conversationsUI;

        this.panelMain.setLayout(new BorderLayout());

        JPanel group1 = new JPanel();

        group1.setLayout(new BorderLayout());

        JPanel panelPhoneTo = new JPanel();
        panelPhoneTo.setLayout(new BorderLayout());
        panelPhoneTo.add(this.labelPhoneTo, BorderLayout.NORTH);
        panelPhoneTo.add(this.textFieldPhoneTo, BorderLayout.CENTER);
        group1.add(panelPhoneTo, BorderLayout.NORTH);

        JPanel panelMessage = new JPanel();
        panelMessage.setLayout(new BorderLayout());
        panelMessage.add(this.labelMessage, BorderLayout.NORTH);
        panelMessage.add(this.textAreaMessage, BorderLayout.CENTER);
        group1.add(panelMessage, BorderLayout.CENTER);

        this.panelMain.add(group1, BorderLayout.CENTER);

        JPanel group2 = new JPanel();

        group2.setLayout(new BorderLayout());

        group2.add(buttonCreateConversation, BorderLayout.EAST);

        this.panelMain.add(group2, BorderLayout.SOUTH);

        NewConversationUI self = this;

        this.buttonCreateConversation.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("OK");
                String phoneTo = textFieldPhoneTo.getText();
                String message = textAreaMessage.getText();
                conversationsUI.createConversation(phoneTo, message);
                //dialog.dispose();

                self.runCreateConversation();
            }
        });
    }

    public void setOnCreateConversation(ActionListener listener) {
        this.onCreateConversation = listener;
    }

    public void runCreateConversation() {
        System.out.println(this.onCreateConversation);

        if (this.onCreateConversation != null) {
            this.onCreateConversation.actionPerformed(new ActionEvent(this, 0, "hello"));
        }
    }

    public JPanel getPanel() {
        return this.panelMain;
    }

}
