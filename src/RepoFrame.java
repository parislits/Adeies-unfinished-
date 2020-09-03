import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class RepoFrame extends JFrame {

	private JPanel contentPane;
	private JFrame jframe;
	private JTextField textField;

	
	public RepoFrame(List<Worker> result, int index) {
		jframe = new JFrame();
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 335);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel label = new JLabel("\u03A4\u03B1 \u03A1\u03B5\u03C0\u03CC \u03C4\u03BF\u03C5");
		label.setBounds(20, 11, 114, 14);
		contentPane.add(label);
		
		JLabel name = new JLabel(result.get(0).getName() + " " + result.get(0).getSurname() );
		name.setBounds(121, 11, 114, 14);
		contentPane.add(name);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 36, 404, 138);
		contentPane.add(scrollPane);
		DefaultListModel<Duores> D = new DefaultListModel<>();
		JList list = new JList(D);
		scrollPane.setViewportView(list);
		
		for(int j=0;j<result.get(0).getD().size();j++) {
			D.addElement(result.get(0).getD().get(j));
		}
		
		JButton button = new JButton("\u03A0\u03C1\u03CC\u03C3\u03B8\u03B5\u03C3\u03B5 \u0386\u03B4\u03B5\u03B9\u03B1");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddAdeia frame = new AddAdeia(result ,index);
				frame.setVisible(true);
				
			}
		});
		button.setBounds(286, 234, 138, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("\u0394\u03B9\u03AD\u03B3\u03C1\u03B1\u03C8\u03B5");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Duores data = null;
				if (list.getSelectedIndex() != -1) { 
					data =  (Duores) list.getSelectedValue();
					System.out.println(data);
					result.get(0).getD().remove(data);
					MainFrame.workers.set(index, result.get(0));
					FileAdmin.writeWorkerToFile((ArrayList<Worker>)MainFrame.workers);
                 }  
				
			}
		});
		button_1.setBounds(326, 262, 98, 23);
		contentPane.add(button_1);
		
		JLabel label_1 = new JLabel("\u03A4\u03B7\u03BD \u03C7\u03C1\u03BF\u03BD\u03B9\u03AC");
		label_1.setBounds(20, 174, 68, 14);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setBounds(88, 174, 46, 14);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("\u03A3\u03C5\u03BD\u03BF\u03BB\u03B9\u03BA\u03AC \u03C7\u03C1\u03BF\u03BD\u03B9\u03AC\u03C2");
		label_3.setBounds(20, 199, 124, 14);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("");
		label_4.setBounds(156, 199, 46, 14);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("\u03A3\u03CD\u03BD\u03BF\u03BB\u03BF \u03A9\u03C1\u03CE\u03BD");
		label_5.setBounds(20, 224, 98, 14);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("");
		label_6.setBounds(128, 224, 46, 14);
		contentPane.add(label_6);
		
		label_1.setVisible(false);
		label_2.setVisible(false);
		label_3.setVisible(false);
		label_4.setVisible(false);
		label_5.setVisible(false);
		label_6.setVisible(false);
		
		
		textField = new JTextField();
		textField.setText("\u0397\u03BC\u03B5\u03C1\u03BF\u03BC\u03B7\u03BD\u03AF\u03B1");
		textField.setBounds(270, 8, 76, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("\u0392\u03C1\u03AD\u03C2");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				D.clear();
				
				label_1.setVisible(true);
				label_2.setVisible(true);
				label_3.setVisible(true);
				label_4.setVisible(true);
				label_5.setVisible(true);
				label_6.setVisible(true);
				
								
				String search = textField.getText();
				int Synolo=0 ;
				double Synolo_oron=0 ;
				
				for(int i=0 ; i<result.get(0).getD().size();i++) {
					
					if(Integer.toString(result.get(0).getD().get(i).getEtos()).equals(search) ) {
							D.addElement(result.get(0).getD().get(i));
													
								Synolo+=1;
								Synolo_oron=Synolo_oron +result.get(0).getD().get(i).getOra()+(result.get(0).getD().get(i).getLepto()/60);
							
						
					}
					
				}
				
				label_2.setText(search);
				label_4.setText(Integer.toString(Synolo));
				label_6.setText(Double.toString(Synolo_oron));
				
			}
		});
		btnNewButton.setBounds(356, 7, 68, 23);
		contentPane.add(btnNewButton);
		
	}

}
