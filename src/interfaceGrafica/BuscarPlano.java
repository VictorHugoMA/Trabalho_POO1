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

public class BuscarPlano extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldCnpj;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BuscarPlano frame = new BuscarPlano();
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
	public BuscarPlano() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBuscarPlano = new JLabel("Buscar Plano de Saude");
		lblBuscarPlano.setBounds(170, 11, 116, 14);
		contentPane.add(lblBuscarPlano);
		
		JLabel lblNewLabel_1 = new JLabel("CNPJ:");
		lblNewLabel_1.setBounds(10, 50, 32, 14);
		contentPane.add(lblNewLabel_1);
		
		textFieldCnpj = new JTextField();
		textFieldCnpj.setColumns(10);
		textFieldCnpj.setBounds(43, 47, 86, 20);
		contentPane.add(textFieldCnpj);
		
		JButton botaoVoltar = new JButton("Voltar");
		botaoVoltar.setBounds(119, 227, 89, 23);
		contentPane.add(botaoVoltar);
		botaoVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Voltar", "Teste", JOptionPane.INFORMATION_MESSAGE);
				
			}
		});
		
		JButton botaoBuscar = new JButton("Buscar");
		botaoBuscar.setBounds(218, 227, 89, 23);
		contentPane.add(botaoBuscar);
		botaoBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Buscar", "Teste", JOptionPane.INFORMATION_MESSAGE);
				
			}
		});
	}

}
