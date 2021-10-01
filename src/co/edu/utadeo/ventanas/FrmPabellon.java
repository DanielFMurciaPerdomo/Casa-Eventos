package co.edu.utadeo.ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import co.edu.utadeo.modelos.AppEvento;
import co.edu.utadeo.modelos.Empleado;
import co.edu.utadeo.modelos.Pabellon;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmPabellon extends JFrame {

	private JPanel contentPane;
	private JLabel lblFotoPabellon;
	private JLabel lblNombre;
	private JLabel lblTelefono;
	private JLabel lblEmpNombre;
	private JLabel lblCarneEmp;

	private static AppEvento event = new AppEvento();
	public static FrmDentroDesfile des = new FrmDentroDesfile();

	private int codDes = des.codDesDef;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmPabellon frame = new FrmPabellon();
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
	public FrmPabellon() {
		
		event.cargarPabellon();
		event.cargarEmpleados();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1400, 700);
		setTitle("Casa de Eventos: "+"\"The Star Rover\"");
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);


		lblFotoPabellon = new JLabel("Foto Pabellon");
		lblFotoPabellon.setBounds(53, 112, 600, 425);
		contentPane.add(lblFotoPabellon);

		JLabel lblNewLabel = new JLabel("Nombre:");
		lblNewLabel.setFont(new Font("Stealdream", Font.PLAIN, 40));
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setBounds(833, 112, 140, 47);
		contentPane.add(lblNewLabel);

		lblNombre = new JLabel("EspacioNombre");
		lblNombre.setFont(new Font("Stealdream", Font.PLAIN, 40));
		lblNombre.setBounds(983, 112, 391, 47);
		contentPane.add(lblNombre);

		JLabel lblNewLabel_1 = new JLabel("Telefono:");
		lblNewLabel_1.setFont(new Font("Stealdream", Font.PLAIN, 40));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setBounds(833, 192, 140, 47);
		contentPane.add(lblNewLabel_1);

		lblTelefono = new JLabel("EspacioTelefono");
		lblTelefono.setFont(new Font("Stealdream", Font.PLAIN, 40));
		lblTelefono.setBounds(983, 192, 391, 47);
		contentPane.add(lblTelefono);

		JLabel lblNewLabel_2 = new JLabel("Nombre Empleado:");
		lblNewLabel_2.setFont(new Font("Stealdream", Font.PLAIN, 40));
		lblNewLabel_2.setBounds(718, 265, 255, 47);
		contentPane.add(lblNewLabel_2);

		lblEmpNombre = new JLabel("EspacioEmp");
		lblEmpNombre.setFont(new Font("Stealdream", Font.PLAIN, 40));
		lblEmpNombre.setBounds(983, 265, 391, 47);
		contentPane.add(lblEmpNombre);

		JLabel lbl = new JLabel("Carne Empleado:");
		lbl.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl.setFont(new Font("Stealdream", Font.PLAIN, 40));
		lbl.setBounds(718, 323, 255, 47);
		contentPane.add(lbl);

		lblCarneEmp = new JLabel("EspacioCarne");
		lblCarneEmp.setFont(new Font("Stealdream", Font.PLAIN, 40));
		lblCarneEmp.setBounds(983, 323, 391, 47);
		contentPane.add(lblCarneEmp);

		JButton btnNewButton = new JButton("Volver");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				FrmDentroDesfile p = new FrmDentroDesfile();
				p.setLocationRelativeTo(null);
				p.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Stealdream", Font.PLAIN, 40));
		btnNewButton.setBounds(834, 449, 298, 90);
		contentPane.add(btnNewButton);

		JLabel lblFondo = new JLabel("Fondo");
		lblFondo.setIcon(new ImageIcon("Imagenes/fondo.jpg"));
		lblFondo.setBounds(0, 0, 680, 661);
		contentPane.add(lblFondo);

		mostrarPabellon(codDes);
	}

	public void mostrarPabellon(int i) {
		for(Pabellon p: event.lstPabellon) {
			if(p.getCodDesfile()==i) {
				lblFotoPabellon.setIcon(new ImageIcon(p.getFoto()));
				lblCarneEmp.setText(buscarEmp(p).getCarne());
				lblEmpNombre.setText(buscarEmp(p).getNombre());
				lblTelefono.setText(p.getTelefono());
				lblNombre.setText(p.getNombre());
			}
			
		}
	}
	
	public Empleado buscarEmp(Pabellon p) {
		for(Empleado m:event.lstEmpleado) {
			if(p.getCodEmp().equals(m.getCarne())) {
				return m;
			}
		}
		return null;
	}
} 
