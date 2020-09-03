import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class NewUserFrame extends JFrame {

	private JPanel contentPane;
	private JFrame jframe;
	private JTextField Onoma;
	private JTextField Epitheto;
	private JTextField Klados;
	private JTextField Eidikotita;
	private JTextField Bathmos;
	private JTextField Afm;
	private JTextField Iban;
	private JTextField Misthos;
	private JTextField Mera;
	private JTextField Xronia_up;
	private JTextField Minas;
	private JTextField Xronia;
	private JButton btnNewButton;
	private JLabel lblNewLabel_1;
	private JTextField textField;

	
	public NewUserFrame(ArrayList<Worker> workers) {
		jframe = new JFrame();
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 335);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u038C\u03BD\u03BF\u03BC\u03B1 :");
		lblNewLabel.setBounds(10, 11, 130, 14);
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("\u0395\u03C0\u03AF\u03B8\u03B5\u03C4\u03BF :");
		label.setBounds(10, 36, 130, 14);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\u039A\u03BB\u03AC\u03B4\u03BF\u03C2 :");
		label_1.setBounds(10, 63, 130, 14);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("\u0395\u03B9\u03B4\u03B9\u03BA\u03CC\u03C4\u03B7\u03C4\u03B1 :");
		label_2.setBounds(10, 88, 130, 14);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("\u0392\u03B1\u03B8\u03BC\u03CC\u03C2 :");
		label_3.setBounds(10, 113, 130, 14);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("\u0391\u03C6\u03BC :");
		label_4.setBounds(10, 138, 130, 14);
		contentPane.add(label_4);
		
		JLabel lblIban = new JLabel("Iban :");
		lblIban.setBounds(10, 195, 130, 14);
		contentPane.add(lblIban);
		
		JLabel label_5 = new JLabel("\u039C\u03B9\u03C3\u03B8\u03CC\u03C2 :");
		label_5.setBounds(10, 220, 130, 14);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("\u0397\u03BC\u03B5\u03C1\u03BF\u03BC\u03B7\u03BD\u03AF\u03B1 \u03C0\u03C1\u03CC\u03C3\u03BB\u03B7\u03C8\u03B7\u03C2 :");
		label_6.setBounds(10, 245, 130, 14);
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("\u03A7\u03C1\u03CC\u03BD\u03B9\u03B1 \u03C5\u03C0\u03B7\u03C1\u03B5\u03C3\u03AF\u03B1\u03C2 :");
		label_7.setBounds(10, 268, 130, 14);
		contentPane.add(label_7);
		
		Onoma = new JTextField();
		Onoma.setBounds(137, 8, 86, 20);
		contentPane.add(Onoma);
		Onoma.setColumns(10);
		
		Epitheto = new JTextField();
		Epitheto.setBounds(137, 33, 86, 20);
		contentPane.add(Epitheto);
		Epitheto.setColumns(10);
		
		Klados = new JTextField();
		Klados.setBounds(137, 58, 86, 20);
		contentPane.add(Klados);
		Klados.setColumns(10);
		
		Eidikotita = new JTextField();
		Eidikotita.setBounds(137, 83, 86, 20);
		contentPane.add(Eidikotita);
		Eidikotita.setColumns(10);
		
		Bathmos = new JTextField();
		Bathmos.setBounds(137, 110, 86, 20);
		contentPane.add(Bathmos);
		Bathmos.setColumns(10);
		
		Afm = new JTextField();
		Afm.setBounds(137, 135, 86, 20);
		contentPane.add(Afm);
		Afm.setColumns(10);
		
		Iban = new JTextField();
		Iban.setBounds(137, 192, 86, 20);
		contentPane.add(Iban);
		Iban.setColumns(10);
		
		Misthos = new JTextField();
		Misthos.setBounds(137, 217, 86, 20);
		contentPane.add(Misthos);
		Misthos.setColumns(10);
		
		Mera = new JTextField();
		Mera.setText("\u0397\u03BC\u03AD\u03C1\u03B1");
		Mera.setBounds(137, 242, 86, 20);
		contentPane.add(Mera);
		Mera.setColumns(10);
		
		Xronia_up = new JTextField();
		Xronia_up.setBounds(137, 265, 86, 20);
		contentPane.add(Xronia_up);
		Xronia_up.setColumns(10);
		
		Minas = new JTextField();
		Minas.setText("\u039C\u03AE\u03BD\u03B1\u03C2");
		Minas.setBounds(233, 242, 86, 20);
		contentPane.add(Minas);
		Minas.setColumns(10);
		
		Xronia = new JTextField();
		Xronia.setText("\u03A7\u03C1\u03BF\u03BD\u03AF\u03B1");
		Xronia.setBounds(329, 242, 86, 20);
		contentPane.add(Xronia);
		Xronia.setColumns(10);
		
		lblNewLabel_1 = new JLabel("\u0391\u03C1\u03B9\u03B8\u03BC\u03CC\u03C2 \u039C\u03B7\u03C4\u03C1\u03CE\u03BF\u03C5 :");
		lblNewLabel_1.setBounds(10, 164, 130, 20);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(137, 163, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		btnNewButton = new JButton("\u0394\u03B7\u03BC\u03B9\u03BF\u03C5\u03C1\u03B3\u03AF\u03B1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String onoma = Onoma.getText();
				String epitheto = Epitheto.getText();
				String klados = Klados.getText();
				String eidikotita = Eidikotita.getText();
				String bathmos = Bathmos.getText();
				String afm = Afm.getText();
				String am = textField.getText();
				String iban = Iban.getText();
				String misth = Misthos.getText();
				String hm = Mera.getText();
				String min = Minas.getText();
				String xr = Xronia.getText();
				String xronia_u = Xronia_up.getText();
				double misthos = Double.parseDouble(misth);
				int xronia_up = Integer.parseInt(xronia_u);
				int hmera = Integer.parseInt(hm);
				int minas = Integer.parseInt(min);
				int xronia = Integer.parseInt(xr);
				
				if(hmera>0 && hmera<32 && minas<13 && minas>0 && xronia>1900 && xronia<2100 && !onoma.equals(null) && !epitheto.equals(null)
						&& !klados.equals(null)&& !eidikotita.equals(null)&& !bathmos.equals(null)&& !afm.equals(null)&& !iban.equals(null)&& misthos!=0){
					
					Worker w = new Worker(onoma,epitheto,klados,eidikotita,bathmos,afm,am,iban,misthos,hmera,minas,xronia,xronia_up);
					workers.add(w);
					
					FileAdmin.writeWorkerToFile(workers);
					jframe.setVisible(false);
					jframe.dispose();
					
				}
				else{
					System.out.println("Blaka");
				}
				
			}
		});
		btnNewButton.setBounds(306, 262, 109, 23);
		contentPane.add(btnNewButton);
		
		
	}
}
