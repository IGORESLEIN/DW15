import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AsignaturaUI extends JFrame {

	private JPanel contentPane;
	private final JLabel lblCodigo = new JLabel("Codigo:");
	private JTextField txtCodigo;
	private JTextField txtNombre;
	private JTextField txtHoras;
	
	private GestorAsignaturas ga;
	private int indAsig=-1;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AsignaturaUI frame = new AsignaturaUI();
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
	public AsignaturaUI(GestorAsignaturas ga) {
		this.ga=ga;
		setBounds(100, 100, 320, 260);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		lblCodigo.setHorizontalAlignment(SwingConstants.LEFT);
		lblCodigo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCodigo.setBounds(45, 40, 98, 31);
		contentPane.add(lblCodigo);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNombre.setHorizontalAlignment(SwingConstants.LEFT);
		lblNombre.setBounds(45, 82, 98, 31);
		contentPane.add(lblNombre);
		
		JLabel lblHoras = new JLabel("Horas:");
		lblHoras.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblHoras.setBounds(45, 124, 98, 31);
		contentPane.add(lblHoras);
		
		txtCodigo = new JTextField();
		txtCodigo.setBounds(153, 40, 98, 31);
		contentPane.add(txtCodigo);
		txtCodigo.setColumns(10);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(153, 82, 98, 31);
		contentPane.add(txtNombre);
		
		txtHoras = new JTextField();
		txtHoras.setColumns(10);
		txtHoras.setBounds(153, 124, 98, 31);
		contentPane.add(txtHoras);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!(txtCodigo.equals("") && txtNombre.equals("") && txtHoras.equals(""))){
					
					Asignatura a=new Asignatura(txtNombre.getText());
					a.setCodigo(txtCodigo.getText());
					a.setHoras(Integer.parseInt(txtHoras.getText()));
					if(indAsig>=0){
						ga.modAsignatura(indAsig, a);
					}
					else{
						ga.addAsignatura(a);
					}
					dispose();
					
				}
			}
		});
		btnAceptar.setBounds(54, 178, 89, 23);
		contentPane.add(btnAceptar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(153, 178, 89, 23);
		contentPane.add(btnCancelar);
	}
	public void setIndAsig(int ind){
		this.indAsig=ind;
		Asignatura a=ga.getAsignatura(ind);
		txtNombre.setText(a.getNombre());
		txtHoras.setText(Integer.toString(a.getHoras()));
		txtCodigo.setText(a.getCodigo());
	}
}
