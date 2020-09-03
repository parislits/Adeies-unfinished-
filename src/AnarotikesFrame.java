import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class AnarotikesFrame extends JFrame {

	private JPanel contentPane;
	private JFrame jframe;
	private JTextField textField;

	

	
	public AnarotikesFrame(List<Worker> result, int index) {
		jframe = new JFrame();
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 335);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		JLabel label = new JLabel("\u039F\u03B9 \u03B1\u03BD\u03B1\u03C1\u03C1\u03C9\u03C4\u03B9\u03BA\u03AD\u03C2 \u03C4\u03BF\u03C5");
		label.setBounds(20, 11, 114, 14);
		contentPane.add(label);
		
		JLabel name = new JLabel(result.get(0).getName() + " " + result.get(0).getSurname() );
		name.setBounds(131, 11, 114, 14);
		contentPane.add(name);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 36, 404, 138);
		contentPane.add(scrollPane);
		DefaultListModel<Anarotikes> A = new DefaultListModel<>();
		JList list = new JList(A);
		scrollPane.setViewportView(list);
		
		for(int j=0;j<result.get(0).getA().size();j++) {
			A.addElement(result.get(0).getA().get(j));
		}
		
		JButton button = new JButton("\u03A0\u03C1\u03CC\u03C3\u03B8\u03B5\u03C3\u03B5 \u0386\u03B4\u03B5\u03B9\u03B1");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddAdeia frame = new AddAdeia(result,index);
				frame.setVisible(true);
				
			}
		});
		button.setBounds(286, 234, 138, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("\u0394\u03B9\u03AD\u03B3\u03C1\u03B1\u03C8\u03B5");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Anarotikes data = null;
				if (list.getSelectedIndex() != -1) { 
					data =  (Anarotikes) list.getSelectedValue();
					System.out.println(data);
					result.get(0).getA().remove(data);
					
					MainFrame.workers.set(index, result.get(0));
					FileAdmin.writeWorkerToFile( MainFrame.workers);
                 }  
				
			}
		});
		button_1.setBounds(326, 262, 98, 23);
		contentPane.add(button_1);
		
		JLabel label_1 = new JLabel("\u03A3\u03CD\u03BD\u03BF\u03BB\u03BF \u03A5\u03C0\u03B5\u03CD\u03B8\u03C5\u03BD\u03C9\u03BD \u03B4\u03B7\u03BB\u03CE\u03C3\u03B5\u03C9\u03BD");
		label_1.setBounds(20, 221, 182, 14);
		contentPane.add(label_1);
		
		
		JLabel synolo_u = new JLabel();
		synolo_u.setBounds(212, 221, 46, 14);
		contentPane.add(synolo_u);
		
		JLabel label_2 = new JLabel("\u03A3\u03CD\u03BD\u03BF\u03BB\u03BF \u0399\u03B1\u03C4\u03C1\u03B9\u03BA\u03CE\u03BD \u03B3\u03BD\u03C9\u03BC\u03B1\u03C4\u03B5\u03CD\u03C3\u03B5\u03C9\u03BD");
		label_2.setBounds(20, 246, 182, 14);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel();
		label_3.setBounds(212, 246, 46, 14);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("\u03A3\u03CD\u03BD\u03BF\u03BB\u03BF \u03B3\u03BD\u03C9\u03BC\u03B1\u03C4\u03B5\u03CD\u03C3\u03B5\u03C9\u03BD");
		label_4.setBounds(20, 271, 138, 14);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel();
		label_5.setBounds(168, 271, 46, 14);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("\u03A4\u03B7\u03BD \u03C7\u03C1\u03BF\u03BD\u03B9\u03AC");
		label_6.setBounds(20, 174, 68, 14);
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("");
		label_7.setBounds(88, 174, 46, 14);
		contentPane.add(label_7);
		
		JLabel label_8 = new JLabel("\u03A3\u03C5\u03BD\u03BF\u03BB\u03B9\u03BA\u03AC \u03C7\u03C1\u03BF\u03BD\u03B9\u03AC\u03C2");
		label_8.setBounds(20, 199, 124, 14);
		contentPane.add(label_8);
		
		JLabel label_9 = new JLabel("");
		label_9.setBounds(156, 199, 46, 14);
		contentPane.add(label_9);
		
		label_1.setVisible(false);
		label_2.setVisible(false);
		label_3.setVisible(false);
		label_4.setVisible(false);
		label_5.setVisible(false);
		synolo_u.setVisible(false);
		label_6.setVisible(false);
		label_7.setVisible(false);
		label_8.setVisible(false);
		label_9.setVisible(false);
		
		
		textField = new JTextField();
		textField.setText("\u0397\u03BC\u03B5\u03C1\u03BF\u03BC\u03B7\u03BD\u03AF\u03B1");
		textField.setBounds(270, 8, 76, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("\u0392\u03C1\u03AD\u03C2");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				A.clear();
				label_6.setVisible(true);
				label_7.setVisible(true);
				label_1.setVisible(true);
				label_2.setVisible(true);
				label_3.setVisible(true);
				label_4.setVisible(true);
				label_5.setVisible(true);
				synolo_u.setVisible(true);
				label_8.setVisible(true);
				label_9.setVisible(true);
				
				
				
				
				String search = textField.getText();
				int Synolo=0 , Synolo_Diloseos=0 , Synolo_Iatrikon=0 ,Synolo_Gnomateuseon=0 ;
				
				for(int i=0 ; i<result.get(0).getA().size();i++) {
					
					if(Integer.toString(result.get(0).getA().get(i).getEtos()).equals(search) ) {
							A.addElement(result.get(0).getA().get(i));
							Synolo+=1;					
								
								
								if(result.get(0).getA().get(i).getYpeuthini_dilosi()) {
									Synolo_Diloseos+=1;
									
								}
								else if(result.get(0).getA().get(i).getIatrikes()) {
									Synolo_Iatrikon+=1;
								}
								else {
									Synolo_Gnomateuseon+=1;
								}
							
						
					}
					
				}
				System.out.println(Synolo);
				label_7.setText(search);
				synolo_u.setText(Integer.toString(Synolo_Diloseos));
				label_3.setText(Integer.toString(Synolo_Iatrikon));
				label_5.setText(Integer.toString(Synolo_Gnomateuseon));
				label_9.setText(Integer.toString(Synolo));
				
			}
		});
		btnNewButton.setBounds(356, 7, 68, 23);
		contentPane.add(btnNewButton);
		
		
		
		
	}
}
