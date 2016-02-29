import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSpinner;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class CandadoUI extends JFrame {

	private JPanel contentPane;
	private JSpinner spinner;
	private JSpinner spinner_1;
	private JSpinner spinner_2;
	private JLabel lblMensaje;
	private ICandado miCandado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CandadoUI frame = new CandadoUI();
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
	public CandadoUI() {
		//creamos un candado
		miCandado=new CandadoAlfa("123");
		setTitle("Entrada");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 251, 254);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		spinner = new JSpinner();
		spinner.setFont(new Font("Tahoma", Font.PLAIN, 18));
		spinner.setBounds(34, 64, 43, 20);
		contentPane.add(spinner);
		
		spinner_1 = new JSpinner();
		spinner_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		spinner_1.setBounds(87, 64, 47, 20);
		contentPane.add(spinner_1);
		
		spinner_2 = new JSpinner();
		spinner_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		spinner_2.setBounds(144, 64, 40, 20);
		contentPane.add(spinner_2);
		
		JButton btnAbrir = new JButton("Abrir");
		btnAbrir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnAbrirClick();
			}
		});
		btnAbrir.setBounds(10, 108, 89, 23);
		contentPane.add(btnAbrir);
		
		JButton btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnCerrarClick();
			}
		});
		btnCerrar.setBounds(109, 108, 89, 23);
		contentPane.add(btnCerrar);
		
		lblMensaje = new JLabel("");
		lblMensaje.setBounds(10, 137, 188, 46);
		contentPane.add(lblMensaje);
	}
private void btnAbrirClick(){
	//coger los números de los spinners
	int centenas=((Integer)spinner.getValue()).intValue();
	int decenas=((Integer)spinner_1.getValue()).intValue();
	int unidades=((Integer)spinner_2.getValue()).intValue();
	int clave=centenas*100+decenas*10+unidades;
	//llamar al método abrir del candado
	if(miCandado.abrir(clave)){
		lblMensaje.setText("Candado Abierto");
	}else{
		lblMensaje.setText("Error!!");
	}
}
private void btnCerrarClick(){
	//llamar al método cerrar del candado
		if(miCandado.cerrar()){
			lblMensaje.setText("Candado Cerrado");
		}else{
			lblMensaje.setText("Error!!");
		}
}

//método que permite cambiar de candado
private void setCandado(ICandado c){
	miCandado=c;
}
}
