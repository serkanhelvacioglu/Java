package pack1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class Employee_Form extends JFrame {

	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtSurname;
	private final ButtonGroup btngrpGender = new ButtonGroup();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Employee_Form frame = new Employee_Form();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Employee_Form() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblname = new JLabel("Name");
		lblname.setBounds(21, 11, 46, 14);
		contentPane.add(lblname);
		
		txtName = new JTextField();
		txtName.setBounds(21, 27, 86, 20);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		JLabel lblSurname = new JLabel("Surname");
		lblSurname.setBounds(21, 60, 74, 14);
		contentPane.add(lblSurname);
		
		txtSurname = new JTextField();
		txtSurname.setBounds(21, 75, 86, 20);
		contentPane.add(txtSurname);
		txtSurname.setColumns(10);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setBounds(21, 125, 46, 14);
		contentPane.add(lblGender);
		
		final JRadioButton rdbtnMale = new JRadioButton("Male");
		btngrpGender.add(rdbtnMale);
		rdbtnMale.setBounds(18, 146, 109, 23);
		contentPane.add(rdbtnMale);
		
		final JRadioButton rdbtnFemale = new JRadioButton("Female");
		btngrpGender.add(rdbtnFemale);
		rdbtnFemale.setBounds(18, 172, 109, 23);
		contentPane.add(rdbtnFemale);
		
		JLabel lblLanguages = new JLabel("Languages");
		lblLanguages.setBounds(134, 27, 80, 14);
		contentPane.add(lblLanguages);
		
		final JCheckBox chckbxJava = new JCheckBox("Java");
		chckbxJava.setBounds(134, 48, 97, 23);
		contentPane.add(chckbxJava);
		
		final JCheckBox chckbxCsharp = new JCheckBox("C-Sharp");
		chckbxCsharp.setBounds(134, 67, 97, 23);
		contentPane.add(chckbxCsharp);
		
		final JCheckBox chckbxPython = new JCheckBox("Python");
		chckbxPython.setBounds(134, 86, 97, 23);
		contentPane.add(chckbxPython);
		
		final JComboBox comboBox = new JComboBox();
		comboBox.setBounds(299, 27, 74, 20);
		contentPane.add(comboBox);
		
		String[] cities = {"Istanbul","Ankara","Bursa","Antalya","Izmir"};
		DefaultComboBoxModel cities_model = new DefaultComboBoxModel(cities);
		comboBox.setModel(cities_model);
		
		
		JLabel lblAdress = new JLabel("Adress");
		lblAdress.setBounds(137, 125, 46, 14);
		contentPane.add(lblAdress);
		
		final JTextArea txtAdress = new JTextArea();
		txtAdress.setBounds(138, 145, 118, 79);
		contentPane.add(txtAdress);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Employee emp1 = new Employee();
				emp1.setName(txtName.getText());
				emp1.setSurname(txtSurname.getText());
				
				if(rdbtnMale.isSelected()){emp1.setGender("Male");}
				if(rdbtnFemale.isSelected()){emp1.setGender("Female");}
				
				String languages="";
				
				if(chckbxJava.isSelected()){languages+="Java ";}
				if(chckbxCsharp.isSelected()){languages+="C# ";}
				if(chckbxPython.isSelected()){languages+="Python ";}
				emp1.setLanguages(languages);
				
				emp1.setAdress(txtAdress.getText());
				emp1.setCity(comboBox.getSelectedItem().toString());
				emp1.display();
				
				
			}
		});
		btnSubmit.setBounds(312, 215, 89, 23);
		contentPane.add(btnSubmit);
		
		/*ButtonGroup btngrpGender = new ButtonGroup();
		btngrpGender.add(rdbtnMale);
		btngrpGender.add(rdbtnFemale);*/
		
	}
}
