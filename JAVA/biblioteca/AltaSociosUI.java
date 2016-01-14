import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AltaSociosUI extends JFrame {

	private JPanel contentPane;
	private JTextField txtDni;
	private JTextField txtNumSocio;
	private JTextField txtNombre;
	private JTextField txtDir;
	private JTextField txtTlfno;
	private int indSocio=-1;
	private GestorSocios gs;
	private JSpinner spinNumMaxPrest;


	

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AltaSociosUI frame = new AltaSociosUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	*/
	/**
	 * Create the frame.
	 */
	public AltaSociosUI(GestorSocios gs) {
		this.gs=gs;
		setTitle("Alta de Socios");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 336, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDni = new JLabel("dni:");
		lblDni.setBounds(10, 11, 46, 14);
		contentPane.add(lblDni);
		
		txtDni = new JTextField();
		txtDni.setBounds(112, 11, 86, 20);
		contentPane.add(txtDni);
		txtDni.setColumns(10);
		
		JLabel lblNumSocio = new JLabel("num Socio:");
		lblNumSocio.setBounds(10, 39, 92, 14);
		contentPane.add(lblNumSocio);
		
		txtNumSocio = new JTextField();
		txtNumSocio.setColumns(10);
		txtNumSocio.setBounds(112, 39, 86, 20);
		contentPane.add(txtNumSocio);
		
		JLabel lblNombre = new JLabel("nombre:");
		lblNombre.setBounds(10, 64, 92, 14);
		contentPane.add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(112, 64, 86, 20);
		contentPane.add(txtNombre);
		
		JLabel lblDireccin = new JLabel("direcci\u00F3n:");
		lblDireccin.setBounds(10, 92, 92, 14);
		contentPane.add(lblDireccin);
		
		txtDir = new JTextField();
		txtDir.setColumns(10);
		txtDir.setBounds(112, 92, 86, 20);
		contentPane.add(txtDir);
		
		JLabel lblTelfono = new JLabel("tel\u00E9fono:");
		lblTelfono.setBounds(10, 120, 92, 14);
		contentPane.add(lblTelfono);
		
		txtTlfno = new JTextField();
		txtTlfno.setColumns(10);
		txtTlfno.setBounds(112, 120, 86, 20);
		contentPane.add(txtTlfno);
		
		JLabel lblNummaxprest = new JLabel("numMaxPrest");
		lblNummaxprest.setBounds(10, 148, 92, 14);
		contentPane.add(lblNummaxprest);
		
		spinNumMaxPrest = new JSpinner();
		spinNumMaxPrest.setBounds(112, 145, 29, 20);
		contentPane.add(spinNumMaxPrest);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//comprobar los datos
				//crear un socio
				Socio soc=new Socio();
				//dar los valores introducidos a dicho socio
				soc.setDni(txtDni.getText());
				soc.setNumSocio(Integer.parseInt(txtNumSocio.getText()));
				soc.setNombre(txtNombre.getText());
				soc.setDireccion(txtDir.getText());
				soc.setTlfno(txtTlfno.getText()); 
				soc.setNumMaxPrest(((Integer)spinNumMaxPrest.getValue()).intValue());
				if(indSocio>=0){
					gs.modSocio(indSocio, soc);
				}
				else{
					gs.addSocio(soc);
				}
				dispose();
			
				
			}
		});
		btnAceptar.setBounds(13, 194, 89, 23);
		contentPane.add(btnAceptar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cerrarVentana();
			}
		});
		btnCancelar.setBounds(140, 194, 89, 23);
		contentPane.add(btnCancelar);
	}
	private void cerrarVentana(){
		this.dispose();
	}
	public void setIndSocio(int ind){
		this.indSocio=ind;
		Socio soc=gs.getSocio(ind);
		txtDni.setText(soc.getDni());
		txtNumSocio.setText(Integer.toString(soc.getNumSocio()));
		txtNombre.setText(soc.getNombre());
		txtDir.setText(soc.getDireccion());
		txtTlfno.setText(soc.getTlfno());	
		spinNumMaxPrest.setValue(1);
	}
}

