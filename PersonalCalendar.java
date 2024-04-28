import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class PersonalCalendar extends JFrame {
    private Map<String, String> events;

    private JTextField dateField;
    private JTextField eventField;
    private JTextArea displayArea;

    public PersonalCalendar() {
        events = new HashMap<>();

        setTitle("Personal Calendar");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(3, 2));

        JLabel dateLabel = new JLabel("Date (YYYY-MM-DD): ");
        dateField = new JTextField();
        JLabel eventLabel = new JLabel("Event: ");
        eventField = new JTextField();
        JButton addButton = new JButton("Add Event");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addEvent();
            }
        });

        inputPanel.add(dateLabel);
        inputPanel.add(dateField);
        inputPanel.add(eventLabel);
        inputPanel.add(eventField);
        inputPanel.add(new JLabel());
        inputPanel.add(addButton);

        displayArea = new JTextArea();
        displayArea.setEditable(false);

        add(inputPanel, BorderLayout.NORTH);
        add(new JScrollPane(displayArea), BorderLayout.CENTER);

        refreshDisplay();
    }

    private void addEvent() {
        String date = dateField.getText();
        String event = eventField.getText();

        if (!date.isEmpty() && !event.isEmpty()) {
            events.put(date, event);
            refreshDisplay();
            dateField.setText("");
            eventField.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "Please enter both date and event.");
        }
    }

    private void refreshDisplay() {
        StringBuilder displayText = new StringBuilder();
        for (Map.Entry<String, String> entry : events.entrySet()) {
            displayText.append(entry.getKey()).append(": ").append(entry.getValue()).append("\n");
        }
        displayArea.setText(displayText.toString());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PersonalCalendar().setVisible(true);
            }
        });
    }
}
