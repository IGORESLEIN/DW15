
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class JugadorEditUI extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtPuesto;
	private GestorJugadores gj;
	private int indJugador=-1;
	private JSlider sldAltura; 
	private JSpinner spinEdad;
	private JTextField txtAltura;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JugadorEditUI frame = new JugadorEditUI();
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
	public JugadorEditUI() {
		setTitle("Formulario de Jugadores");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 320, 210);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(30, 25, 46, 23);
		contentPane.add(lblNombre);
		
		JLabel lblPuesto = new JLabel("Puesto");
		lblPuesto.setBounds(30, 50, 46, 23);
		contentPane.add(lblPuesto);
		
		JLabel lblAltura = new JLabel("Altura");
		lblAltura.setBounds(30, 75, 46, 23);
		contentPane.add(lblAltura);
		
		JLabel lblEdad = new JLabel("Edad");
		lblEdad.setBounds(30, 100, 46, 23);
		contentPane.add(lblEdad);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(119, 22, 155, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtPuesto = new JTextField();
		txtPuesto.setBounds(119, 47, 155, 20);
		contentPane.add(txtPuesto);
		txtPuesto.setColumns(10);
		
		txtAltura = new JTextField();
		txtAltura.setBounds(227, 75, 47, 23);
		contentPane.add(txtAltura);
		txtAltura.setColumns(10);
		
		sldAltura = new JSlider();
		sldAltura.setMinimum(150);
		sldAltura.setMaximum(250);
		sldAltura.setBounds(119, 75, 98, 23);
		contentPane.add(sldAltura);
		sldAltura.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				txtAltura.setText(String.valueOf(((JSlider)arg0.getSource()).getValue()));
			}
		});
		
		spinEdad = new JSpinner();
		spinEdad.setBounds(119, 101, 73, 20);
		contentPane.add(spinEdad);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Jugador jugon=new Jugador();
				jugon.setNombre(txtNombre.getText());
				jugon.setPuesto(txtPuesto.getText());
				jugon.setAltura(sldAltura.getValue());
				jugon.setEdad(((Integer)spinEdad.getValue()).intValue());
				if(indJugador<0){
				gj.addJugador(jugon);
				}else{
				gj.modJugador(indJugador, jugon);
				}
				txtNombre.setText("");
				txtPuesto.setText("");
				sldAltura.setValue(0);
				spinEdad.setValue(18);
			}
		});
		btnAceptar.setBounds(30, 134, 98, 23);
		contentPane.add(btnAceptar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCancelar.setBounds(155, 132, 98, 23);
		contentPane.add(btnCancelar);
		

	}
	public void setGestorJugadores(GestorJugadores gj){
		this.gj=gj;
	}
	public void setIndJugador(int ind){
	this.indJugador=ind;
	Jugador jugon=gj.getJugador(ind);
	txtNombre.setText(jugon.getNombre());
	txtPuesto.setText(jugon.getPuesto());
	txtAltura.setText("150");
	sldAltura.setValue(jugon.getAltura());
	spinEdad.setValue(new Integer(jugon.getEdad()));
	}
	
}
