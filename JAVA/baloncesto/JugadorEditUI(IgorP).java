import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSlider;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.JSpinner;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class JugadorEditUI extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtPuesto;
	private JTextField txtAltura;
	private ArrayList<Jugador> lstJugadores=new ArrayList<Jugador>();
	private JSpinner spinnerEdad;
	private JSlider slider;
	private JComboBox cmbJugadores;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("nombre:");
		lblNombre.setBounds(10, 23, 46, 14);
		contentPane.add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(80, 19, 147, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblPuesto = new JLabel("puesto:");
		lblPuesto.setBounds(10, 52, 46, 14);
		contentPane.add(lblPuesto);
		
		txtPuesto = new JTextField();
		txtPuesto.setColumns(10);
		txtPuesto.setBounds(80, 48, 147, 20);
		contentPane.add(txtPuesto);
		
		JLabel lblAltura = new JLabel("altura:");
		lblAltura.setBounds(10, 77, 46, 14);
		contentPane.add(lblAltura);
		
		txtAltura = new JTextField();
		txtAltura.setEditable(false);
		txtAltura.setColumns(10);
		txtAltura.setBounds(242, 82, 36, 20);
		contentPane.add(txtAltura);
		
		slider = new JSlider();
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				txtAltura.setText(String.valueOf(((JSlider)arg0.getSource()).getValue()));
			}
			
		});
		slider.setMaximum(250);
		slider.setMinimum(150);
		
		slider.setBounds(70, 79, 157, 23);
		contentPane.add(slider);
		
		JLabel lblEdad = new JLabel("edad:");
		lblEdad.setBounds(10, 105, 46, 14);
		contentPane.add(lblEdad);
		
		spinnerEdad = new JSpinner();
		spinnerEdad.setBounds(80, 102, 29, 20);
		contentPane.add(spinnerEdad);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnGuardarClick();
			}
		});
		btnGuardar.setBounds(121, 136, 89, 23);
		contentPane.add(btnGuardar);
		
		cmbJugadores = new JComboBox();
		cmbJugadores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				mostrarJugador(lstJugadores.get(cmbJugadores.getSelectedIndex()));
			}
		});
		
		cmbJugadores.setBounds(297, 34, 89, 20);
		contentPane.add(cmbJugadores);
		
		JLabel lblBuscar = new JLabel("Buscar:");
		lblBuscar.setBounds(297, 11, 46, 14);
		contentPane.add(lblBuscar);
		
		//cargar el jugador del fichero
		leerFichero();
		//cargar cmbJugadores
		cargarCmbJugadores();
	}
	
	//muestra los datos del jugador en la ventana
	private void mostrarJugador(Jugador j){
        txtNombre.setText(j.getNombre());
        txtPuesto.setText(j.getPuesto());
        slider.setValue(new Integer(j.getAltura()));
        spinnerEdad.setValue(new Integer(j.getEdad()));
	}
	private void cargarCmbJugadores(){
		DefaultComboBoxModel mJugadores= 
				new DefaultComboBoxModel(lstJugadores.toArray());
		cmbJugadores.setModel(mJugadores);
	}
	private void btnGuardarClick(){
		Jugador j=new Jugador();
		j.setNombre(txtNombre.getText());
		j.setPuesto(txtPuesto.getText());
		j.setAltura(Integer.parseInt(txtAltura.getText()));
		j.setEdad((Integer)(spinnerEdad.getValue()));
		lstJugadores.add(j);
		cargarCmbJugadores();
		cmbJugadores.setSelectedIndex(lstJugadores.size()-1);
		guardarFichero();
		
		
	}
	
	//guarda todos los jugadores del arrayList en un fichero
	private void guardarFichero(){
		 FileWriter fichero = null;
	     PrintWriter pw = null;
	        try
	        {
	            fichero = new FileWriter("jugadores.txt");
	            pw = new PrintWriter(fichero);
	            for(int i=0;i<lstJugadores.size();i++){
		            //guardar los datos del jugador
	            	Jugador j=lstJugadores.get(i);
		            pw.print(j.getNombre()+",");
		            pw.print(j.getPuesto()+",");
		            pw.print(j.getAltura()+",");
		            pw.println(j.getEdad());
	            }
	            
	 
	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	           try {
	           // Nuevamente aprovechamos el finally para 
	           // asegurarnos que se cierra el fichero.
	           if (null != fichero)
	              fichero.close();
	           } catch (Exception e2) {
	              e2.printStackTrace();
	           }
	        }
	    }
private void leerFichero(){
	FileReader fichero = null;
    BufferedReader pw = null;
       try
       {
    	   //abrir el fichero de texto de lectura
           fichero = new FileReader("jugadores.txt");
           pw = new BufferedReader(fichero);
           //leer una línea del fichero de texto
           String linea=pw.readLine();
           //mientras haya leido un jugador
           while (linea!=null){
        	   //crear un jugador con los datos
        	   String[] array=linea.split(",");
        	   Jugador j=new Jugador();
        	   j.setNombre(array[0]);
        	   j.setPuesto(array[1]);
        	   j.setAltura(Integer.parseInt(array[2]));
        	   j.setEdad(Integer.parseInt(array[3]));
        	   //añadirlo al array
        	   lstJugadores.add(j);
        	   linea=pw.readLine();
           }
           	
	           //mostrarlos en pantalla el primero
           		mostrarJugador(lstJugadores.get(0));

       }catch(FileNotFoundException e1){ 
    	   //no existe el fichero de lectura
    	   System.out.println("Fichero de lectura no encontrado");
       }catch (Exception e) {
           e.printStackTrace();
       } finally {
          try {
          // Nuevamente aprovechamos el finally para 
          // asegurarnos que se cierra el fichero.
          if (null != fichero)
             fichero.close();
          } catch (Exception e2) {
             e2.printStackTrace();
          }
       }

}
}
