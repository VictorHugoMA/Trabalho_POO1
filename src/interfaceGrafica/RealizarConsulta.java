package interfaceGrafica;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clinica.*;
import dados.*;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class RealizarConsulta extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldCpfMed;
	private JTextField textFieldCpfPac;
	private JTextField textFieldDataHora;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RealizarConsulta frame = new RealizarConsulta();
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
	public RealizarConsulta() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 560, 405);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Consulta");
		lblNewLabel.setBounds(244, 11, 61, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("CPF Medico:");
		lblNewLabel_1.setBounds(10, 54, 89, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("CPF Paciente: ");
		lblNewLabel_2.setBounds(10, 79, 89, 14);
		contentPane.add(lblNewLabel_2);
		
		textFieldCpfMed = new JTextField();
		textFieldCpfMed.setBounds(95, 51, 86, 20);
		contentPane.add(textFieldCpfMed);
		textFieldCpfMed.setColumns(10);
		
		textFieldCpfPac = new JTextField();
		textFieldCpfPac.setBounds(95, 76, 86, 20);
		contentPane.add(textFieldCpfPac);
		textFieldCpfPac.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Data e Hora:");
		lblNewLabel_3.setBounds(10, 104, 89, 14);
		contentPane.add(lblNewLabel_3);
		
		textFieldDataHora = new JTextField();
		textFieldDataHora.setToolTipText("dd/MM/aaaa HH:mm");
		textFieldDataHora.setBounds(95, 101, 86, 20);
		contentPane.add(textFieldDataHora);
		textFieldDataHora.setColumns(10);
		
		JButton botaoVoltar = new JButton("Voltar");
		botaoVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fecha();
			}
		});
		botaoVoltar.setBounds(185, 332, 89, 23);
		contentPane.add(botaoVoltar);
		
		JButton botaoEnviar = new JButton("Enviar");
		botaoEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Medico medico = (Medico)DadosFuncionarios.buscar(textFieldCpfMed.getText());
				Paciente paciente = DadosPacientes.buscar(textFieldCpfPac.getText());
				if(medico!=null && paciente !=null) {
					Consulta consulta;
					if(paciente instanceof PacCPlano) {
						PacCPlano pacC = (PacCPlano)paciente;
						consulta = new Consulta(medico, pacC); 
					}
					else {
						PacSPlano pacS = (PacSPlano)paciente;
						consulta = new Consulta(medico, pacS); 
					}
					try {
						consulta.setStrDataHoraCons(textFieldDataHora.getText());
					} catch (ParseException e1) {
					}
					consulta.realizarCons();
					JOptionPane.showMessageDialog(contentPane, consulta.mostrarDados(), "Consulta", JOptionPane.INFORMATION_MESSAGE);
					
				}
				else {
					JOptionPane.showMessageDialog(contentPane, "Dados Invalidos", "Consulta", JOptionPane.INFORMATION_MESSAGE);
				}
				
			}
		});
		botaoEnviar.setBounds(295, 332, 89, 23);
		contentPane.add(botaoEnviar);
		
	}

	public void fecha() {
		this.dispose();
	}
}
