import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.JList;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GestorJugadoresUI extends JFrame {

	private JPanel contentPane;
	private GestorJugadores gj=new GestorJugadores();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GestorJugadoresUI frame = new GestorJugadoresUI();
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
	public GestorJugadoresUI() {
		setTitle("Lista de Jugadores");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JList lstJugadores = new JList();
		lstJugadores.setBounds(30, 22, 377, 165);
		contentPane.add(lstJugadores);
		lstJugadores.setModel(gj.getJugador());
		
		
		JButton btnNuevo = new JButton("Nuevo");
		btnNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JugadorEditUI frmJugon=new JugadorEditUI();
				frmJugon.setGestorJugadores(gj);
				frmJugon.setVisible(true);
			}
		});
		btnNuevo.setBounds(10, 200, 89, 23);
		contentPane.add(btnNuevo);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ind=lstJugadores.getSelectedIndex();
				if(ind>=0){
				JugadorEditUI frmJugon=new JugadorEditUI();
				frmJugon.setGestorJugadores(gj);
				frmJugon.setIndJugador(ind);
				frmJugon.setVisible(true);
				}
			}
		});
		btnEditar.setBounds(115, 200, 89, 23);
		contentPane.add(btnEditar);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ind=lstJugadores.getSelectedIndex();
				if(ind>=0){
				gj.delJugador(ind);
				}
			}
		});
		btnEliminar.setBounds(226, 200, 89, 23);
		contentPane.add(btnEliminar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnSalir.setBounds(335, 200, 89, 23);
		contentPane.add(btnSalir);
	}
}
