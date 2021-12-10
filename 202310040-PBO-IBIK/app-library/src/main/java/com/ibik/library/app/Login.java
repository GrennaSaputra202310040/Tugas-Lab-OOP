package com.ibik.library.app;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class Login extends JFrame {
	private JFrame frmLoginPage;
	private JTextField textUsername;
	private JPasswordField textPassword;
	private JButton btnSignIn;
	
	public static void main(String[] args) {	
		
		Login frmLoginPage = new Login();//initialisasi object pada class Login sebagai bagian dari JFrame
		
		
		frmLoginPage.setTitle("Login Page");//set title pada window
		
		
		frmLoginPage.setResizable(false);//membuat window tidak bisa melakukan resizable atau maximize window
		
		
		frmLoginPage.setBounds(100, 100, 500, 646);//set ukuran window dengan format (x, y, width, height). Dimana x dan y mengatur tata letak posisi window ketika pertama kali dijalankan
		
		
		frmLoginPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//action ketika menutup window untuk mengakhiri program
		
		
		frmLoginPage.getContentPane().setLayout(null);//menentukan jenis layout apa yang bakal dipakai

		
		frmLoginPage.initialize(frmLoginPage);//memanggil method initialize() dengan parameter yaitu frmLoginPage
		
		
		frmLoginPage.actionInitialize();//memanggil method actionInitialize()

		 
		frmLoginPage.setVisible(true);//mengatur output agar dapat ditampilkan 		
	}

	private void initialize(JFrame frmLoginPage) {
		JLabel labelLogo = new JLabel("logo");
		
		labelLogo.setBackground(Color.WHITE);//mengatur background awal
		  
		labelLogo.setIcon(new ImageIcon("C:\\CODING\\Java\\mvn2\\app-library\\src\\main\\java\\com\\ibik\\library\\image\\logo-ibik-web.png"));//lokasi logo IBI Kesatuan
		
		labelLogo.setBounds(183, 0, 110, 127);//set ukuran window dengan format (x, y, width, height).
		
		frmLoginPage.getContentPane().add(labelLogo);//menambahkan background, icon, dan posisi yang sudah diatur
		
		JLabel labelTitle1 = new JLabel("Sistem Informasi Perpustakaan");//menampilkan judul di dalam halaman konten yang dibuat
		
		labelTitle1.setBackground(Color.YELLOW);//mengatur background belakang title
		
		labelTitle1.setForeground(Color.BLACK);//mengatur background belakang title
		
		labelTitle1.setHorizontalAlignment(SwingConstants.CENTER);//mengatur agar posisi title di tengah
		
		labelTitle1.setFont(new Font("Tahoma", Font.PLAIN, 25));//mengatur jenis font yang digunakan
		
		labelTitle1.setBounds(25, 138, 441, 25);//set ukuran window dengan format (x, y, width, height).
		
		frmLoginPage.getContentPane().add(labelTitle1);//menambahkan background, icon, dan posisi yang sudah diatur sebelumnya kedalam halaman konten
		
		JPanel panel = new JPanel();//membuat object baru dari class JPanel
		
		panel.setBorder(new TitledBorder(null, "Login to you account", TitledBorder.LEADING, TitledBorder.TOP, null, null));//mengatur tata letak pembatas/border
		
		panel.setBounds(25, 209, 441, 271);//set ukuran window dengan format (x, y, width, height). Dimana x dan y mengatur tata letak posisi window ketika pertama kali dijalankan
		
		frmLoginPage.getContentPane().add(panel);//menambahkan background, icon, dan posisi yang sudah diatur sebelumnya kedalam halaman konten
		
		panel.setLayout(null);//fungsi untuk menentukan jenis layout apa yang bakal dipakai	
		
		JLabel LabelUsername = new JLabel("Username");//object untuk menampilkan label inputan username
		
		LabelUsername.setBounds(29, 38, 72, 14);//set ukuran window dengan format (x, y, width, height). Dimana x dan y mengatur tata letak posisi window ketika pertama kali dijalankan
		
		panel.add(LabelUsername);//menambahkan background, icon, dan posisi yang sudah diatur sebelumnya kedalam halaman konten
		
		textUsername = new JTextField();//object untuk mengisi inputan username
		
		textUsername.setBounds(29, 63, 363, 36);//set ukuran window dengan format (x, y, width, height). Dimana x dan y mengatur tata letak posisi window ketika pertama kali dijalankan
		
		textUsername.setDocument(new textLimit(10));//set untuk membatasi panjang input
		
		panel.add(textUsername);//menambahkan background, icon, dan posisi yang sudah diatur sebelumnya kedalam halaman konten
		
		textUsername.setColumns(10);//mengatur agar kolom inputan user maksimal sampai dengan 10 
		
		JLabel LabelPassword = new JLabel("Password");//object untuk mengisi inputan password
		
		LabelPassword.setBounds(29, 122, 363, 14);//set ukuran window dengan format (x, y, width, height). Dimana x dan y mengatur tata letak posisi window ketika pertama kali dijalankan
		
		panel.add(LabelPassword);//menambahkan background, icon, dan posisi yang sudah diatur sebelumnya kedalam halaman konten
		
		textPassword = new JPasswordField();//object untuk mengisi password
		
		textPassword.setBounds(29, 147, 363, 36);//set ukuran window dengan format (x, y, width, height). Dimana x dan y mengatur tata letak posisi window ketika pertama kali dijalankan
		
		panel.add(textPassword);//menambahkan background, icon, dan posisi yang sudah diatur sebelumnya kedalam halaman konten
		
		btnSignIn = new JButton("Sign In");//object untuk menambahkan button/tombol klik
		
		btnSignIn.setBounds(303, 208, 89, 36);	//set ukuran window dengan format (x, y, width, height). Dimana x dan y mengatur tata letak posisi window ketika pertama kali dijalankan
		
		panel.add(btnSignIn);//menambahkan background, icon, dan posisi yang sudah diatur sebelumnya kedalam halaman konten
		
		btnSignIn.addActionListener(new ActionListener() {
		
			@Override
		
			public void actionPerformed(ActionEvent e) {
		
				String inUser = textUsername.getText();
				String inPass = String.valueOf(textPassword.getPassword());
		
				if (inUser.isEmpty() && inPass.isEmpty()) { //kondisi jika username dan password tidak diisi
					JOptionPane.showMessageDialog(null, "Mohon masukan username dan password anda.");
		
				} else if (isNumber(inUser) == false) { //kondisi jika username bukan angka
					JOptionPane.showMessageDialog(null, "Harap masukan angka.");
		
				} else if (inUser.equalsIgnoreCase("202310040") && inPass.equalsIgnoreCase("19092002")) { //kondisi jika username dan password benar
					JOptionPane.showMessageDialog(btnSignIn, "Selamat datang di aplikasi Perpustakaan IBIK.");
		
				} else {
					JOptionPane.showMessageDialog(btnSignIn, "Data yang anda masukan salah."); //kondisi jika username dan password tidak sesuai
				}
				System.out.println("username: " + inUser);
				System.out.println("password: " + inPass);
			}
		});
		
		JLabel lblNewLabel = new JLabel("(c) 2021 Grenna Saputra");//menambahkan label untuk copyright
		
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));//mengatur font yang digunakan dan ukuran font
		
		lblNewLabel.setBounds(25, 582, 441, 14);//set ukuran window dengan format (x, y, width, height). Dimana x dan y mengatur tata letak posisi window ketika pertama kali dijalankan	
		
		frmLoginPage.getContentPane().add(lblNewLabel);//menambahkan background, icon, dan posisi yang sudah diatur sebelumnya kedalam halaman konten
	}   
	private void actionInitialize() {	
		btnSignIn.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				String username = textUsername.getText();
				String password = String.valueOf(textPassword.getPassword());
				
				
				System.out.println("username: " + username);
				System.out.println("password: " + password);
			}		
		});
	}

	private boolean isNumber(String input) {	
		try {
			Integer i = Integer.parseInt(input) ;
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
class textLimit extends PlainDocument {	
	private int limit;
	textLimit(int limit) {
		super();
		this.limit = limit;
	}
	textLimit(int limit, boolean upper) {
		super();
		this.limit = limit;
	}
	public void insertString(int offset, String str, AttributeSet attr) throws BadLocationException {
		if (str == null)
			return;
		if ((getLength() + str.length()) <= limit) {
			super.insertString(offset, str, attr);
	    } else {
	    	JOptionPane.showMessageDialog(null, "Max input 10 digit");
		} 
	}
}