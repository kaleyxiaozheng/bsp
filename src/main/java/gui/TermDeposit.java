package gui;

import implementClass.ExitSystem;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Kaley on 20/3/17.
 */
public class TermDeposit extends JPanel{

	private JPanel[] panels;

	private JLabel header;
	private JLabel hi;
	private JLabel customerName;
	private JLabel choiceNote;
	private JLabel terms;
	private JLabel interestRate;
	private JLabel three_interest;
	private JLabel six_interest;
	private JLabel twelve_interest;

	private JButton[] buttons;

	private JButton threeMonths;
	private JButton sixMonths;
	private JButton twelveMonths;
	private JButton back;
	private JButton exit;


	public TermDeposit(){
		initialize();
	}

	public void initialize(){

		this.setLayout(new GridLayout(5, 1));

		panels = new JPanel[5];
		for(int i = 0; i < panels.length; i++){
			panels[i] = new JPanel();
		}

		buttons = new JButton[31];
		for(int i = 0; i < buttons.length; i++){
			buttons[i] = new JButton();
			buttons[i].setVisible(false);
			buttons[i].setEnabled(false);
		}

		// Panel1 with header
		panels[0].setPreferredSize(new Dimension(80, 100));
		panels[0].setLayout(new BorderLayout());
		this.add(panels[0], BorderLayout.PAGE_START);

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

		// Panel3 with choice note
		panels[2].setLayout(new FlowLayout());
		this.add(panels[2]);

		choiceNote = new JLabel("Choose the term you want");
		panels[2].add(choiceNote);

		// Panel4 with choice buttons
		panels[3].setLayout(new GridLayout(7, 5));
		this.add(panels[3]);

		terms = new JLabel("Terms");
		interestRate = new JLabel("Interest rate");
		three_interest = new JLabel("3%");
		six_interest = new JLabel("4%");
		twelve_interest = new JLabel("5%");

		threeMonths = new JButton("3 months");
		sixMonths = new JButton("6 months");
		twelveMonths = new JButton("12 months");

		panels[3].add(buttons[0]);
		panels[3].add((interestRate));
		panels[3].add((terms));
		panels[3].add(buttons[1]);
		panels[3].add(buttons[2]);

		panels[3].add(buttons[3]);
		panels[3].add(buttons[4]);
		panels[3].add(buttons[5]);
		panels[3].add(buttons[6]);
		panels[3].add(buttons[7]);

		panels[3].add(buttons[8]);
		panels[3].add(three_interest);
		panels[3].add(threeMonths);
		panels[3].add(buttons[9]);
		panels[3].add(buttons[10]);

		panels[3].add(buttons[11]);
		panels[3].add(buttons[12]);
		panels[3].add(buttons[13]);
		panels[3].add(buttons[14]);
		panels[3].add(buttons[15]);

		panels[3].add(buttons[16]);
		panels[3].add(six_interest);
		panels[3].add(sixMonths);
		panels[3].add(buttons[17]);
		panels[3].add(buttons[18]);

		panels[3].add(buttons[19]);
		panels[3].add(buttons[20]);
		panels[3].add(buttons[21]);
		panels[3].add(buttons[22]);
		panels[3].add(buttons[23]);

		panels[3].add(buttons[24]);
		panels[3].add(twelve_interest);
		panels[3].add(twelveMonths);
		panels[3].add(buttons[25]);
		panels[3].add(buttons[26]);

		// panel5 with action buttons
		panels[4].setLayout(new FlowLayout());
		this.add(panels[4]);

		back = new JButton("back");
		exit = new JButton("exit");

		ExitSystem es = new ExitSystem();
		exit.addActionListener(es);

		panels[4].add(buttons[27]);
		panels[4].add(buttons[28]);
		panels[4].add(back);
		panels[4].add(exit);
		panels[4].add(buttons[29]);
		panels[4].add(buttons[30]);
	}



	public static void main(String[] args){
		TermDeposit td = new TermDeposit();
		JFrame mainFrame = new JFrame("Bank of Monash System");
		mainFrame.add(td);
		mainFrame.setSize(600, 400);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setVisible(true);
	}
}
