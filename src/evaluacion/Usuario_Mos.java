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


public class Usuario_Mos extends JPanel implements ActionListener{
	
 
	
	 /**
    * Constante para la serialización
    */
   private static final long serialVersionUID = 1L;

   public static final String Cedula = "Cedula", BUSCAR_CLIENTE = "BUSCAR";

   private JButton btnBuscarCliente, cedula;

       
	public Usuario_Mos(){
			

					
				 
				
			        setLayout( new GridBagLayout( ) );                 //otro tipo de layout y tiene que tener obligado un constraint
			        // Nos va comvertir nuestro panel en una matriz 
			        
			        Border borde = BorderFactory.createTitledBorder( "DerechoSuperior" );
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
			        Insets insets = new Insets( 5, 10, 5, 10 );
			        constraint.insets = insets;
			        
			        
			        cedula = new JButton( "Agregar a favoritas" );
			        constraint = new GridBagConstraints( );
			        constraint.gridx = 0;//Aumenta el tamaña del espacio en que se en cuentra                            contrain funciona con ese:  setLayout( new GridBagLayout( ) );    
			        constraint.gridy = 0;//
			        constraint.fill = GridBagConstraints.BOTH; //Modificar el tamaño con respecto al grid    clase.constante: "GridBagConstraints.BOTH"      
			        insets = new Insets( 5, 10, 5, 10 );     //espacxios por fuera del componente
			        //top, left, abajo/bottom,  right
			        constraint.insets = insets;	        
			        add( cedula, constraint );
			        
			        
			        btnBuscarCliente = new JButton( "Ver mis avoritas" );
			        btnBuscarCliente.addActionListener( this );
			        btnBuscarCliente.setActionCommand( BUSCAR_CLIENTE );        
			        constraint = new GridBagConstraints( );
			        constraint.gridx = 0;
			        constraint.gridy = 1;
			        constraint.fill = GridBagConstraints.BOTH;
			        insets = new Insets( 5, 10, 5, 10 );
			        constraint.insets = insets;
			        add( btnBuscarCliente, constraint );
			        
			        
			
			}

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
		   	String accion = e.getActionCommand( );
		       if( accion.equals( BUSCAR_CLIENTE) ) {
		          	
		       
			 
		       }
		       
			
			}
}

