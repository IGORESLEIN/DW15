import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class Calculadora2 extends JFrame {

	private JPanel contentPane;
	private JTextField txtResultado;
	private String num="";
	private int acumulador=0;
	private char operacion='n';
	private int numero=0;
	private String resultado="";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora2 frame = new Calculadora2();
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
	public Calculadora2() {
		setTitle("Calculadora");
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 330, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNum1 = new JButton("1");
		btnNum1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num=num+"1";
				txtResultado.setText(num);
			}
		});
		btnNum1.setBounds(10, 11, 89, 23);
		contentPane.add(btnNum1);
		
		JButton btnNum2 = new JButton("2");
		btnNum2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num=num+"2";
				txtResultado.setText(num);
			}
		});
		btnNum2.setBounds(109, 11, 89, 23);
		contentPane.add(btnNum2);
		
		JButton btnNum3 = new JButton("3");
		btnNum3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num=num+"3";
				txtResultado.setText(num);
			}
		});
		btnNum3.setBounds(208, 11, 89, 23);
		contentPane.add(btnNum3);
		
		JButton btnNum4 = new JButton("4");
		btnNum4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num=num+"4";
				txtResultado.setText(num);
			}
		});
		btnNum4.setBounds(10, 45, 89, 23);
		contentPane.add(btnNum4);
		
		JButton btnNum5 = new JButton("5");
		btnNum5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num=num+"5";
				txtResultado.setText(num);
			}
		});
		btnNum5.setBounds(109, 45, 89, 23);
		contentPane.add(btnNum5);
		
		JButton btnNum6 = new JButton("6");
		btnNum6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num=num+"6";
				txtResultado.setText(num);
			}
		});
		btnNum6.setBounds(208, 45, 89, 23);
		contentPane.add(btnNum6);
		
		JButton btnNum7 = new JButton("7");
		btnNum7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num=num+"7";
				txtResultado.setText(num);
			}
		});
		btnNum7.setBounds(10, 79, 89, 23);
		contentPane.add(btnNum7);
		
		JButton btnNum8 = new JButton("8");
		btnNum8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num=num+"8";
				txtResultado.setText(num);
			}
		});
		btnNum8.setBounds(109, 79, 89, 23);
		contentPane.add(btnNum8);
		
		JButton btnNum9 = new JButton("9");
		btnNum9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num=num+"9";
				txtResultado.setText(num);
			}
		});
		btnNum9.setBounds(208, 79, 89, 23);
		contentPane.add(btnNum9);
		
		JButton btnSuma = new JButton("+");
		btnSuma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(acumulador==0 && operacion=='n'){
					acumulador=Integer.parseInt(num);
					num=num+"+";
					txtResultado.setText(num);
					num="";
					operacion='+';
				}
				else{
					switch(operacion){
					case '+':
						numero=Integer.parseInt(num);
						acumulador=acumulador+numero;
						txtResultado.setText(Integer.toString(acumulador));
						num="";
						operacion='+';
						break;
					case '-':
						numero=Integer.parseInt(num);
						acumulador=acumulador-numero;
						txtResultado.setText(Integer.toString(acumulador));
						num="";
						operacion='+';
						break;
					case '*':
						numero=Integer.parseInt(num);
						acumulador=acumulador*numero;
						txtResultado.setText(Integer.toString(acumulador));
						num="";
						operacion='+';
						break;
					case '/':
						numero=Integer.parseInt(num);
						acumulador=acumulador/numero;
						txtResultado.setText(Integer.toString(acumulador));
						num="";
						operacion='+';
						break;
					}
				}
			}
		});
		btnSuma.setBounds(10, 113, 41, 23);
		contentPane.add(btnSuma);
		
		JButton btnResta = new JButton("-");
		btnResta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(acumulador==0 && operacion=='n'){
					acumulador=Integer.parseInt(num);
					num=num+"-";
					txtResultado.setText(num);
					num="";
					operacion='-';
				}
				else{
					switch(operacion){
					case '+':
						numero=Integer.parseInt(num);
						acumulador=acumulador+numero;
						txtResultado.setText(Integer.toString(acumulador));
						num="";
						operacion='-';
						break;
					case '-':
						numero=Integer.parseInt(num);
						acumulador=acumulador-numero;
						txtResultado.setText(Integer.toString(acumulador));
						num="";
						operacion='-';
						break;
					case '*':
						numero=Integer.parseInt(num);
						acumulador=acumulador*numero;
						txtResultado.setText(Integer.toString(acumulador));
						num="";
						operacion='-';
						break;
					case '/':
						numero=Integer.parseInt(num);
						acumulador=acumulador/numero;
						txtResultado.setText(Integer.toString(acumulador));
						num="";operacion='-';
						break;
					}
				}
			}
		});
		btnResta.setBounds(58, 113, 41, 23);
		contentPane.add(btnResta);
		
		JButton btnMultiplicacion = new JButton("*");
		btnMultiplicacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(acumulador==0 && operacion=='n'){
					acumulador=Integer.parseInt(num);
					num=num+"*";
					txtResultado.setText(num);
					num="";
					operacion='*';
				}
				else{
					switch(operacion){
					case '+':
						numero=Integer.parseInt(num);
						acumulador=acumulador+numero;
						txtResultado.setText(Integer.toString(acumulador));
						num="";
						operacion='*';
						break;
					case '-':
						numero=Integer.parseInt(num);
						acumulador=acumulador-numero;
						txtResultado.setText(Integer.toString(acumulador));
						num="";
						operacion='*';
						break;
					case '*':
						numero=Integer.parseInt(num);
						acumulador=acumulador*numero;
						txtResultado.setText(Integer.toString(acumulador));
						num="";
						operacion='*';
						break;
					case '/':
						numero=Integer.parseInt(num);
						acumulador=acumulador/numero;
						txtResultado.setText(Integer.toString(acumulador));
						num="";
						operacion='*';
						break;
					}
				}
			}
		});
		btnMultiplicacion.setBounds(208, 113, 41, 23);
		contentPane.add(btnMultiplicacion);
		
		JButton btnDivision = new JButton("/");
		btnDivision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(acumulador==0 && operacion=='n'){
					acumulador=Integer.parseInt(num);
					num=num+"/";
					txtResultado.setText(num);
					num="";
					operacion='/';
				}
				else{
					switch(operacion){
					case '+':
						numero=Integer.parseInt(num);
						acumulador=acumulador+numero;
						txtResultado.setText(Integer.toString(acumulador));
						num="";
						operacion='/';
						break;
					case '-':
						numero=Integer.parseInt(num);
						acumulador=acumulador-numero;
						txtResultado.setText(Integer.toString(acumulador));
						num="";
						operacion='/';
						break;
					case '*':
						numero=Integer.parseInt(num);
						acumulador=acumulador*numero;
						txtResultado.setText(Integer.toString(acumulador));
						num="";
						operacion='/';
						break;
					case '/':
						numero=Integer.parseInt(num);
						acumulador=acumulador/numero;
						txtResultado.setText(Integer.toString(acumulador));
						num="";
						operacion='/';
						break;
					}
				}
			}
		});
		btnDivision.setBounds(256, 113, 41, 23);
		contentPane.add(btnDivision);
		
		txtResultado = new JTextField();
		txtResultado.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtResultado.setEditable(false);
		txtResultado.setBounds(10, 181, 287, 70);
		contentPane.add(txtResultado);
		txtResultado.setColumns(10);
		
		JButton btnNum0 = new JButton("0");
		btnNum0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num=num+0;
				txtResultado.setText(num);
			}
		});
		btnNum0.setBounds(109, 113, 89, 23);
		contentPane.add(btnNum0);
		
		JButton btnResultado = new JButton("=");
		btnResultado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(operacion!='n'){
					switch(operacion){
					case '+':
						numero=Integer.parseInt(num);
						resultado=Integer.toString(acumulador+numero);
						txtResultado.setText(resultado);
						num="";
						operacion='n';
						acumulador=0;
						break;
					case '-':
						numero=Integer.parseInt(num);
						resultado=Integer.toString(acumulador-numero);
						txtResultado.setText(resultado);
						num="";
						operacion='n';
						acumulador=0;
						break;
					case '*':
						numero=Integer.parseInt(num);
						resultado=Integer.toString(acumulador*numero);
						txtResultado.setText(resultado);
						num="";
						operacion='n';
						acumulador=0;
						break;
					case '/':
						numero=Integer.parseInt(num);
						resultado=Integer.toString(acumulador/numero);
						txtResultado.setText(resultado);
						num="";
						operacion='n';
						acumulador=0;
						break;
					}
					
				}
			}
		});
		btnResultado.setBounds(61, 147, 89, 23);
		contentPane.add(btnResultado);
		
		JButton btnCe = new JButton("ce");
		btnCe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num="";
				acumulador=0;
				operacion='n';
				txtResultado.setText(num);
			}
		});
		btnCe.setBounds(160, 147, 89, 23);
		contentPane.add(btnCe);
	}
}
