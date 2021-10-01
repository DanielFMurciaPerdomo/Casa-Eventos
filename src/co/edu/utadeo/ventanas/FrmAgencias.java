package co.edu.utadeo.ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import co.edu.utadeo.modelos.Agencia;
import co.edu.utadeo.modelos.AppEvento;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmAgencias extends JFrame {

	private JPanel contentPane;

	private static AppEvento event = new AppEvento();
	private JLabel lblEspacioEmail;
	private JLabel lblImagenAgencia;
	private JLabel lblNombreAgencia; 
	private	JLabel lblEspacioDueno;
	private JLabel lblEspacioSede;
	private JLabel lblespacioCodigo;
	private JLabel lblEspacioFecha;
	private int i = 0;

	public static FrmModelo mode = new FrmModelo();
	public static String pasp = mode.pasp; 


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmAgencias frame = new FrmAgencias();
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
	public FrmAgencias() {
		event.cargarAgencia();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1400, 700);
		setTitle("Casa de Eventos: "+"\"The Star Rover\"");
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblTituloAgencia = new JLabel("Agencias de Modelos");
		lblTituloAgencia.setForeground(Color.WHITE);
		lblTituloAgencia.setFont(new Font("Stealdream", Font.PLAIN, 75));
		lblTituloAgencia.setBounds(331, 0, 615, 138);
		contentPane.add(lblTituloAgencia);

		lblImagenAgencia = new JLabel("ImagenAgencia");
		lblImagenAgencia.setIcon(new ImageIcon("Imagenes/logoAgencia1.png"));
		lblImagenAgencia.setBounds(143, 188, 450, 350);
		contentPane.add(lblImagenAgencia);

		JLabel lblFondoColorido = new JLabel("New label");
		lblFondoColorido.setIcon(new ImageIcon("Imagenes/fondo.jpg"));
		lblFondoColorido.setBounds(0, 0, 1386, 149);
		contentPane.add(lblFondoColorido);

		

		lblNombreAgencia = new JLabel("TituloAgencia");
		lblNombreAgencia.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombreAgencia.setFont(new Font("Stealdream", Font.PLAIN, 50));
		lblNombreAgencia.setBounds(47, 548, 498, 61);
		contentPane.add(lblNombreAgencia);

		JLabel lblSede = new JLabel("Pa\u00EDs Sede:");
		lblSede.setFont(new Font("Stealdream", Font.PLAIN, 50));
		lblSede.setBounds(698, 225, 178, 61);
		contentPane.add(lblSede);

		JLabel lblCodigo = new JLabel("C\u00F3digo:");
		lblCodigo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCodigo.setFont(new Font("Stealdream", Font.PLAIN, 50));
		lblCodigo.setBounds(708, 301, 160, 61);
		contentPane.add(lblCodigo);

		JLabel lblFechaCreacion = new JLabel("Fecha Creaci\u00F3n:");
		lblFechaCreacion.setFont(new Font("Stealdream", Font.PLAIN, 46));
		lblFechaCreacion.setBounds(631, 372, 238, 61);
		contentPane.add(lblFechaCreacion);

		JLabel lblNombreDuenoTitulo = new JLabel("Due\u00F1o:");
		lblNombreDuenoTitulo.setFont(new Font("Stealdream", Font.PLAIN, 50));
		lblNombreDuenoTitulo.setBounds(748, 148, 128, 61);
		contentPane.add(lblNombreDuenoTitulo);

		JLabel lblEmailTitulo = new JLabel("E-mail:");
		lblEmailTitulo.setFont(new Font("Stealdream", Font.PLAIN, 50));
		lblEmailTitulo.setBounds(738, 443, 130, 63);
		contentPane.add(lblEmailTitulo);

		

		lblEspacioDueno = new JLabel("EspacioNombre");
		lblEspacioDueno.setFont(new Font("Stealdream", Font.PLAIN, 50));
		lblEspacioDueno.setBounds(878, 146, 498, 63);
		contentPane.add(lblEspacioDueno);

		lblEspacioSede = new JLabel("EspacioPais");
		lblEspacioSede.setFont(new Font("Stealdream", Font.PLAIN, 50));
		lblEspacioSede.setBounds(878, 223, 508, 63);
		contentPane.add(lblEspacioSede);

		lblespacioCodigo = new JLabel("EspacioCodigo");
		lblespacioCodigo.setFont(new Font("Stealdream", Font.PLAIN, 50));
		lblespacioCodigo.setBounds(878, 299, 508, 63);
		contentPane.add(lblespacioCodigo);

		lblEspacioFecha = new JLabel("EspacioFechaCreacion");
		lblEspacioFecha.setFont(new Font("Stealdream", Font.PLAIN, 50));
		lblEspacioFecha.setBounds(879, 370, 508, 63);
		contentPane.add(lblEspacioFecha);

		lblEspacioEmail = new JLabel("EspacioEmail");
		lblEspacioEmail.setFont(new Font("Stealdream", Font.PLAIN, 50));
		lblEspacioEmail.setBounds(878, 443, 508, 63);
		contentPane.add(lblEspacioEmail);

		JButton btnNewButton = new JButton("Atras");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				FrmModelo m = new FrmModelo();
				m.setLocationRelativeTo(null);
				m.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Stealdream", Font.BOLD, 75));
		btnNewButton.setBounds(1102, 558, 203, 71);
		contentPane.add(btnNewButton);

		mostrarAgencias(mode.getPasp());

	}
	public void mostrarAgencias(String i) {
		for(Agencia agencia: event.lstAgencias) {
			if(agencia.getCodmodelo().equals(i)) {
				lblNombreAgencia.setText(agencia.getNombre());
				lblEspacioDueno.setText(agencia.getNameOwner());
				lblEspacioSede.setText(agencia.getSede());
				lblespacioCodigo.setText(agencia.getCodigo());
				lblEspacioFecha.setText(agencia.getYearCreation());
				lblEspacioEmail.setText(agencia.getEmail());
				lblImagenAgencia.setIcon(new ImageIcon(agencia.getFoto()));			
			}
		}
	}
	
	
}

