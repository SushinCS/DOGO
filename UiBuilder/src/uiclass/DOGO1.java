package uiclass;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTabbedPane;

public class DOGO1 extends JPanel {

	/**
	 * Create the panel.
	 */
	public DOGO1() {
		 setLayout(null);
		
		JLabel lblDogo = new JLabel("DOGO");
		lblDogo.setBounds(188, 12, 70, 15);
		add(lblDogo);
		
		JButton btnSet = new JButton("Set");
		btnSet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblDogo.setText("Clicked");
			}
		});
		btnSet.setBounds(56, 202, 142, 25);
		add(btnSet);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setBounds(258, 202, 117, 25);
		add(btnClear);
		
		JTextArea txtrRequestArea = new JTextArea();
		txtrRequestArea.setText("Request Area");
		txtrRequestArea.setBounds(56, 48, 142, 126);
		add(txtrRequestArea);
		
		JTextArea txtrResponseArea = new JTextArea();
		txtrResponseArea.setText("Response Area");
		txtrResponseArea.setBounds(258, 48, 117, 126);
		add(txtrResponseArea);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(22, 160, 5, 7);
		add(tabbedPane);

	}
	public static void main(String args[])
	{
		DOGO1 dog=new DOGO1();
		dog.setVisible(true);
	}
}
