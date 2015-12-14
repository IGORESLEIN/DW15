import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GestorAsignaturasUI extends JFrame {

	private GestorAsignaturas ga=new GestorAsignaturas();
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GestorAsignaturasUI frame = new GestorAsignaturasUI();
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
	public GestorAsignaturasUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JList lstAsignaturas = new JList();
		lstAsignaturas.setModel(ga.getAsignatura());
		lstAsignaturas.setBounds(40, 23, 350, 183);
		contentPane.add(lstAsignaturas);
		
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int ind=lstAsignaturas.getSelectedIndex();
				if(ind>=0){
				ga.delAsignatura(ind);
				}
			}
		});
		btnEliminar.setBounds(26, 217, 89, 23);
		contentPane.add(btnEliminar);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ind=lstAsignaturas.getSelectedIndex();
				if(ind>=0){
				AsignaturaUI frmAsig=new AsignaturaUI(ga);
				frmAsig.setIndAsig(ind);
				frmAsig.setVisible(true);
				}
			}
		});
		btnEditar.setBounds(125, 217, 89, 23);
		contentPane.add(btnEditar);
		
		JButton btnNuevo = new JButton("Nuevo");
		btnNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AsignaturaUI frmAsig=new AsignaturaUI(ga);
				frmAsig.setVisible(true);
			}
		});
		btnNuevo.setBounds(224, 217, 89, 23);
		contentPane.add(btnNuevo);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnSalir.setBounds(323, 217, 89, 23);
		contentPane.add(btnSalir);
		
		JLabel lblAsignaturas = new JLabel("Asignaturas");
		lblAsignaturas.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblAsignaturas.setBounds(180, -2, 89, 23);
		contentPane.add(lblAsignaturas);
	}
}
