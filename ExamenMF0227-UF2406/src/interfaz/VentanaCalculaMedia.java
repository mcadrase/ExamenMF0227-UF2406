package interfaz;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import net.miginfocom.swing.MigLayout;

import funciones.Utilidades;

public class VentanaCalculaMedia extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JLabel lblUF2404;
	private JLabel lblUF2405;
	private JLabel lblUF2406;
	private JTextField txtUF2404;
	private JTextField txtUF2405;
	private JTextField txtUF2406;
	private JButton btnCalcularNota;
	private JLabel lblNotaMedia;
	private JLabel lblResultado;
	private JLabel lblNotaMediaResultado;
	private JLabel lblResultadoResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaCalculaMedia frame = new VentanaCalculaMedia();
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
	public VentanaCalculaMedia() {
		setTitle("Calcular media MF0227");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][grow]", "[][][][][][][][]"));
		
		JLabel lblNombre = new JLabel("Nombre");
		contentPane.add(lblNombre, "cell 0 0,alignx trailing");
		
		txtNombre = new JTextField();
		contentPane.add(txtNombre, "cell 1 0,growx");
		txtNombre.setColumns(10);
		
		lblUF2404 = new JLabel("UF2404");
		contentPane.add(lblUF2404, "cell 0 1,alignx trailing");
		
		txtUF2404 = new JTextField();
		contentPane.add(txtUF2404, "cell 1 1,growx");
		txtUF2404.setColumns(10);
		
		lblUF2405 = new JLabel("UF2405");
		contentPane.add(lblUF2405, "cell 0 2,alignx trailing");
		
		txtUF2405 = new JTextField();
		contentPane.add(txtUF2405, "cell 1 2,growx");
		txtUF2405.setColumns(10);
		
		lblUF2406 = new JLabel("UF2406");
		contentPane.add(lblUF2406, "cell 0 3,alignx trailing");
		
		txtUF2406 = new JTextField();
		contentPane.add(txtUF2406, "cell 1 3,growx");
		txtUF2406.setColumns(10);
		
		btnCalcularNota = new JButton("Calcular Nota");
		btnCalcularNota.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comprobar();
			}
		});
		contentPane.add(btnCalcularNota, "cell 0 5 2 1,alignx center");
		
		lblNotaMedia = new JLabel("Nota Media");
		contentPane.add(lblNotaMedia, "cell 0 6");
		
		lblNotaMediaResultado = new JLabel("0.0");
		contentPane.add(lblNotaMediaResultado, "cell 1 6");
		
		lblResultado = new JLabel("Resultado");
		contentPane.add(lblResultado, "cell 0 7");
		
		lblResultadoResultado = new JLabel("No calculado aún");
		contentPane.add(lblResultadoResultado, "cell 1 7");
	}

	protected void comprobar() {
		String Nombre;
		double UF2404;
		double UF2405;
		double UF2406;
		
		Nombre = txtNombre.getText();
		UF2404 = Double.parseDouble(txtUF2404.getText());
		UF2405 = Double.parseDouble(txtUF2405.getText());
		UF2406 = Double.parseDouble(txtUF2406.getText());
		
		
		double media = (UF2404+UF2405+UF2406)/3;
		
		
		lblNotaMediaResultado.setText(""+media);
		
		lblResultadoResultado.setText(Nombre+" ha sacado un "+Utilidades.devuelveNota(media));
		
		
		//devuelveNota();
	}

}
