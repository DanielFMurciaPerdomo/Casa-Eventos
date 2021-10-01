package co.edu.utadeo.ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmDentroDesfile extends JFrame {

	private JPanel contentPane;
	public static FrmEventos ev = new FrmEventos();
	
	public static FrmDesfile des = new FrmDesfile();
	public static int codDesDef = des.codigoDesfile; 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmDentroDesfile frame = new FrmDentroDesfile();
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
	public FrmDentroDesfile() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1400, 700);
		setTitle("Casa de Eventos: "+"\"The Star Rover\"");
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnBack = new JButton("Atr\u00E1s");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				FrmDesfile p = new FrmDesfile();
				p.setLocationRelativeTo(null);
				p.setVisible(true);
			}
		});
		btnBack.setFont(new Font("Stealdream", Font.PLAIN, 20));
		btnBack.setBounds(653, 629, 125, 34);
		contentPane.add(btnBack);
		
		JLabel lblArtistaTitle = new JLabel("Artistas");
		lblArtistaTitle.setForeground(new Color(204, 204, 255));
		lblArtistaTitle.setFont(new Font("Stealdream", Font.PLAIN, 67));
		lblArtistaTitle.setBounds(1133, 558, 209, 59);
		contentPane.add(lblArtistaTitle);
		
		JLabel lblArtistasSombra = new JLabel("Artistas");
		lblArtistasSombra.setForeground(new Color(0, 0, 0));
		lblArtistasSombra.setFont(new Font("Stealdream", Font.PLAIN, 67));
		lblArtistasSombra.setBounds(1135, 558, 209, 59);
		contentPane.add(lblArtistasSombra);
		
		JLabel lblModelosTitle = new JLabel("Modelos");
		lblModelosTitle.setForeground(new Color(230, 230, 250));
		lblModelosTitle.setFont(new Font("Stealdream", Font.PLAIN, 67));
		lblModelosTitle.setBounds(787, 558, 186, 59);
		contentPane.add(lblModelosTitle);
		
		JLabel lblModelosSombra = new JLabel("Modelos");
		lblModelosSombra.setForeground(new Color(0, 0, 0));
		lblModelosSombra.setFont(new Font("Stealdream", Font.PLAIN, 67));
		lblModelosSombra.setBounds(789, 558, 195, 59);
		contentPane.add(lblModelosSombra);
		
		JLabel lblPabellonTitle = new JLabel("Pabell\u00F3n");
		lblPabellonTitle.setForeground(new Color(224, 255, 255));
		lblPabellonTitle.setFont(new Font("Stealdream", Font.PLAIN, 67));
		lblPabellonTitle.setBounds(422, 558, 218, 59);
		contentPane.add(lblPabellonTitle);
		
		JLabel lblSombraPabellon = new JLabel("Pabell\u00F3n");
		lblSombraPabellon.setForeground(new Color(0, 0, 0));
		lblSombraPabellon.setFont(new Font("Stealdream", Font.PLAIN, 67));
		lblSombraPabellon.setBounds(424, 555, 253, 64);
		contentPane.add(lblSombraPabellon);
		
		JLabel lblSombraDisenador = new JLabel("Dise\u00F1ador");
		lblSombraDisenador.setForeground(new Color(240, 255, 240));
		lblSombraDisenador.setFont(new Font("Stealdream", Font.PLAIN, 67));
		lblSombraDisenador.setBounds(47, 555, 274, 64);
		contentPane.add(lblSombraDisenador);
		
		JLabel lblDisenadorTitle = new JLabel("Dise\u00F1ador");
		lblDisenadorTitle.setForeground(new Color(0, 0, 0));
		lblDisenadorTitle.setFont(new Font("Stealdream", Font.PLAIN, 67));
		lblDisenadorTitle.setBounds(49, 555, 283, 64);
		contentPane.add(lblDisenadorTitle);
		
		JLabel lblImagenDisenador = new JLabel("imagenDisenador");
		lblImagenDisenador.setFont(new Font("Tahoma", Font.PLAIN, 39));
		lblImagenDisenador.setForeground(Color.WHITE);
		lblImagenDisenador.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				guardarCod();
				dispose();
				FrmDisenador p = new FrmDisenador();
				p.setLocationRelativeTo(null);
				p.setVisible(true);
			}
		});
		lblImagenDisenador.setIcon(new ImageIcon("Imagenes/Disenadores.jpg"));
		lblImagenDisenador.setBounds(0, 0, 353, 552);
		contentPane.add(lblImagenDisenador);
		
		JLabel lblImagenPabellon = new JLabel("ImagenPabellon");
		lblImagenPabellon.setForeground(Color.WHITE);
		lblImagenPabellon.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				guardarCod();
				dispose();
				FrmPabellon p = new FrmPabellon();
				p.setLocationRelativeTo(null);
				p.setVisible(true);
			}
		});
		lblImagenPabellon.setIcon(new ImageIcon("Imagenes/pabellon1.jpg"));
		lblImagenPabellon.setBounds(352, 0, 338, 552);
		contentPane.add(lblImagenPabellon);
		
		JLabel lblImagenModelos = new JLabel("ImagenModelos");
		lblImagenModelos.setForeground(Color.WHITE);
		lblImagenModelos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				guardarCod();
				dispose();
				FrmModelo p = new FrmModelo();
				p.setLocationRelativeTo(null);
				p.setVisible(true);
			}
		});
		lblImagenModelos.setIcon(new ImageIcon("Imagenes/modelos1.jpg"));
		lblImagenModelos.setBounds(712, 0, 338, 552);
		contentPane.add(lblImagenModelos);
		
		JLabel lblImagenArtistas = new JLabel("ImagenArtistas");
		lblImagenArtistas.setForeground(Color.WHITE);
		lblImagenArtistas.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				guardarCod();
				dispose();
				FrmArtista n = new FrmArtista();
				n.setLocationRelativeTo(null);
				n.setVisible(true);
			}
		});
		lblImagenArtistas.setIcon(new ImageIcon("Imagenes/musicos1.jpg"));
		lblImagenArtistas.setBounds(1048, 0, 338, 552);
		contentPane.add(lblImagenArtistas);
		
		JLabel lblDivisionRosa = new JLabel("DivisionRosa");
		lblDivisionRosa.setIcon(new ImageIcon("Imagenes/fondo.jpg"));
		lblDivisionRosa.setBounds(689, 0, 25, 552);
		contentPane.add(lblDivisionRosa);
		
		JLabel lblfondoInferior = new JLabel("FondoInferior");
		lblfondoInferior.setIcon(new ImageIcon("Imagenes/fondo.jpg"));
		lblfondoInferior.setBounds(0, 547, 1386, 116);
		contentPane.add(lblfondoInferior);
	}
	
	public void guardarCod() {
		codDesDef = des.codigoDesfile;
	}
}