package First;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class HelloWorld {
	
	public HelloWorld()
	{
		JFrame kalle = new JFrame("Hello world");
		JLabel l = new JLabel("Arnold");
		JLabel a = new JLabel("Git är kosntigt.");
		kalle.add(l);
		kalle.pack();
		kalle.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		kalle.setVisible(true);
	}

}


