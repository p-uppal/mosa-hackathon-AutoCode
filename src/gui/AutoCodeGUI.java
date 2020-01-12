package gui;
import logic.CodePicker;
import logic.InstanceVariable;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Enumeration;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class AutoCodeGUI {
	
	private JFrame frame = new JFrame("Auto Coder");
	JPanel functionPage;
	private JPanel cards;
	private CardLayout cl1;
	private JPanel classPage;
	
	private String name;
	private ArrayList<InstanceVariable> all_inst_vars;
	private ArrayList<Integer> functions_picked;
	
	private JCheckBox chkbox1 = new JCheckBox("private",true);
	private JCheckBox chkbox2 = new JCheckBox("private",true);
	private JCheckBox chkbox3 = new JCheckBox("private",true);
	private JCheckBox chkbox4 = new JCheckBox("private",true);
	private JCheckBox chkbox5 = new JCheckBox("private",true);
	private JCheckBox chkbox6 = new JCheckBox("private",true);
	private JCheckBox chkbox7 = new JCheckBox("private",true);
	private JCheckBox chkbox8 = new JCheckBox("private",true);
	private JCheckBox chkbox9 = new JCheckBox("private",true);
	private JCheckBox chkbox10 = new JCheckBox("private",true);
	
	private JTextField ins_var1a = new JTextField(20);
	private JTextField ins_var1b = new JTextField(20);
	private JTextField ins_var2a = new JTextField(20);
	private JTextField ins_var2b = new JTextField(20);
	private JTextField ins_var3a = new JTextField(20);
	private JTextField ins_var3b = new JTextField(20);
	private JTextField ins_var4a = new JTextField(20);
	private JTextField ins_var4b = new JTextField(20);
	private JTextField ins_var5a = new JTextField(20);
	private JTextField ins_var5b = new JTextField(20);
	private JTextField ins_var6a = new JTextField(20);
	private JTextField ins_var6b = new JTextField(20);
	private JTextField ins_var7a = new JTextField(20);
	private JTextField ins_var7b = new JTextField(20);
	private JTextField ins_var8a = new JTextField(20);
	private JTextField ins_var8b = new JTextField(20);
	private JTextField ins_var9a = new JTextField(20);
	private JTextField ins_var9b = new JTextField(20);
	private JTextField ins_var10a = new JTextField(20);
	private JTextField ins_var10b = new JTextField(20);
	
	private JCheckBox[] chkbox_arr;
	private JTextField[] ins_vara_arr;
	private JTextField[] ins_varb_arr;
	
	private JComboBox<String> funcChoice;
	private JPanel combo_panel;
	private JLabel func_instructions;
	private JPanel instr;
	private JPanel combobox_instr;
	private JPanel param_panel;
	private CardLayout cl3;
	
	private JPanel blank;
	private JPanel function_details;
	private JLabel details;
	
	
	private JPanel constructor;
	private JPanel bubble_sort;
	private JPanel quicksort;
	private JPanel readtxt;
	private JPanel writetxt;
	private JPanel readcsv;
	private JPanel writecsv;
	
	
	public AutoCodeGUI () {
		functions_picked = new ArrayList<Integer>();
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
		
		functionPage = new JPanel(new GridLayout(2,1));
		cards.add(functionPage, "functions");
		
		chkbox_arr = new JCheckBox[]{
				chkbox1,chkbox2,chkbox3,chkbox4,chkbox5,
				chkbox6,chkbox7,chkbox8,chkbox9,chkbox10
		};
		
		ins_vara_arr = new JTextField[]{
				ins_var1a,ins_var2a,ins_var3a,ins_var4a,ins_var5a,
				ins_var6a,ins_var7a,ins_var8a,ins_var9a,ins_var10a
		};
		
		ins_varb_arr = new JTextField[]{
				ins_var1b,ins_var2b,ins_var3b,ins_var4b,ins_var5b,
				ins_var6b,ins_var7b,ins_var8b,ins_var9b,ins_var10b
		};
		
		
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
		
		JLabel error_message = new JLabel("");
		JPanel error_panel = new JPanel(new FlowLayout());
		error_panel.add(error_message);
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
		instructions.add(error_panel);
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
		
		next.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (class_name.getText().isEmpty()) {
					error_message.setText("Please enter a Class name, at least!");
					error_message.setFont(new Font("Serif",Font.BOLD,30));
					//instructions.add(error_panel);
				}
				else {
					name = class_name.getText();
					cl1.show(cards, "functions");
					packageVariables();
					
				}
			}
		});
		
		createFunctionPage();
		
		funcChoice.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {

                int selected = funcChoice.getSelectedIndex();
                switch (selected) {
                	case 1:
                		cl3.show(param_panel, "constructor");
                		break;
                	case 2:
                		cl3.show(param_panel, "bs");
                		break;
                	case 3:
                		cl3.show(param_panel, "qs");
                		break;
                	case 4:
                		cl3.show(param_panel, "rt");
                		break;
                	case 5:
                		cl3.show(param_panel, "wt");
                		break;
                	case 6:
                		cl3.show(param_panel, "rc");
                		break;
                	case 7:
                		cl3.show(param_panel, "wc");
                		break;
                	default:
                		cl3.show(param_panel, "blank");
                		break;
                }
            }
        });
		
		frame.pack();
		frame.setVisible(true);
	}
	
	public void createFunctionPage() {
		String[] functions = {"Select a function","Constructor","Bubble Sort", 
				"QuickSort", "Read TXT File", "Write to TXT File",
				"Read CSV File", "Write to CSV File"};
		
		funcChoice = new JComboBox<String>(functions);
		funcChoice.setSelectedIndex(0);
		funcChoice.setEditable(false);
		combo_panel = new JPanel(new FlowLayout());
		combo_panel.add(funcChoice);
		
		func_instructions = new JLabel("Please choose a function, enter parameters, and click the add button to add it to your class");
		instr = new JPanel(new FlowLayout());
		instr.add(func_instructions);
		
		combobox_instr = new JPanel(new GridLayout(4,1));
		combobox_instr.add(instr);
		combobox_instr.add(combo_panel);
		
		functionPage.add(combobox_instr);
		
		cl3 = new CardLayout();
		param_panel = new JPanel();
		param_panel.setLayout(cl3);
		
		blank = new JPanel();
		constructor = new JPanel(new GridLayout(6,2));
		bubble_sort = new JPanel(new FlowLayout());
		quicksort = new JPanel(new FlowLayout());
		readtxt = new JPanel(new FlowLayout());
		writetxt = new JPanel(new FlowLayout());
		readcsv = new JPanel(new FlowLayout());
		writecsv = new JPanel(new FlowLayout());
		
		JPanel function_details = new JPanel(new FlowLayout());
		JLabel details = new JLabel("");
		
		param_panel.add(blank,"blank");
		param_panel.add(blank,"blank");
		/*
		param_panel.add(constructor,"constructor");
		param_panel.add(bubble_sort,"bs");
		param_panel.add(quicksort,"qs");
		param_panel.add(readtxt,"rt");
		param_panel.add(writetxt,"wt");
		param_panel.add(readcsv,"rc");
		param_panel.add(writecsv,"wc");
		*/
		
		functionPage.add(param_panel);
		
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
	
	public void packageVariables() {
		for (int i = 0; i < 10; i++) {
			if (ins_vara_arr[i].getText().isEmpty()) {
				continue;
			}
			
			all_inst_vars.add(new InstanceVariable(chkbox_arr[i].isSelected(),
					ins_vara_arr[i].getText(),
					ins_varb_arr[i].getText()));
		}
	}
	
	public static void main(String[] args) {

		EventQueue.invokeLater(() -> {
			AutoCodeGUI gui = new AutoCodeGUI();
		});
	}
}
