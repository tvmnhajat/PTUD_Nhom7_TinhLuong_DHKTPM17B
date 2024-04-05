package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
/**
 * @author Nguyễn Hồng Quân
 */
public class About extends JFrame implements WindowListener{

	private static final long serialVersionUID = 1L;
	public About() {
		setTitle("About");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 500, 325);
		setLocationRelativeTo(null);
		URL urlicon = About.class.getResource("/img/logo_icon.png");
		ImageIcon icon = new ImageIcon(urlicon);
		setIconImage(icon.getImage());
		setResizable(false);
		
		JLabel lblTV4 = new JLabel("Trần Vũ Minh Nhật");
		lblTV4.setHorizontalAlignment(SwingConstants.LEFT);
		lblTV4.setForeground(Color.WHITE);
		lblTV4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblTV4.setBounds(356, 110, 134, 25);
		add(lblTV4);
		
		JLabel lblTV3 = new JLabel("Nguyễn Hồng Quân");
		lblTV3.setHorizontalAlignment(SwingConstants.LEFT);
		lblTV3.setForeground(Color.WHITE);
		lblTV3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblTV3.setBounds(356, 85, 134, 25);
		add(lblTV3);
		
		JLabel lblTV2 = new JLabel("Nguyễn Tuấn Hùng");
		lblTV2.setHorizontalAlignment(SwingConstants.LEFT);
		lblTV2.setForeground(Color.WHITE);
		lblTV2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblTV2.setBounds(356, 60, 134, 25);
		add(lblTV2);
		
		JLabel lblTV1 = new JLabel("Nguyễn Thành An");
		lblTV1.setHorizontalAlignment(SwingConstants.LEFT);
		lblTV1.setForeground(Color.WHITE);
		lblTV1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblTV1.setBounds(356, 35, 134, 25);
		add(lblTV1);
		
		JLabel lblNhom = new JLabel("Nhóm phát triển: 07");
		lblNhom.setHorizontalAlignment(SwingConstants.LEFT);
		lblNhom.setForeground(Color.WHITE);
		lblNhom.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNhom.setBounds(356, 10, 134, 25);
		add(lblNhom);
		
		JLabel lblCopy = new JLabel("Copyright (C) 2023");
		lblCopy.setHorizontalAlignment(SwingConstants.LEFT);
		lblCopy.setForeground(Color.WHITE);
		lblCopy.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblCopy.setBounds(10, 35, 214, 25);
		add(lblCopy);
		
		JLabel lblVer = new JLabel("Salar v1");
		lblVer.setHorizontalAlignment(SwingConstants.LEFT);
		lblVer.setForeground(new Color(255, 255, 255));
		lblVer.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblVer.setBounds(10, 10, 214, 25);
		add(lblVer);
		
		JLabel lblHinh = new JLabel("");
		lblHinh.setBackground(new Color(0, 0, 0));
		lblHinh.setBounds(2, 2, 496, 303);
		URL urlHinhAnh = About.class.getResource("/img/SplashScreen.png");
		lblHinh.setIcon(new ImageIcon(urlHinhAnh));
		add(lblHinh);
		addWindowListener(this);
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		this.dispose();
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
}