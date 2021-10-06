package interfaceGrafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class ExcluirPac extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldCpf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExcluirPac frame = new ExcluirPac();
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
	public ExcluirPac() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Excluir Paciente");
		lblNewLabel.setBounds(170, 11, 116, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("CPF:");
		lblNewLabel_1.setBounds(10, 50, 32, 14);
		contentPane.add(lblNewLabel_1);
		
		textFieldCpf = new JTextField();
		textFieldCpf.setBounds(43, 47, 86, 20);
		contentPane.add(textFieldCpf);
		textFieldCpf.setColumns(10);
		
		JButton btnNewButtonVoltar = new JButton("Voltar");
		btnNewButtonVoltar.setBounds(119, 227, 89, 23);
		contentPane.add(btnNewButtonVoltar);
		
		JButton btnNewButtonExcluir = new JButton("Excluir");
		btnNewButtonExcluir.setBounds(218, 227, 89, 23);
		contentPane.add(btnNewButtonExcluir);
	}
}
