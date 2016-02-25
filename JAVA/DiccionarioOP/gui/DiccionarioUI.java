package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import diccionario.Diccionario;
import diccionario.Palabra;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;

public class DiccionarioUI extends JFrame {

	private JPanel contentPane;
	private JTextField txtBuscar;
	private JTextField txtSignificado;
	private JList lstBusqueda;
	
	//objeto diccionario para trabajar con las palabras
	private Diccionario d=new Diccionario();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DiccionarioUI frame = new DiccionarioUI();
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
	public DiccionarioUI() {
		//cargar las palabras del fichero al diccionario
		d.leer();
		
		setTitle("Diccionario");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 373);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBuscar = new JLabel("Buscar:");
		lblBuscar.setBounds(10, 11, 46, 14);
		contentPane.add(lblBuscar);
		
		txtBuscar = new JTextField();
		txtBuscar.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				txtBuscarPulsarTecla();
				
			}
		});
		txtBuscar.setBounds(10, 36, 86, 20);
		contentPane.add(txtBuscar);
		txtBuscar.setColumns(10);
		
		JLabel lblPalabras = new JLabel("Palabras:");
		lblPalabras.setBounds(10, 67, 46, 14);
		contentPane.add(lblPalabras);
		
		lstBusqueda = new JList();
		lstBusqueda.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent arg0) {
				lstBusquedaClick();
			}
		});
		
		lstBusqueda.setBounds(10, 90, 86, 101);
		contentPane.add(lstBusqueda);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.setBounds(106, 87, 89, 23);
		contentPane.add(btnModificar);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnEliminarClick();
			}
		});
		btnEliminar.setBounds(106, 121, 89, 23);
		contentPane.add(btnEliminar);
		
		JLabel lblSignificado = new JLabel("Significado:");
		lblSignificado.setBounds(10, 202, 86, 14);
		contentPane.add(lblSignificado);
		
		txtSignificado = new JTextField();
		txtSignificado.setColumns(10);
		txtSignificado.setBounds(10, 227, 185, 20);
		contentPane.add(txtSignificado);
	}

	//metodo q se ejecuta al escribir algo en el txtBuscar
	private void txtBuscarPulsarTecla(){
		//pedir al diccionario q devuelva las pals q empiezan 
		//con lo escrito en txtBuscar
		//if(!txtBuscar.getText().equals("")){
			//cargar el jlist con las palabras
			lstBusqueda.setModel(d.getPalabras(txtBuscar.getText()));
			//si hay palabras en la lista
			if(lstBusqueda.getModel().getSize()>0){
				//seleccionamos el primer elemento
				lstBusqueda.setSelectedIndex(0);
			}
			
		//}
		
	}
	//metodo q se ejecuta cuando se selecciona una pal en la lista
	private void lstBusquedaClick(){
	//obtener la pal seleccionada en la lista
		Palabra p=(Palabra)lstBusqueda.getSelectedValue();
	//mostrar el significado de dicha palabra
		if (p!=null){
			txtSignificado.setText(p.getSignificado());
		}
		
	}
	//metodo q se llama al pulsar el btn eliminar
	private void btnEliminarClick(){
		//obtener la pal seleccionada en la lista
		Palabra p=(Palabra)lstBusqueda.getSelectedValue();
		//eliminar dicha palabra del diccionario-de memoria
		d.delPalabra(p);
		//guardarmos los cambios en el fichero
		d.guardar();
		
		//recargar el jList
		txtBuscarPulsarTecla();

	}
}
