import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;

public class HelloworldUUI extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtSaludo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HelloworldUUI frame = new HelloworldUUI();
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
	public HelloworldUUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 139));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setForeground(new Color(240, 248, 255));
		lblNombre.setBounds(145, 51, 46, 14);
		contentPane.add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setForeground(new Color(240, 248, 255));
		txtNombre.setBackground(new Color(0, 0, 255));
		txtNombre.setBounds(213, 48, 86, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		JButton btnNewButton = new JButton("Saludar");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//comprobar si hay nombre
				String nombre=txtNombre.getText();
				if(nombre.equals("")){
					//mostrar saludo anonimo
					txtSaludo.setText("Hola anonimo");
				}//if
				else{
					//mostrar saludo con su nombre
					txtSaludo.setText("Hola "+nombre);
				}//else	
			}
		});
		btnNewButton.setBounds(164, 89, 89, 23);
		contentPane.add(btnNewButton);
		
		txtSaludo = new JTextField();
		txtSaludo.setBackground(new Color(0, 0, 255));
		txtSaludo.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtSaludo.setForeground(new Color(245, 245, 245));
		txtSaludo.setHorizontalAlignment(SwingConstants.CENTER);
		txtSaludo.setEditable(false);
		txtSaludo.setBounds(59, 123, 314, 96);
		contentPane.add(txtSaludo);
		txtSaludo.setColumns(10);
	}

}
