import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class IdentificacionUUI extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsuario;
	private JPasswordField txtPassword;
	private String password="";
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IdentificacionUUI frame = new IdentificacionUUI();
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
	public IdentificacionUUI() {
		setTitle("IDENTIFICACION");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 340, 262);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblUsuario.setBounds(42, 11, 87, 30);
		contentPane.add(lblUsuario);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(159, 13, 136, 30);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPassword.setBounds(42, 52, 87, 30);
		contentPane.add(lblPassword);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(159, 54, 136, 30);
		contentPane.add(txtPassword);
		
		JButton btnAceptar = new JButton("aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nombre=txtUsuario.getText();
				if(nombre.equals("admin") && password.equals("1234")){
					HelloworldUUI frmSaludo=new HelloworldUUI();
					frmSaludo.setVisible(true);
				}
			}
		});
		btnAceptar.setBounds(72, 175, 84, 23);
		contentPane.add(btnAceptar);
		
		JButton btnCancelar = new JButton("cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnCancelar.setBounds(178, 175, 84, 23);
		contentPane.add(btnCancelar);
		
		JButton btnNum0 = new JButton("0");
		btnNum0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				password=password+"0";
				txtPassword.setText(password);
			}
		});
		btnNum0.setBounds(10, 93, 52, 23);
		contentPane.add(btnNum0);
		
		JButton btnNum1 = new JButton("1");
		btnNum1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				password=password+"1";
				txtPassword.setText(password);
			}
		});
		btnNum1.setBounds(72, 93, 52, 23);
		contentPane.add(btnNum1);
		
		JButton btnNum2 = new JButton("2");
		btnNum2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				password=password+"2";
				txtPassword.setText(password);
			}
		});
		btnNum2.setBounds(134, 93, 52, 23);
		contentPane.add(btnNum2);
		
		JButton btnNum3 = new JButton("3");
		btnNum3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				password=password+"3";
				txtPassword.setText(password);
			}
		});
		btnNum3.setBounds(196, 93, 52, 23);
		contentPane.add(btnNum3);
		
		JButton btnNum4 = new JButton("4");
		btnNum4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				password=password+"4";
				txtPassword.setText(password);
			}
		});
		btnNum4.setBounds(258, 93, 52, 23);
		contentPane.add(btnNum4);
		
		JButton btnNum5 = new JButton("5");
		btnNum5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				password=password+"5";
				txtPassword.setText(password);
			}
		});
		btnNum5.setBounds(10, 127, 52, 23);
		contentPane.add(btnNum5);
		
		JButton btnNum6 = new JButton("6");
		btnNum6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				password=password+"6";
				txtPassword.setText(password);
			}
		});
		btnNum6.setBounds(72, 127, 52, 23);
		contentPane.add(btnNum6);
		
		JButton btnNum7 = new JButton("7");
		btnNum7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				password=password+"7";
				txtPassword.setText(password);
			}
		});
		btnNum7.setBounds(134, 127, 52, 23);
		contentPane.add(btnNum7);
		
		JButton btnNum8 = new JButton("8");
		btnNum8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				password=password+"8";
				txtPassword.setText(password);
			}
		});
		btnNum8.setBounds(196, 127, 52, 23);
		contentPane.add(btnNum8);
		
		JButton btnNum9 = new JButton("9");
		btnNum9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				password=password+"9";
				txtPassword.setText(password);
			}
		});
		btnNum9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNum9.setBounds(258, 127, 52, 23);
		contentPane.add(btnNum9);
	}
}
