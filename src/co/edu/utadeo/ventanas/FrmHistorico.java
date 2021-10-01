package co.edu.utadeo.ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import co.edu.utadeo.modelos.AppEvento;
import co.edu.utadeo.modelos.Historico;
import co.edu.utadeo.modelos.Modelo;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FrmHistorico extends JFrame {

	private JPanel contentPane;
	private JLabel lblNombre;
	private JLabel lblEstatura;
	private JLabel lblPeso;
	private JLabel lblBusto;
	private JLabel lblCintura;
	private JLabel lblCalzado;
	private JLabel lblAnio;
	private JTextPane lblParti;
	private int i=0;

	private static AppEvento event = new AppEvento();

	private ArrayList<Historico> lstHist = new ArrayList<Historico>();

	public static FrmModelo mode = new FrmModelo();
	public static String pasp = mode.pasp; 
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmHistorico frame = new FrmHistorico();
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
	public FrmHistorico() {

		event.cargarHistorico();
		crearLstHis(mode.getPasp());
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Casa de Eventos: "+"\"The Star Rover\"");
		setBounds(100, 100, 1400, 700);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Stealdream", Font.PLAIN, 40));
		lblNombre.setBounds(10, 78, 436, 59);
		contentPane.add(lblNombre);

		lblEstatura = new JLabel("Estatura:");
		lblEstatura.setFont(new Font("Stealdream", Font.PLAIN, 40));
		lblEstatura.setBounds(481, 148, 397, 59);
		contentPane.add(lblEstatura);

		lblPeso = new JLabel("Peso:");
		lblPeso.setFont(new Font("Stealdream", Font.PLAIN, 40));
		lblPeso.setBounds(10, 148, 301, 64);
		contentPane.add(lblPeso);

		JLabel lblParticularidades = new JLabel("Particularidades:");
		lblParticularidades.setFont(new Font("Stealdream", Font.PLAIN, 40));
		lblParticularidades.setBounds(985, 148, 230, 59);
		contentPane.add(lblParticularidades);

		lblBusto = new JLabel("Busto:");
		lblBusto.setFont(new Font("Stealdream", Font.PLAIN, 40));
		lblBusto.setBounds(10, 223, 282, 49);
		contentPane.add(lblBusto);

		lblCintura = new JLabel("Cintura:");
		lblCintura.setFont(new Font("Stealdream", Font.PLAIN, 40));
		lblCintura.setBounds(481, 78, 357, 59);
		contentPane.add(lblCintura);

		lblCalzado = new JLabel("Calzado:");
		lblCalzado.setFont(new Font("Stealdream", Font.PLAIN, 40));
		lblCalzado.setBounds(481, 218, 427, 49);
		contentPane.add(lblCalzado);

		JLabel lblFashion = new JLabel("");
		lblFashion.setIcon(new ImageIcon("Imagenes/fashion.png"));
		lblFashion.setBounds(529, 353, 552, 295);
		contentPane.add(lblFashion);

		JButton btnNewButton = new JButton("Volver");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				FrmModelo m = new FrmModelo();
				m.setLocationRelativeTo(null);
				m.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Stealdream", Font.PLAIN, 40));
		btnNewButton.setBounds(34, 563, 202, 59);
		contentPane.add(btnNewButton);

		JLabel lblNewLabel = new JLabel("Historico");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Stealdream", Font.PLAIN, 40));
		lblNewLabel.setBounds(481, 11, 421, 59);
		contentPane.add(lblNewLabel);

		lblAnio = new JLabel("A\u00F1o de los datos:");
		lblAnio.setFont(new Font("Stealdream", Font.PLAIN, 40));
		lblAnio.setBounds(985, 78, 389, 59);
		contentPane.add(lblAnio);

		JLabel lblIzq = new JLabel("Izquierda");
		lblIzq.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				i--;
				if(i<0) i=lstHist.size()-1;
				mostrarHist(i);
			}
		});
		lblIzq.setIcon(new ImageIcon("Imagenes/boton.jpg"));
		lblIzq.setBounds(34, 329, 170, 170);
		contentPane.add(lblIzq);

		JLabel lblDer = new JLabel("Derecha");
		lblDer.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				i++;
				if(i>lstHist.size()-1) i=0;
				mostrarHist(i);
			}
		});
		lblDer.setIcon(new ImageIcon("Imagenes/boton1.jpg"));
		lblDer.setBounds(214, 330, 170, 170);
		contentPane.add(lblDer);

		lblParti = new JTextPane();
		lblParti.setEditable(false);
		lblParti.setBounds(995, 212, 318, 80);
		contentPane.add(lblParti);

		JLabel lblFondoHistorico = new JLabel("");
		lblFondoHistorico.setIcon(new ImageIcon("Imagenes/fondo.jpg"));
		lblFondoHistorico.setBounds(0, 0, 1384, 319);
		contentPane.add(lblFondoHistorico);
		
		mostrarHist(0);
		
	}

	public void mostrarHist(int i) {
		Historico h = lstHist.get(i);
		if(h.getPasaporte().equals(mode.getPasp())) {
			lblNombre.setText("Pasaporte: "+h.getPasaporte());
			lblEstatura.setText("Estatura: "+h.getEstatura()+"cm");
			lblBusto.setText("Busto: "+h.getBusto()+"cm");
			lblCalzado.setText("Calzado: "+h.getCalzado());
			lblPeso.setText("Peso: "+h.getPeso()+"kg");
			lblParti.setText(h.getParticularidades());
			lblCintura.setText("Cintura: "+h.getCintura()+"cm");
			lblAnio.setText("Año de Creación: "+h.getAnio());

		}
	}

	public void crearLstHis(String a) {
		for(Historico h:event.lstHistorico) {
			if(h.getPasaporte().equals(a)) {
				lstHist.add(h);
			}
		}
	}
}
