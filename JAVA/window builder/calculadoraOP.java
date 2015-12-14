import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JProgressBar;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.ButtonGroup;
import javax.swing.JList;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class calculadoraOP extends JFrame {

	private JPanel contentPane;
	private JTextField txtNum1;
	private JTextField txtNum2;
	private JTextField txtResultado;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField txtNombre;
	private DefaultListModel<String> mAmigos=new DefaultListModel<String>();
	private DefaultListModel<String> mEnemigos=new DefaultListModel<String>();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculadoraOP frame = new calculadoraOP();
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
	public calculadoraOP() {
		setTitle("Calculator 0.1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 375, 485);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNumero = new JLabel("numero 1:");
		lblNumero.setBounds(32, 41, 71, 14);
		contentPane.add(lblNumero);
		
		JLabel lblNumero_1 = new JLabel("numero 2:");
		lblNumero_1.setBounds(32, 66, 71, 14);
		contentPane.add(lblNumero_1);
		
		JLabel lblResultado = new JLabel("Resultado:");
		lblResultado.setBounds(32, 91, 71, 14);
		contentPane.add(lblResultado);
		
		txtNum1 = new JTextField();
		txtNum1.setBounds(124, 38, 193, 20);
		contentPane.add(txtNum1);
		txtNum1.setColumns(10);
		
		txtNum2 = new JTextField();
		txtNum2.setBounds(124, 63, 193, 20);
		contentPane.add(txtNum2);
		txtNum2.setColumns(10);
		
		txtResultado = new JTextField();
		txtResultado.setEditable(false);
		txtResultado.setBounds(124, 88, 193, 20);
		contentPane.add(txtResultado);
		txtResultado.setColumns(10);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, -2, 359, 21);
		contentPane.add(menuBar);
		
		JMenu mnOperaciones = new JMenu("Operaciones");
		menuBar.add(mnOperaciones);
		
		JMenuItem mntmSuma = new JMenuItem("Suma");
		mntmSuma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcularRes("+");				
			}
		});
		mnOperaciones.add(mntmSuma);
		
		JMenuItem mntmResta = new JMenuItem("Resta");
		mntmResta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcularRes("-");
			}
		});
		mnOperaciones.add(mntmResta);
		
		JMenuItem mntmMultiplicacion = new JMenuItem("Multiplicacion");
		mntmMultiplicacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcularRes("*");
			}
		});
		mnOperaciones.add(mntmMultiplicacion);
		
		JMenuItem mntmDivision = new JMenuItem("Division");
		mntmDivision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcularRes("/");
			}
		});
		mnOperaciones.add(mntmDivision);
		
		JMenuItem mntmBorrar = new JMenuItem("Borrar");
		mntmBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcularRes("C");
			}
		});
		menuBar.add(mntmBorrar);
		
		JMenuItem mntmSalir = new JMenuItem("Salir");
		mntmSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int confirmar = JOptionPane.showConfirmDialog(null,"¿estas seguro de que quieres salir?", "salir", JOptionPane.YES_OPTION);
				if(confirmar==JOptionPane.YES_OPTION){
					System.exit(0);
				}
			}
		});
		menuBar.add(mntmSalir);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds(7, 404, 341, 20);
		contentPane.add(progressBar);
		
		JButton btnClickFast = new JButton("Click Fast!!");
		btnClickFast.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				progressBar.setValue(progressBar.getValue()+2);
			}
		});
		btnClickFast.setBounds(124, 370, 105, 23);
		contentPane.add(btnClickFast);
		
		JTabbedPane tabbedPane_2 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_2.setBounds(6, 128, 342, 231);
		contentPane.add(tabbedPane_2);
		
		JPanel panel = new JPanel();
		tabbedPane_2.addTab("JButton", null, panel, null);
		panel.setLayout(null);
		
		JButton btnSuma = new JButton("+");
		btnSuma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				calcularRes("+");
			}
		});
		btnSuma.setForeground(Color.WHITE);
		btnSuma.setBackground(Color.BLACK);
		btnSuma.setBounds(51, 27, 41, 23);
		panel.add(btnSuma);
		
		JButton btnResta = new JButton("-");
		btnResta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcularRes("-");
			}
		});
		btnResta.setForeground(Color.WHITE);
		btnResta.setBackground(Color.BLACK);
		btnResta.setBounds(102, 27, 41, 23);
		panel.add(btnResta);
		
		JButton btnMulti = new JButton("*");
		btnMulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcularRes("*");
			}
		});
		btnMulti.setForeground(Color.WHITE);
		btnMulti.setBackground(Color.BLACK);
		btnMulti.setBounds(51, 75, 41, 23);
		panel.add(btnMulti);
		
		JButton btnDivi = new JButton("/");
		btnDivi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcularRes("/");
			}
		});
		btnDivi.setForeground(Color.WHITE);
		btnDivi.setBackground(Color.BLACK);
		btnDivi.setBounds(102, 75, 41, 23);
		panel.add(btnDivi);
		
		JButton btnBorrar = new JButton("CE");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcularRes("C");
			}
		});
		btnBorrar.setForeground(Color.WHITE);
		btnBorrar.setBackground(Color.BLACK);
		btnBorrar.setBounds(190, 27, 70, 23);
		panel.add(btnBorrar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int confirmar = JOptionPane.showConfirmDialog(null,"¿estas seguro de que quieres salir?", "salir", JOptionPane.YES_OPTION);
				if(confirmar==JOptionPane.YES_OPTION){
					System.exit(0);
				}
			}
		});
		btnSalir.setForeground(Color.WHITE);
		btnSalir.setBackground(Color.BLACK);
		btnSalir.setBounds(190, 75, 70, 23);
		panel.add(btnSalir);
		
		JPanel panel_1 = new JPanel();
		tabbedPane_2.addTab("JComboBox", null, panel_1, null);
		panel_1.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switch(comboBox.getSelectedIndex()){
					case 1: calcularRes("+");break;
					case 2: calcularRes("-");break;
					case 3: calcularRes("*");break;
					case 4: calcularRes("/");break;
				}
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"(Elige operacion)", "Suma", "Resta", "Multiplicacion", "Division"}));
		comboBox.setBounds(118, 49, 193, 20);
		panel_1.add(comboBox);
		
		JLabel label = new JLabel("Operacion:");
		label.setBounds(26, 52, 71, 14);
		panel_1.add(label);
		
		JPanel panel_2 = new JPanel();
		tabbedPane_2.addTab("JRadioButton", null, panel_2, null);
		panel_2.setLayout(null);
		
		JRadioButton rdbtnSuma = new JRadioButton("Suma");
		buttonGroup.add(rdbtnSuma);
		rdbtnSuma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcularRes("+");
			}
		});
		rdbtnSuma.setBounds(6, 7, 109, 23);
		panel_2.add(rdbtnSuma);
		
		JRadioButton rdbtnResta = new JRadioButton("Resta");
		buttonGroup.add(rdbtnResta);
		rdbtnResta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcularRes("-");
			}
		});
		rdbtnResta.setBounds(6, 33, 109, 23);
		panel_2.add(rdbtnResta);
		
		JRadioButton rdbtnMulti = new JRadioButton("Multiplicaci\u00F3n");
		buttonGroup.add(rdbtnMulti);
		rdbtnMulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcularRes("*");
			}
		});
		rdbtnMulti.setBounds(6, 59, 109, 23);
		panel_2.add(rdbtnMulti);
		
		JRadioButton rdbtnDivi = new JRadioButton("Divisi\u00F3n");
		buttonGroup.add(rdbtnDivi);
		rdbtnDivi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcularRes("/");
			}
		});
		rdbtnDivi.setBounds(6, 85, 109, 23);
		panel_2.add(rdbtnDivi);
		
		JPanel panel_3 = new JPanel();
		tabbedPane_2.addTab("JList", null, panel_3, null);
		panel_3.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(10, 11, 46, 14);
		panel_3.add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(66, 7, 120, 20);
		panel_3.add(txtNombre);
		txtNombre.setColumns(10);
		
		JButton btnAnadir = new JButton("A\u00F1adir");
		btnAnadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mAmigos.addElement(txtNombre.getText());
			
			}
		});
		btnAnadir.setBounds(196, 7, 89, 23);
		panel_3.add(btnAnadir);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 36, 121, 88);
		panel_3.add(scrollPane_1);
		
		JList lstAmigos = new JList();
		scrollPane_1.setViewportView(lstAmigos);
		lstAmigos.setModel(mAmigos);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(206, 33, 121, 88);
		panel_3.add(scrollPane);
		
		JList lstEnemigos = new JList();
		scrollPane.setViewportView(lstEnemigos);
		lstEnemigos.setModel(mEnemigos);
		
		JButton btnDer1 = new JButton(">");
		btnDer1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (lstAmigos.getSelectedIndices().length > 0) {
		            int[] selectedIndices = lstAmigos.getSelectedIndices();
		            //append selected to list2
		            for (int i = 0; i < selectedIndices.length; i++) {
		                mEnemigos.addElement((String) lstAmigos.getModel().getElementAt(selectedIndices[i]));
		            }
		            //remove selected from list1
		            for (int i = selectedIndices.length - 1; i >= 0; i--) {
		                mAmigos.removeElementAt(selectedIndices[i]);
		            }
		        }
			}
		});
		btnDer1.setBounds(141, 33, 55, 23);
		panel_3.add(btnDer1);
		
		JButton btnDerAll = new JButton(">>");
		btnDerAll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//copy all elements from list1 to list2
		        for (int i = 0; i < mAmigos.getSize(); i++) {
		            mEnemigos.addElement(mAmigos.elementAt(i));
		        }
		        //remove all list1 elements
		        for (int i = mAmigos.getSize() - 1; i >= 0; i--) {
		            mAmigos.removeElement(mAmigos.elementAt(i));
		        }
			}
		});
		btnDerAll.setBounds(141, 56, 55, 23);
		panel_3.add(btnDerAll);
		
		JButton btnIzq1 = new JButton("<");
		btnIzq1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (lstEnemigos.getSelectedIndices().length > 0) {
		            int[] selectedIndices = lstEnemigos.getSelectedIndices();
		            //append selected to list2
		            for (int i = 0; i < selectedIndices.length; i++) {
		                mAmigos.addElement((String) lstEnemigos.getModel().getElementAt(selectedIndices[i]));
		            }
		            //remove selected from list1
		            for (int i = selectedIndices.length - 1; i >= 0; i--) {
		                mEnemigos.removeElementAt(selectedIndices[i]);
		            }
		        }
			}
		});
		btnIzq1.setBounds(141, 78, 55, 23);
		panel_3.add(btnIzq1);
		
		JButton btnIzqAll = new JButton("<<");
		btnIzqAll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//copy all elements from list1 to list2
		        for (int i = 0; i < mEnemigos.getSize(); i++) {
		            mAmigos.addElement(mEnemigos.elementAt(i));
		        }
		        //remove all list1 elements
		        for (int i = mEnemigos.getSize() - 1; i >= 0; i--) {
		            mEnemigos.removeElement(mEnemigos.elementAt(i));
		        }
			}
		});
		btnIzqAll.setBounds(141, 101, 55, 23);
		panel_3.add(btnIzqAll);
		
		
	}
	private void calcularRes(String ope){
		try{//Si hay un error aqui	
			double num1=Double.parseDouble(txtNum1.getText());
			double num2=Double.parseDouble(txtNum2.getText());
			switch(ope){
				case "+":txtResultado.setText(Double.toString(num1+num2));break;
				case "-":txtResultado.setText(Double.toString(num1-num2));break;
				case "*":txtResultado.setText(Double.toString(num1*num2));break;
				case "/":txtResultado.setText(Double.toString(num1/num2));break;
				case "C":txtNum1.setText("");txtNum2.setText("");
				     	 txtResultado.setText("");txtNum1.requestFocus();break;
			}
		}catch(NumberFormatException e){//lo resuelve aqui
			JOptionPane.showMessageDialog(null, "Introduzca valores numéricos");
			txtNum1.requestFocus();
		}
		
	}
}