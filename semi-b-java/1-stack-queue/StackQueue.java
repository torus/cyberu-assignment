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

class DentakuTimerListener implements ActionListener {
    Queue inputs;
    Stack stack;
    JLabel display;

    DentakuTimerListener(Queue q, Stack s, JLabel d) {
	this.inputs = q;
	this.stack = s;
	this.display = d;
    }

    public void actionPerformed(ActionEvent ev) {
	if (!this.inputs.empty()) {
	    Object elem = this.inputs.dequeue();
	    if (elem == "E") {
		System.out.println("ENTER");
		double num = 0;
		double weight = 1;
		while (!this.stack.empty() && this.stack.top() instanceof String) {
		    num += weight * Double.parseDouble((String)this.stack.pop());
		    weight *= 10;
		}
		this.stack.push(num);
	    } else if (elem == "*") {
		System.out.println("MULTIPLY");
		double a = (double)this.stack.pop();
		double b = (double)this.stack.pop();
		this.stack.push(a * b);
	    } else if (elem == "+") {
		System.out.println("PLUS");
		double a = (double)this.stack.pop();
		double b = (double)this.stack.pop();
		this.stack.push(a + b);
	    } else if (elem == "-") {
		System.out.println("MINUS");
		double a = (double)this.stack.pop();
		double b = (double)this.stack.pop();
		this.stack.push(b - a);
	    } else if (elem == "/") {
		System.out.println("DIVIDE");
		double a = (double)this.stack.pop();
		double b = (double)this.stack.pop();
		this.stack.push(b / a);
	    } else if (elem == "P") {
		if (!this.stack.empty()) {
		    System.out.println("POP");
		    this.stack.pop();
		}
	    } else {
		this.stack.push(elem);
	    }

	    if (this.stack.empty()) {
		this.display.setText("EMPTY");
	    } else {
		Object top = this.stack.top();
		System.out.println(top);
		this.display.setText(top.toString());
	    }
	}
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

	JLabel display = new JLabel("HELLO");
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

	Stack stack = new Stack();
	Timer timer = new Timer(400, new DentakuTimerListener(inputs, stack, display));
	timer.start();
    }
}
