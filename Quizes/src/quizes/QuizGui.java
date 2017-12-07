package quizes;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;

public class QuizGui extends JFrame {
//answer class privates
	private Answer_q7 answer_q7;
	private Answer_q8 answer_q8;
	//radiobuttongroup so only one answer can be selected
	private final ButtonGroup buttonGroup = new ButtonGroup();

	//textfields for answer
	private JTextField textField_a;
	
	
	//answer wrong/correct textfields		
	private JTextField textField_q1;
	private JTextField textField_q2;
	private JTextField textField_q3;
	private JTextField textField_q4;
	private JTextField textField_q5;
	private JTextField textField_q6;
	private JTextField textField_q7;
	private JTextField textField_q8;
	private JTextField textField_q9;
	private JTextField textField_q10;


	public QuizGui() {
		
	//JFrame configurations
		setBounds(100, 100, 600, 600);
		getContentPane().setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


	//1. question	
		JLabel lblWhatIsThe = new JLabel("What is the Capital of Sweden?");
		lblWhatIsThe.setBounds(6, 11, 210, 14);
		getContentPane().add(lblWhatIsThe);
		JRadioButton RadioButton_Ma = new JRadioButton("Malm\u00F6");
		buttonGroup.add(RadioButton_Ma);
		RadioButton_Ma.setBounds(6, 32, 66, 23);
		
		getContentPane().add(RadioButton_Ma);
		// setting radiobuttons
		JRadioButton RadioButton_St = new JRadioButton("Stockholm");
		buttonGroup.add(RadioButton_St);
		RadioButton_St.setBounds(74, 32, 95, 23);
		getContentPane().add(RadioButton_St);
		
		JRadioButton RadioButton_He = new JRadioButton("Helsinki");
		buttonGroup.add(RadioButton_He);
		RadioButton_He.setBounds(171, 32, 72, 23);
		getContentPane().add(RadioButton_He);
		//submit button check the answer, disables answering and gives message and adds text
		JButton btnSubmit = new JButton("submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				boolean button1 = RadioButton_Ma.isSelected();
				boolean button2 = RadioButton_St.isSelected();
				boolean button3 = RadioButton_He.isSelected();
				if(button2==true) {	JOptionPane.showMessageDialog(rootPane, "Correct"); textField_q1.setText("Well done!");}
				else if(button1==true||button3==true) {	JOptionPane.showMessageDialog(rootPane, "False");textField_q1.setText("Answer: Stockholm");}
				else {JOptionPane.showMessageDialog(rootPane, "False");textField_q1.setText("Answer: Stockholm");}
				RadioButton_Ma.setEnabled(false);
				RadioButton_St.setEnabled(false);
				RadioButton_He.setEnabled(false);
			}
		});
		btnSubmit.setBounds(6, 62, 89, 23);
		getContentPane().add(btnSubmit);
		
		//question 2
		
		
		textField_q1 = new JTextField();
		textField_q1.setEditable(false);
		textField_q1.setBounds(105, 63, 86, 20);
		getContentPane().add(textField_q1);
		textField_q1.setColumns(10);
		
		JLabel lblWhatIsThe_1 = new JLabel("What is the Capital of Norway?");
		lblWhatIsThe_1.setBounds(6, 96, 210, 14);
		getContentPane().add(lblWhatIsThe_1);
		
		JRadioButton RadioButton_Os = new JRadioButton("Oslo");
		buttonGroup.add(RadioButton_Os);
		RadioButton_Os.setBounds(6, 115, 55, 23);
		getContentPane().add(RadioButton_Os);
		
		JRadioButton RadioButton_Go = new JRadioButton("Gothenburg");
		buttonGroup.add(RadioButton_Go);
		RadioButton_Go.setBounds(63, 115, 104, 23);
		getContentPane().add(RadioButton_Go);
		
		JRadioButton RadioButton_Up = new JRadioButton("Uppsala");
		buttonGroup.add(RadioButton_Up);
		RadioButton_Up.setBounds(164, 115, 79, 23);
		getContentPane().add(RadioButton_Up);
		
		JButton btnSubmit_1 = new JButton("submit");
		btnSubmit_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				boolean button1 = RadioButton_Os.isSelected();
				boolean button2 = RadioButton_Go.isSelected();
				boolean button3 = RadioButton_Up.isSelected();
				if(button1==true) {	JOptionPane.showMessageDialog(rootPane, "Correct"); textField_q2.setText("Well done!");}
				else if(button2==true||button3==true) {	JOptionPane.showMessageDialog(rootPane, "False");textField_q2.setText("Answer: Oslo");}
				else {JOptionPane.showMessageDialog(rootPane, "False");textField_q2.setText("Answer: Oslo");}
				RadioButton_Os.setEnabled(false);
				RadioButton_Go.setEnabled(false);
				RadioButton_Up.setEnabled(false);
			}
		});
		btnSubmit_1.setBounds(6, 145, 89, 23);
		getContentPane().add(btnSubmit_1);
		
		textField_q2 = new JTextField();
		textField_q2.setBounds(105, 146, 86, 20);
		textField_q2.setEditable(false);
		getContentPane().add(textField_q2);
		textField_q2.setColumns(10);
		
		
		//q3
		JLabel lblWhatIsThe_2 = new JLabel("What is the Capital of Germany?");
		lblWhatIsThe_2.setBounds(6, 190, 210, 14);
		getContentPane().add(lblWhatIsThe_2);
		
		JRadioButton RadioButton_Mu = new JRadioButton("Munich");
		buttonGroup.add(RadioButton_Mu);
		RadioButton_Mu.setBounds(6, 211, 66, 23);
		getContentPane().add(RadioButton_Mu);
		
		JRadioButton RadioButton_Ha = new JRadioButton("Hamburg");
		buttonGroup.add(RadioButton_Ha);
		RadioButton_Ha.setBounds(74, 211, 104, 23);
		getContentPane().add(RadioButton_Ha);
		
		JRadioButton RadioButton_Be = new JRadioButton("Berlin");
		buttonGroup.add(RadioButton_Be);
		RadioButton_Be.setBounds(180, 211, 63, 23);
		getContentPane().add(RadioButton_Be);
		
		JButton btnSubmit_2 = new JButton("submit");
		btnSubmit_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				boolean button1 = RadioButton_Mu.isSelected();
				boolean button2 = RadioButton_Ha.isSelected();
				boolean button3 = RadioButton_Be.isSelected();
				if(button3==true) {	JOptionPane.showMessageDialog(rootPane, "Correct"); textField_q3.setText("Well done!");}
				else if(button1==true||button2==true) {	JOptionPane.showMessageDialog(rootPane, "False");textField_q3.setText("Answer: Berlin");}
				else {JOptionPane.showMessageDialog(rootPane, "False");textField_q3.setText("Answer: Berlin");}
				RadioButton_Os.setEnabled(false);
				RadioButton_Go.setEnabled(false);
				RadioButton_Up.setEnabled(false);
			}
		});
		btnSubmit_2.setBounds(6, 241, 89, 23);
		getContentPane().add(btnSubmit_2);
		
		textField_q3 = new JTextField();
		textField_q3.setBounds(105, 242, 86, 20);
		textField_q3.setEditable(false);
		getContentPane().add(textField_q3);
		textField_q3.setColumns(10);
		
		//q4
		
		JLabel lblWhatIsThe_3 = new JLabel("What is the Capital of Spain?");
		lblWhatIsThe_3.setBounds(6, 275, 195, 14);
		getContentPane().add(lblWhatIsThe_3);
		
		JRadioButton RadioButton_Mad = new JRadioButton("Madrid");
		buttonGroup.add(RadioButton_Mad);
		RadioButton_Mad.setBounds(6, 296, 66, 23);
		getContentPane().add(RadioButton_Mad);
		
		JRadioButton RadioButton_Ba = new JRadioButton("Barcelona");
		buttonGroup.add(RadioButton_Ba);
		RadioButton_Ba.setBounds(74, 296, 104, 23);
		getContentPane().add(RadioButton_Ba);
		
		JRadioButton RadioButton_Ib = new JRadioButton("Ibiza");
		buttonGroup.add(RadioButton_Ib);
		RadioButton_Ib.setBounds(180, 296, 63, 23);
		getContentPane().add(RadioButton_Ib);
		
		JButton btnSubmit_3 = new JButton("submit");
		btnSubmit_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				boolean button1 = RadioButton_Mad.isSelected();
				boolean button2 = RadioButton_Ba.isSelected();
				boolean button3 = RadioButton_Ib.isSelected();
				if(button1==true) {	JOptionPane.showMessageDialog(rootPane, "Correct"); textField_q4.setText("Well done!");}
				else if(button2==true||button3==true) {	JOptionPane.showMessageDialog(rootPane, "False");textField_q4.setText("Answer: Madrid");}
				else {JOptionPane.showMessageDialog(rootPane, "False");textField_q4.setText("Answer: Madrid");}
				RadioButton_Os.setEnabled(false);
				RadioButton_Go.setEnabled(false);
				RadioButton_Up.setEnabled(false);
			}
		});
		btnSubmit_3.setBounds(6, 326, 89, 23);
		getContentPane().add(btnSubmit_3);
		
		textField_q4 = new JTextField();
		textField_q4.setBounds(105, 327, 86, 20);
		textField_q4.setEditable(false);
		getContentPane().add(textField_q4);
		textField_q4.setColumns(10);
		
		//q5
		
		JLabel lblWhatIsThe_4 = new JLabel("What is the Capital of Serbia?");
		lblWhatIsThe_4.setBounds(6, 360, 185, 14);
		getContentPane().add(lblWhatIsThe_4);
		
		JRadioButton RadioButton_Sa = new JRadioButton("Sarajevo");
		buttonGroup.add(RadioButton_Sa);
		RadioButton_Sa.setBounds(6, 381, 79, 23);
		getContentPane().add(RadioButton_Sa);
		
		JRadioButton RadioButton_Mi = new JRadioButton("Minsk");
		buttonGroup.add(RadioButton_Mi);
		RadioButton_Mi.setBounds(87, 381, 79, 23);
		getContentPane().add(RadioButton_Mi);
		
		JRadioButton RadioButton_Bel = new JRadioButton("Belgrad");
		buttonGroup.add(RadioButton_Bel);
		RadioButton_Bel.setBounds(168, 381, 75, 23);
		getContentPane().add(RadioButton_Bel);
		
		JButton btnSubmit_4 = new JButton("submit");
		btnSubmit_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				boolean button1 = RadioButton_Sa.isSelected();
				boolean button2 = RadioButton_Mi.isSelected();
				boolean button3 = RadioButton_Bel.isSelected();
				if(button3==true) {	JOptionPane.showMessageDialog(rootPane, "Correct"); textField_q5.setText("Well done!");}
				else if(button1==true||button2==true) {	JOptionPane.showMessageDialog(rootPane, "False");textField_q5.setText("Answer: Belgrad");}
				else {JOptionPane.showMessageDialog(rootPane, "False");textField_q5.setText("Answer: Belgrad");}
				RadioButton_Os.setEnabled(false);
				RadioButton_Go.setEnabled(false);
				RadioButton_Up.setEnabled(false);
			}
		});
		btnSubmit_4.setBounds(6, 411, 89, 23);
		getContentPane().add(btnSubmit_4);
		
		textField_q5 = new JTextField();
		textField_q5.setBounds(105, 412, 86, 20);
		textField_q5.setEditable(false);
		getContentPane().add(textField_q5);
		textField_q5.setColumns(10);
		
		//q6
		
		JLabel lblWhichOfThese = new JLabel("Which of these countries are in EU?");
		lblWhichOfThese.setBounds(285, 11, 233, 14);
		getContentPane().add(lblWhichOfThese);
		
		JCheckBox chckbxSwitzerland = new JCheckBox("Switzerland");
		chckbxSwitzerland.setBounds(285, 32, 107, 23);
		getContentPane().add(chckbxSwitzerland);
		
		JCheckBox chckbxSweden = new JCheckBox("Sweden");
		chckbxSweden.setBounds(394, 32, 72, 23);
		getContentPane().add(chckbxSweden);
		
		JCheckBox chckbxSpain = new JCheckBox("Spain");
		chckbxSpain.setBounds(468, 32, 97, 23);
		getContentPane().add(chckbxSpain);
		
		JButton btnSubmit_5 = new JButton("submit");
		btnSubmit_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				boolean check1 = chckbxSwitzerland.isSelected();
				boolean check2 = chckbxSweden.isSelected();
				boolean check3 = chckbxSpain.isSelected();
				if(check2==true&&check3==true) {	JOptionPane.showMessageDialog(rootPane, "Correct"); textField_q6.setText("Well done!");}
				else if(check1==true) {	JOptionPane.showMessageDialog(rootPane, "False");textField_q6.setText("Answer: Sweden AND Spain");}
				else{JOptionPane.showMessageDialog(rootPane, "False");textField_q6.setText("Answer: Sweden AND Spain");}
				chckbxSwitzerland.setEnabled(false);
				chckbxSweden.setEnabled(false);
				chckbxSpain.setEnabled(false);
			}
		});
		btnSubmit_5.setBounds(287, 62, 89, 23);
		getContentPane().add(btnSubmit_5);
		
		textField_q6 = new JTextField();
		textField_q6.setBounds(386, 63, 132, 20);
		textField_q6.setEditable(false);
		getContentPane().add(textField_q6);
		textField_q6.setColumns(10);
		
		//q7
		
		JLabel lblCapitalOfMalta = new JLabel("Capital of Malta is...");
		lblCapitalOfMalta.setBounds(285, 96, 185, 14);
		getContentPane().add(lblCapitalOfMalta);
		//setting up ddown
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setMaximumRowCount(3);
		comboBox.setBounds(285, 116, 89, 20);
		getContentPane().add(comboBox);
		comboBox.addItem("Malta City");
		comboBox.addItem("Valetta");
		comboBox.addItem("Korsica");
		
		JButton btnSubmit_6 = new JButton("submit");
		btnSubmit_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				answer_q7 = new Answer_q7(comboBox.getSelectedItem().toString());
				JOptionPane.showMessageDialog(rootPane, answer_q7.greet());			
				if(answer_q7.greet()=="Correct") {textField_q7.setText("Well done!");}else if(answer_q7.greet()!="Correct"){textField_q7.setText("Answer: Valetta");}
				comboBox.setEnabled(false);
			}
		});
		btnSubmit_6.setBounds(285, 145, 89, 23);
		getContentPane().add(btnSubmit_6);
		
		textField_q7 = new JTextField();
		textField_q7.setBounds(386, 146, 132, 20);
		textField_q7.setEditable(false);
		getContentPane().add(textField_q7);
		textField_q7.setColumns(10);
		
		//q8
		
		JLabel lblWhatIsThe_5 = new JLabel("What is the Capital of the Netherlands?");
		lblWhatIsThe_5.setBounds(285, 190, 262, 14);
		getContentPane().add(lblWhatIsThe_5);
		
		textField_a = new JTextField();
		textField_a.setBounds(285, 212, 102, 20);
		getContentPane().add(textField_a);
		textField_a.setColumns(10);
		
		JButton btnSubmit_7 = new JButton("submit");
		btnSubmit_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				answer_q8 = new Answer_q8(textField_a.getText());
				JOptionPane.showMessageDialog(rootPane, answer_q8.greet());
				if(answer_q8.greet()=="Correct") {textField_q8.setText("Well done!");}else if(answer_q8.greet()!="Correct"){textField_q8.setText("Answer: Amsterdam");}
				textField_a.setEnabled(false);
			}
		});
		btnSubmit_7.setBounds(285, 241, 89, 23);
		getContentPane().add(btnSubmit_7);
		
		textField_q8 = new JTextField();
		textField_q8.setBounds(386, 242, 132, 20);
		textField_q8.setEditable(false);
		getContentPane().add(textField_q8);
		textField_q8.setColumns(10);
		
		//q9
		
		JLabel lblWhatIsThe_6 = new JLabel("What is the Capital of Portugal?");
		lblWhatIsThe_6.setBounds(285, 275, 233, 14);
		getContentPane().add(lblWhatIsThe_6);
		
		JRadioButton RadioButton_Li = new JRadioButton("Lissabon");
		buttonGroup.add(RadioButton_Li);
		RadioButton_Li.setBounds(278, 296, 96, 23);
		getContentPane().add(RadioButton_Li);
		
		JRadioButton RadioButton_Po = new JRadioButton("Porto");
		buttonGroup.add(RadioButton_Po);
		RadioButton_Po.setBounds(382, 296, 66, 23);
		getContentPane().add(RadioButton_Po);
		
		JRadioButton RadioButton_Made = new JRadioButton("Madeira");
		buttonGroup.add(RadioButton_Made);
		RadioButton_Made.setBounds(452, 296, 95, 23);
		getContentPane().add(RadioButton_Made);
		
		JButton btnSubmit_8 = new JButton("submit");
		btnSubmit_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				boolean button1 = RadioButton_Li.isSelected();
				boolean button2 = RadioButton_Po.isSelected();
				boolean button3 = RadioButton_Made.isSelected();
				if(button1==true) {	JOptionPane.showMessageDialog(rootPane, "Correct"); textField_q9.setText("Well done!");}
				else if(button2==true||button3==true) {	JOptionPane.showMessageDialog(rootPane, "False");textField_q9.setText("Answer: Lissabon");}
				else {JOptionPane.showMessageDialog(rootPane, "False");textField_q9.setText("Answer: Lissabon");}
				RadioButton_Os.setEnabled(false);
				RadioButton_Go.setEnabled(false);
				RadioButton_Up.setEnabled(false);
			}
		});
		btnSubmit_8.setBounds(285, 326, 89, 23);
		getContentPane().add(btnSubmit_8);
		
		textField_q9 = new JTextField();
		textField_q9.setBounds(386, 327, 132, 20);
		textField_q9.setEditable(false);
		getContentPane().add(textField_q9);
		textField_q9.setColumns(10);
		
		//q10
		
		JLabel lblWhatIsThe_7 = new JLabel("What is the Capital of Croatia?");
		lblWhatIsThe_7.setBounds(285, 360, 233, 14);
		getContentPane().add(lblWhatIsThe_7);
		
		JRadioButton RadioButton_Br = new JRadioButton("Bratislava");
		buttonGroup.add(RadioButton_Br);
		RadioButton_Br.setBounds(285, 381, 89, 23);
		getContentPane().add(RadioButton_Br);
		
		
		
		JRadioButton RadioButton_Za = new JRadioButton("Zagreb");
		buttonGroup.add(RadioButton_Za);
		RadioButton_Za.setBounds(376, 381, 70, 23);
		getContentPane().add(RadioButton_Za);
		
		JRadioButton RadioButton_Du = new JRadioButton("Dubrovnik");
		buttonGroup.add(RadioButton_Du);
		RadioButton_Du.setBounds(452, 381, 108, 23);
		getContentPane().add(RadioButton_Du);
		
		JButton btnSubmit_9 = new JButton("submit");
		btnSubmit_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				boolean button1 = RadioButton_Br.isSelected();
				boolean button2 = RadioButton_Za.isSelected();
				boolean button3 = RadioButton_Du.isSelected();
				if(button2==true) {	JOptionPane.showMessageDialog(rootPane, "Correct"); textField_q10.setText("Well done!");}
				else if(button1==true||button3==true) {	JOptionPane.showMessageDialog(rootPane, "False");textField_q10.setText("Answer: Zagreb");}
				else {JOptionPane.showMessageDialog(rootPane, "False");textField_q10.setText("Answer: Zagreb");}
				RadioButton_Os.setEnabled(false);
				RadioButton_Go.setEnabled(false);
				RadioButton_Up.setEnabled(false);
			}
		});
		btnSubmit_9.setBounds(285, 411, 89, 23);
		getContentPane().add(btnSubmit_9);
		
		textField_q10 = new JTextField();
		textField_q10.setBounds(386, 412, 132, 20);
		textField_q10.setEditable(false);
		getContentPane().add(textField_q10);
		textField_q10.setColumns(10);

	}

public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
		public void run() {
			try {
				JFrame frame = new QuizGui();
				frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	});
}
}
