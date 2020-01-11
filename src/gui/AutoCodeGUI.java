package gui;
import logic.CodePicker;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.Enumeration;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class AutoCodeGUI {
	
	private JFrame frame = new JFrame("Auto Coder");
	private JPanel cards;
	private CardLayout cl1;
	private JPanel classPage;
	
	public AutoCodeGUI () {
		startGUI();
	}
	
	public void startGUI() {
		setDefaultUIFont (new javax.swing.plaf.FontUIResource("Serif",Font.PLAIN,30));
		frame.setPreferredSize(new Dimension(1800,1000));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		cards = new JPanel();
		cl1 = new CardLayout();
		cards.setLayout(cl1);
		
		frame.add(cards,BorderLayout.CENTER);
		
		classPage = new JPanel();
		GroupLayout gl1 = new GroupLayout(classPage);
		classPage.setLayout(gl1);
		
		cards.add(classPage, "class");
		
		JPanel functionPage = new JPanel(new FlowLayout());
		cards.add(functionPage, "functions");
		
		JPanel instructions = new JPanel(new GridLayout(3,1));
		JPanel classname = new JPanel(new FlowLayout());
		JPanel instance = new JPanel(new GridLayout(2,1));
		JPanel var_labels = new JPanel(new GridLayout(1,3));
		JButton next = new JButton("Continue...");
		
		JLabel instruct1 = new JLabel("Welcome to AutoCoder. Enter in the parameter you desire in your Class.");
		JLabel instruct2 = new JLabel("Anything non-crucial left empty will be filled in with default names/values");
		JPanel instr1 = new JPanel(new FlowLayout());
		JPanel instr2 = new JPanel(new FlowLayout());
		instr1.add(instruct1);
		instr2.add(instruct2);
		//instruct1.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		//instruct2.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		
		JLabel class_label = new JLabel("Class Name: ");
		class_label.setFont(new Font("Serif",Font.BOLD,30));
		
		JTextField class_name = new JTextField(20);
		JLabel instance_var_label = new JLabel("Instance Variables: ");
		instance_var_label.setFont(new Font("Serif",Font.BOLD,30));
		
		//JPanel instance_vars = new JPanel(new GridLayout(10,3));
		JPanel instance_vars = new JPanel();
		GroupLayout gl2 = new GroupLayout(instance_vars);
		instance_vars.setLayout(gl2);
		
		JLabel private_type = new JLabel("    Private?");
		JLabel var_type = new JLabel("Variable Type");
		JLabel var_name = new JLabel("Variable Name");

		JCheckBox chkbox1 = new JCheckBox("private",true);
		JCheckBox chkbox2 = new JCheckBox("private",true);
		JCheckBox chkbox3 = new JCheckBox("private",true);
		JCheckBox chkbox4 = new JCheckBox("private",true);
		JCheckBox chkbox5 = new JCheckBox("private",true);
		JCheckBox chkbox6 = new JCheckBox("private",true);
		JCheckBox chkbox7 = new JCheckBox("private",true);
		JCheckBox chkbox8 = new JCheckBox("private",true);
		JCheckBox chkbox9 = new JCheckBox("private",true);
		JCheckBox chkbox10 = new JCheckBox("private",true);
		
		JTextField ins_var1a = new JTextField(20);
		JTextField ins_var1b = new JTextField(20);
		JTextField ins_var2a = new JTextField(20);
		JTextField ins_var2b = new JTextField(20);
		JTextField ins_var3a = new JTextField(20);
		JTextField ins_var3b = new JTextField(20);
		JTextField ins_var4a = new JTextField(20);
		JTextField ins_var4b = new JTextField(20);
		JTextField ins_var5a = new JTextField(20);
		JTextField ins_var5b = new JTextField(20);
		JTextField ins_var6a = new JTextField(20);
		JTextField ins_var6b = new JTextField(20);
		JTextField ins_var7a = new JTextField(20);
		JTextField ins_var7b = new JTextField(20);
		JTextField ins_var8a = new JTextField(20);
		JTextField ins_var8b = new JTextField(20);
		JTextField ins_var9a = new JTextField(20);
		JTextField ins_var9b = new JTextField(20);
		JTextField ins_var10a = new JTextField(20);
		JTextField ins_var10b = new JTextField(20);
		
		/*
		instance_vars.add(chkbox1);
		instance_vars.add(ins_var1a);
		instance_vars.add(ins_var1b);
		
		instance_vars.add(chkbox2);
		instance_vars.add(ins_var2a);
		instance_vars.add(ins_var2b);
		
		instance_vars.add(chkbox3);
		instance_vars.add(ins_var3a);
		instance_vars.add(ins_var3b);
		
		instance_vars.add(chkbox4);
		instance_vars.add(ins_var4a);
		instance_vars.add(ins_var4b);
		
		instance_vars.add(chkbox5);
		instance_vars.add(ins_var5a);
		instance_vars.add(ins_var5b);
		
		instance_vars.add(chkbox6);
		instance_vars.add(ins_var6a);
		instance_vars.add(ins_var6b);
		
		instance_vars.add(chkbox7);
		instance_vars.add(ins_var7a);
		instance_vars.add(ins_var7b);
		
		instance_vars.add(chkbox8);
		instance_vars.add(ins_var8a);
		instance_vars.add(ins_var8b);
		
		instance_vars.add(chkbox9);
		instance_vars.add(ins_var9a);
		instance_vars.add(ins_var9b);
		
		instance_vars.add(chkbox10);
		instance_vars.add(ins_var10a);
		instance_vars.add(ins_var10b);
		*/
		JLabel ph = new JLabel("    ");
		JLabel ph2 = new JLabel("    ");
		JLabel ph3 = new JLabel("    ");
		JLabel ph4 = new JLabel("        ");
		JLabel ph5 = new JLabel("    ");
		
		gl2.setHorizontalGroup(gl2.createSequentialGroup()
				.addComponent(ph)
				.addGroup(gl2.createParallelGroup()
						.addComponent(chkbox1)
						.addComponent(chkbox2)
						.addComponent(chkbox3)
						.addComponent(chkbox4)
						.addComponent(chkbox5)
						.addComponent(chkbox6)
						.addComponent(chkbox7)
						.addComponent(chkbox8)
						.addComponent(chkbox9)
						.addComponent(chkbox10)		
						)
				.addComponent(ph4)
				.addGroup(gl2.createParallelGroup()
						.addComponent(ins_var1a)
						.addComponent(ins_var2a)
						.addComponent(ins_var3a)
						.addComponent(ins_var4a)
						.addComponent(ins_var5a)
						.addComponent(ins_var6a)
						.addComponent(ins_var7a)
						.addComponent(ins_var8a)
						.addComponent(ins_var9a)
						.addComponent(ins_var10a)		
						)
				.addComponent(ph3)
				.addGroup(gl2.createParallelGroup()
						.addComponent(ins_var1b)
						.addComponent(ins_var2b)
						.addComponent(ins_var3b)
						.addComponent(ins_var4b)
						.addComponent(ins_var5b)
						.addComponent(ins_var6b)
						.addComponent(ins_var7b)
						.addComponent(ins_var8b)
						.addComponent(ins_var9b)
						.addComponent(ins_var10b)
						)
				.addComponent(ph2)
				);
		gl2.setVerticalGroup(gl2.createSequentialGroup()
				.addGroup(gl2.createParallelGroup(Alignment.CENTER)
						.addComponent(ph)
						.addComponent(ph4)
						.addComponent(ph3)
						.addComponent(ph2)
						)
				.addGroup(gl2.createParallelGroup(Alignment.CENTER)
						.addComponent(chkbox1)
						.addComponent(ins_var1a)
						.addComponent(ins_var1b)
						)
				.addGroup(gl2.createParallelGroup(Alignment.CENTER)
						.addComponent(chkbox2)
						.addComponent(ins_var2a)
						.addComponent(ins_var2b)
						)
				.addGroup(gl2.createParallelGroup(Alignment.CENTER)
						.addComponent(chkbox3)
						.addComponent(ins_var3a)
						.addComponent(ins_var3b)
						)
				.addGroup(gl2.createParallelGroup(Alignment.CENTER)
						.addComponent(chkbox4)
						.addComponent(ins_var4a)
						.addComponent(ins_var4b)
						)
				.addGroup(gl2.createParallelGroup(Alignment.CENTER)
						.addComponent(chkbox5)
						.addComponent(ins_var5a)
						.addComponent(ins_var5b)
						)
				.addGroup(gl2.createParallelGroup(Alignment.CENTER)
						.addComponent(chkbox6)
						.addComponent(ins_var6a)
						.addComponent(ins_var6b)
						)
				.addGroup(gl2.createParallelGroup(Alignment.CENTER)
						.addComponent(chkbox7)
						.addComponent(ins_var7a)
						.addComponent(ins_var7b)
						)
				.addGroup(gl2.createParallelGroup(Alignment.CENTER)
						.addComponent(chkbox8)
						.addComponent(ins_var8a)
						.addComponent(ins_var8b)
						)
				.addGroup(gl2.createParallelGroup(Alignment.CENTER)
						.addComponent(chkbox9)
						.addComponent(ins_var9a)
						.addComponent(ins_var9b)
						)
				.addGroup(gl2.createParallelGroup(Alignment.CENTER)
						.addComponent(chkbox10)
						.addComponent(ins_var10a)
						.addComponent(ins_var10b)
						)
				);
		
		instructions.add(instr1);
		instructions.add(instr2);
		//classPage.add(instructions);
		
		classname.add(class_label);
		classname.add(class_name);
		//classPage.add(classname);
		
		var_labels.add(private_type);
		var_labels.add(var_type);
		var_labels.add(var_name);
		instance.add(instance_var_label);
		instance.add(var_labels);
		//classPage.add(instance);
		
		//classPage.add(instance_vars);
		
		gl1.setHorizontalGroup(gl1.createSequentialGroup()
				.addGroup(gl1.createParallelGroup()
						.addComponent(instructions)
						.addComponent(classname)
						.addComponent(instance)
						.addComponent(instance_vars))
				.addComponent(next)
				.addComponent(ph5)
				);
		
		gl1.setVerticalGroup(gl1.createSequentialGroup()
				.addComponent(instructions)
				.addComponent(classname)
				.addComponent(instance)
				.addComponent(instance_vars)
				.addComponent(next)
				.addComponent(ph5)
				);
		
		frame.pack();
		frame.setVisible(true);
	}
	
	public static void setDefaultUIFont (javax.swing.plaf.FontUIResource f){

		Enumeration<Object> keys = UIManager.getDefaults().keys();
		while (keys.hasMoreElements()) {
			Object key = keys.nextElement();
			Object value = UIManager.get (key);
			if (value instanceof javax.swing.plaf.FontUIResource)
				UIManager.put (key, f);
		}
	}
	
	public static void main(String[] args) {

		EventQueue.invokeLater(() -> {
			AutoCodeGUI gui = new AutoCodeGUI();
		});
	}
}
