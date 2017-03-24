package gui;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Kaley on 20/3/17.
 */
public class CreditCard extends JPanel{

	private JPanel[] panels;

	private JLabel header;
	private JLabel hi;
	private JLabel customerName;

	private JButton[] buttons;

	private JButton repay;
	private JButton cancel;
	private JButton exit;

	public CreditCard(){
		initialize();
	}

	public void initialize(){

		this.setLayout(new GridLayout(5, 1));

		panels = new JPanel[5];
		for(int i = 0; i < panels.length; i++){
			panels[i] = new JPanel();
		}

		buttons = new JButton[10];
		for(int i = 0; i < buttons.length; i++){
			buttons[i] = new JButton();
			buttons[i].setVisible(false);
			buttons[i].setEnabled(false);
		}

		// Panel1 with header
		panels[0].setPreferredSize(new Dimension(80, 100));
		panels[0].setLayout(new BorderLayout());
		this.add(panels[0]);

		header = new JLabel("Bank of Monash System");
		header.setFont(new Font("Serif", Font.BOLD, 25));
		header.setHorizontalAlignment(JLabel.CENTER);
		panels[0].add(header);


		// Panel2 with greeting words
		panels[1].setLayout(new FlowLayout());
		this.add(panels[1]);

		hi = new JLabel("Hi");
		customerName = new JLabel("Kaley");
		panels[1].add(hi);
		panels[1].add(customerName);

		// Panel3 with credit bill information
		panels[2].setLayout(new GridLayout(2, 6));
		this.add(panels[2]);

		panels[2].add(buttons[0]);
	}

	public static void main(String[] args){
		CreditCard cc = new CreditCard();
		JFrame mainFrame = new JFrame("Bank of Monash System");
		mainFrame.add(cc);
		mainFrame.setSize(600, 400);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setVisible(true);
	}
}
