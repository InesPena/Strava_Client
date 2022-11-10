package client.gui;

import javax.swing.*;
import java.awt.Color;

public class VentrManual extends VentBase {

	private static final long serialVersionUID = 1L;

	public VentrManual() {
		super();
		getContentPane().setForeground(new Color(0, 0, 0));
		
		/*
		 * Titulo de página
		 */
		JLabel lblOpcion = new JLabel("CREAR MANUAL DE UNA SESIÓN    |");
		lblOpcion.setBounds(541, 32, 479, 75);
		lblOpcion.setFont(FONT_TITULO);
		getContentPane().add(lblOpcion);
		
		/*
		 * Crear Manual
		 */
		JLabel lblTitulo = new JLabel("Título");
		lblTitulo.setBounds(335, 128, 79, 40);
		lblTitulo.setFont(FONT_TXT);
		getContentPane().add(lblTitulo);
		
		JTextField tfTitulo = new JTextField();
		tfTitulo.setBounds(335, 165, 254, 20);
		getContentPane().add(tfTitulo);
		tfTitulo.setColumns(10);
		
		JLabel lblDeporte = new JLabel("Deporte");
		lblDeporte.setBounds(335, 209, 137, 40);
		lblDeporte.setFont(FONT_TXT);
		getContentPane().add(lblDeporte);
		
		JTextField tfDeporte = new JTextField();
		tfDeporte.setBounds(335, 165, 254, 20);
		getContentPane().add(tfDeporte);
		tfDeporte.setColumns(10);
		
		JComboBox<String> cbDeporte = new JComboBox<>();
		cbDeporte.setBounds(335, 251, 254, 30);
		cbDeporte.addItem("Running");
		cbDeporte.addItem("Ciclismo");
		getContentPane().add(cbDeporte);
		
		JLabel lblDistancia = new JLabel("Distancia (Km)");
		lblDistancia.setFont(FONT_TXT);
		lblDistancia.setBounds(335, 311, 153, 40);
		getContentPane().add(lblDistancia);
		
		JTextField tfDistancia = new JTextField();
		tfDistancia.setColumns(10);
		tfDistancia.setBounds(335, 355, 254, 20);
		getContentPane().add(tfDistancia);
		
		JLabel lblFecha = new JLabel("Fecha de Inicio");
		lblFecha.setFont(FONT_TXT);
		lblFecha.setBounds(335, 407, 209, 40);
		getContentPane().add(lblFecha);
		
		JTextField tfFecha = new JTextField();
		tfFecha.setColumns(10);
		tfFecha.setBounds(335, 449, 254, 20);
		tfFecha.setText("dd/mm/aaaa");
		getContentPane().add(tfFecha);
		
		JLabel lblHora = new JLabel("Hora de Inicio");
		lblHora.setFont(FONT_TXT);
		lblHora.setBounds(599, 407, 209, 40);
		getContentPane().add(lblHora);
		
		JTextField tfHora = new JTextField();
		tfHora.setBounds(599, 449, 153, 20);
		getContentPane().add(tfHora);
		tfHora.setText("HH:mm");
		tfHora.setColumns(10);
		
		JLabel lblDuracion = new JLabel("Duración (min)");
		lblDuracion.setFont(FONT_TXT);
		lblDuracion.setBounds(335, 504, 176, 40);
		getContentPane().add(lblDuracion);
		
		JTextField tfDuracion = new JTextField();
		tfDuracion.setColumns(10);
		tfDuracion.setBounds(335, 548, 254, 20);
		getContentPane().add(tfDuracion);
		
	}
}
