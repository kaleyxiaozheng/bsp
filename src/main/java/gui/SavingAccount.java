package gui;

import implementClass.ExitSystem;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Kaley on 20/3/17.
 */
public class SavingAccount extends JPanel {
	private JPanel[] panels;

	private JLabel header;
	private JLabel hi;
	private JLabel customerName;
	private JLabel amount;

	private JTextField amountTest;

	private JButton[] buttons;

	private JButton deposit;
	private JButton withdraw;
	private JButton balance;
	private JButton transfer;
	private JButton back;
	private JButton exit;
	private JButton okay;
	private JButton cancel;


	public SavingAccount() {
		initialize();
	}

	public void initialize(){
		this.setLayout(new GridLayout(5, 1));

		panels = new JPanel[8];

		for(int i = 0; i < panels.length; i++){
			panels[i] = new JPanel();
		}

		// Panel1 with header
		panels[0].setPreferredSize(new Dimension(80, 100));
		panels[0].setLayout(new BorderLayout());
		this.add(panels[0]);

		header = new JLabel("Bank of Monash System");
		header.setFont(new Font("Serif", Font.BOLD, 25));
		header.setHorizontalAlignment(JLabel.CENTER);
		panels[0].add(header);

		buttons = new JButton[10];

		for(int i = 0; i < buttons.length; i++){
			buttons[i] = new JButton();
			buttons[i].setEnabled(false);
			buttons[i].setVisible(false);
		}

		// Panel2 with greeting words
		panels[1].setLayout(new FlowLayout());
		this.add(panels[1]);

		hi = new JLabel("Hi");
		customerName = new JLabel("Kaley");
		panels[1].add(hi);
		panels[1].add(customerName);

		// Panel3 with choices buttons
		panels[2].setLayout(new FlowLayout());
		this.add(panels[2]);

		deposit = new JButton("deposit");
		withdraw = new JButton("withdraw");
		balance = new JButton("check balance");
		transfer = new JButton("transfer");

		panels[2].add(buttons[0]);
		panels[2].add(deposit);
		panels[2].add(withdraw);
		panels[2].add(balance);
		panels[2].add(transfer);
		panels[2].add(buttons[1]);

		// Panel4 with action buttons
		panels[3].setLayout(new FlowLayout());
		this.add(panels[3]);

		back = new JButton("back");
		exit = new JButton("exit");

		panels[3].add(buttons[2]);
		panels[3].add(buttons[3]);
		panels[3].add(back);
		panels[3].add(exit);
		panels[3].add(buttons[4]);
		panels[3].add(buttons[5]);

		ExitSystem es = new ExitSystem();
		exit.addActionListener(es);

		// Panel5 with choices buttons
		panels[4].setLayout(new GridLayout(3, 1));
		this.add(panels[4]);

		panels[5].setLayout(new FlowLayout());
		panels[4].add(panels[5]);

		amount = new JLabel("Amount of money");
		panels[5].add(amount);

		panels[6].setLayout(new FlowLayout());
		panels[4].add(panels[6]);

		amountTest = new JTextField();
		panels[6].add(amountTest);

		panels[7].setLayout(new FlowLayout());
		panels[4].add(panels[7]);

		okay = new JButton("okay");
		cancel = new JButton("cancel");
		panels[7].add(buttons[6]);
		panels[7].add(buttons[7]);
		panels[7].add(okay);
		panels[7].add(cancel);
		panels[7].add(buttons[8]);
		panels[7].add(buttons[9]);
	}

	public static void main(String[] args){
		SavingAccount sa = new SavingAccount();
		JFrame mainFrame = new JFrame("Bank of Monash System");
		mainFrame.add(sa);
		mainFrame.setSize(600, 400);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setVisible(true);
	}
}
