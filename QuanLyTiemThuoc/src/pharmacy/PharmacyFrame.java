package pharmacy;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Component;

/**
 *
 *
 */
public class PharmacyFrame extends javax.swing.JFrame {
	DefaultTableModel tableModel;

	List<Pharmacy> pharmacyList = new ArrayList<>();

	/**
	 * Creates new form StudentFrame
	 */

	public PharmacyFrame() {
		getContentPane().setBackground(Color.WHITE);
		initComponents();

		tableModel = (DefaultTableModel) tblPharmacy.getModel();

		showStudent();
	}

	private void showStudent() {
		pharmacyList = PharmacyModify.findAll();

		tableModel.setRowCount(0);

		pharmacyList.forEach((Pharmacy) -> {
			tableModel.addRow(new Object[] { tableModel.getRowCount() + 1, Pharmacy.getTensanpham(), Pharmacy.getDvt(),
					Pharmacy.getGia(), Pharmacy.getSoluong() });
		});
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		txtTensanpham = new javax.swing.JTextField();
		jLabel2 = new javax.swing.JLabel();
		cbDvt = new javax.swing.JComboBox<>();
		jLabel3 = new javax.swing.JLabel();
		txtGia = new javax.swing.JTextField();
		jLabel4 = new javax.swing.JLabel();
		txtSoluong = new javax.swing.JTextField();
		jLabel5 = new javax.swing.JLabel();
		txtCachdung = new javax.swing.JTextField();
		btnSave = new javax.swing.JButton();
		btnReset = new javax.swing.JButton();
		btnDelete = new javax.swing.JButton();
		btnFind = new javax.swing.JButton();
		jScrollPane1 = new javax.swing.JScrollPane();
		tblPharmacy = new javax.swing.JTable();
		btnUpdate = new javax.swing.JButton();

		//setLocationRelativeTo(null);
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("Pharmacy Manager");

		jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Input Pharmacy's Detail Information"));

		jLabel1.setText("Ten san pham:");

		jLabel2.setText("Dvt: ");

		cbDvt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vỉ", "Hộp" }));

		jLabel3.setText("Gia:");

		jLabel4.setText("So luong:");

		jLabel5.setText("Cách dùng:");

		btnSave.setText("Save");
		btnSave.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnSaveActionPerformed(evt);
			}
		});

		btnReset.setText("Reset");
		btnReset.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnResetActionPerformed(evt);
			}
		});

		btnDelete.setText("Delete");
		btnDelete.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnDeleteActionPerformed(evt);
			}
		});

		btnFind.setText("Find");
		btnFind.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnFindActionPerformed(evt);
			}
		});
		
		btnUpdate.setText("Update");
		btnUpdate.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnUpdateActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1Layout.setHorizontalGroup(
			jPanel1Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup()
					.addGap(15)
					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
						.addGroup(jPanel1Layout.createSequentialGroup()
							.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
								.addComponent(jLabel1)
								.addComponent(jLabel2))
							.addGap(77)
							.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
								.addComponent(cbDvt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtTensanpham, 317, 317, 317)))
						.addGroup(jPanel1Layout.createSequentialGroup()
							.addComponent(jLabel3)
							.addGap(116)
							.addComponent(txtGia, GroupLayout.PREFERRED_SIZE, 330, GroupLayout.PREFERRED_SIZE))
						.addGroup(jPanel1Layout.createSequentialGroup()
							.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
								.addComponent(jLabel5)
								.addComponent(jLabel4))
							.addGap(48)
							.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING, false)
								.addComponent(txtSoluong)
								.addComponent(txtCachdung)
								.addGroup(jPanel1Layout.createSequentialGroup()
									.addComponent(btnSave)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnReset)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnDelete)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnFind)))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnUpdate, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		jPanel1Layout.setVerticalGroup(
			jPanel1Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup()
					.addGap(10)
					.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(jLabel1)
						.addComponent(txtTensanpham, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(jLabel2)
						.addComponent(cbDvt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(jLabel3)
						.addComponent(txtGia, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(jLabel4)
						.addComponent(txtSoluong, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(jLabel5)
						.addComponent(txtCachdung, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnSave)
						.addComponent(btnReset)
						.addComponent(btnDelete)
						.addComponent(btnFind)
						.addComponent(btnUpdate))
					.addContainerGap(64, Short.MAX_VALUE))
		);
		jPanel1.setLayout(jPanel1Layout);

		tblPharmacy.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {

		}, new String[] { "ID", "tensanpham", "dvt", "gia", "soluong" }) {
			boolean[] canEdit = new boolean[] { false, false, false, true, false };

			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return canEdit[columnIndex];
			}
		});
		jScrollPane1.setViewportView(tblPharmacy);
		
		JLabel pharmacityLabel = new JLabel("PHARMACITY");
		pharmacityLabel.setOpaque(true);
		pharmacityLabel.setHorizontalAlignment(SwingConstants.CENTER);
		pharmacityLabel.setForeground(Color.WHITE);
		pharmacityLabel.setFont(new Font("Impact", Font.BOLD, 35));
		pharmacityLabel.setBackground(new Color(0, 51, 102));
		
		JLabel labelForButton = new JLabel("");
		labelForButton.setAlignmentX(Component.CENTER_ALIGNMENT);
		labelForButton.setOpaque(true);
		labelForButton.setEnabled(false);
		labelForButton.setBackground(new Color(0, 102, 153));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		layout.setHorizontalGroup(
			layout.createParallelGroup(Alignment.TRAILING)
				.addComponent(pharmacityLabel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 955, Short.MAX_VALUE)
				.addComponent(labelForButton, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 955, Short.MAX_VALUE)
				.addGroup(layout.createSequentialGroup()
					.addGroup(layout.createParallelGroup(Alignment.TRAILING)
						.addComponent(jScrollPane1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 945, Short.MAX_VALUE)
						.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 945, Short.MAX_VALUE))
					.addContainerGap())
		);
		layout.setVerticalGroup(
			layout.createParallelGroup(Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
					.addComponent(pharmacityLabel, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(labelForButton, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 267, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
					.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 188, GroupLayout.PREFERRED_SIZE))
		);
		getContentPane().setLayout(layout);

		pack();
	}// </editor-fold>

	private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		txtTensanpham.setText("");
		cbDvt.setSelectedIndex(0);
		txtGia.setText("");
		txtSoluong.setText("");
		txtCachdung.setText("");
	}

	private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		String Tensanpham = txtTensanpham.getText();
		String Dvt = cbDvt.getSelectedItem().toString();
		int Gia = Integer.parseInt(txtGia.getText());
		int Soluong = Integer.parseInt(txtSoluong.getText());
		String Cachdung = txtCachdung.getText();

		Pharmacy std = new Pharmacy(Tensanpham, Dvt, Gia, Soluong, Cachdung);

		PharmacyModify.insert(std);

		showStudent();
	}

	private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		int selectedIndex = tblPharmacy.getSelectedRow();
		if (selectedIndex >= 0) {
			Pharmacy std = pharmacyList.get(selectedIndex);

			int option = JOptionPane.showConfirmDialog(this, "Do you want to delete this item?");
			System.out.println("option : " + option);

			if (option == 0) {
				PharmacyModify.delete(std.getId());

				showStudent();
			}
		}
	}

	private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		int selectedIndex = tblPharmacy.getSelectedRow();
		if (selectedIndex >= 0) {
			Pharmacy std = pharmacyList.get(selectedIndex);
			String Tensanpham = txtTensanpham.getText();
			String Dvt = cbDvt.getSelectedItem().toString();
			int Gia = Integer.parseInt(txtGia.getText());
			int Soluong = Integer.parseInt(txtSoluong.getText());
			String Cachdung = txtCachdung.getText();
			Pharmacy std1 = new Pharmacy(Tensanpham, Dvt, Gia, Soluong, Cachdung);
//			System.out.println(std);
			PharmacyModify.update(std1, std.getId());
			showStudent();
		}
	}

	private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		String input = JOptionPane.showInputDialog(this, "Enter full name to search");
		if (input != null && input.length() > 0) {
			pharmacyList = PharmacyModify.findByFullname(input);

			tableModel.setRowCount(0);

			pharmacyList.forEach((Pharmacy) -> {
				tableModel.addRow(new Object[] { tableModel.getRowCount() + 1, Pharmacy.getTensanpham(),
						Pharmacy.getDvt(), Pharmacy.getGia(), Pharmacy.getSoluong() });
			});
		} else {
			showStudent();
		}
	}

	/**
	 * @param args the command line arguments
	 */

	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
		// (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
		 * look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(PharmacyFrame.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(PharmacyFrame.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(PharmacyFrame.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(PharmacyFrame.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new PharmacyFrame().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify
	private javax.swing.JButton btnDelete;
	private javax.swing.JButton btnFind;
	private javax.swing.JButton btnUpdate;
	private javax.swing.JButton btnReset;
	private javax.swing.JButton btnSave;
	private javax.swing.JComboBox<String> cbDvt;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTable tblPharmacy;
	private javax.swing.JTextField txtTensanpham;
	private javax.swing.JTextField txtCachdung;
	private javax.swing.JTextField txtGia;
	private javax.swing.JTextField txtSoluong;
}