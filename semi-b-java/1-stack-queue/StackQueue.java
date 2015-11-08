import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

// 参考サイト: http://www.javadrive.jp/tutorial/jbutton/index1.html

class DentakuActionListener implements ActionListener {
    Queue inputs;
    DentakuActionListener(Queue q) {
	this.inputs = q;
    }

    public void actionPerformed(ActionEvent ev) {
	JButton btn = (JButton)ev.getSource();
	System.out.println(btn.getText());
	this.inputs.enqueue(btn.getText());
    }
}

class StackQueue extends JFrame{
    public static void main(String args[]){
	StackQueue frame = new StackQueue("タイトル");
	frame.setVisible(true);

    }

    private JPanel makeRow(ActionListener al, String... labels) {
	JPanel panel = new JPanel();

	for (int i = 0; i < labels.length; i ++) {
	    JButton btn = new JButton(labels[i]);
	    btn.addActionListener(al);
	    panel.add(btn);
	}

	return panel;
    }

    StackQueue(String title){
	setTitle(title);
	setBounds(100, 100, 300, 250);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	Container contentPane = getContentPane();

	JPanel console = new JPanel();
	console.setLayout(new BoxLayout(console, BoxLayout.Y_AXIS));

	JLabel display = new JLabel("");

	JPanel keyboard = new JPanel();

	Queue inputs = new Queue();

	ActionListener al = new DentakuActionListener(inputs);

	keyboard.add(makeRow(al, "7", "8", "9", "*"));
	keyboard.add(makeRow(al, "4", "5", "6", "/"));
	keyboard.add(makeRow(al, "1", "2", "3", "+"));
	keyboard.add(makeRow(al, "P", "0", "E", "-"));

	console.add(display);
	console.add(keyboard);
	contentPane.add(console);
    }
}
