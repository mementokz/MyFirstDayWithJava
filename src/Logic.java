import javax.swing.*;
import javax.swing.border.LineBorder;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Logic extends JFrame{
	JButton ClearFirst, ClearAll, Clear, Div, Mul, Minus, Plus, Equal, Zero, One, Two, Three, Four, Five, Six, Seven, Eight, Nine, Dot, Reverse;
	JLabel MainScreen, CopyrightText;
	JTextField TF;
	int a, b;
	String S = "------------------------------------------------------------------";
	eHandler handler = new eHandler();
	String Result = "";
	double firstnum = 0;
	double secondnum = 0;
	double finalresult = 0;
	char which = '!';
	public Logic(String s) {
		super(s);

		MainScreen = new JLabel(S);
		setLayout(new FlowLayout());
		TF = new JTextField(10);
		ClearFirst = new JButton("CE");
		ClearAll = new JButton("C");
		Clear = new JButton("<-");
		Div = new JButton("/");
		Mul = new JButton("*");
		Minus = new JButton("-");
		Plus = new JButton("+");
		Equal = new JButton("=");
		Zero = new JButton("0");
		One = new JButton("1");
		Two = new JButton("2");
		Three = new JButton("3");
		Four = new JButton("4");
		Five = new JButton("5");
		Six = new JButton("6");
		Seven = new JButton("7");
		Eight = new JButton("8");
		Nine = new JButton("9");
		Dot = new JButton(".");
		Reverse = new JButton("+-");
		CopyrightText = new JLabel("Powered by Turganaliyev Bauyrzhan");
		
		Container mainContainer = this.getContentPane();
		mainContainer.setLayout(new BorderLayout(8, 6));
		mainContainer.setBackground(Color.white);
		this.getRootPane().setBorder(BorderFactory.createMatteBorder(4, 4, 4,4, Color.white));
		
		JPanel topPanel = new JPanel();
		topPanel.setBorder(new LineBorder(Color.black, 2));
		topPanel.setBackground(Color.white);
		topPanel.setLayout(new FlowLayout(5));
		
		JPanel GridPanel = new JPanel();
		GridPanel.setBorder(new LineBorder(Color.black, 2));
		GridPanel.setBackground(Color.black);
		GridPanel.setLayout(new GridLayout(5, 2, 6,5));
		
		JPanel BottomPanel = new JPanel();
		topPanel.setBorder(new LineBorder(Color.black, 2));
		topPanel.setBackground(Color.white);
		topPanel.setLayout(new FlowLayout(5));
		
		topPanel.add(MainScreen);
		GridPanel.add(ClearFirst);
		GridPanel.add(ClearAll);
		GridPanel.add(Clear);
		GridPanel.add(Div);
		GridPanel.add(Seven);
		GridPanel.add(Eight);
		GridPanel.add(Nine);
		GridPanel.add(Mul);
		GridPanel.add(Four);
		GridPanel.add(Five);
		GridPanel.add(Six);
		GridPanel.add(Minus);
		GridPanel.add(One);
		GridPanel.add(Two);
		GridPanel.add(Three);
		GridPanel.add(Plus);
		GridPanel.add(Reverse);
		GridPanel.add(Zero);
		GridPanel.add(Dot);
		GridPanel.add(Equal);
		BottomPanel.add(CopyrightText);
		
		mainContainer.add(topPanel, BorderLayout.NORTH);
		mainContainer.add(GridPanel, BorderLayout.CENTER);
		mainContainer.add(BottomPanel, BorderLayout.SOUTH);
		TF.addActionListener(handler);
		One.addActionListener(handler);
		Two.addActionListener(handler);
		Three.addActionListener(handler);
		Four.addActionListener(handler);
		Five.addActionListener(handler);
		Six.addActionListener(handler);
		Seven.addActionListener(handler);
		Eight.addActionListener(handler);
		Nine.addActionListener(handler);
		Zero.addActionListener(handler);
		ClearFirst.addActionListener(handler);
		ClearAll.addActionListener(handler);
		Clear.addActionListener(handler);
		Plus.addActionListener(handler);
		Minus.addActionListener(handler);
		Mul.addActionListener(handler);
		Div.addActionListener(handler);
		Dot.addActionListener(handler);
		Equal.addActionListener(handler);
		Reverse.addActionListener(handler);
	}
	public class eHandler implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == Equal) {
				switch(which) {
					case '+':	secondnum = Double.parseDouble(Result);
								firstnum = firstnum + secondnum;
								finalresult = 0;
								secondnum = 0;
								Result = "";
								S = String.valueOf(firstnum);
								MainScreen.setText(S);
								break;
					case '-': 	secondnum = Double.parseDouble(Result);
								firstnum = firstnum + secondnum;
								finalresult = 0;
								secondnum = 0;
								Result = "";
								S = String.valueOf(firstnum);
								MainScreen.setText(S);
								break;
					case '*': 	secondnum = Double.parseDouble(Result);
								firstnum = firstnum * secondnum;
								finalresult = 1;
								secondnum = 0;
								Result = "";
								S = String.valueOf(firstnum);
								MainScreen.setText(S);
								break;
					case '/': 	secondnum = Double.parseDouble(Result);
								firstnum = firstnum / secondnum;
								finalresult = 0;
								secondnum = 0;
								Result = "";
								S = String.valueOf(firstnum);
								MainScreen.setText(S);
								break;
				}
			}
			if (e.getSource() == Div) {
				which = '/';
				if (Result.length() == 0) {
					S = "/";
					MainScreen.setText(S);
				}
				else {
					if (firstnum == 0 && secondnum == 0) {
						firstnum = Double.parseDouble(Result);
						finalresult = firstnum;
						Result = "";
						S = String.valueOf(finalresult);
						MainScreen.setText(S);
					} else if (firstnum != 0 && secondnum == 0) {
						secondnum = Double.parseDouble(Result);
						finalresult = firstnum / secondnum;
						firstnum = finalresult;
						finalresult = 0;
						secondnum = 0;
						Result = "";
						S = String.valueOf(firstnum);
						MainScreen.setText(S);
					} 
				}
			}
			if (e.getSource() == Mul) {
				which = '*';
				if (Result.length() == 0) {
					S = "*";
					MainScreen.setText(S);
				}
				else {
					if (firstnum == 0 && secondnum == 0) {
						firstnum = Double.parseDouble(Result);
						finalresult = firstnum;
						Result = "";
						S = String.valueOf(finalresult);
						MainScreen.setText(S);
					} else if (firstnum != 0 && secondnum == 0) {
						secondnum = Double.parseDouble(Result);
						finalresult = firstnum * secondnum;
						firstnum = finalresult;
						finalresult = 0;
						secondnum = 0;
						Result = "";
						S = String.valueOf(firstnum);
						MainScreen.setText(S);
					} 
				}
			}
			if (e.getSource() == Minus) {
				which = '-';
				if (Result.length() == 0) {
					Result += "-";
					S = Result;
					MainScreen.setText(S);
				}
				else {
					if (firstnum == 0 && secondnum == 0) {
						firstnum = Double.parseDouble(Result);
						finalresult = firstnum + secondnum;
						Result = "-";
						S = String.valueOf(finalresult);
						MainScreen.setText(S);
					} else if (firstnum != 0 && secondnum == 0) {
						secondnum = Double.parseDouble(Result);
						firstnum = firstnum + secondnum;
						finalresult = 0;
						secondnum = 0;
						Result = "-";
						S = String.valueOf(firstnum);
						MainScreen.setText(S);
					} else if (firstnum == 0 && secondnum != 0) {
						firstnum = Double.parseDouble(Result);
						finalresult = secondnum + firstnum;
						Result = "-";
						S = String.valueOf(finalresult);
						MainScreen.setText(S);
					}
				}
			}
			if (e.getSource() == Plus) {
				which = '+';
				if (Result.length() == 0) {
					Result += "+";
					S = Result;
					MainScreen.setText(S);
				}
				else {
					if (firstnum == 0 && secondnum == 0) {
						firstnum = Double.parseDouble(Result);
						finalresult = firstnum + secondnum;
						Result = "";
						S = String.valueOf(finalresult);
						MainScreen.setText(S);
					} else if (firstnum != 0 && secondnum == 0) {
						secondnum = Double.parseDouble(Result);
						finalresult = firstnum + secondnum;
						firstnum = finalresult;
						finalresult = 0;
						secondnum = 0;
						Result = "";
						S = String.valueOf(firstnum);
						MainScreen.setText(S);
					} 
				}
			}
			if (e.getSource() == ClearFirst) {
				if (secondnum == 0) {
					S = "------------------------------------------------------------------";
				}
				secondnum = 0;
				Result = "";
				if (firstnum != 0) {
					S = (String.valueOf(firstnum) + which);
				}
				MainScreen.setText(S);
			}
			if (e.getSource() == ClearAll) {
				firstnum = 0;
				secondnum = 0;
				Result = "";
				S = "------------------------------------------------------------------";
				MainScreen.setText(S);
			}
			if (e.getSource() == Clear) {
				int n = Result.length();
				if (n <= 1) {
					n--;
					Result = "";
					S = "------------------------------------------------------------------";
					MainScreen.setText(S);
				}
				else {
					n--;
					Result = Result.substring(0, n);
					S = Result;
					MainScreen.setText(S);
				}
			}
			if (e.getSource() == Dot) {
				int check = Result.indexOf('.');
				if (check == -1) {
					Result += '.';
				} else {}
				S = Result;
				MainScreen.setText(S);
			}
			if (e.getSource() == Reverse) {
				double tmp = Double.parseDouble(Result);
				tmp = tmp * (-1);
				Result = String.valueOf(tmp);
				S = Result;
				MainScreen.setText(S);
			}
			if (e.getSource() == One) {
				Result += "1";
				S = Result;
				MainScreen.setText(S);
			}
			if (e.getSource() == Two) {
				Result += "2";
				S = Result;
				MainScreen.setText(S);
			}
			if (e.getSource() == Three) {
				Result += "3";
				S = Result;
				MainScreen.setText(S);
			}
			if (e.getSource() == Four) {
				Result += "4";
				S = Result;
				MainScreen.setText(S);
			}
			if (e.getSource() == Five) {
				Result += "5";
				S = Result;
				MainScreen.setText(S);
			}
			if (e.getSource() == Six) {
				Result += "6";
				S = Result;
				MainScreen.setText(S);
			}
			if (e.getSource() == Seven) {
				Result += "7";
				S = Result;
				MainScreen.setText(S);
			}
			if (e.getSource() == Eight) {
				Result += "8";
				S = Result;
				MainScreen.setText(S);
			}
			if (e.getSource() == Nine) {
				Result += "9";
				S = Result;
				MainScreen.setText(S);
			}
			if (e.getSource() == Zero) {
				Result += "0";
				S = Result;
				MainScreen.setText(S);
			}

		}
		
	}
}

