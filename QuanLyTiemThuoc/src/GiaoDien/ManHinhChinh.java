package GiaoDien;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.swing.SwingConstants;
import java.awt.Color;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import pharmacy.Pharmacy;
import pharmacy.PharmacyModify;

import javax.swing.JSeparator;
import java.awt.Dimension;
import javax.swing.JComboBox;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class ManHinhChinh extends JFrame {

	public JPanel contentPane;
	public JTextField textFieldMaThuocThemThuoc;
	public JTextField textFieldTenThuocThemThuoc;
	public JTextField textFieldGiaThemThuoc;
	public JTextField textFieldSoLuongThemThuoc;
	public JTextField textFieldCachDungThemThuoc;
	public JTextField textFieldTenThuocTraCuu;
	public JComboBox comboBoxDvtThemThuoc;

	public JTable table;
	public JPanel panelThemThuoc;
	public JTabbedPane tabbedPane;
	public JTextField textFieldMaThuocCapNhat;
	public JTextField textFieldTenThuocCapNhat;
	public JTextField textFieldGiaCapNhat;
	public JTextField textFieldSoLuongCapNhat;
	public JTextField textFieldCachDungCapNhat;
	public JComboBox comboBoxDVTCapNhat;
	
	DefaultTableModel tableModel;
	List<Pharmacy> pharmacyList = new ArrayList<>();
	public String[] model_DVT;
	public Integer[] model_index_comboboxCapNhat;
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				System.out.println("cc");
				try {
					ManHinhChinh frame = new ManHinhChinh();
					frame.setLocationRelativeTo(null);
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
	public ManHinhChinh() {
		
		
		//setIcon cho Frame mÃ n hÃ¬nh chÃ­nh
		URL url_iconPlus = ManHinhChinh.class.getResource("Plus-icon.png");
		Image imgFrame = Toolkit.getDefaultToolkit().createImage(url_iconPlus);
		this.setIconImage(imgFrame);
		
		setTitle("QUáº¢N LÃ� THUá»�C");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//this.setLocationRelativeTo(null);
		//this.setExtendedState(MAXIMIZED_BOTH);
//		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
//		this.setLocation(dim.width/2 - this.getSize().width/2, dim.height/2 - this.getSize().height/2);
		
		
		/////////////////////////////////////////////////////////////////////
//		ActionListener ac = new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				String src = e.getActionCommand();
//				
//				if(src.equals("THÃŠM"))
//				{
//					btnThem(e);
//				}
//				else if(src.equals("RESET")) {
//					btnReset(e);
//				}
//				
//			}
//		};
		
		
		setBounds(100, 100, 921, 667);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel pharmacityLabel = new JLabel("PHARMACITY");
		pharmacityLabel.setForeground(new Color(255, 255, 255));
		pharmacityLabel.setBackground(new Color(0, 51, 102));
		pharmacityLabel.setHorizontalAlignment(SwingConstants.CENTER);
		pharmacityLabel.setFont(new Font("Impact", Font.BOLD, 35));
		pharmacityLabel.setBounds(0, 0, 905, 93);
		pharmacityLabel.setOpaque(true);
		contentPane.add(pharmacityLabel);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 92, 905, 52);
		contentPane.add(layeredPane);
		
		JButton btnDangXuat = new JButton("Ä�Ä‚NG XUáº¤T");
		btnDangXuat.setBorderPainted(false);
		btnDangXuat.setBorder(new MatteBorder(0, 2, 0, 0, (Color) new Color(255, 255, 204)));
		btnDangXuat.setFont(new Font("Arial", Font.BOLD, 15));
		btnDangXuat.setForeground(new Color(255, 255, 255));
		btnDangXuat.setBackground(new Color(0, 102, 153));
		btnDangXuat.setBounds(772, 6, 123, 41);
		btnDangXuat.setOpaque(true);
		
		URL url_iconLogout = ManHinhChinh.class.getResource("Logout-icon.png");
//		ImageIcon imgLogout = Toolkit.getDefaultToolkit().createImage(url_iconLogout);
//		imgLogout.getScaledInstance(WIDTH, HEIGHT, java.awt.Image.SCALE_SMOOTH);
//		btnDangXuat.setIcon(imgLogout);
		
		btnDangXuat.setIcon(new ImageIcon(Toolkit.getDefaultToolkit()
								.createImage(ManHinhChinh.class.getResource("Logout-icon.png"))
								.getScaledInstance(24, 24, java.awt.Image.SCALE_SMOOTH)));
		layeredPane.add(btnDangXuat);
		
		JButton btnThongKe = new JButton("THá»�NG KÃŠ");
		btnThongKe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(0);
			}
		});
		btnThongKe.setOpaque(true);
		btnThongKe.setForeground(new Color(255, 255, 255));
		btnThongKe.setFont(new Font("Arial", Font.BOLD, 15));
		btnThongKe.setBorderPainted(false);
		btnThongKe.setBackground(new Color(0, 102, 153));
		btnThongKe.setBounds(0, 6, 141, 41);
		layeredPane.add(btnThongKe);
		
		//////////////////////////////////////////////////////////////
		//DÃ£y cÃ¡c btn chá»©c nÄƒng//////////////////////////////////////
		JButton btnThemThuoc = new JButton("THÃŠM THUá»�C");
//		btnThemThuoc.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseClicked(MouseEvent e) {
//				btnThemThuoc.setBackground(new Color(255,255,255));
//				btnThemThuoc.setForeground(new Color(0, 0, 0));
//			}
//		});
		btnThemThuoc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				tabbedPane.setSelectedIndex(1);
			}
		});
		btnThemThuoc.setOpaque(true);
		btnThemThuoc.setForeground(new Color(255, 255, 255));
		btnThemThuoc.setFont(new Font("Arial", Font.BOLD, 15));
		btnThemThuoc.setBorderPainted(false);
		btnThemThuoc.setBackground(new Color(0, 102, 153));
		btnThemThuoc.setBounds(137, 3, 141, 46);
		layeredPane.add(btnThemThuoc);
		
		JButton btnTraCuuThuoc = new JButton("TRA Cá»¨U THUá»�C");
		btnTraCuuThuoc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(2);
				showTablePharmacy();
			}
		});
		btnTraCuuThuoc.setOpaque(true);
		btnTraCuuThuoc.setForeground(Color.WHITE);
		btnTraCuuThuoc.setFont(new Font("Arial", Font.BOLD, 15));
		btnTraCuuThuoc.setBorderPainted(false);
		btnTraCuuThuoc.setBackground(new Color(0, 102, 153));
		btnTraCuuThuoc.setBounds(277, 6, 170, 41);
		layeredPane.add(btnTraCuuThuoc);
		
		JButton btnCapNhatThuoc = new JButton("Cáº¬P NHáº¬T THUá»�C");
		btnCapNhatThuoc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(3);
			}
		});
		btnCapNhatThuoc.setOpaque(true);
		btnCapNhatThuoc.setForeground(Color.WHITE);
		btnCapNhatThuoc.setFont(new Font("Arial", Font.BOLD, 15));
		btnCapNhatThuoc.setBorderPainted(false);
		btnCapNhatThuoc.setBackground(new Color(0, 102, 153));
		btnCapNhatThuoc.setBounds(434, 6, 180, 41);
		layeredPane.add(btnCapNhatThuoc);
		
		//////////Label chá»©a cÃ¡c button/////////////////////////
		JLabel labelForButton = new JLabel("");
		labelForButton.setBounds(0, 92, 905, 52);
		contentPane.add(labelForButton);
		labelForButton.setEnabled(false);
		labelForButton.setBackground(new Color(0, 102, 153));
		labelForButton.setOpaque(true);
		
		/////////tabbed chá»©a cÃ¡c tab hiá»ƒn thá»‹ chá»©c nÄƒng////////////
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(-17, 117, 957, 528);
		contentPane.add(tabbedPane);
		
		JPanel panelThongKe = new JPanel();
		panelThongKe.setBackground(Color.WHITE);
		tabbedPane.addTab("New tab", null, panelThongKe, null);
		
		/////////PANEL CHá»¨C NÄ‚NG THÃŠM THUá»�C/////////////////////
		panelThemThuoc = new JPanel();
		panelThemThuoc.setBackground(new Color(255, 255, 255));
		tabbedPane.addTab("New tab", null, panelThemThuoc, null);
		panelThemThuoc.setLayout(null);
		
		JLabel lblMaThuocThemThuoc = new JLabel("MÃƒ THUá»�C");
		lblMaThuocThemThuoc.setFont(new Font("Arial", Font.BOLD, 17));
		lblMaThuocThemThuoc.setBounds(178, 52, 115, 36);
		panelThemThuoc.add(lblMaThuocThemThuoc);
		
		textFieldMaThuocThemThuoc = new JTextField();
		textFieldMaThuocThemThuoc.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textFieldMaThuocThemThuoc.setBorder(new MatteBorder(1, 1, 2, 2, (Color) new Color(0, 102, 153)));
		textFieldMaThuocThemThuoc.setBackground(new Color(255, 255, 255));
		textFieldMaThuocThemThuoc.setForeground(new Color(0, 0, 0));
		textFieldMaThuocThemThuoc.setBounds(178, 85, 220, 28);
		panelThemThuoc.add(textFieldMaThuocThemThuoc);
		textFieldMaThuocThemThuoc.setColumns(10);
		
		JLabel lblTenThuocThemThuoc = new JLabel("TÃŠN THUá»�C");
		lblTenThuocThemThuoc.setFont(new Font("Arial", Font.BOLD, 17));
		lblTenThuocThemThuoc.setBounds(178, 138, 100, 28);
		panelThemThuoc.add(lblTenThuocThemThuoc);
		
		textFieldTenThuocThemThuoc = new JTextField();
		textFieldTenThuocThemThuoc.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textFieldTenThuocThemThuoc.setBorder(new MatteBorder(1, 1, 2, 2, (Color) new Color(0, 102, 153)));
		textFieldTenThuocThemThuoc.setColumns(10);
		textFieldTenThuocThemThuoc.setBounds(178, 169, 220, 28);
		panelThemThuoc.add(textFieldTenThuocThemThuoc);
		
		JLabel lblDonViTinhThemThuoc = new JLabel("Ä�Æ N Vá»Š TÃ�NH");
		lblDonViTinhThemThuoc.setFont(new Font("Arial", Font.BOLD, 17));
		lblDonViTinhThemThuoc.setBounds(178, 216, 115, 31);
		panelThemThuoc.add(lblDonViTinhThemThuoc);
		
		comboBoxDvtThemThuoc = new JComboBox();
//		comboBoxDvtThemThuoc.addActionListener(new ActionListener() {
////			public void actionPerformed(ActionEvent e) {
////				DVT = comboBoxDvtThemThuoc.getSelectedItem().toString();
////			}
////		});
		comboBoxDvtThemThuoc.setFont(new Font("Arial", Font.BOLD, 15));
		comboBoxDvtThemThuoc.setBackground(new Color(255, 255, 255));
		comboBoxDvtThemThuoc.setBorder(new MatteBorder(1, 1, 2, 2, (Color) new Color(0, 102, 153)));
		comboBoxDvtThemThuoc.setBounds(178, 252, 220, 28);
		String [] dvt = new String [] {" ","Vá»‰", "Há»™p"};
		comboBoxDvtThemThuoc.setModel(new javax.swing.DefaultComboBoxModel<>(dvt));
		//comboBoxDvtThemThuoc.setEnabled(true);
		panelThemThuoc.add(comboBoxDvtThemThuoc);
		
		JLabel lblGiaThemThuoc = new JLabel("GIÃ�");
		lblGiaThemThuoc.setFont(new Font("Arial", Font.BOLD, 17));
		lblGiaThemThuoc.setBounds(555, 52, 80, 36);
		panelThemThuoc.add(lblGiaThemThuoc);
		
		textFieldGiaThemThuoc = new JTextField();
		textFieldGiaThemThuoc.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textFieldGiaThemThuoc.setBorder(new MatteBorder(1, 1, 2, 2, (Color) new Color(0, 102, 153)));
		textFieldGiaThemThuoc.setColumns(10);
		textFieldGiaThemThuoc.setBounds(555, 85, 220, 28);
		panelThemThuoc.add(textFieldGiaThemThuoc);
		
		JLabel lblSoLuongThemThuoc = new JLabel("Sá»� LÆ¯á»¢NG");
		lblSoLuongThemThuoc.setFont(new Font("Arial", Font.BOLD, 17));
		lblSoLuongThemThuoc.setBounds(555, 138, 100, 28);
		panelThemThuoc.add(lblSoLuongThemThuoc);
		
		textFieldSoLuongThemThuoc = new JTextField();
		textFieldSoLuongThemThuoc.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textFieldSoLuongThemThuoc.setBorder(new MatteBorder(1, 1, 2, 2, (Color) new Color(0, 102, 153)));
		textFieldSoLuongThemThuoc.setColumns(10);
		textFieldSoLuongThemThuoc.setBounds(555, 169, 220, 28);
		panelThemThuoc.add(textFieldSoLuongThemThuoc);
		
		JLabel lblCachDungThemThuoc = new JLabel("CÃ�CH DÃ™NG");
		lblCachDungThemThuoc.setFont(new Font("Arial", Font.BOLD, 17));
		lblCachDungThemThuoc.setBounds(555, 219, 115, 28);
		panelThemThuoc.add(lblCachDungThemThuoc);
		
		textFieldCachDungThemThuoc = new JTextField();
		textFieldCachDungThemThuoc.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textFieldCachDungThemThuoc.setBorder(new MatteBorder(1, 1, 2, 2, (Color) new Color(0, 102, 153)));
		textFieldCachDungThemThuoc.setColumns(10);
		textFieldCachDungThemThuoc.setBounds(555, 256, 220, 86);
		panelThemThuoc.add(textFieldCachDungThemThuoc);
		
		JSeparator separator = new JSeparator();
		separator.setAlignmentY(0.75f);
		separator.setAlignmentX(0.75f);
		separator.setBorder(new LineBorder(new Color(0, 102, 153), 3));
		separator.setBounds(479, 52, 6, 290);
		panelThemThuoc.add(separator);
		
		JButton btnThem = new JButton("THÃŠM");
		btnThem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnThem(e);
				JOptionPane.showMessageDialog(separator,"THÃŠM THÃ€NH CÃ”NG","THÃ”NG TIN", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		
		btnThem.setFont(new Font("Arial", Font.BOLD, 14));
		btnThem.setForeground(new Color(255, 255, 255));
		btnThem.setBackground(new Color(0, 102, 153));
		btnThem.setBorder(null);
		btnThem.setBounds(495, 413, 100, 36);
		
		panelThemThuoc.add(btnThem);
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldMaThuocThemThuoc.setText("");
				textFieldTenThuocThemThuoc.setText("");
				textFieldGiaThemThuoc.setText("");
				textFieldSoLuongThemThuoc.setText("");
				textFieldCachDungThemThuoc.setText("");
				comboBoxDvtThemThuoc.setSelectedIndex(-1);
			}
		});
		btnReset.setForeground(Color.WHITE);
		btnReset.setFont(new Font("Arial", Font.BOLD, 14));
		btnReset.setBorder(null);
		btnReset.setBackground(new Color(0, 102, 153));
		btnReset.setBounds(688, 413, 100, 36);
		btnReset.setIcon(new ImageIcon(Toolkit.getDefaultToolkit()
				.createImage(ManHinhChinh.class.getResource("Redo-icon.png"))
				.getScaledInstance(24, 24, java.awt.Image.SCALE_SMOOTH)));
		panelThemThuoc.add(btnReset);
		
		JPanel panelTraCuuThuoc = new JPanel();
		panelTraCuuThuoc.setBackground(new Color(255, 255, 255));
		tabbedPane.addTab("New tab", null, panelTraCuuThuoc, null);
		panelTraCuuThuoc.setLayout(null);
		
		JLabel lblTenThuocTraCuu = new JLabel("TÃŠN THUá»�C");
		lblTenThuocTraCuu.setFont(new Font("Arial", Font.BOLD, 17));
		lblTenThuocTraCuu.setBounds(143, 26, 100, 30);
		panelTraCuuThuoc.add(lblTenThuocTraCuu);
		
		textFieldTenThuocTraCuu = new JTextField();
		textFieldTenThuocTraCuu.setColumns(10);
		textFieldTenThuocTraCuu.setBorder(new MatteBorder(1, 1, 2, 2, (Color) new Color(0, 102, 153)));
		textFieldTenThuocTraCuu.setBounds(142, 52, 226, 23);
		panelTraCuuThuoc.add(textFieldTenThuocTraCuu);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBorder(new LineBorder(new Color(0, 102, 153), 3));
		separator_1.setAlignmentY(0.75f);
		separator_1.setAlignmentX(0.75f);
		separator_1.setBounds(22, 110, 886, 5);
		panelTraCuuThuoc.add(separator_1);
		
		JButton btnTraCuu = new JButton("TRA Cá»¨U");
		btnTraCuu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnTimTheoTen(e);
				System.out.println("Ä�Ã£ tÃ¬m");
				
			}
		});
		btnTraCuu.setForeground(Color.WHITE);
		btnTraCuu.setFont(new Font("Arial", Font.BOLD, 14));
		btnTraCuu.setBorder(null);
		btnTraCuu.setBackground(new Color(0, 102, 153));
		btnTraCuu.setBounds(557, 48, 100, 36);
		panelTraCuuThuoc.add(btnTraCuu);
		
		JButton btnResetTraCuu = new JButton("RESET");
		btnResetTraCuu.setForeground(Color.WHITE);
		btnResetTraCuu.setFont(new Font("Arial", Font.BOLD, 14));
		btnResetTraCuu.setBorder(null);
		btnResetTraCuu.setBackground(new Color(0, 102, 153));
		btnResetTraCuu.setBounds(723, 48, 100, 36);
		btnResetTraCuu.setIcon(new ImageIcon(Toolkit.getDefaultToolkit()
				.createImage(ManHinhChinh.class.getResource("Redo-icon.png"))
				.getScaledInstance(24, 24, java.awt.Image.SCALE_SMOOTH)));
		panelTraCuuThuoc.add(btnResetTraCuu);
		
		table = new JTable();
		table.setBorder(new MatteBorder(1, 1, 2, 2, (Color) new Color(102, 205, 170)));
		table.setSelectionBackground(new Color(173, 216, 230));
		table.setGridColor(new Color(46, 139, 87));
		table.setRowHeight(20);
		table.setForeground(new Color(0, 0, 0));
		table.setFont(new Font("Tahoma", Font.BOLD, 16));
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBorder(null);
		scrollPane.setBackground(Color.WHITE);
		scrollPane.setBounds(33, 148, 875, 312);
		panelTraCuuThuoc.add(scrollPane);
		
		
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
			},
			new String[] {
				"M\u00E3 Thu\u1ED1c", "T\u00EAn Thu\u1ED1c", "\u0110\u01A1n V\u1ECB T\u00EDnh", "Gi\u00E1", "S\u1ED1 L\u01B0\u1EE3ng", "C\u00E1ch D\u00F9ng"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(47);
		table.getColumnModel().getColumn(1).setPreferredWidth(184);
		table.getColumnModel().getColumn(2).setPreferredWidth(31);
		table.getColumnModel().getColumn(3).setPreferredWidth(52);
		table.getColumnModel().getColumn(4).setPreferredWidth(47);
		table.getColumnModel().getColumn(5).setPreferredWidth(276);
		table.setBounds(0, 0, 1, 1);
		tableModel = (DefaultTableModel) table.getModel();
		
		
		JPanel panelCapNhatThuoc = new JPanel();
		panelCapNhatThuoc.setBackground(Color.WHITE);
		tabbedPane.addTab("New tab", null, panelCapNhatThuoc, null);
		panelCapNhatThuoc.setLayout(null);
		
		JLabel lblMaThuoc_1_1 = new JLabel("MÃƒ THUá»�C");
		lblMaThuoc_1_1.setFont(new Font("Arial", Font.BOLD, 17));
		lblMaThuoc_1_1.setBounds(195, 60, 100, 28);
		panelCapNhatThuoc.add(lblMaThuoc_1_1);
		
		textFieldMaThuocCapNhat = new JTextField();
		textFieldMaThuocCapNhat.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textFieldMaThuocCapNhat.setForeground(Color.BLACK);
		textFieldMaThuocCapNhat.setColumns(10);
		textFieldMaThuocCapNhat.setBorder(new MatteBorder(1, 1, 2, 2, (Color) new Color(0, 102, 153)));
		textFieldMaThuocCapNhat.setBackground(Color.WHITE);
		textFieldMaThuocCapNhat.setBounds(195, 91, 220, 28);
		panelCapNhatThuoc.add(textFieldMaThuocCapNhat);
		
		JLabel lblTenThuoc_1_1 = new JLabel("TÃŠN THUá»�C");
		lblTenThuoc_1_1.setFont(new Font("Arial", Font.BOLD, 17));
		lblTenThuoc_1_1.setBounds(195, 161, 100, 28);
		panelCapNhatThuoc.add(lblTenThuoc_1_1);
		
		textFieldTenThuocCapNhat = new JTextField();
		textFieldTenThuocCapNhat.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textFieldTenThuocCapNhat.setColumns(10);
		textFieldTenThuocCapNhat.setBorder(new MatteBorder(1, 1, 2, 2, (Color) new Color(0, 102, 153)));
		textFieldTenThuocCapNhat.setBounds(195, 189, 220, 31);
		panelCapNhatThuoc.add(textFieldTenThuocCapNhat);
		
		JLabel lblDonViTinh_1_1 = new JLabel("Ä�Æ N Vá»Š TÃ�NH");
		lblDonViTinh_1_1.setFont(new Font("Arial", Font.BOLD, 17));
		lblDonViTinh_1_1.setBounds(195, 248, 111, 31);
		panelCapNhatThuoc.add(lblDonViTinh_1_1);
		
		model_DVT = new String[] {" ","Vá»‰","Há»™p"};
//		model_index_comboboxCapNhat = new Integer[] {0,1,2}; 
		comboBoxDVTCapNhat = new JComboBox<>();
		comboBoxDVTCapNhat.setModel(new DefaultComboBoxModel(model_DVT));
		comboBoxDVTCapNhat.setFont(new Font("Tahoma", Font.BOLD, 15));
		comboBoxDVTCapNhat.setBorder(new MatteBorder(1, 1, 2, 2, (Color) new Color(0, 102, 153)));
		comboBoxDVTCapNhat.setBackground(Color.WHITE);
		comboBoxDVTCapNhat.setBounds(195, 280, 220, 28);
		panelCapNhatThuoc.add(comboBoxDVTCapNhat);
		
		JLabel lblGia_1_1 = new JLabel("GIÃ�");
		lblGia_1_1.setFont(new Font("Arial", Font.BOLD, 17));
		lblGia_1_1.setBounds(537, 60, 100, 28);
		panelCapNhatThuoc.add(lblGia_1_1);
		
		textFieldGiaCapNhat = new JTextField();
		textFieldGiaCapNhat.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textFieldGiaCapNhat.setColumns(10);
		textFieldGiaCapNhat.setBorder(new MatteBorder(1, 1, 2, 2, (Color) new Color(0, 102, 153)));
		textFieldGiaCapNhat.setBounds(537, 91, 220, 28);
		panelCapNhatThuoc.add(textFieldGiaCapNhat);
		
		JLabel lblSoLuong_1_1 = new JLabel("Sá»� LÆ¯á»¢NG");
		lblSoLuong_1_1.setFont(new Font("Arial", Font.BOLD, 17));
		lblSoLuong_1_1.setBounds(537, 161, 100, 28);
		panelCapNhatThuoc.add(lblSoLuong_1_1);
		
		textFieldSoLuongCapNhat = new JTextField();
		textFieldSoLuongCapNhat.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textFieldSoLuongCapNhat.setColumns(10);
		textFieldSoLuongCapNhat.setBorder(new MatteBorder(1, 1, 2, 2, (Color) new Color(0, 102, 153)));
		textFieldSoLuongCapNhat.setBounds(537, 189, 220, 31);
		panelCapNhatThuoc.add(textFieldSoLuongCapNhat);
		
		JLabel lblCachDung_1_1 = new JLabel("CÃ�CH DÃ™NG");
		lblCachDung_1_1.setFont(new Font("Arial", Font.BOLD, 17));
		lblCachDung_1_1.setBounds(537, 248, 105, 24);
		panelCapNhatThuoc.add(lblCachDung_1_1);
		
		textFieldCachDungCapNhat = new JTextField();
		textFieldCachDungCapNhat.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textFieldCachDungCapNhat.setColumns(10);
		textFieldCachDungCapNhat.setBorder(new MatteBorder(1, 1, 2, 2, (Color) new Color(0, 102, 153)));
		textFieldCachDungCapNhat.setBounds(537, 274, 220, 82);
		panelCapNhatThuoc.add(textFieldCachDungCapNhat);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBorder(new LineBorder(new Color(0, 102, 153), 3));
		separator_1_1.setAlignmentY(0.75f);
		separator_1_1.setAlignmentX(0.75f);
		separator_1_1.setBounds(461, 44, 5, 312);
		panelCapNhatThuoc.add(separator_1_1);
		
		JButton btnCapNhat = new JButton("Cáº¬P NHáº¬T");
		btnCapNhat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCapNhat(e);
				JOptionPane.showMessageDialog(separator_1_1, "Cáº¬P NHáº¬T THUá»�C THÃ€NH CÃ”NG","THÃ”NG TIN",JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btnCapNhat.setForeground(Color.WHITE);
		btnCapNhat.setFont(new Font("Arial", Font.BOLD, 14));
		btnCapNhat.setBorder(null);
		btnCapNhat.setBackground(new Color(0, 102, 153));
		btnCapNhat.setBounds(475, 414, 100, 36);
		panelCapNhatThuoc.add(btnCapNhat);
		
		JButton btnResetCapNhat = new JButton("RESET");
		btnResetCapNhat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldMaThuocCapNhat.setText("");
				textFieldTenThuocCapNhat.setText("");
				textFieldGiaCapNhat.setText("");
				textFieldSoLuongCapNhat.setText("");
				textFieldCachDungCapNhat.setText("");
				comboBoxDVTCapNhat.setSelectedIndex(-1);
			}
		});
		btnResetCapNhat.setForeground(Color.WHITE);
		btnResetCapNhat.setFont(new Font("Arial", Font.BOLD, 14));
		btnResetCapNhat.setBorder(null);
		btnResetCapNhat.setBackground(new Color(0, 102, 153));
		btnResetCapNhat.setBounds(720, 414, 100, 36);
		btnResetCapNhat.setIcon(new ImageIcon(Toolkit.getDefaultToolkit()
				.createImage(ManHinhChinh.class.getResource("redo-icon.png"))
				.getScaledInstance(24, 24, java.awt.Image.SCALE_SMOOTH)));
		panelCapNhatThuoc.add(btnResetCapNhat);
		
		JButton btnCapNhat_Xoa = new JButton("XÃ“A");
		btnCapNhat_Xoa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnDelete(e);
			}
		});
		btnCapNhat_Xoa.setForeground(Color.WHITE);
		btnCapNhat_Xoa.setFont(new Font("Arial", Font.BOLD, 14));
		btnCapNhat_Xoa.setBorder(null);
		btnCapNhat_Xoa.setBackground(new Color(0, 102, 153));
		btnCapNhat_Xoa.setBounds(601, 414, 100, 36);
		panelCapNhatThuoc.add(btnCapNhat_Xoa);
		
		JButton btnCapNhatTimKiem = new JButton("TÃ¬m");
		btnCapNhatTimKiem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCapNhatTim(e);
			}
		});
		btnCapNhatTimKiem.setForeground(Color.WHITE);
		btnCapNhatTimKiem.setFont(new Font("Arial", Font.BOLD, 14));
		btnCapNhatTimKiem.setBorder(null);
		btnCapNhatTimKiem.setBackground(new Color(0, 102, 153));
		btnCapNhatTimKiem.setBounds(331, 121, 84, 28);
		panelCapNhatThuoc.add(btnCapNhatTimKiem);
		
		
		//this.setVisible(true);
	}
	
	
	
	private void showTablePharmacy() {
		pharmacyList = PharmacyModify.findAll();

		tableModel.setRowCount(0);

		pharmacyList.forEach((Pharmacy) -> {
			tableModel.addRow(new Object[] {Pharmacy.getId(),
											Pharmacy.getTensanpham(),
											Pharmacy.getDvt(),
											Pharmacy.getGia(),
											Pharmacy.getSoluong(),
											Pharmacy.getCachdung()});
		});
	}
	
	
	private void btnThem(java.awt.event.ActionEvent evt) {
		
		String id=textFieldMaThuocThemThuoc.getText();
		String Tensanpham = textFieldTenThuocThemThuoc.getText();
		String Dvt = null;
		Dvt = comboBoxDvtThemThuoc.getSelectedItem().toString();
		double Gia = Integer.parseInt(textFieldGiaThemThuoc.getText());
		int Soluong = Integer.parseInt(textFieldSoLuongThemThuoc.getText());
		String Cachdung = textFieldCachDungThemThuoc.getText();
		
		
		Pharmacy std = new Pharmacy(id,Tensanpham, Dvt,  Gia, Soluong, Cachdung);

		PharmacyModify.insert(std);

		showTablePharmacy();
	}
	/////TÃ¬m theo tÃªn
	private void btnTimTheoTen(java.awt.event.ActionEvent evt) {
		String name= textFieldTenThuocTraCuu.getText();
			pharmacyList = PharmacyModify.findByFullname(name);

			//tableModel.setRowCount(0);

			pharmacyList.forEach((Pharmacy) -> {
				tableModel.addRow(new Object[] {Pharmacy.getTensanpham(),
						Pharmacy.getDvt(), Pharmacy.getGia(), Pharmacy.getSoluong() });
			});
			showTablePharmacy();
	}
	
	public void btnCapNhatTim(java.awt.event.ActionEvent evt)
	{
		String id = textFieldMaThuocCapNhat.getText();
		PharmacyModify.FindWithID(id);

		String ID= PharmacyModify.FindWithID(id).getId();
		String tensanpham = PharmacyModify.FindWithID(id).getTensanpham();
		String Dvt = PharmacyModify.FindWithID(id).getDvt();
		int i=0;
		while(true) {
			if(Dvt.equals(model_DVT[i])) {
				break;
			}
			i++;
		}
		Double gia = PharmacyModify.FindWithID(id).getGia();
		Integer soluong = PharmacyModify.FindWithID(id).getSoluong();
		String Cachdung = PharmacyModify.FindWithID(id).getCachdung();
		
//		System.out.println(ID);
//		System.out.println(tensanpham);
//		System.out.println(Dvt);
//		System.out.println(gia);
//		System.out.println(soluong);
//		System.out.println(Cachdung);
		
		textFieldMaThuocCapNhat.setText(ID);
		textFieldTenThuocCapNhat.setText(tensanpham);
		textFieldGiaCapNhat.setText(gia.toString());
		textFieldSoLuongCapNhat.setText(soluong.toString());
		textFieldCachDungCapNhat.setText(Cachdung);
		comboBoxDVTCapNhat.setSelectedIndex(i);
	}
	
	private void btnCapNhat(java.awt.event.ActionEvent evt) {
		String id= textFieldMaThuocCapNhat.getText();
		String Tensanpham = textFieldTenThuocCapNhat.getText();
		String Dvt = comboBoxDVTCapNhat.getSelectedItem().toString();
		double Gia = Double.parseDouble(textFieldGiaCapNhat.getText());
		int Soluong = Integer.parseInt(textFieldSoLuongCapNhat.getText());
		String Cachdung = textFieldCachDungCapNhat.getText();
		Pharmacy std1 = new Pharmacy(Tensanpham, Dvt, Gia, Soluong, Cachdung);
//		System.out.println(std);
		PharmacyModify.update(std1,id);
	}
	
	private void btnDelete(java.awt.event.ActionEvent evt) {
		
		String id = textFieldMaThuocCapNhat.getText();
			int option = JOptionPane.showConfirmDialog(this, "Báº¡n cÃ³ cháº¯c muá»‘n xÃ³a loáº¡i thuá»‘c nÃ y?");
			System.out.println("option : " + option);
			if (option == 0) {
				PharmacyModify.delete(id);
				textFieldMaThuocCapNhat.setText("");
				textFieldTenThuocCapNhat.setText("");
				textFieldGiaCapNhat.setText("");
				textFieldSoLuongCapNhat.setText("");
				textFieldCachDungCapNhat.setText("");
				comboBoxDVTCapNhat.setSelectedIndex(-1);
			}
		}
	
//	private void btnReset(java.awt.event.ActionEvent evt) {
//		Reset();
//	}
}