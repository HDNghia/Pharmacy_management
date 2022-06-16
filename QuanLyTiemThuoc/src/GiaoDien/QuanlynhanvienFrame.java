package GiaoDien;

import java.awt.BorderLayout;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import pharmacy.Pharmacy;
import pharmacy.PharmacyModify;
import nhanvien.nhanvien;
import javax.swing.table.DefaultTableModel;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.util.List;


public class QuanlynhanvienFrame extends JFrame {

	private JPanel contentPane;
	private JTextField hovaten;
	private JTextField ngaysinh;
	private JTable table;
	private JTextField sodienthoai;
	private JTextField diachi;
	List<nhanvien> nhanvienlist = new ArrayList<>();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QuanlynhanvienFrame frame = new QuanlynhanvienFrame();
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
	public void showTable() {
		nhanvienlist = findall();
		DefaultTableModel tableModel;
		tableModel = (DefaultTableModel) table.getModel();
		tableModel.setRowCount(0);
		nhanvienlist.forEach((nhanvien) -> {
			tableModel.addRow(new Object[] {nhanvien.getHovaten(),
					nhanvien.getNgaysinh(),
					nhanvien.getGioitinh(),
					nhanvien.getDiachi(),
					nhanvien.getHocvan(),
					nhanvien.getSodienthoai()});
		});
	}
		public static void update(nhanvien std, String hovaten) {
    	
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            //lay tat ca danh sach pharmacy
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Pharmacy_management", "root", "");
            
            //query
            String sql = "update pharmacy set tennhanvien=?,ngaysinh=?,gioitinh=?,sodienthoai=?,diachi=? where tennhanvien = ?";
            
            statement = connection.prepareCall(sql);
            statement.setString(1, std.getHovaten());
            statement.setString(2, std.getNgaysinh());
            statement.setString(3, std.getGioitinh());
            statement.setInt(4, std.getSodienthoai());
            statement.setString(5, std.getDiachi());
            statement.setString(6, hovaten);
            
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(PharmacyModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(PharmacyModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(PharmacyModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc.
    }
	public static void delete(String tennhanvien) {
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            //lay tat ca danh sach pharmacy
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacy_management", "root", "");
            
            //query
            String sql = "delete from nhanvien where `tennhanvien` = ?";
            statement = connection.prepareCall(sql);
            
            statement.setString(1, tennhanvien);
            
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(PharmacyModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(PharmacyModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(PharmacyModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc.
    }
	public static List<nhanvien> findall() {

		List<nhanvien> nhanvienlist = new ArrayList<>();
        Connection connection = null;
        Statement statement = null;
        
        try {
            //lay tat ca danh sach thuoc
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacy_management", "root", "");
            
            //query
            String sql = "select * from nhanvien";
            statement = connection.createStatement();
            
            ResultSet resultSet = statement.executeQuery(sql);
            
            while (resultSet.next()) {                
               	nhanvien std = new nhanvien(resultSet.getInt("id"),resultSet.getString("tennhanvien"), 
                           resultSet.getString("ngaysinh"), resultSet.getString("gioitinh"), 
                           resultSet.getInt("sodienthoai"), resultSet.getString("hocvan"),
                           resultSet.getString("diachi"));
               	nhanvienlist.add(std);
               }
        } catch (SQLException ex) {
            Logger.getLogger(PharmacyModify.class.getName()).log(Level.SEVERE, null, ex);
        }
		return nhanvienlist;
	}
	public QuanlynhanvienFrame() {
		init();
		showTable();
	}
	public void init() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 845, 626);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Quản lý nhân viên");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblNewLabel.setBounds(265, 24, 289, 86);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Họ và tên");
		lblNewLabel_1.setBounds(58, 133, 122, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Ngày sinh");
		lblNewLabel_1_1.setBounds(58, 175, 85, 13);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Giới tính");
		lblNewLabel_1_2.setBounds(58, 217, 102, 13);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Học vấn");
		lblNewLabel_1_2_1.setBounds(58, 255, 85, 13);
		contentPane.add(lblNewLabel_1_2_1);
		
		hovaten = new JTextField();
		hovaten.setBounds(140, 130, 96, 19);
		contentPane.add(hovaten);
		hovaten.setColumns(10);
		
		ngaysinh = new JTextField();
		ngaysinh.setColumns(10);
		ngaysinh.setBounds(140, 172, 96, 19);
		contentPane.add(ngaysinh);
		JComboBox hocvan = new JComboBox();
		hocvan.setModel(new DefaultComboBoxModel(new String[] {"Cấp 3", "Cao đẳng", "Đại học"}));
		hocvan.setBounds(140, 251, 96, 21);
		contentPane.add(hocvan);

		JComboBox gioitinh = new JComboBox();
		gioitinh.setModel(new DefaultComboBoxModel(new String[] {"Nam ", "Nữ"}));
		gioitinh.setBounds(140, 213, 96, 21);
		contentPane.add(gioitinh);
		
		JButton btnNewButton = new JButton("Thêm");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Connection connection = null;
	             PreparedStatement statement = null;
	             try {
	                 //lay tat ca danh sach pharmacy
	            	
	                 connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacy_management", "root", "");
	                 
	                 //query
	                 String sql = "insert into nhanvien(tennhanvien, ngaysinh, gioitinh, hocvan, sodienthoai, diachi) values(?, ?, ?, ?, ?, ?)";
	                 statement = connection.prepareCall(sql);
	                 statement.setString(1, hovaten.getText());
	                 statement.setString(2, ngaysinh.getText());
	                 statement.setString(3, gioitinh.getSelectedItem().toString());
	                 statement.setString(4, hocvan.getSelectedItem().toString());
	                 statement.setString(5, sodienthoai.getText());
	                 statement.setString(6, diachi.getText());
	                 statement.execute();   
	                 showTable();
	            
	             } catch (SQLException ex) {
	                 System.out.println(ex.getMessage());
	             }
			}
		});
		btnNewButton.setBounds(58, 353, 85, 21);
		contentPane.add(btnNewButton);
		
		JButton btnXa = new JButton("Xóa ");
		btnXa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Nghia");
				nhanvienlist = findall();
				int selectedIndex = table.getSelectedRow();
				if (selectedIndex >= 0) {
					nhanvien std = nhanvienlist.get(selectedIndex);
						delete(std.getHovaten());
						showTable();
					}
				}
			});
		btnXa.setBounds(181, 353, 85, 21);
		contentPane.add(btnXa);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(58, 403, 693, 139);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel_2 = new JLabel("Số điện thoại");
		lblNewLabel_2.setBounds(58, 292, 122, 13);
		contentPane.add(lblNewLabel_2);
		
		sodienthoai = new JTextField();
		sodienthoai.setColumns(10);
		sodienthoai.setBounds(140, 289, 96, 19);
		contentPane.add(sodienthoai);
		
		JLabel lblNewLabel_2_1 = new JLabel("Địa chỉ");
		lblNewLabel_2_1.setBounds(58, 330, 122, 13);
		contentPane.add(lblNewLabel_2_1);
		
		diachi = new JTextField();
		diachi.setColumns(10);
		diachi.setBounds(140, 324, 96, 19);
		contentPane.add(diachi);
}
}


