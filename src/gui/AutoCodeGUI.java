package gui;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.Enumeration;

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
		frame.setLayout(new BorderLayout());
		cards = new JPanel();
		cl1 = new CardLayout();
		cards.setLayout(cl1);
		
		frame.add(cards,BorderLayout.CENTER);
		
		classPage = new JPanel(new GridLayout(6,2));
		cards.add(classPage, "class");
		
		JLabel class_label = new JLabel("Class Name: ");
		JTextField class_name = new JTextField(20);
		JLabel instance_var_label = new JLabel("Instance Variables: ");
		JPanel instance_vars = new JPanel(new GridLayout(5,2));
		
		JLabel private_type = new JLabel("Private?");
		JLabel var_type = new JLabel("Variable Type");
		JLabel var_name = new JLabel("Variable Name");

		JCheckBox chkbox1 = new JCheckBox("private?",true);;
		JCheckBox chkbox2 = new JCheckBox("private?",true);;
		JCheckBox chkbox3 = new JCheckBox("private?",true);;
		JCheckBox chkbox4 = new JCheckBox("private?",true);;
		JCheckBox chkbox5 = new JCheckBox("private?",true);;
		
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
		
		
		classPage.add(class_label);
		classPage.add(class_name);
		classPage.add(instance_var_label);
		classPage.add(private_type);
		classPage.add(var_type);
		classPage.add(var_name);
		classPage.add(instance_vars);
		
		
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
