import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AUserFrame extends JFrame {

	private JPanel contentPane;
	private JFrame jframe;

	

	public AUserFrame(List<Worker> result, int index ) {
		jframe = new JFrame();
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 335);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel onoma = new JLabel(result.get(0).getName());
		onoma.setBounds(153, 11, 130, 14);
		contentPane.add(onoma);
		
		
		JLabel epitheto = new JLabel(result.get(0).getSurname());
		epitheto.setBounds(153, 36, 130, 14);
		contentPane.add(epitheto);
		
		JLabel klados = new JLabel(result.get(0).getKlados());
		klados.setBounds(153, 63, 130, 14);
		contentPane.add(klados);
		
		JLabel eidikotita = new JLabel(result.get(0).getEidikotita());
		eidikotita.setBounds(153, 88, 130, 14);
		contentPane.add(eidikotita);
		
		JLabel bathmos = new JLabel(result.get(0).getBathmos());
		bathmos.setBounds(153, 113, 130, 14);
		contentPane.add(bathmos);
		
		JLabel afm = new JLabel(result.get(0).getAfm());
		afm.setBounds(153, 138, 130, 14);
		contentPane.add(afm);
		
		JLabel iban = new JLabel(result.get(0).getIban());
		iban.setBounds(153, 163, 130, 14);
		contentPane.add(iban);
		
		JLabel misthos = new JLabel(Double.toString(result.get(0).getMisthos()));
		misthos.setBounds(153, 188, 130, 14);
		contentPane.add(misthos);
		
		JLabel pros = new JLabel(Integer.toString(result.get(0).getHmProslipsi())+"/"+
									Integer.toString(result.get(0).getMinProslipsi())+"/"+
									Integer.toString(result.get(0).getXrProslipsi()));
		pros.setBounds(153, 213, 130, 14);
		contentPane.add(pros);
		
		JLabel xronia = new JLabel(Integer.toString(result.get(0).getXronia()));
		xronia.setBounds(153, 236, 130, 14);
		contentPane.add(xronia);
		
		JLabel label_10 = new JLabel("\u038C\u03BD\u03BF\u03BC\u03B1 :");
		label_10.setBounds(10, 11, 130, 14);
		contentPane.add(label_10);
		
		JLabel label_11 = new JLabel("\u0395\u03C0\u03AF\u03B8\u03B5\u03C4\u03BF :");
		label_11.setBounds(10, 36, 130, 14);
		contentPane.add(label_11);
		
		JLabel label_12 = new JLabel("\u039A\u03BB\u03AC\u03B4\u03BF\u03C2 :");
		label_12.setBounds(10, 63, 130, 14);
		contentPane.add(label_12);
		
		JLabel label_13 = new JLabel("\u0395\u03B9\u03B4\u03B9\u03BA\u03CC\u03C4\u03B7\u03C4\u03B1 :");
		label_13.setBounds(10, 88, 130, 14);
		contentPane.add(label_13);
		
		JLabel label_14 = new JLabel("\u0392\u03B1\u03B8\u03BC\u03CC\u03C2 :");
		label_14.setBounds(10, 113, 130, 14);
		contentPane.add(label_14);
		
		JLabel label_15 = new JLabel("\u0391\u03C6\u03BC :");
		label_15.setBounds(10, 138, 130, 14);
		contentPane.add(label_15);
		
		JLabel label_16 = new JLabel("Iban :");
		label_16.setBounds(10, 163, 130, 14);
		contentPane.add(label_16);
		
		JLabel label_17 = new JLabel("\u039C\u03B9\u03C3\u03B8\u03CC\u03C2 :");
		label_17.setBounds(10, 188, 130, 14);
		contentPane.add(label_17);
		
		JLabel label_18 = new JLabel("\u0397\u03BC\u03B5\u03C1\u03BF\u03BC\u03B7\u03BD\u03AF\u03B1 \u03C0\u03C1\u03CC\u03C3\u03BB\u03B7\u03C8\u03B7\u03C2 :");
		label_18.setBounds(10, 213, 130, 14);
		contentPane.add(label_18);
		
		JLabel label_19 = new JLabel("\u03A7\u03C1\u03CC\u03BD\u03B9\u03B1 \u03C5\u03C0\u03B7\u03C1\u03B5\u03C3\u03AF\u03B1\u03C2 :");
		label_19.setBounds(10, 236, 130, 14);
		contentPane.add(label_19);
		
		JButton anarotikes = new JButton("\u0391\u03BD\u03B1\u03C1\u03C9\u03C4\u03B9\u03BA\u03AD\u03C2");
		anarotikes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AnarotikesFrame frame = new AnarotikesFrame(result,index);
				frame.setVisible(true);
			}
		});
		anarotikes.setBounds(318, 27, 89, 23);
		contentPane.add(anarotikes);
		
		JLabel label = new JLabel("\u0391\u0394\u0395\u0399\u0395\u03A3");
		label.setBounds(336, 7, 46, 14);
		contentPane.add(label);
		
		JButton gonikes = new JButton("\u0393\u03BF\u03BD\u03B9\u03BA\u03AD\u03C2");
		gonikes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GonikesFrame frame = new GonikesFrame(result,index);
				frame.setVisible(true);
			}
		});
		gonikes.setBounds(318, 63, 89, 23);
		contentPane.add(gonikes);
		
		JButton kanonikes = new JButton("\u039A\u03B1\u03BD\u03BF\u03BD\u03B9\u03BA\u03AD\u03C2");
		kanonikes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				KanonikesFrame frame = new KanonikesFrame(result,index);
				frame.setVisible(true);
			}
		});
		kanonikes.setBounds(318, 97, 89, 23);
		contentPane.add(kanonikes);
		
		JButton repo = new JButton("\u03A1\u03B5\u03C0\u03CC");
		repo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				RepoFrame frame = new RepoFrame(result,index);
				frame.setVisible(true);
			}
		});
		repo.setBounds(318, 134, 89, 23);
		contentPane.add(repo);
		
		JButton duores = new JButton("\u0394\u03CD\u03C9\u03C1\u03B5\u03C2");
		duores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DuoresFrame frame = new DuoresFrame(result,index);
				frame.setVisible(true);
			}
		});
		duores.setBounds(318, 168, 89, 23);
		contentPane.add(duores);
		
		JButton alles = new JButton("Άλλες");
		alles.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AllesFrame frame = new AllesFrame(result,index);
				frame.setVisible(true);
			}
		});
		alles.setBounds(318, 204, 89, 23);
		contentPane.add(alles);
		
		
		
	}
}
