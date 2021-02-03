package GUI.Magazzino;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.Box;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;


import Controller.ControllerMagazzino;
import Controller.ControllerPrincipale;


public class AggiungiLatticiniJFrame extends JFrame {

	private JPanel AggiungiLatticiniPanel;
	private JTextField InserisciNomeTB;
	private JTextField InserisciPaeseLavorazioneTB;
	private JTextField InserisciPaeseMungituraTB;
	private JTextField InserisciValorekgTB;
	private JTextField InserisciScorteTB;
	private ControllerMagazzino ControllerM;
	private JComboBox InserisciGiornoMungituraCB;
	private JComboBox InserisciMeseMungituraCB;
	private JComboBox InserisciAnnoMungituraCB;
	private JComboBox InserisciGiornoScadenzaCB;
	private JComboBox InserisciMeseScadenzaCB;
	private JComboBox InserisciAnnoScadenzaCB;
	private ControllerPrincipale ControllerP;


	/**
	 * Create the frame.
	 */
	public AggiungiLatticiniJFrame(ControllerMagazzino c, ControllerPrincipale cp) {
		ControllerM = c;
		ControllerP = cp;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(150, 80, 1000, 600);
		AggiungiLatticiniPanel = new JPanel();
		setResizable(false);
		setTitle("ProgettoOOBD2020");
		AggiungiLatticiniPanel.setBackground(new Color(255, 228, 181));
		AggiungiLatticiniPanel.setAlignmentX(Component.LEFT_ALIGNMENT);
		AggiungiLatticiniPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(AggiungiLatticiniPanel);
		AggiungiLatticiniPanel.setLayout(null);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBackground(new Color(255, 153, 51));
		toolBar.setBorder(null);
		toolBar.setFloatable(false);
		toolBar.setOrientation(SwingConstants.VERTICAL);
		toolBar.setBounds(0, 0, 66, 563);
		AggiungiLatticiniPanel.add(toolBar);
		
		
		JButton ClientiButton = new JButton("");
		ClientiButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControllerP.AggiungiLatticiniMenuLateraleClientiBottonePremuto();
			}
		});
		toolBar.add(ClientiButton);
		ClientiButton.setBackground(new Color(255, 153, 51));
		ClientiButton.setBorderPainted(false);
		ClientiButton.setBorder(null);
		ClientiButton.setIcon(new ImageIcon(AggiungiLatticiniJFrame.class.getResource("/Risorse/cliente.png")));
		ClientiButton.setMaximumSize(new Dimension(65, 70));
		
		
		JButton VenditeButton = new JButton("");
		VenditeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControllerP.AggiungiLatticiniMenuLateraleVenditeBottonePremuto();
			}
		});
		toolBar.add(VenditeButton);
		VenditeButton.setBackground(new Color(255, 153, 51));
		VenditeButton.setBorder(null);
		VenditeButton.setBorderPainted(false);
		VenditeButton.setIcon(new ImageIcon(AggiungiLatticiniJFrame.class.getResource("/Risorse/vendite-menu.png")));
		VenditeButton.setMaximumSize(new Dimension(65, 70));
		
		
		JButton MagazzinoButton = new JButton("");
		toolBar.add(MagazzinoButton);
		MagazzinoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControllerP.AggiungiLatticiniMenuLateraleMagazzinoBottonePremuto();
			}
		});
		MagazzinoButton.setBackground(new Color(255, 153, 51));
		MagazzinoButton.setIcon(new ImageIcon(AggiungiLatticiniJFrame.class.getResource("/Risorse/magazzino.png")));
		MagazzinoButton.setBorderPainted(false);
		MagazzinoButton.setBorder(null);
		MagazzinoButton.setMaximumSize(new Dimension(65, 70));
		
		Component verticalStrut = Box.createVerticalStrut(280);
		toolBar.add(verticalStrut);
		verticalStrut.setMaximumSize(new Dimension(32767, 300));
		
		JToolBar percorsoTB = new JToolBar();
		percorsoTB.setBorder(null);
		percorsoTB.setAlignmentX(Component.LEFT_ALIGNMENT);
		percorsoTB.setBorderPainted(false);
		percorsoTB.setFloatable(false);
		percorsoTB.setBackground(new Color(255, 204, 153));
		percorsoTB.setMaximumSize(new Dimension(100, 100));
		percorsoTB.setBounds(65, 0, 976, 30);
		AggiungiLatticiniPanel.add(percorsoTB);
		
		JButton MagazzinoPercorsoButton = new JButton("> Magazzino");
		MagazzinoPercorsoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControllerM.Latticini_MagazzinoPercorsoBottonePremuto();
			}
		});
		MagazzinoPercorsoButton.setFont(new Font("Arial", Font.PLAIN, 11));
		percorsoTB.add(MagazzinoPercorsoButton);
		
		JButton AggiungiNuovoProdottoPercorsoButton = new JButton("> Aggiungi Nuovo Prodotto");
		AggiungiNuovoProdottoPercorsoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControllerM.Latticini_AggiungiProdottoPercorsoBottonePremuto();
			}
		});
		AggiungiNuovoProdottoPercorsoButton.setFont(new Font("Arial", Font.PLAIN, 11));
		percorsoTB.add(AggiungiNuovoProdottoPercorsoButton);
		
		JButton LatticiniPercorsoButton = new JButton("> Latticini");
		LatticiniPercorsoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControllerM.Latticini_LatticiniPercorsoBottonePremuto();
			}
		});
		LatticiniPercorsoButton.setFont(new Font("Arial", Font.PLAIN, 11));
		percorsoTB.add(LatticiniPercorsoButton);
		
		JLabel AggiungiLatticini1LB = new JLabel("Benvenuto\\a nella sezione dedicata all'aggiunta di un nuovo prodotto di tipo Latticino!");
		AggiungiLatticini1LB.setFont(new Font("Arial", Font.BOLD, 14));
		AggiungiLatticini1LB.setHorizontalAlignment(SwingConstants.CENTER);
		AggiungiLatticini1LB.setBounds(181, 51, 641, 37);
		AggiungiLatticiniPanel.add(AggiungiLatticini1LB);
		
		JLabel AggiungiLatticini2LB = new JLabel("Compila i seguenti campi con le relative informazioni");
		AggiungiLatticini2LB.setFont(new Font("Arial", Font.PLAIN, 13));
		AggiungiLatticini2LB.setBounds(334, 97, 318, 16);
		AggiungiLatticiniPanel.add(AggiungiLatticini2LB);
		
		JLabel InserisciNomeLB = new JLabel("Nome : ");
		InserisciNomeLB.setHorizontalAlignment(SwingConstants.RIGHT);
		InserisciNomeLB.setFont(new Font("Arial", Font.PLAIN, 12));
		InserisciNomeLB.setBounds(129, 171, 150, 20);
		AggiungiLatticiniPanel.add(InserisciNomeLB);
		
		JLabel InserisciPaeseLavorazioneLB = new JLabel("Paese Lavorazione : ");
		InserisciPaeseLavorazioneLB.setHorizontalAlignment(SwingConstants.RIGHT);
		InserisciPaeseLavorazioneLB.setFont(new Font("Arial", Font.PLAIN, 12));
		InserisciPaeseLavorazioneLB.setBounds(129, 222, 150, 20);
		AggiungiLatticiniPanel.add(InserisciPaeseLavorazioneLB);
		
		JLabel InserisciValoreLB = new JLabel("Valore al kg : ");
		InserisciValoreLB.setHorizontalAlignment(SwingConstants.RIGHT);
		InserisciValoreLB.setFont(new Font("Arial", Font.PLAIN, 12));
		InserisciValoreLB.setBounds(129, 267, 150, 20);
		AggiungiLatticiniPanel.add(InserisciValoreLB);
		
		JLabel InserisciDataMungituraLB = new JLabel("Data Mungitura : ");
		InserisciDataMungituraLB.setHorizontalAlignment(SwingConstants.RIGHT);
		InserisciDataMungituraLB.setFont(new Font("Arial", Font.PLAIN, 12));
		InserisciDataMungituraLB.setBounds(129, 317, 150, 20);
		AggiungiLatticiniPanel.add(InserisciDataMungituraLB);
		
		JLabel InserisciPaeseMungituraLB = new JLabel("Paese Mungitura :");
		InserisciPaeseMungituraLB.setHorizontalAlignment(SwingConstants.RIGHT);
		InserisciPaeseMungituraLB.setFont(new Font("Arial", Font.PLAIN, 12));
		InserisciPaeseMungituraLB.setBounds(139, 398, 140, 20);
		AggiungiLatticiniPanel.add(InserisciPaeseMungituraLB);
		
		InserisciNomeTB = new JTextField();
		InserisciNomeTB.setFont(new Font("Arial", Font.PLAIN, 11));
		InserisciNomeTB.setBounds(316, 172, 190, 19);
		AggiungiLatticiniPanel.add(InserisciNomeTB);
		InserisciNomeTB.setColumns(10);
		
		InserisciPaeseLavorazioneTB = new JTextField();
		InserisciPaeseLavorazioneTB.setFont(new Font("Arial", Font.PLAIN, 11));
		InserisciPaeseLavorazioneTB.setBounds(316, 223, 190, 19);
		AggiungiLatticiniPanel.add(InserisciPaeseLavorazioneTB);
		InserisciPaeseLavorazioneTB.setColumns(10);
		
		InserisciGiornoMungituraCB = new JComboBox();
		InserisciGiornoMungituraCB.setFont(new Font("Arial", Font.PLAIN, 12));
		InserisciGiornoMungituraCB.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		InserisciGiornoMungituraCB.setBounds(316, 317, 45, 21);
		AggiungiLatticiniPanel.add(InserisciGiornoMungituraCB);
		
		InserisciMeseMungituraCB = new JComboBox();
		InserisciMeseMungituraCB.setFont(new Font("Arial", Font.PLAIN, 12));
		InserisciMeseMungituraCB.setModel(new DefaultComboBoxModel(new String[] {"GENNAIO", "FEBBRAIO", "MARZO", "APRILE", "MAGGIO", "GIUGNO", "LUGLIO", "AGOSTO", "SETTEMBRE", "OTTOBRE", "NOVEMBRE", "DICEMBRE"}));
		InserisciMeseMungituraCB.setBounds(368, 317, 103, 21);
		AggiungiLatticiniPanel.add(InserisciMeseMungituraCB);
		
		
		
		InserisciAnnoMungituraCB = new JComboBox();
		InserisciAnnoMungituraCB.setFont(new Font("Arial", Font.PLAIN, 12));
		InserisciAnnoMungituraCB.setModel(new DefaultComboBoxModel(new String[] {"2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021"}));
		InserisciAnnoMungituraCB.setBounds(481, 317, 66, 21);
		AggiungiLatticiniPanel.add(InserisciAnnoMungituraCB);
		
		InserisciPaeseMungituraTB = new JTextField();
		InserisciPaeseMungituraTB.setFont(new Font("Arial", Font.PLAIN, 11));
		InserisciPaeseMungituraTB.setBounds(316, 399, 190, 19);
		AggiungiLatticiniPanel.add(InserisciPaeseMungituraTB);
		InserisciPaeseMungituraTB.setColumns(10);
		
		InserisciValorekgTB = new JTextField();
		InserisciValorekgTB.setFont(new Font("Arial", Font.PLAIN, 11));
		InserisciValorekgTB.setBounds(316, 267, 96, 20);
		AggiungiLatticiniPanel.add(InserisciValorekgTB);
		InserisciValorekgTB.setColumns(10);
		
		JLabel EuroLB = new JLabel("\u20AC");
		EuroLB.setFont(new Font("Arial", Font.ITALIC, 14));
		EuroLB.setBounds(422, 269, 8, 14);
		AggiungiLatticiniPanel.add(EuroLB);
		
		JLabel InserisciScorteLB = new JLabel("Scorte :");
		InserisciScorteLB.setFont(new Font("Arial", Font.PLAIN, 12));
		InserisciScorteLB.setBounds(234, 441, 45, 14);
		AggiungiLatticiniPanel.add(InserisciScorteLB);
		
		InserisciScorteTB = new JTextField();
		InserisciScorteTB.setFont(new Font("Arial", Font.PLAIN, 11));
		InserisciScorteTB.setColumns(10);
		InserisciScorteTB.setBounds(316, 439, 96, 20);
		AggiungiLatticiniPanel.add(InserisciScorteTB);
		
		JLabel KgLB = new JLabel("Kg");
		KgLB.setFont(new Font("Arial", Font.ITALIC, 14));
		KgLB.setBounds(422, 437, 27, 20);
		AggiungiLatticiniPanel.add(KgLB);
		
		JButton AggiungiProdottoButton = new JButton("Aggiungi Prodotto");
		AggiungiProdottoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
					ControllerM.LatticiniBottoneAvantiPremuto();
			
			}
		});
		AggiungiProdottoButton.setFont(new Font("Arial", Font.PLAIN, 11));
		AggiungiProdottoButton.setBounds(799, 484, 137, 31);
		AggiungiLatticiniPanel.add(AggiungiProdottoButton);
		
		JLabel InserisciDataScadenzaLB = new JLabel("Data Scadenza : ");
		InserisciDataScadenzaLB.setHorizontalAlignment(SwingConstants.RIGHT);
		InserisciDataScadenzaLB.setFont(new Font("Arial", Font.PLAIN, 12));
		InserisciDataScadenzaLB.setBounds(129, 359, 150, 20);
		AggiungiLatticiniPanel.add(InserisciDataScadenzaLB);
		
		InserisciGiornoScadenzaCB = new JComboBox();
		InserisciGiornoScadenzaCB.setFont(new Font("Arial", Font.PLAIN, 12));
		InserisciGiornoScadenzaCB.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		InserisciGiornoScadenzaCB.setBounds(316, 358, 45, 21);
		AggiungiLatticiniPanel.add(InserisciGiornoScadenzaCB);
		
		InserisciMeseScadenzaCB = new JComboBox();
		InserisciMeseScadenzaCB.setFont(new Font("Arial", Font.PLAIN, 12));
		InserisciMeseScadenzaCB.setModel(new DefaultComboBoxModel(new String[] {"GENNAIO", "FEBBRAIO", "MARZO", "APRILE", "MAGGIO", "GIUGNO", "LUGLIO", "AGOSTO", "SETTEMBRE", "OTTOBRE", "NOVEMBRE", "DICEMBRE"}));
		InserisciMeseScadenzaCB.setBounds(368, 358, 103, 21);
		AggiungiLatticiniPanel.add(InserisciMeseScadenzaCB);
		
		InserisciAnnoScadenzaCB = new JComboBox();
		InserisciAnnoScadenzaCB.setFont(new Font("Arial", Font.PLAIN, 12));
		InserisciAnnoScadenzaCB.setModel(new DefaultComboBoxModel(new String[] {"2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030"}));
		InserisciAnnoScadenzaCB.setBounds(481, 358, 66, 21);
		AggiungiLatticiniPanel.add(InserisciAnnoScadenzaCB);
		
		JButton IndietroButton = new JButton("Indietro");
		IndietroButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControllerM.LatticiniBottoneIndietroPremuto();
			}
		});
		IndietroButton.setFont(new Font("Arial", Font.PLAIN, 11));
		IndietroButton.setBounds(652, 484, 137, 31);
		AggiungiLatticiniPanel.add(IndietroButton);
	}


	public String getInserisciNomeTB() {
		return InserisciNomeTB.getText();
	}


	public String getInserisciPaeseLavorazioneTB() {
		return InserisciPaeseLavorazioneTB.getText();
	}


	public String getInserisciPaeseMungituraTB() {
		return InserisciPaeseMungituraTB.getText();
	}


	public String getInserisciValorekgTB() {
		return InserisciValorekgTB.getText();
	}


	public String getInserisciScorteTB() {
		return InserisciScorteTB.getText();
	}


	public String getInserisciGiornoMungituraCB() {
		return InserisciGiornoMungituraCB.getSelectedItem().toString();
	}


	public String getInserisciMeseMungituraCB() {
		return InserisciMeseMungituraCB.getSelectedItem().toString();
	}


	public String getInserisciAnnoMungituraCB() {
		return InserisciAnnoMungituraCB.getSelectedItem().toString();
	}


	public String getInserisciGiornoScadenzaCB() {
		return InserisciGiornoScadenzaCB.getSelectedItem().toString();
	}


	public String getInserisciMeseScadenzaCB() {
		return InserisciMeseScadenzaCB.getSelectedItem().toString();
	}


	public String getInserisciAnnoScadenzaCB() {
		return InserisciAnnoScadenzaCB.getSelectedItem().toString();
	}
	
	
	
	
}
