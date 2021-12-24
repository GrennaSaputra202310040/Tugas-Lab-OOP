package com.ibik.library.app.login;

//import java library
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

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

import com.ibik.library.app.connection.ConnectionDB;


public class Login extends JFrame {

private JFrame frmLoginPage; //menggunakan JFrame dengan nama atribut frmLoginPage
private JTextField textUsername; //menggunakan JTextField dengan nama atribut textUsername
private JPasswordField textPassword; //menggunakan JPasswordField dengan nama atribut textPassword
private JButton btnSignIn; //menggunakan JButton dengan nama atribut btnSignIn



public static void main(String[] args) {
	  ConnectionDB conn = new ConnectionDB ();
    
    try {
		conn.connect();
      new Login().init();
	} catch (SQLException e) { 		//error handling for if connection is connected will show window dialog, the connection is failed
		JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
		e.printStackTrace();
	}
}

private void init() {
	  Login frmLoginPage = new Login(); //initialisasi object pada class Login sebagai bagian dari JFrame
    frmLoginPage.setTitle("Login Page"); // set title pada window
    frmLoginPage.setResizable(false); // membuat window tidak bisa melakukan resizeable atau maximize window
    frmLoginPage.setBounds(100, 100, 500, 646); // set ukuran window dengan format (x, y, width, height). Dimana x dan y mengatur tata letak posisi window ketika pertama kali dijalankan
    frmLoginPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //action ketika menutup window untuk mengakhiri program
    frmLoginPage.getContentPane().setLayout(null); //membuat content pane dari frame dengan pengaturan content manager dari setLayout adalah null
    frmLoginPage.initialize(frmLoginPage); //memanggil method initialize dengan parameter frmLoginPage
    frmLoginPage.actionInitialize(); //memanggil method actionInitialize
    frmLoginPage.setVisible(true); //set window bisa dilihat karena nilainya = true
}
//method initialize
private void initialize(JFrame frmLoginPage) {
    JLabel labelLogo = new JLabel("logo"); //initialisasi object labelLogo pada class Login sebagai bagian dari JLabel
        labelLogo.setBackground(Color.WHITE); //initialisasi warna background untuk logo
        labelLogo.setIcon(new ImageIcon("C:\\CODING\\PBO\\app_library\\src\\main\\java\\com\\ibik\\library\\app\\images\\logo-ibik-web.png")); //membuat setIcon dengan lokasi sesuai direktori
        labelLogo.setBounds(183, 0, 110, 127); // set ukuran window dengan format (x, y, width, height). Dimana x dan y mengatur tata letak posisi window ketika pertama kali dijalankan
        frmLoginPage.getContentPane().add(labelLogo); //membuat content pane dari frame dengan menanmbahkan labelLogo ke frmLoginPage
    JLabel labelTitle1 = new JLabel("Sistem Informasi Perpustakaan"); //initialisasi object labelTitle1 pada class Login sebagai bagian dari JLabel
        labelTitle1.setBackground(Color.YELLOW); //mengatur warna background dari labelTitle1 = kuning
        labelTitle1.setForeground(Color.BLACK); //mengatur warna foreground dari labelTitle1 = hitam
        labelTitle1.setHorizontalAlignment(SwingConstants.CENTER); //mengatur teks agar rata tengah
        labelTitle1.setFont(new Font("Tahoma", Font.PLAIN, 25)); //mengatur jenis font yang digunakan pada labelTitle1 adalah Tahoma, Plain, 25
        labelTitle1.setBounds(25, 138, 441, 25); // set ukuran window dengan format (x, y, width, height). Dimana x dan y mengatur tata letak posisi window ketika pertama kali dijalankan
        frmLoginPage.getContentPane().add(labelTitle1); //membuat content pane dari frame dengan menanmbahkan labelTitle1 ke frmLoginPage
    JPanel panel = new JPanel(); //initialisasi object panel pada class Login sebagai bagian dari JPanel
        panel.setBorder(new TitledBorder(null, "Login to your account", TitledBorder.LEADING, TitledBorder.TOP, null, null)); //initialisasi border pada panel dengan parameter border = null,  judul = "Login to your account", perataan border = leading, posisi title border = top, title font = null, dan title color = null
        panel.setBounds(25, 209, 441, 271); // set ukuran window dengan format (x, y, width, height). Dimana x dan y mengatur tata letak posisi window ketika pertama kali dijalankan
        frmLoginPage.getContentPane().add(panel); //membuat content pane dari frame dengan menanmbahkan panel ke frmLoginPage
        panel.setLayout(null); //mengatur layout manager pada panel = null
    JLabel LabelUsername = new JLabel("Username");  //initialisasi object labelUsername pada class Login sebagai bagian dari JLabel dengan parameter "Username"
        LabelUsername.setBounds(29, 38, 72, 14); // set ukuran window dengan format (x, y, width, height). Dimana x dan y mengatur tata letak posisi window ketika pertama kali dijalankan
        panel.add(LabelUsername); //menambahkan labelUsername ke bagian panel
    textUsername = new JTextField(); //initialisasi object textUsername pada class Login sebagai bagian dari JTextField
        textUsername.setBounds(29, 63, 363, 36); // set ukuran window dengan format (x, y, width, height). Dimana x dan y mengatur tata letak posisi window ketika pertama kali dijalankan
        panel.add(textUsername); //menambahkan textUsername ke bagian panel
        textUsername.setColumns(10); //mengatur jumlah kolom pada textUsername
    JLabel LabelPassword = new JLabel("Password"); //initialisasi object LabelPassword pada class Login sebagai bagian dari JLabel dengan parameter "Password"
        LabelPassword.setBounds(29, 122, 363, 14); // set ukuran window dengan format (x, y, width, height). Dimana x dan y mengatur tata letak posisi window ketika pertama kali dijalankan
        panel.add(LabelPassword); // menambahkan LabelPassword ke bagian panel
    textPassword = new JPasswordField(); //initialisasi object textPassword pada class Login sebagai bagian dari JPasswordField
        textPassword.setBounds(29, 147, 363, 36); // set ukuran window dengan format (x, y, width, height). Dimana x dan y mengatur tata letak posisi window ketika pertama kali dijalankan
        panel.add(textPassword); // menambahkan textPassword ke bagian panel
    btnSignIn = new JButton("Sign In"); //initialisasi object btnSignIn pada class Login sebagai bagian dari JButton dengan parameter "Sign In"
        btnSignIn.setBounds(303, 208, 89, 36); // set ukuran window dengan format (x, y, width, height). Dimana x dan y mengatur tata letak posisi window ketika pertama kali dijalankan
        panel.add(btnSignIn); // menambahkan btnSignIn ke bagian panel
    JLabel lblNewLabel = new JLabel("(c) 2021 Grenna Saputra"); //initialisasi object lblNewLabel pada class Login sebagai bagian dari JLabel dengan parameter "(c) 2021 Michael Mervin Ruswan"
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 11)); //mengatur jenis font yang digunakan pada lblNewLabel adalah Tahoma, Plain, 11
        lblNewLabel.setBounds(25, 582, 441, 14); // set ukuran window dengan format (x, y, width, height). Dimana x dan y mengatur tata letak posisi window ketika pertama kali dijalankan
        frmLoginPage.getContentPane().add(lblNewLabel); //membuat content pane dari frame dengan menanmbahkan lblNewLabel ke frmLoginPage
    
}

//method actionInitialize
private void actionInitialize(){
    btnSignIn.addActionListener(new ActionListener(){ //menambahkan ActionListener pada btnSignIn
        @Override
        public void actionPerformed(ActionEvent e) { // menjelaskan hal yang terjadi ketika sebuah action terjadi
            String username = textUsername.getText(); // initialisasi variabel username dengan valuenya diambil dari textUsername
            String password = String.valueOf(textPassword.getPassword()); // initialisasi variabel password dengan valuenya diambil dari textPassword yang dikonversikan ke String terlebih dahulu
            if(username.isEmpty() || password.isEmpty()) {
        		System.out.println("Username & Password harus diisi");
        		JOptionPane.showMessageDialog(null, "Username & Password harus diisi","Error",JOptionPane.ERROR_MESSAGE);
        	}else if(username.length()>10) {
        		System.out.println("Maximum 10 character untuk username");
        		JOptionPane.showConfirmDialog(null,"Maximum 10 character untuk username","Konfirmasi",JOptionPane.YES_NO_OPTION);
        	}else if(password.length()>6) {
        		System.out.println("Maximum 6 character untuk Password");
        		JOptionPane.showOptionDialog(null, "Maximum 6 character untuk Password", "Pilihan",JOptionPane.YES_OPTION,JOptionPane.INFORMATION_MESSAGE, null, null,null);
        	}else if(isNumber(username) == false) {
        		System.out.println("Harap masukan angka.");
        		JOptionPane.showMessageDialog(null, "Harap masukkan angka", "Error", JOptionPane.ERROR_MESSAGE);
        	}else if(username.equals("202310040") && password.equals("190902")) {
        		System.out.println("Selamat Datang di Aplikasi");
        		JOptionPane.showMessageDialog(null, "Selamat Datang di Aplikasi");
        	}else {
        		System.out.println("Data yang anda masukkan salah");
        		JOptionPane.showMessageDialog(null, "Data yang anda masukkan salah");
        	}
            System.out.println("username:"+username); //mengeluarkan output username ke CLI
            System.out.println("password:"+password); //mengeluarkan output password ke CLI
        }
    }
    );
}

public boolean isNumber(String jumlah) { //membuat fungsi error handling/exception menggunakan try and catch
    try {
        Double x = Double.parseDouble(jumlah);
        return true;
    } catch (Exception e) {
        return false;
    }
}


}