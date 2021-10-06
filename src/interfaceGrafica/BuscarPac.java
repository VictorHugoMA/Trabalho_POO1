package interfaceGrafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class BuscarPac extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldCpf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BuscarPac frame = new BuscarPac();
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
	public BuscarPac() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBuscarPaciente = new JLabel("Buscar Paciente");
		lblBuscarPaciente.setBounds(170, 11, 116, 14);
		contentPane.add(lblBuscarPaciente);
		
		JLabel lblNewLabel_1 = new JLabel("CPF:");
		lblNewLabel_1.setBounds(10, 50, 32, 14);
		contentPane.add(lblNewLabel_1);
		
		textFieldCpf = new JTextField();
		textFieldCpf.setColumns(10);
		textFieldCpf.setBounds(43, 47, 86, 20);
		contentPane.add(textFieldCpf);
		
		JButton btnNewButtonVoltar = new JButton("Voltar");
		btnNewButtonVoltar.setBounds(119, 227, 89, 23);
		contentPane.add(btnNewButtonVoltar);
		
		JButton btnNewButtonBuscar = new JButton("Buscar");
		btnNewButtonBuscar.setBounds(218, 227, 89, 23);
		contentPane.add(btnNewButtonBuscar);
	}

}
