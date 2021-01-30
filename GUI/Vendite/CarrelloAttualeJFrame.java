package GUI.Vendite;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

import Controller.ControllerCliente;
import Controller.ControllerPrincipale;
import Controller.ControllerVendite;

import java.awt.event.ActionListener;
import java.sql.Date;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTable;

public class CarrelloAttualeJFrame extends JFrame {

	private JPanel VenditePanel;
	private ControllerVendite ControllerV;
	private DefaultTableModel ModelKG = new DefaultTableModel(new String[] {"ID Prodotto", "Quantit� (kg)"},0)
	{
		 public boolean isCellEditable(int row, int column) {
		       return false; //Tabella non modificabile
		    }
		 
	};
	
	private DefaultTableModel ModelN = new DefaultTableModel(new String[] {"ID Prodotto", "Quantit� (n)"},0)
	{
		 public boolean isCellEditable(int row, int column) {
		       return false; //Tabella non modificabile
		    }
		 
	};
	private JTable ProdottiKGTable;
	private JTable ProdottiNTable;

	
	
	
	public  CarrelloAttualeJFrame(ControllerVendite CV) {
		ControllerV = CV;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(150, 80, 500, 532);
		setResizable(false);
		VenditePanel = new JPanel();
		VenditePanel.setBackground(new Color(255, 222, 173));
		VenditePanel.setAlignmentX(Component.LEFT_ALIGNMENT);
		VenditePanel.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(VenditePanel);
		VenditePanel.setLayout(null);
		
		JLabel PrezzoLB = new JLabel("Prezzo :");
		PrezzoLB.setFont(new Font("Arial", Font.PLAIN, 13));
		PrezzoLB.setBounds(342, 385, 54, 14);
		VenditePanel.add(PrezzoLB);
		
		JLabel PuntiLB = new JLabel("Punti :");
		PuntiLB.setFont(new Font("Arial", Font.PLAIN, 13));
		PuntiLB.setBounds(352, 410, 47, 14);
		VenditePanel.add(PuntiLB);
		
		JScrollPane TabellaKGPanel = new JScrollPane();
		TabellaKGPanel.setBounds(0, 0, 486, 187);
		TabellaKGPanel.setBackground(new Color(255, 222, 173));
		TabellaKGPanel.setBorder(null);
		VenditePanel.add(TabellaKGPanel);
		
		ProdottiKGTable = new JTable(ModelKG);
		ProdottiKGTable.setFont(new Font("Arial", Font.PLAIN, 11));
		ProdottiKGTable.setRowSelectionAllowed(false);
		ProdottiKGTable.setBackground(new Color(255, 204, 153));
		ProdottiKGTable.setAutoCreateRowSorter(true);
		ProdottiKGTable.getTableHeader().setReorderingAllowed(false);
		TabellaKGPanel.setViewportView(ProdottiKGTable);
		
		JScrollPane TabellaNPanel = new JScrollPane();
		TabellaNPanel.setBounds(0, 187, 486, 187);
		TabellaNPanel.setBackground(new Color(255, 222, 173));
		TabellaNPanel.setBorder(null);
		VenditePanel.add(TabellaNPanel);
		
		ProdottiNTable = new JTable(ModelN);
		ProdottiNTable.setFont(new Font("Arial", Font.PLAIN, 11));
		ProdottiNTable.setRowSelectionAllowed(false);
		ProdottiNTable.setBackground(new Color(255, 204, 153));
		ProdottiNTable.setAutoCreateRowSorter(true);
		ProdottiNTable.getTableHeader().setReorderingAllowed(false);
		TabellaNPanel.setViewportView(ProdottiNTable);
		
		JButton AggiornaButton = new JButton("Aggiorna");
		AggiornaButton.setBounds(274, 461, 89, 23);
		VenditePanel.add(AggiornaButton);
		
		JButton FatturaButton = new JButton("Genera Fattura");
		FatturaButton.setBounds(373, 461, 107, 23);
		VenditePanel.add(FatturaButton);
	}
	
	public void setRigheTabellaKG(int ID_Prodotto, float Quantit�) {
		ModelKG.addRow(new Object[]{ID_Prodotto, Quantit�});
		}
	
	public void setRigheTabellaN(int ID_Prodotto, int Quantit�) {
		ModelN.addRow(new Object[]{ID_Prodotto, Quantit�});
		}
}