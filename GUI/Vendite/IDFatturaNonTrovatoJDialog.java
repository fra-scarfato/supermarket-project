package GUI.Vendite;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.ControllerVendite;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class IDFatturaNonTrovatoJDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private ControllerVendite ControllerV;

	public IDFatturaNonTrovatoJDialog(ControllerVendite ControllerVendite) {
		ControllerV = ControllerVendite;
		setBounds(100, 100, 450, 229);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Il numero della fattura inserito non \u00E8 corretto");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(42, 29, 352, 37);
		contentPanel.add(lblNewLabel);
		
		JButton RiprovaButton = new JButton("Riprova");
		RiprovaButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setVisible(false);
				
			}
		});
		RiprovaButton.setBounds(175, 126, 85, 21);
		contentPanel.add(RiprovaButton);
	}
}