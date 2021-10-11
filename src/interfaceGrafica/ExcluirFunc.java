package interfaceGrafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import dados.DadosFuncionarios;
import dados.DadosPacientes;

public class ExcluirFunc extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldCpf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExcluirFunc frame = new ExcluirFunc();
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
	public ExcluirFunc() {
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
		
		
		JButton botaoVoltar = new JButton("Voltar");
		botaoVoltar.setBounds(119, 227, 89, 23);
		contentPane.add(botaoVoltar);
		botaoVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Voltar", "Teste", JOptionPane.INFORMATION_MESSAGE);
				
			}
		});
		
		JButton botaoExcluir = new JButton("Excluir");
		botaoExcluir.setBounds(218, 227, 89, 23);
		contentPane.add(botaoExcluir);
		botaoExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DadosFuncionarios.excluir(textFieldCpf.getText());
				JOptionPane.showMessageDialog(null, "Excluir", "Teste", JOptionPane.INFORMATION_MESSAGE);
				
			}
		});
	}

}
