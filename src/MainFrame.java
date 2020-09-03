import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JList;

public class MainFrame extends JFrame{

	private JPanel contentPane;
	private JTextField textField;
	static public ArrayList<Worker> workers= new ArrayList<Worker>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
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
	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		try {
			workers=(ArrayList<Worker>)FileAdmin.readsWorkersOfFile();
		} catch (ClassNotFoundException e) {
			
		
		} catch (IOException e) {
			
		}
		for(int i=0;i<workers.size();i++){
		System.out.println(workers.get(i).getName() +" ");
		}
		
		
		JButton button = new JButton("\u039D\u03AD\u03BF\u03C2 \u03A7\u03C1\u03AE\u03C3\u03C4\u03B7\u03C2");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				NewUserFrame frame = new NewUserFrame(workers);
				frame.setVisible(true);
			}
		});
		
		button.setBounds(10, 11, 122, 23);
		contentPane.add(button);
		
		JButton Search = new JButton("\u0391\u03BD\u03B1\u03B6\u03AE\u03C4\u03B7\u03C3\u03B7");
		Search.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String search =textField.getText();
				
				List<Worker> result = workers.stream()
					     .filter(item -> item.getSurname().equals(search))
					     .collect(Collectors.toList()); 
				
				
				System.out.println(workers.indexOf(result.get(0)));
				
				AUserFrame frame = new AUserFrame(result,workers.indexOf(result.get(0)));
				frame.setVisible(true);
				}
				
				
			
		});
		Search.setBounds(325, 11, 99, 23);
		contentPane.add(Search);
		
		textField = new JTextField();
		textField.setBounds(231, 12, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton Selected = new JButton("\u0395\u03C0\u03B9\u03BB\u03BF\u03B3\u03AE");
		Selected.setBounds(300, 227, 89, 23);
		contentPane.add(Selected);
		Selected.setVisible(false);
		
		JButton Delete = new JButton("\u0394\u03B9\u03B1\u03B3\u03C1\u03B1\u03C6\u03AE");
		Delete.setBounds(43, 227, 89, 23);
		contentPane.add(Delete);
		Delete.setVisible(false);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 78, 414, 148);
		contentPane.add(scrollPane);
		scrollPane.setVisible(false);
		
		DefaultListModel<Worker> A = new DefaultListModel<>();
		JList list = new JList(A);
		scrollPane.setViewportView(list);
		list.setVisible(false);
		
		
		JButton button_2 = new JButton("\u03A0\u03C1\u03BF\u03B2\u03BF\u03BB\u03AE \u03CC\u03BB\u03C9\u03BD");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				A.clear();
				Selected.setVisible(true);
				Delete.setVisible(true);
				scrollPane.setVisible(true);	
				list.setVisible(true);
						
				
				for(int j=0;j<workers.size();j++) {
					A.addElement(workers.get(j));
				}
				
				
				Selected.addActionListener(new ActionListener() {
					
					public void actionPerformed(ActionEvent arg0) {
						
						Worker data = null;  
		                 if (list.getSelectedIndex() != -1) {       
		                	 int index = list.getSelectedIndex();
		                    data = (Worker) list.getSelectedValue();   
		                    System.out.println(data); 
		                   ArrayList<Worker> result = new ArrayList<Worker>();
		                    result.add(data);
		                    AUserFrame frame = new AUserFrame(result,index);
		    				frame.setVisible(true);
		    				
		                 }  
						
					}
				});
				
				Delete.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Worker data = null;
						if (list.getSelectedIndex() != -1) { 
							data = (Worker) list.getSelectedValue();
							workers.remove(data);
							FileAdmin.writeWorkerToFile(workers);
		                 }  
					}
				});
				
			}
		});
		button_2.setBounds(267, 45, 122, 23);
		contentPane.add(button_2);
		
		
		
		
		
		
		
	}
}
