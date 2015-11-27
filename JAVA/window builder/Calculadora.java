import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculadora extends JFrame {

	private JPanel contentPane;
	private JTextField txtNumero1;
	private JTextField txtNumero2;
	private JTextField txtResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
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
	public Calculadora() {
		setTitle("Calculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 250, 210);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNumero = new JLabel("Numero 1");
		lblNumero.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNumero.setBounds(10, 11, 84, 23);
		contentPane.add(lblNumero);
		
		JLabel lblNumero_1 = new JLabel("Numero 2");
		lblNumero_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNumero_1.setBounds(10, 45, 84, 20);
		contentPane.add(lblNumero_1);
		
		JLabel lblResultado = new JLabel("Resultado");
		lblResultado.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblResultado.setBounds(10, 76, 84, 23);
		contentPane.add(lblResultado);
		
		txtNumero1 = new JTextField();
		txtNumero1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtNumero1.setBounds(104, 11, 101, 23);
		contentPane.add(txtNumero1);
		txtNumero1.setColumns(10);
		
		txtNumero2 = new JTextField();
		txtNumero2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtNumero2.setColumns(10);
		txtNumero2.setBounds(104, 46, 101, 23);
		contentPane.add(txtNumero2);
		
		txtResultado = new JTextField();
		txtResultado.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtResultado.setEditable(false);
		txtResultado.setColumns(10);
		txtResultado.setBounds(104, 78, 101, 23);
		contentPane.add(txtResultado);
		
		JButton btnSuma = new JButton("+");
		btnSuma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String resultado;
				int num1=Integer.parseInt(txtNumero1.getText());
				int num2=Integer.parseInt(txtNumero2.getText());
				int suma;
				suma=num1+num2;
				resultado=Integer.toString(suma);
				txtResultado.setText(resultado);
			}
		});
		btnSuma.setBounds(10, 107, 41, 23);
		contentPane.add(btnSuma);
		
		JButton btnResta = new JButton("-");
		btnResta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String resultado;
				int num1=Integer.parseInt(txtNumero1.getText());
				int num2=Integer.parseInt(txtNumero2.getText());
				int suma;
				suma=num1-num2;
				resultado=Integer.toString(suma);
				txtResultado.setText(resultado);
			}
		});
		btnResta.setBounds(61, 107, 41, 23);
		contentPane.add(btnResta);
		
		JButton btnMultiplicacion = new JButton("*");
		btnMultiplicacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String resultado;
				int num1=Integer.parseInt(txtNumero1.getText());
				int num2=Integer.parseInt(txtNumero2.getText());
				int suma;
				suma=num1*num2;
				resultado=Integer.toString(suma);
				txtResultado.setText(resultado);
			}
		});
		btnMultiplicacion.setBounds(114, 107, 41, 23);
		contentPane.add(btnMultiplicacion);
		
		JButton btnDivision = new JButton("/");
		btnDivision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String resultado;
				int num1=Integer.parseInt(txtNumero1.getText());
				int num2=Integer.parseInt(txtNumero2.getText());
				int suma;
				suma=num1/num2;
				resultado=Integer.toString(suma);
				txtResultado.setText(resultado);
			}
		});
		btnDivision.setBounds(164, 107, 41, 23);
		contentPane.add(btnDivision);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(61, 141, 94, 23);
		contentPane.add(btnSalir);
	}
}
