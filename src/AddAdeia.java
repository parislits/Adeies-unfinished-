import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;

public class AddAdeia extends JFrame {

	private JPanel contentPane;
	private JFrame jframe;
	private JTextField Hmera;
	private JTextField Minas;
	private JTextField Xronia;
	private JTextField dikaiologia;

	

	
	public AddAdeia(List<Worker> result, int index) {
		
		jframe = new JFrame();
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 335);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JCheckBox checkBox = new JCheckBox("\u03A5\u03C0\u03B5\u03CD\u03B8\u03C5\u03BD\u03B7 \u0394\u03AE\u03BB\u03C9\u03C3\u03B7");
		checkBox.setBounds(193, 45, 145, 23);
		contentPane.add(checkBox);
		checkBox.setVisible(false);
		
		
		JCheckBox checkBox_1 = new JCheckBox("\u0399\u03B1\u03C4\u03C1\u03B9\u03BA\u03AE \u0393\u03BD\u03C9\u03BC\u03AC\u03C4\u03B5\u03C5\u03C3\u03B7");
		checkBox_1.setBounds(193, 79, 145, 23);
		contentPane.add(checkBox_1);
		checkBox_1.setVisible(false);
		
		
		JCheckBox checkBox_2 = new JCheckBox("\u0393\u03BD\u03C9\u03BC\u03AC\u03C4\u03B5\u03C5\u03C3\u03B7 ");
		checkBox_2.setBounds(193, 113, 120, 23);
		contentPane.add(checkBox_2);
		checkBox_2.setVisible(false);
		
		
		JButton add = new JButton("\u03A0\u03C1\u03BF\u03C3\u03B8\u03AE\u03BA\u03B7");
		add.setBounds(307, 147, 89, 23);
		contentPane.add(add);
		add.setVisible(false);
		
		JButton add_1 = new JButton("\u03A0\u03C1\u03BF\u03C3\u03B8\u03AE\u03BA\u03B7");
		add_1.setBounds(307, 147, 89, 23);
		contentPane.add(add_1);
		add_1.setVisible(false);
		
		JButton add_2 = new JButton("\u03A0\u03C1\u03BF\u03C3\u03B8\u03AE\u03BA\u03B7");
		add_2.setBounds(307, 147, 89, 23);
		contentPane.add(add_2);
		add_2.setVisible(false);
		
		JButton add_3 = new JButton("\u03A0\u03C1\u03BF\u03C3\u03B8\u03AE\u03BA\u03B7");
		add_3.setBounds(307, 147, 89, 23);
		contentPane.add(add_3);
		add_3.setVisible(false);
		
		JButton add_4 = new JButton("\u03A0\u03C1\u03BF\u03C3\u03B8\u03AE\u03BA\u03B7");
		add_4.setBounds(307, 147, 89, 23);
		contentPane.add(add_4);
		add_4.setVisible(false);
		
		
		
		JLabel date = new JLabel("\u0397\u03BC\u03B5\u03C1\u03BF\u03BC\u03B7\u03BD\u03AF\u03B1:");
		date.setBounds(137, 15, 86, 14);
		contentPane.add(date);
		
		Hmera = new JTextField();
		Hmera.setText("\u0397\u03BC\u03AD\u03C1\u03B1");
		Hmera.setColumns(10);
		Hmera.setBounds(233, 12, 48, 20);
		contentPane.add(Hmera);
		
		Minas = new JTextField();
		Minas.setText("\u039C\u03AE\u03BD\u03B1\u03C2");
		Minas.setColumns(10);
		Minas.setBounds(290, 12, 48, 20);
		contentPane.add(Minas);
		
		Xronia = new JTextField();
		Xronia.setText("\u03A7\u03C1\u03BF\u03BD\u03AF\u03B1");
		Xronia.setColumns(10);
		Xronia.setBounds(348, 12, 48, 20);
		contentPane.add(Xronia);
		
		dikaiologia = new JTextField();
		dikaiologia.setBounds(250, 46, 111, 20);
		contentPane.add(dikaiologia);
		dikaiologia.setColumns(10);
		dikaiologia.setVisible(false);
		
		JLabel label = new JLabel("\u0394\u03B9\u03BA\u03B1\u03B9\u03BF\u03BB\u03BF\u03B3\u03AF\u03B1: ");
		label.setBounds(166, 49, 89, 14);
		contentPane.add(label);
		label.setVisible(false);
		
	
		JButton anarotiki = new JButton("\u0391\u03BD\u03B1\u03C1\u03C1\u03C9\u03C4\u03B9\u03BA\u03B7");
		anarotiki.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkBox.setVisible(true);
				checkBox_1.setVisible(true);
				checkBox_2.setVisible(true);
				
				
				
				dikaiologia.setVisible(false);
				label.setVisible(false);
				
				add.setVisible(true);
				add_1.setVisible(false);
				add_2.setVisible(false);
				add_3.setVisible(false);
				add_4.setVisible(false);
			
				add.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String hm = Hmera.getText();
						int hmera = Integer.parseInt(hm);
						String min = Minas.getText();
						int minas = Integer.parseInt(min);
						String xr = Xronia.getText();
						int xronia = Integer.parseInt(xr);
						
						if (checkBox.isSelected()) {
							
							Anarotikes a = new Anarotikes(hmera,minas,xronia,true,false,false);
							 result.get(0).setA(a);
							 MainFrame.workers.set(index, result.get(0));
							 FileAdmin.writeWorkerToFile( MainFrame.workers);
							 
							 for(int i=0;i<MainFrame.workers.size();i++) {
							 System.out.println(MainFrame.workers.get(i).getName());
							 }
						    
						 
						} else if(checkBox_1.isSelected()) {
						 
							Anarotikes a = new Anarotikes(hmera,minas,xronia,false,true,false);
							 result.get(0).setA(a);
							
							 MainFrame.workers.set(index, result.get(0));
							 FileAdmin.writeWorkerToFile( MainFrame.workers);
						 
						}
						else if(checkBox_2.isSelected()) {
							Anarotikes a = new Anarotikes(hmera,minas,xronia,false,false,true);
							 result.get(0).setA(a);
							 MainFrame.workers.set(index, result.get(0));
							 FileAdmin.writeWorkerToFile( MainFrame.workers);
						}
						
						
					}
				});
				
			}
		});
		anarotiki.setBounds(10, 11, 120, 23);
		contentPane.add(anarotiki);
		
		
		
		JButton goniki = new JButton("\u0393\u03BF\u03BD\u03B9\u03BA\u03AE");
		goniki.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				checkBox.setVisible(false);
				checkBox_1.setVisible(false);
				checkBox_2.setVisible(false);
				dikaiologia.setVisible(false);
				
				label.setVisible(false);
				
				
				add.setVisible(false);
				add_1.setVisible(true);
				add_2.setVisible(false);
				add_3.setVisible(false);
				add_4.setVisible(false);
	
				
				add_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						String hm = Hmera.getText();
						int hmera = Integer.parseInt(hm);
						String min = Minas.getText();
						int minas = Integer.parseInt(min);
						String xr = Xronia.getText();
						int xronia = Integer.parseInt(xr);
						
						
						
						
						Gonikes g = new Gonikes(hmera,minas,xronia);
						 result.get(0).setG(g);
						 MainFrame.workers.set(index, result.get(0));
						 FileAdmin.writeWorkerToFile( MainFrame.workers);
					}
				});
				
			}
		});
		goniki.setBounds(10, 45, 120, 23);
		contentPane.add(goniki);
		
		
		
		JButton kanoniki = new JButton("\u03BA\u03B1\u03BD\u03BF\u03BD\u03B9\u03BA\u03AE");
		kanoniki.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkBox.setVisible(false);
				checkBox_1.setVisible(false);
				checkBox_2.setVisible(false);
				dikaiologia.setVisible(false);
				label.setVisible(false);
				
				add.setVisible(false);
				add_1.setVisible(false);
				add_2.setVisible(true);
				add_3.setVisible(false);
				add_4.setVisible(false);
				
				
				
				
	
				
				add_2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						String hm = Hmera.getText();
						int hmera = Integer.parseInt(hm);
						String min = Minas.getText();
						int minas = Integer.parseInt(min);
						String xr = Xronia.getText();
						int xronia = Integer.parseInt(xr);
						
												
						Kanonikes k = new Kanonikes(hmera,minas,xronia);
						 result.get(0).setK(k);
						 MainFrame.workers.set(index, result.get(0));
						 FileAdmin.writeWorkerToFile( MainFrame.workers);
					}
				});
				
			}
		});
		
		kanoniki.setBounds(10, 79, 120, 23);
		contentPane.add(kanoniki);
		
		JButton repo = new JButton("\u03A1\u03B5\u03C0\u03CC");
		repo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
			}
		});
		
		repo.setBounds(10, 113, 120, 23);
		contentPane.add(repo);
		
		JButton duori = new JButton("\u0394\u03CD\u03C9\u03C1\u03B7");
		duori.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkBox.setVisible(false);
				checkBox_1.setVisible(false);
				checkBox_2.setVisible(false);
				dikaiologia.setVisible(false);
				label.setVisible(false);
				
				
				
				
				add.setVisible(false);
				add_1.setVisible(false);
				add_2.setVisible(false);
				add_3.setVisible(true);
				add_4.setVisible(false);
				
	
				
				add_3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						String hm = Hmera.getText();
						int hmera = Integer.parseInt(hm);
						String min = Minas.getText();
						int minas = Integer.parseInt(min);
						String xr = Xronia.getText();
						int xronia = Integer.parseInt(xr);
						
						
						
						
						Duores d = new Duores(hmera,minas,xronia);
						 result.get(0).setD(d);
						 MainFrame.workers.set(index, result.get(0));
						 FileAdmin.writeWorkerToFile( MainFrame.workers);
					}
				});
				
			}
		});
		
		duori.setBounds(10, 147, 120, 23);
		contentPane.add(duori);
		
		JButton alles = new JButton("\u0386\u03BB\u03BB\u03B5\u03C2");
		alles.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				checkBox.setVisible(false);
				checkBox_1.setVisible(false);
				checkBox_2.setVisible(false);
				dikaiologia.setVisible(true);
				label.setVisible(true);
				
				
				
				
				add.setVisible(false);
				add_1.setVisible(false);
				add_2.setVisible(false);
				add_3.setVisible(false);
				add_4.setVisible(true);
				
	
				
				add_4.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						String hm = Hmera.getText();
						int hmera = Integer.parseInt(hm);
						String min = Minas.getText();
						int minas = Integer.parseInt(min);
						String xr = Xronia.getText();
						int xronia = Integer.parseInt(xr);
						
						String text = dikaiologia.getText();
						
					
						
						Alles al = new Alles(hmera,minas,xronia,text);
						 result.get(0).setAl(al);
						 MainFrame.workers.set(index, result.get(0));
						 FileAdmin.writeWorkerToFile( MainFrame.workers);
					}
				});
				
				
			}
		});
		alles.setBounds(10, 180, 120, 23);
		contentPane.add(alles);
		
		
		
		
		
		
		
		
		
		
	}
}
