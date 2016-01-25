import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class DiccionarioUI extends JFrame {

	private JPanel contentPane;
	private JTextField txtPalabra;
	private ArrayList<String> lstPalabras=new ArrayList<String>();
	private JTextField txtMensaje;

	
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
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 330, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPalabra = new JLabel("Palabra:");
		lblPalabra.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPalabra.setBounds(75, 40, 55, 21);
		contentPane.add(lblPalabra);
		
		txtPalabra = new JTextField();
		txtPalabra.setBounds(162, 41, 86, 20);
		contentPane.add(txtPalabra);
		txtPalabra.setColumns(10);
		
		JButton btnAadir = new JButton("A\u00F1adir");
		btnAadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnAñadirClik();
			}
		});
		btnAadir.setBounds(10, 85, 89, 23);
		contentPane.add(btnAadir);
		
		JButton btnImprimir = new JButton("Imprimir");
		btnImprimir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnImprimirClik();
			}
		});
		btnImprimir.setBounds(109, 85, 89, 23);
		contentPane.add(btnImprimir);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnGuardarClik();
			}
		});
		btnGuardar.setBounds(208, 85, 89, 23);
		contentPane.add(btnGuardar);
		
		txtMensaje = new JTextField();
		txtMensaje.setEditable(false);
		txtMensaje.setBounds(10, 116, 287, 135);
		contentPane.add(txtMensaje);
		txtMensaje.setColumns(10);
		
		//leer fichero
		leerFichero();
	}
	
	public void btnAñadirClik(){
		boolean introducido=false;
		for(int i=0;i<lstPalabras.size();i++){
			if(lstPalabras.get(i).equals(txtPalabra.getText())){
				txtMensaje.setText(txtPalabra.getText()+" esta introducida");
				introducido=true;
			}
		}
		if(introducido==false){
		lstPalabras.add(txtPalabra.getText());
		txtPalabra.setText("");
		txtPalabra.requestFocus();
		}
	}
	public void btnImprimirClik(){
		String lstPals="";
		for(int i=0;i<lstPalabras.size();i++){
			lstPals=lstPals+(char)10+(char)13+lstPalabras.get(i);
        }
		txtMensaje.setText(lstPals);
		
	}
	public void btnGuardarClik(){
		 FileWriter fichero = null;
	     PrintWriter pw = null;
	        try
	        {
	            fichero = new FileWriter("palabras.txt");
	            pw = new PrintWriter(fichero);
	            for(int i=0;i<lstPalabras.size();i++){
		            pw.println(lstPalabras.get(i));
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
	           fichero = new FileReader("palabras.txt");
	           pw = new BufferedReader(fichero);
	           //leer una línea del fichero de texto
	           String linea=pw.readLine();
	           //mientras haya leido la palabra
	           while (linea!=null){
	        	   //añadir palabras al array
	        	   String palabra=linea;
	        	   lstPalabras.add(palabra);
	        	   linea=pw.readLine();
	           }

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
