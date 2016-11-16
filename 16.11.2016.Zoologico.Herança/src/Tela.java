import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;

public class Tela extends JFrame {

	private JPanel contentPane;
	private JTextField jtfAvesOrigem;
	private JTextField jtfAvesHabitat;
	private JTextField jtfAvesNome;
	private JTextField jtfAvesRaca;
	private JTextField jtfFelinosOrigem;
	private JTextField jtfFelinosHabitat;
	private JTextField jtfFelinosNome;
	private JTextField jtfFelinosRaca;
	private JTextField jtfPrimatasOrigem;
	private JTextField jtfPrimatasHabitat;
	private JTextField jtfPrimatasNome;
	private JTextField jtfPrimatasRaca;
	private JTextField jtfAvesCor;
	private JTextField jtfAvesAlimentacao;
	private JButton jbtnAvesCadastrar;
	private JButton jbtnFelinosCadastrar;
	private JComboBox jcbAvesPorte;
	private JComboBox jcbFelinosPorte;
	private JComboBox jcbFelinosManchas;
	private JComboBox jcbFelinosPelagem;
	private JComboBox jcbPrimatasPorte;
	private HashMap<String, Aves> aves;
	private HashMap<String, GatoSelvagem> felinos;
	private HashMap<String, Primatas> primatas;
	private JTextField jtfRelatorioPesquisa;
	private JTextPane jtpRelatorio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela frame = new Tela();
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
	public Tela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		aves = new HashMap<>();
		felinos = new HashMap<>();
		primatas = new HashMap<>();

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 524, 429);
		contentPane.add(tabbedPane);

		JPanel panel = new JPanel();
		tabbedPane.addTab("Aves", null, panel, null);
		panel.setLayout(null);

		jtfAvesOrigem = new JTextField();
		jtfAvesOrigem.setColumns(10);
		jtfAvesOrigem.setBounds(115, 183, 383, 32);
		panel.add(jtfAvesOrigem);

		JLabel label = new JLabel("Origem:");
		label.setBounds(21, 186, 92, 26);
		panel.add(label);

		JLabel label_1 = new JLabel("Habitat:");
		label_1.setBounds(21, 145, 92, 26);
		panel.add(label_1);

		jtfAvesHabitat = new JTextField();
		jtfAvesHabitat.setColumns(10);
		jtfAvesHabitat.setBounds(115, 142, 383, 32);
		panel.add(jtfAvesHabitat);

		jcbAvesPorte = new JComboBox();
		jcbAvesPorte.setModel(new DefaultComboBoxModel(new String[] { "Pequeno", "M\u00E9dio", "Grande" }));
		jcbAvesPorte.setBounds(115, 101, 383, 32);
		panel.add(jcbAvesPorte);

		JLabel label_2 = new JLabel("Porte:");
		label_2.setBounds(21, 104, 92, 26);
		panel.add(label_2);

		JLabel label_3 = new JLabel("Nome:");
		label_3.setBounds(21, 64, 92, 26);
		panel.add(label_3);

		jtfAvesNome = new JTextField();
		jtfAvesNome.setColumns(10);
		jtfAvesNome.setBounds(115, 61, 383, 32);
		panel.add(jtfAvesNome);

		jtfAvesRaca = new JTextField();
		jtfAvesRaca.setColumns(10);
		jtfAvesRaca.setBounds(115, 21, 383, 32);
		panel.add(jtfAvesRaca);

		JLabel label_4 = new JLabel("Ra\u00E7a:");
		label_4.setBounds(21, 24, 92, 26);
		panel.add(label_4);

		JLabel lblCor = new JLabel("Cor:");
		lblCor.setBounds(21, 227, 92, 26);
		panel.add(lblCor);

		jtfAvesCor = new JTextField();
		jtfAvesCor.setBounds(115, 224, 383, 32);
		panel.add(jtfAvesCor);
		jtfAvesCor.setColumns(10);

		JLabel lblAlimentao = new JLabel("Alimenta\u00E7\u00E3o:");
		lblAlimentao.setBounds(21, 268, 92, 26);
		panel.add(lblAlimentao);

		jtfAvesAlimentacao = new JTextField();
		jtfAvesAlimentacao.setBounds(115, 265, 383, 32);
		panel.add(jtfAvesAlimentacao);
		jtfAvesAlimentacao.setColumns(10);

		jbtnAvesCadastrar = new JButton("Cadastrar");
		jbtnAvesCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				jbtnAvesCadastrarActionPerformed(arg0);
			}
		});
		jbtnAvesCadastrar.setBounds(357, 318, 141, 35);
		panel.add(jbtnAvesCadastrar);

		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Felinos", null, panel_1, null);
		panel_1.setLayout(null);

		jtfFelinosOrigem = new JTextField();
		jtfFelinosOrigem.setColumns(10);
		jtfFelinosOrigem.setBounds(115, 183, 383, 32);
		panel_1.add(jtfFelinosOrigem);

		JLabel label_5 = new JLabel("Origem:");
		label_5.setBounds(21, 186, 92, 26);
		panel_1.add(label_5);

		JLabel label_6 = new JLabel("Habitat:");
		label_6.setBounds(21, 145, 92, 26);
		panel_1.add(label_6);

		jtfFelinosHabitat = new JTextField();
		jtfFelinosHabitat.setColumns(10);
		jtfFelinosHabitat.setBounds(115, 142, 383, 32);
		panel_1.add(jtfFelinosHabitat);

		jcbFelinosPorte = new JComboBox();
		jcbFelinosPorte.setModel(new DefaultComboBoxModel(new String[] { "Pequeno", "M\u00E9dio", "Grande" }));
		jcbFelinosPorte.setBounds(115, 101, 383, 32);
		panel_1.add(jcbFelinosPorte);

		JLabel label_7 = new JLabel("Porte:");
		label_7.setBounds(21, 104, 92, 26);
		panel_1.add(label_7);

		JLabel label_8 = new JLabel("Nome:");
		label_8.setBounds(21, 64, 92, 26);
		panel_1.add(label_8);

		jtfFelinosNome = new JTextField();
		jtfFelinosNome.setColumns(10);
		jtfFelinosNome.setBounds(115, 61, 383, 32);
		panel_1.add(jtfFelinosNome);

		jtfFelinosRaca = new JTextField();
		jtfFelinosRaca.setColumns(10);
		jtfFelinosRaca.setBounds(115, 21, 383, 32);
		panel_1.add(jtfFelinosRaca);

		JLabel label_9 = new JLabel("Ra\u00E7a:");
		label_9.setBounds(21, 24, 92, 26);
		panel_1.add(label_9);

		JLabel lblPelagem = new JLabel("Pelagem:");
		lblPelagem.setBounds(21, 227, 92, 26);
		panel_1.add(lblPelagem);

		jcbFelinosPelagem = new JComboBox();
		jcbFelinosPelagem.setModel(new DefaultComboBoxModel(new String[] { "Pardo", "Preto" }));
		jcbFelinosPelagem.setBounds(115, 224, 383, 32);
		panel_1.add(jcbFelinosPelagem);

		JLabel lblManchas = new JLabel("Manchas:");
		lblManchas.setBounds(21, 268, 92, 26);
		panel_1.add(lblManchas);

		jcbFelinosManchas = new JComboBox();
		jcbFelinosManchas.setModel(new DefaultComboBoxModel(new String[] { "Ausente", "Pintado", "Listrado" }));
		jcbFelinosManchas.setBounds(115, 265, 383, 32);
		panel_1.add(jcbFelinosManchas);

		JButton jbtnFelinosCadastrar = new JButton("Cadastrar");
		jbtnFelinosCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jbtnFelinosCadastrarActionPerformed(e);
			}
		});
		jbtnFelinosCadastrar.setBounds(357, 318, 141, 35);
		panel_1.add(jbtnFelinosCadastrar);

		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Primatas", null, panel_2, null);
		panel_2.setLayout(null);

		jtfPrimatasOrigem = new JTextField();
		jtfPrimatasOrigem.setColumns(10);
		jtfPrimatasOrigem.setBounds(115, 183, 383, 32);
		panel_2.add(jtfPrimatasOrigem);

		JLabel label_10 = new JLabel("Origem:");
		label_10.setBounds(21, 186, 92, 26);
		panel_2.add(label_10);

		JLabel label_11 = new JLabel("Habitat:");
		label_11.setBounds(21, 145, 92, 26);
		panel_2.add(label_11);

		jtfPrimatasHabitat = new JTextField();
		jtfPrimatasHabitat.setColumns(10);
		jtfPrimatasHabitat.setBounds(115, 142, 383, 32);
		panel_2.add(jtfPrimatasHabitat);

		jcbPrimatasPorte = new JComboBox();
		jcbPrimatasPorte.setModel(new DefaultComboBoxModel(new String[] { "Pequeno", "M\u00E9dio", "Grande" }));
		jcbPrimatasPorte.setBounds(115, 101, 383, 32);
		panel_2.add(jcbPrimatasPorte);

		JLabel label_12 = new JLabel("Porte:");
		label_12.setBounds(21, 104, 92, 26);
		panel_2.add(label_12);

		JLabel label_13 = new JLabel("Nome:");
		label_13.setBounds(21, 64, 92, 26);
		panel_2.add(label_13);

		jtfPrimatasNome = new JTextField();
		jtfPrimatasNome.setColumns(10);
		jtfPrimatasNome.setBounds(115, 61, 383, 32);
		panel_2.add(jtfPrimatasNome);

		jtfPrimatasRaca = new JTextField();
		jtfPrimatasRaca.setColumns(10);
		jtfPrimatasRaca.setBounds(115, 21, 383, 32);
		panel_2.add(jtfPrimatasRaca);

		JLabel label_14 = new JLabel("Ra\u00E7a:");
		label_14.setBounds(21, 24, 92, 26);
		panel_2.add(label_14);

		JButton jbtnPrimatasCadastrar = new JButton("Cadastrar");
		jbtnPrimatasCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jbtnPrimatasCadastrarActionPerformed(e);
			}
		});
		jbtnPrimatasCadastrar.setBounds(357, 236, 141, 35);
		panel_2.add(jbtnPrimatasCadastrar);

		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Relat\u00F3rio", null, panel_3, null);
		panel_3.setLayout(null);

		JButton jbtnRelatorioAves = new JButton("Aves");
		jbtnRelatorioAves.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jbtnRelatorioAvesActionPerformes(e);
			}
		});
		jbtnRelatorioAves.setBounds(21, 21, 141, 35);
		panel_3.add(jbtnRelatorioAves);

		JButton jbtnRelatorioPrimatas = new JButton("Primatas");
		jbtnRelatorioPrimatas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jbtnRelatorioPrimatasActionPerformes(e);
			}
		});
		jbtnRelatorioPrimatas.setBounds(357, 21, 141, 35);
		panel_3.add(jbtnRelatorioPrimatas);

		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(21, 131, 92, 26);
		panel_3.add(lblNome);

		jtfRelatorioPesquisa = new JTextField();
		jtfRelatorioPesquisa.setBounds(106, 128, 219, 32);
		panel_3.add(jtfRelatorioPesquisa);
		jtfRelatorioPesquisa.setColumns(10);

		JButton jtbnPesquisar = new JButton("Pesquisar");
		jtbnPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jbtnPesquisaActionPerformes(e);
			}
		});
		jtbnPesquisar.setBounds(357, 127, 141, 35);
		panel_3.add(jtbnPesquisar);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(21, 182, 477, 186);
		panel_3.add(scrollPane);

		jtpRelatorio = new JTextPane();
		scrollPane.setViewportView(jtpRelatorio);

		JButton jbtnRelatorioFelinos = new JButton("Felinos");
		jbtnRelatorioFelinos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jbtnRelatorioFelinosActionPerformes(e);
			}
		});
		jbtnRelatorioFelinos.setBounds(21, 75, 141, 35);
		panel_3.add(jbtnRelatorioFelinos);

		JButton jbtnRelatorioTodos = new JButton("Todos");
		jbtnRelatorioTodos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jbtnTelatorioTodosActionPerformed(e);
			}
		});
		jbtnRelatorioTodos.setBounds(357, 77, 141, 35);
		panel_3.add(jbtnRelatorioTodos);
	}

	protected void jbtnPesquisaActionPerformes(ActionEvent e) {
		String lista = "";
		for(String pa: aves.keySet()){
			if (pa.equalsIgnoreCase(jtfRelatorioPesquisa.getText())){
				lista += aves.get(pa).toString();
			}
		}
		for(String pf: felinos.keySet()){
			if (pf.equalsIgnoreCase(jtfRelatorioPesquisa.getText())){
				lista += felinos.get(pf).toString();
			}
		}
		for(String pm: primatas.keySet()){
			if (pm.equalsIgnoreCase(jtfRelatorioPesquisa.getText())){
				lista += primatas.get(pm).toString();
			}
		}
		if (lista.trim().length()<=0)
			jtpRelatorio.setText("Nenhum animal encontrado com este nome.");
		else
			jtpRelatorio.setText(lista);
	}

	protected void jbtnTelatorioTodosActionPerformed(ActionEvent e) {
		jtpRelatorio.setText(listaTodos());
	}

	protected void jbtnRelatorioPrimatasActionPerformes(ActionEvent e) {
		jtpRelatorio.setText(listaPrimatas());
	}

	protected void jbtnRelatorioFelinosActionPerformes(ActionEvent e) {
		jtpRelatorio.setText(listaFelinos());
	}

	protected void jbtnRelatorioAvesActionPerformes(ActionEvent e) {
		jtpRelatorio.setText(listaAves());
	}

	public String listaAves() {
		if (!aves.isEmpty()) {
			String lista = "Aves: ";
			for (Aves la : aves.values())
				lista += la.toString();
			return lista;
		} else
			return "Nenhuma ave cadastrada.";
	}

	public String listaFelinos() {
		if (!felinos.isEmpty()) {
			String lista = "Felinos: ";
			for (GatoSelvagem lf : felinos.values())
				lista += lf.toString();
			return lista;
		} else
			return "Nenhum felino cadastrado.";
	}

	public String listaPrimatas() {
		if(!primatas.isEmpty()){
		String lista = "Primatas: ";
		for (Primatas lp : primatas.values())
			lista += lp.toString();
		return lista;
		} else
			return "Nenhum primata cadastrado.";
	}

	public String listaTodos() {
		String lista = "Aves:";
		if(!aves.isEmpty()){
		for (Aves la : aves.values())
			lista += la.toString();
		}
		else
			lista += "Nenhuma.";
		lista += "\n\nFelinos:";
		if(!felinos.isEmpty()){
		for (GatoSelvagem lf : felinos.values())
			lista += lf.toString();
		} else
			lista += "Nenhum.";
		lista += "\n\nPrimatas: ";
		if(!primatas.isEmpty()){ 
		for (Primatas lp : primatas.values())
			lista += lp.toString();
		} else
			lista += "Nenhum.";
		return lista;
	}

	protected void jbtnPrimatasCadastrarActionPerformed(ActionEvent e) {

		try {
			primatas.put(jtfPrimatasNome.getText(),
					new Primatas(jtfPrimatasRaca.getText(), jtfPrimatasNome.getText(),
							jcbPrimatasPorte.getSelectedItem().toString(), jtfPrimatasHabitat.getText(),
							jtfPrimatasOrigem.getText()));
		} catch (Exception e1) {
			JOptionPane.showMessageDialog(this, e1.getMessage());
		}

	}

	protected void jbtnFelinosCadastrarActionPerformed(ActionEvent e) {

		try {
			felinos.put(jtfFelinosNome.getText(),
					new GatoSelvagem(jtfFelinosRaca.getText(), jtfFelinosNome.getText(),
							jcbFelinosPorte.getSelectedItem().toString(), jtfFelinosHabitat.getText(),
							jtfFelinosOrigem.getText(), jcbFelinosPelagem.getSelectedItem().toString(),
							jcbFelinosManchas.getSelectedItem().toString()));
		} catch (Exception e1) {
			JOptionPane.showMessageDialog(this, e1.getMessage());
		}
	}

	protected void jbtnAvesCadastrarActionPerformed(ActionEvent arg0) {

		try {
			aves.put(jtfAvesNome.getText(),
					new Aves(jtfAvesRaca.getText(), jtfAvesNome.getText(), jcbAvesPorte.getSelectedItem().toString(),
							jtfAvesHabitat.getText(), jtfAvesOrigem.getText(), jtfAvesCor.getText(),
							jtfAvesAlimentacao.getText()));
		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, e.getMessage());
		}

	}
}
