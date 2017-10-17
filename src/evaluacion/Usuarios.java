package evaluacion;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

import javax.jws.soap.SOAPBinding.Use;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;


public class Usuarios extends JPanel{
	
	Usuario_Mos  Usuario_Mos;
	Usuario_Tab  Usuario_Tab;

	
	public Usuarios(){
		
		 
		   //El gestor de diseño GridBagLayout le da al programador el control total 
		   //de dónde se colocan los componentes, el espacio entre ellos, etc, 
		   //pero junto con este control viene la complejidad.
		
	        setLayout( new GridBagLayout( ) );                 //otro tipo de layout y tiene que tener obligado un constraint
	        // Nos va comvertir nuestro panel en una matriz 
	        
	        Border borde = BorderFactory.createTitledBorder( "Buscar" );
	        setBorder( borde );
	        
	        
	       //El GridBagContraint pone las "propiedades" donde va a ser dibujado el componente,
	        GridBagConstraints constraint = new GridBagConstraints( );
	        //Pone las normas de como se debe colocar cada componente dentro de nuestro GridBagLayout 
	        //Maneja las restringciones que le voy a dar a los componentes
	        
	        constraint.gridx = 0;// definir la columna que empieza mi componete
	        constraint.gridy = 0;// definir la fila que empieza mi componete
	        constraint.fill = GridBagConstraints.BOTH;//El modo como va crecer el componente, BOTH:crece para los dos lados
	        //Un objeto Insets es una representación de los bordes de un contenedor. 
	        //Especifica el espacio que un contenedor debe dejar en cada uno de sus bordes. 
	        //top, left,  bottom,  right
	        Insets insets = new Insets(  5, 60, 50, 60 );
	        constraint.insets = insets;
	        
	        Usuario_Mos = new Usuario_Mos ();
	        add( Usuario_Mos,constraint );
	        
	        constraint.gridx = 0;// definir la columna que empieza mi componete
	        constraint.gridy = 1;// definir la fila que empieza mi componete
	        constraint.fill = GridBagConstraints.BOTH;//El modo como va crecer el componente, BOTH:crece para los dos lados
	        //Un objeto Insets es una representación de los bordes de un contenedor. 
	        //Especifica el espacio que un contenedor debe dejar en cada uno de sus bordes. 
	        //top, left,  bottom,  right
	        Insets insets2 = new Insets(  5, 60, 150, 60  );
	        constraint.insets = insets2;
	        
	        Usuario_Tab = new Usuario_Tab();
	        add( Usuario_Tab,constraint );
	        
	        
	        
	}
}
