package evaluacion;

import javax.swing.JPanel;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

public class Usuario_Tab extends JPanel {
	
		
		public DefaultTableModel ref_tab_mod;
		private Object [] dat;
		public JTable tabla=new JTable();	
		public ArrayList<Object[]> ref_arr=new ArrayList<Object[]>();
		public JScrollPane scrollPane = new JScrollPane();
		private JTable t1=new JTable();
		
		private DefaultTableModel referencia_tabla_model = new DefaultTableModel();
		public String [] columnas = {"Cedula","Nombre","Apellido","Edad","Tipo","Genero","Celular","peso","Altura","Direcion"};
		public String [][] filas = {{"Cedula","Nombre","Apellido","Edad","Tipo","Genero","Celular","peso","Altura","Direcion"}};
		private JTable tabla_vehiculos;
		private Object[][] tableContents;

		
		public Usuario_Tab(){
			this.setLayout(new BorderLayout());
			
			tableContents = new Object[0][0];
			referencia_tabla_model = new DefaultTableModel(tableContents, columnas);
			
			tabla_vehiculos = new JTable(referencia_tabla_model);
			this.add(new JScrollPane(tabla_vehiculos), BorderLayout.CENTER);
		}
		
		public Usuario_Tab(ArrayList<Object[]> ref_arr) {
			
			super();
			this.ref_arr=ref_arr;
				
			this.setVisible(true);
		}
		
		// ######### 8. Metodo para actualizar mi tabla, recibe el arrayList con las personas registradas
		public void refrescarLista( ArrayList<DatosPersona> listPersonas) {
			int b=0;
			// TODO Auto-generated method stub
			
			if(listPersonas.isEmpty()) {
				JOptionPane.showMessageDialog(null, "No hay elementos en el arraylist","Mensaje",JOptionPane.WARNING_MESSAGE);
			}
			else {		
				

				// ######### 9. Recorremos nuestro ArrayList para convertirlo en una matriz de objetos  Object[][] tableContents
				 
				tableContents = new Object[listPersonas.size()][4];
				  for (int i=0 ; i<listPersonas.size() ; i++) {
					tableContents[i][0] = listPersonas.get(i).getCed();
					tableContents[i][1] = listPersonas.get(i).getNombre();
					tableContents[i][2] = listPersonas.get(i).getApellido();
					tableContents[i][3] = listPersonas.get(i).getEdad();
				  }
				
				// ######### 10. Actualizo mi tabla con el metodo  setDataVector
				referencia_tabla_model.setDataVector(tableContents, columnas);
		

			}
		}
			
	


}
