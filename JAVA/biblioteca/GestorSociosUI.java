import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GestorSociosUI extends JFrame {


	private GestorSocios gs=new GestorSocios();
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GestorSociosUI frame = new GestorSociosUI();
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
	public GestorSociosUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 360, 230);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JList lstSocios = new JList();
		lstSocios.setBounds(22, 11, 183, 162);
		contentPane.add(lstSocios);
		lstSocios.setModel(gs.getSocios());
		
		JButton btnAadir = new JButton("A\u00F1adir");
		btnAadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AltaSociosUI frmSocios=new AltaSociosUI(gs);
				frmSocios.setVisible(true);
			}
		});
		btnAadir.setBounds(233, 8, 89, 23);
		contentPane.add(btnAadir);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int ind=lstSocios.getSelectedIndex();
				if(ind>=0){
				AltaSociosUI frmSocios=new AltaSociosUI(gs);
				frmSocios.setIndAsig(ind);
				frmSocios.setVisible(true);
				}
			}
		});
		btnModificar.setBounds(233, 51, 89, 23);
		contentPane.add(btnModificar);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(233, 97, 89, 23);
		contentPane.add(btnEliminar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setBounds(233, 144, 89, 23);
		contentPane.add(btnSalir);
	}
}
