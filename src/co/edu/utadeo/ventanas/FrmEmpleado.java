package co.edu.utadeo.ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import co.edu.utadeo.modelos.Empleado;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FrmEmpleado extends JFrame {

	private JPanel contentPane;
	public static FrmEventos ev = new FrmEventos();
	private JLabel lblPago;
	private JLabel lblCarrera;
	private JLabel lblUniversidad;
	private JLabel lblCelular;
	private JLabel lblNombre;
	private JLabel lblCarne;
	private JLabel lblPago1;
	private JLabel lblCelular1;
	private JLabel lblNombre1;
	private JLabel lblCarne1;
	public static ArrayList<Empleado> lstEmp = ev.lstEmpDefinidos;
	private ArrayList<Empleado> lstEmpRaso = new ArrayList<Empleado>();
	public int i =0;
	
	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public FrmEmpleado() {
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1400, 700);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Empleado Directivo");
		lblNewLabel.setBounds(124, 21, 432, 91);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Stealdream", Font.PLAIN, 56));
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Carn\u00E9: ");
		lblNewLabel_1.setBounds(52, 140, 129, 58);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setFont(new Font("Stealdream", Font.PLAIN, 40));
		contentPane.add(lblNewLabel_1);

		lblCarne = new JLabel("EspacioCarne");
		lblCarne.setBounds(183, 140, 402, 58);
		lblCarne.setFont(new Font("Stealdream", Font.PLAIN, 40));
		contentPane.add(lblCarne);

		JLabel lblNewLabel_2 = new JLabel("Nombre:");
		lblNewLabel_2.setBounds(52, 209, 129, 65);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2.setFont(new Font("Stealdream", Font.PLAIN, 40));
		contentPane.add(lblNewLabel_2);

		lblNombre = new JLabel("EspacioNombre");
		lblNombre.setBounds(183, 212, 402, 58);
		lblNombre.setFont(new Font("Stealdream", Font.PLAIN, 40));
		contentPane.add(lblNombre);

		JLabel lblNewLabel_3 = new JLabel("Celular:");
		lblNewLabel_3.setBounds(52, 285, 129, 58);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3.setFont(new Font("Stealdream", Font.PLAIN, 40));
		contentPane.add(lblNewLabel_3);

		lblCelular = new JLabel("EspacioCelular");
		lblCelular.setBounds(183, 285, 402, 58);
		lblCelular.setFont(new Font("Stealdream", Font.PLAIN, 40));
		contentPane.add(lblCelular);

		JLabel lblNewLabel_4 = new JLabel("Universidad:");
		lblNewLabel_4.setBounds(10, 354, 171, 58);
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_4.setFont(new Font("Stealdream", Font.PLAIN, 40));
		contentPane.add(lblNewLabel_4);

		lblUniversidad = new JLabel("EspacioUniversidad");
		lblUniversidad.setBounds(183, 354, 481, 58);
		lblUniversidad.setFont(new Font("Stealdream", Font.PLAIN, 40));
		contentPane.add(lblUniversidad);

		JLabel lblNewLabel_5 = new JLabel("Carrera:");
		lblNewLabel_5.setBounds(52, 423, 129, 58);
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_5.setFont(new Font("Stealdream", Font.PLAIN, 40));
		contentPane.add(lblNewLabel_5);

		lblCarrera = new JLabel("EspacioCarrera");
		lblCarrera.setBounds(183, 423, 481, 58);
		lblCarrera.setFont(new Font("Stealdream", Font.PLAIN, 40));
		contentPane.add(lblCarrera);

		JLabel lblNewLabel_6 = new JLabel("Pago:");
		lblNewLabel_6.setBounds(52, 486, 129, 58);
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_6.setFont(new Font("Stealdream", Font.PLAIN, 40));
		contentPane.add(lblNewLabel_6);

		lblPago = new JLabel("EspacioPago");
		lblPago.setBounds(183, 486, 373, 58);
		lblPago.setFont(new Font("Stealdream", Font.PLAIN, 40));
		contentPane.add(lblPago);

		JLabel lblNewLabel_7 = new JLabel("Empleados Rasos");
		lblNewLabel_7.setBounds(840, 21, 432, 91);
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setFont(new Font("Stealdream", Font.PLAIN, 56));
		contentPane.add(lblNewLabel_7);

		JButton btnNewButton = new JButton("Volver");
		btnNewButton.setBounds(589, 570, 163, 58);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ev.lstEmpDefinidos.clear();
				dispose();
				FrmEventos p = new FrmEventos();
				p.setLocationRelativeTo(null);
				p.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Stealdream", Font.PLAIN, 42));
		contentPane.add(btnNewButton);

		JLabel lblFondo = new JLabel("Fondo");
		lblFondo.setBounds(0, 0, 680, 661);
		lblFondo.setIcon(new ImageIcon("Imagenes/fondo.jpg"));
		contentPane.add(lblFondo);
		
		JLabel lblNewLabel_8 = new JLabel("Carn\u00E9:");
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_8.setFont(new Font("Stealdream", Font.PLAIN, 40));
		lblNewLabel_8.setBounds(780, 140, 129, 58);
		contentPane.add(lblNewLabel_8);
		
		lblCarne1 = new JLabel("EspacioCarne");
		lblCarne1.setFont(new Font("Stealdream", Font.PLAIN, 40));
		lblCarne1.setBounds(913, 140, 402, 58);
		contentPane.add(lblCarne1);
		
		JLabel lblNewLabel_9 = new JLabel("Nombre:");
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_9.setFont(new Font("Stealdream", Font.PLAIN, 40));
		lblNewLabel_9.setBounds(790, 209, 119, 65);
		contentPane.add(lblNewLabel_9);
		
		lblNombre1 = new JLabel("EspacioNombre");
		lblNombre1.setFont(new Font("Stealdream", Font.PLAIN, 40));
		lblNombre1.setBounds(913, 209, 421, 58);
		contentPane.add(lblNombre1);
		
		JLabel lbl = new JLabel("Celular:");
		lbl.setFont(new Font("Stealdream", Font.PLAIN, 40));
		lbl.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl.setBounds(780, 286, 129, 57);
		contentPane.add(lbl);
		
		lblCelular1 = new JLabel("EspacioCelular");
		lblCelular1.setFont(new Font("Stealdream", Font.PLAIN, 40));
		lblCelular1.setBounds(913, 285, 421, 58);
		contentPane.add(lblCelular1);
		
		JLabel lblNewLabel_10 = new JLabel("Pago:");
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_10.setFont(new Font("Stealdream", Font.PLAIN, 40));
		lblNewLabel_10.setBounds(790, 363, 119, 49);
		contentPane.add(lblNewLabel_10);
		
		lblPago1 = new JLabel("EspacioPago");
		lblPago1.setFont(new Font("Stealdream", Font.PLAIN, 40));
		lblPago1.setBounds(913, 364, 421, 48);
		contentPane.add(lblPago1);
		
		JLabel lblIzq = new JLabel("");
		lblIzq.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				i--;
				if(i<0)i=lstEmpRaso.size()-1;
				mostrarEmpRaso(i);
			}
		});
		lblIzq.setIcon(new ImageIcon("Imagenes/boton.jpg"));
		lblIzq.setBounds(790, 455, 170, 170);
		contentPane.add(lblIzq);
		
		JLabel lblDer = new JLabel("");
		lblDer.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				i++;
				if(i>lstEmpRaso.size()-1)i=0;
				mostrarEmpRaso(i);
			}
		});
		lblDer.setIcon(new ImageIcon("Imagenes/boton1.jpg"));
		lblDer.setBounds(1033, 455, 170, 170);
		contentPane.add(lblDer);
		
		
		mostrarEmpleado();
		mostrarEmpRaso(0);
		
		
	}

	public void mostrarEmpleado() {
		for(Empleado e:lstEmp) {
			if(!e.getUniversidad().equals("0") && !e.getCarrera().equals("0")) {
				lblCarne.setText(e.getCarne());
				lblNombre.setText(e.getNombre());
				lblCelular.setText(e.getCelular());
				lblUniversidad.setText(e.getUniversidad());
				lblCarrera.setText(e.getCarrera());
				String pago = e.getPago()+"€";
				lblPago.setText(pago);
			}
		}
	}
	
	public void mostrarEmpRaso(int i) {
		
		
		for(Empleado e: lstEmp) {
			if(e.getUniversidad().equals("0") && e.getCarrera().equals("0")) {
				lstEmpRaso.add(e);
			}
		}
		Empleado e = lstEmpRaso.get(i);
		lblCarne1.setText(e.getCarne()+"");
		lblNombre1.setText(e.getNombre());
		lblCelular1.setText(e.getCelular());
		String pago = e.getPago()+"€";
		lblPago1.setText(pago);
	}
}
