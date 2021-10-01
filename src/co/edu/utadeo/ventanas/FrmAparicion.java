package co.edu.utadeo.ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import co.edu.utadeo.modelos.Aparicion;
import co.edu.utadeo.modelos.AppEvento;
import co.edu.utadeo.modelos.Historico;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FrmAparicion extends JFrame {

	private JPanel contentPane;
	private JLabel lblModelo;
	private JLabel lblDesfile;
	private JLabel lblInferior;
	private JLabel lblSuperior;
	private int i =0;
	
	private static AppEvento event = new AppEvento();
	
	private ArrayList<Aparicion> lstAp = new ArrayList<Aparicion>();

	public static FrmModelo mode = new FrmModelo();
	public static String pasp = mode.pasp; 
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmAparicion frame = new FrmAparicion();
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
	public FrmAparicion() {
		
		event.cargarApariciones();
		crearLstAp(mode.getPasp());
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Casa de Eventos: "+"\"The Star Rover\"");
		setBounds(100, 100, 1400, 700);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPrendas = new JLabel("");
		lblPrendas.setBounds(438, 377, 560, 270);
		lblPrendas.setIcon(new ImageIcon("Imagenes/Prendas.jpg"));
		contentPane.add(lblPrendas);
		
		JLabel lblRopa = new JLabel("Prendas Utilizadas");
		lblRopa.setBounds(404, 0, 637, 68);
		lblRopa.setHorizontalAlignment(SwingConstants.CENTER);
		lblRopa.setFont(new Font("Stealdream", Font.PLAIN, 60));
		contentPane.add(lblRopa);
		
		JButton btnBack = new JButton("Volver");
		btnBack.setBounds(10, 593, 261, 57);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				FrmModelo a = new FrmModelo();
				a.setLocationRelativeTo(null);
				a.setVisible(true);
			}
		});
		btnBack.setFont(new Font("Stealdream", Font.PLAIN, 50));
		contentPane.add(btnBack);
		
		lblSuperior = new JLabel("Parte Superior:");
		lblSuperior.setHorizontalAlignment(SwingConstants.CENTER);
		lblSuperior.setFont(new Font("Stealdream", Font.PLAIN, 40));
		lblSuperior.setBounds(10, 94, 1319, 46);
		contentPane.add(lblSuperior);
		
		lblInferior = new JLabel("Parte Inferior:");
		lblInferior.setHorizontalAlignment(SwingConstants.CENTER);
		lblInferior.setFont(new Font("Stealdream", Font.PLAIN, 40));
		lblInferior.setBounds(10, 151, 1319, 57);
		contentPane.add(lblInferior);
		
		lblDesfile = new JLabel("Desfile: ");
		lblDesfile.setHorizontalAlignment(SwingConstants.CENTER);
		lblDesfile.setFont(new Font("Stealdream", Font.PLAIN, 40));
		lblDesfile.setBounds(10, 219, 1319, 57);
		contentPane.add(lblDesfile);
		
		lblModelo = new JLabel("Modelo:");
		lblModelo.setHorizontalAlignment(SwingConstants.CENTER);
		lblModelo.setFont(new Font("Stealdream", Font.PLAIN, 40));
		lblModelo.setBounds(10, 287, 1319, 46);
		contentPane.add(lblModelo);
		
		JLabel lblFondoIndum = new JLabel("");
		lblFondoIndum.setBounds(0, 0, 1384, 366);
		lblFondoIndum.setIcon(new ImageIcon("Imagenes/fondo.jpg"));
		contentPane.add(lblFondoIndum);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				i--;
				if(i<0)i=0;
				mostrarAp(i);
			}
		});
		lblNewLabel.setIcon(new ImageIcon("Imagenes/boton.jpg"));
		lblNewLabel.setBounds(10, 377, 170, 170);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				i++;
				if(i>lstAp.size()-1)i=0;
				mostrarAp(i);
			}
		});
		lblNewLabel_1.setIcon(new ImageIcon("Imagenes/boton1.jpg"));
		lblNewLabel_1.setBounds(1071, 377, 170, 170);
		contentPane.add(lblNewLabel_1);
		
		mostrarAp(0);
	}
	public void mostrarAp(int i) {
		Aparicion m = lstAp.get(i);
		lblSuperior.setText("Parte Superior: "+m.getArriba());
		lblInferior.setText("Parte Inferior: "+m.getAbajo());
		lblModelo.setText("Modelo: "+m.getModelo());
		lblDesfile.setText("Desfile: "+m.getDesfile());
	}
	public void crearLstAp(String a) {
		for(Aparicion h:event.lstApariciones) {
			if(h.getPasaporte().equals(a)) {
				lstAp.add(h);
			}
		}
	}
}
