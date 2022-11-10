package client.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class VentBase extends JFrame {	

	private static final long serialVersionUID = 1L;
	
	protected static final Color NEGRO = new Color(35, 35, 35);
	protected static final Font FONT_TITULO = new Font("Calibri", Font.CENTER_BASELINE, 30);
	protected static final Font FONT_TXT = new Font("Calibri", Font.CENTER_BASELINE, 25);

	public static void main(String[] args) {
		VentBase vent = new VentBase();
		vent.setVisible(true);
	}

	public VentBase() {
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		super.setSize(super.getToolkit().getScreenSize());
		getContentPane().setLayout(null);
		getContentPane().setBackground(Color.WHITE);
		
		/*
		 * Icono Strava
		 */
		Image imgStrava = new ImageIcon(getClass().getResource("logo.png")).getImage();
		ImageIcon iconStrava = new ImageIcon(imgStrava.getScaledInstance(200, 50, Image.SCALE_SMOOTH));
		JLabel lblNewLabel = new JLabel(iconStrava);
		lblNewLabel.setBounds(1001, 21, 237, 82);
		getContentPane().add(lblNewLabel);
		
		/*
		 * Menú
		 */
		JPanel panelMenu = new JPanel();
		panelMenu.setBounds(0, 0, 281, 683);
		getContentPane().add(panelMenu);
		panelMenu.setBackground(NEGRO);
		panelMenu.setLayout(null);		
		
		DefaultListModel<String> menuModel= new DefaultListModel<>();
		menuModel.addElement("Crear Manual");
		menuModel.addElement("Crear Reto");
		menuModel.addElement("Retos Activos");
		menuModel.addElement("Mis Retos");
		
		JList<String> listMenu = new JList<>(menuModel);
		listMenu.setLocation(10, 11);
		panelMenu.add(listMenu);
		listMenu.setSize(250, 500);
		listMenu.setBackground(NEGRO);
		listMenu.setForeground(Color.WHITE);
		
		listMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				VentrManual vent = new VentrManual();
				vent.setVisible(true);
			}
		});
		
		/*
		 * Logout
		 */
		JButton btnLogout = new JButton("LOGOUT");
		btnLogout.setForeground(new Color(255, 255, 255));
		btnLogout.setBounds(1106, 619, 118, 30);
		btnLogout.setBackground(new Color(255, 0, 0));
		getContentPane().add(btnLogout);
	}
}