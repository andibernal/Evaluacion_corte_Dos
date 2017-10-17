package evaluacion;


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


import java.util.Random;


public class Registro extends JPanel implements ActionListener {
	
	
	Usuario_Tab panelC;
	JTextField Tnom, Tape, Tedad, Tced,Ttip,Tgen,Tcel,Tpes,Talt,Tdir;
	JButton agregar;
	DatosPersona datos,datos1;
	public Object [] ar;
	private ArrayList<Object[]> listaDatos= new ArrayList<Object[]>();  
	
	private String [] col= {"Cedula", "Nombre", "Apellido", "Edad"};
	DatosPersona p1;
	private Object[][]ve;
	public HashMap<Integer, String> personasMap = new HashMap<Integer, String>();
	//PanelRegistro a= new PanelRegistro();
	private DefaultTableModel dt1;
	private JTable t1;
	public DefaultTableModel table_model;
	
	private Ventana_Ini refe_princi;
	
	
	 /**
     * Constante para la serialización
     */
    private static final long serialVersionUID = 1L;

    /**
     * Constante que agrega
     */
    //public static final String Cedula = "Cedula",Nombre = "Nombre",Apellido = "Apellido",Edad = "Edad",Peso = "Peso",Agregar = "Agregar";

    private JLabel cedula,nombre,apellido,edad,Tipo,Genero,Celular,peso,Altura,Direcion;
    /**
     * Botón para generar el reporte 
     */
    private JButton Agregar;
    
    
 // ######### 2. Recibo a traves del contructor una referencia de tipo de mi JFRAME en este caso tu frame es VentanaJFrame
	public Registro(Ventana_Ini _refe_princi){
			
		//######### 3. Hago global en esta clase esa referencia, para que la pueda ver en toda mi clase
				refe_princi=_refe_princi;
		 
		   //El gestor de diseño GridBagLayout le da al programador el control total 
		   //de dónde se colocan los componentes, el espacio entre ellos, etc, 
		   //pero junto con este control viene la complejidad.
		
	        setLayout( new GridBagLayout( ) );                 //otro tipo de layout y tiene que tener obligado un constraint
	        // Nos va comvertir nuestro panel en una matriz 
	        
	        Border borde = BorderFactory.createTitledBorder( "Panel Izquierdo" );
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
	        
	        
	        
	        
			
			
	        cedula = new JLabel( "Cedula" );
	        //cedula.setText("");	       
	        constraint = new GridBagConstraints( );
	        constraint.gridx = 0;//Aumenta el tamaña del espacio en que se en cuentra                            contrain funciona con ese:  setLayout( new GridBagLayout( ) );    
	        constraint.gridy = 1;//
	        constraint.fill = GridBagConstraints.BOTH; //Modificar el tamaño con respecto al grid    clase.constante: "GridBagConstraints.BOTH"      
	        insets = new Insets( 5, 10, 5, 10 );     //espacxios por fuera del componente
	        //top, left, abajo/bottom,  right
	        constraint.insets = insets;	        
	        add( cedula, constraint );
	        
	        
	        Tced= new JTextField();
	        constraint = new GridBagConstraints( );
	        constraint.gridx = 0;//Aumenta el tamaña del espacio en que se en cuentra
	        constraint.gridy = 2;//
	        constraint.fill = GridBagConstraints.BOTH; //Modificar el tamaño con respecto al grid
	        insets = new Insets( 5, 10, 5, 10 );
	        constraint.insets = insets;	        
	        add( Tced,constraint);
	        
	        
	        nombre = new JLabel( "Nombre" );
	        constraint = new GridBagConstraints( );
	        constraint.gridx = 0;
	        constraint.gridy = 3;
	        constraint.fill = GridBagConstraints.BOTH;
	        insets = new Insets( 5, 10, 5, 10 );
	        //top, left,  bottom,  right
	        constraint.insets = insets;
	        add( nombre, constraint );  //agrega el boton al JPanel
	        
	        
	        Tnom= new JTextField();
	        constraint = new GridBagConstraints( );
	        constraint.gridx = 0;//Aumenta el tamaña del espacio en que se en cuentra
	        constraint.gridy = 4;//
	        constraint.fill = GridBagConstraints.BOTH; //Modificar el tamaño con respecto al grid
	        insets = new Insets( 5, 10, 5, 10 );
	        constraint.insets = insets;	        
	        add( Tnom,constraint);
	        
	        
	        apellido = new JLabel( "Apellido" );        
	        constraint = new GridBagConstraints( );
	        constraint.gridx = 0;
	        constraint.gridy = 5;
	        constraint.fill = GridBagConstraints.BOTH;
	        insets = new Insets( 5, 10, 5, 10 );
	        constraint.insets = insets;
	        add( apellido, constraint );
	        
	        
	        Tape= new JTextField();
	        constraint = new GridBagConstraints( );
	        constraint.gridx = 0;//Aumenta el tamaña del espacio en que se en cuentra
	        constraint.gridy = 6;//
	        constraint.fill = GridBagConstraints.BOTH; //Modificar el tamaño con respecto al grid
	        insets = new Insets( 5, 10, 5, 10 );
	        constraint.insets = insets;	        
	        add( Tape,constraint);
	        
	        
	        edad = new JLabel( "Edad" );
	        constraint = new GridBagConstraints( );
	        constraint.gridx = 0;
	        constraint.gridy = 7;
	        constraint.fill = GridBagConstraints.BOTH;
	        insets = new Insets( 5, 10, 5, 10 );
	        constraint.insets = insets;
	        add( edad, constraint );
	        
	        
	        Tedad= new JTextField();
	        constraint = new GridBagConstraints( );
	        constraint.gridx = 0;//Aumenta el tamaña del espacio en que se en cuentra
	        constraint.gridy = 8;//
	        constraint.fill = GridBagConstraints.BOTH; //Modificar el tamaño con respecto al grid
	        insets = new Insets( 5, 10, 5, 10 );
	        constraint.insets = insets;	        
	        add( Tedad,constraint);
	        
	        Tipo = new JLabel( "Tipo" );
	        constraint = new GridBagConstraints( );
	        constraint.gridx = 0;
	        constraint.gridy = 3;
	        constraint.fill = GridBagConstraints.BOTH;
	        insets = new Insets( 5, 10, 5, 10 );
	        //top, left,  bottom,  right
	        constraint.insets = insets;
	        add( Tipo, constraint );  //agrega el boton al JPanel
	        
	        
	        Ttip= new JTextField();
	        constraint = new GridBagConstraints( );
	        constraint.gridx = 0;//Aumenta el tamaña del espacio en que se en cuentra
	        constraint.gridy = 4;//
	        constraint.fill = GridBagConstraints.BOTH; //Modificar el tamaño con respecto al grid
	        insets = new Insets( 5, 10, 5, 10 );
	        constraint.insets = insets;	        
	        add( Ttip,constraint);
	        
	        
	        
	        Genero = new JLabel( "Genereo" );
	        constraint = new GridBagConstraints( );
	        constraint.gridx = 0;
	        constraint.gridy = 3;
	        constraint.fill = GridBagConstraints.BOTH;
	        insets = new Insets( 5, 10, 5, 10 );
	        //top, left,  bottom,  right
	        constraint.insets = insets;
	        add( Genero, constraint );  //agrega el boton al JPanel
	        
	        
	        Tgen= new JTextField();
	        constraint = new GridBagConstraints( );
	        constraint.gridx = 0;//Aumenta el tamaña del espacio en que se en cuentra
	        constraint.gridy = 4;//
	        constraint.fill = GridBagConstraints.BOTH; //Modificar el tamaño con respecto al grid
	        insets = new Insets( 5, 10, 5, 10 );
	        constraint.insets = insets;	        
	        add( Tgen,constraint);
	        
	        
	        Celular = new JLabel( "Celular" );
	        constraint = new GridBagConstraints( );
	        constraint.gridx = 0;
	        constraint.gridy = 3;
	        constraint.fill = GridBagConstraints.BOTH;
	        insets = new Insets( 5, 10, 5, 10 );
	        //top, left,  bottom,  right
	        constraint.insets = insets;
	        add( Celular, constraint );  //agrega el boton al JPanel
	        
	        
	        Tcel= new JTextField();
	        constraint = new GridBagConstraints( );
	        constraint.gridx = 0;//Aumenta el tamaña del espacio en que se en cuentra
	        constraint.gridy = 4;//
	        constraint.fill = GridBagConstraints.BOTH; //Modificar el tamaño con respecto al grid
	        insets = new Insets( 5, 10, 5, 10 );
	        constraint.insets = insets;	        
	        add( Tcel,constraint);
	        
	        
	        Altura = new JLabel( "Altura" );
	        constraint = new GridBagConstraints( );
	        constraint.gridx = 0;
	        constraint.gridy = 3;
	        constraint.fill = GridBagConstraints.BOTH;
	        insets = new Insets( 5, 10, 5, 10 );
	        //top, left,  bottom,  right
	        constraint.insets = insets;
	        add( Altura, constraint );  //agrega el boton al JPanel
	        
	        
	        Talt= new JTextField();
	        constraint = new GridBagConstraints( );
	        constraint.gridx = 0;//Aumenta el tamaña del espacio en que se en cuentra
	        constraint.gridy = 4;//
	        constraint.fill = GridBagConstraints.BOTH; //Modificar el tamaño con respecto al grid
	        insets = new Insets( 5, 10, 5, 10 );
	        constraint.insets = insets;	        
	        add( Talt,constraint);
	        
	        
	
	        Direcion = new JLabel( "Direccion" );
	        constraint = new GridBagConstraints( );
	        constraint.gridx = 0;
	        constraint.gridy = 3;
	        constraint.fill = GridBagConstraints.BOTH;
	        insets = new Insets( 5, 10, 5, 10 );
	        //top, left,  bottom,  right
	        constraint.insets = insets;
	        add( Direcion, constraint );  //agrega el boton al JPanel
	        
	        
	        Tdir= new JTextField();
	        constraint = new GridBagConstraints( );
	        constraint.gridx = 0;//Aumenta el tamaña del espacio en que se en cuentra
	        constraint.gridy = 4;//
	        constraint.fill = GridBagConstraints.BOTH; //Modificar el tamaño con respecto al grid
	        insets = new Insets( 5, 10, 5, 10 );
	        constraint.insets = insets;	        
	        add( Tdir,constraint);
	        
	        
	        
	        peso = new JLabel( "Peso" );        
	        constraint = new GridBagConstraints( );
	        constraint.gridx = 0;
	        constraint.gridy = 9;
	        constraint.fill = GridBagConstraints.BOTH;
	        insets = new Insets( 5, 10, 5, 10 );
	        constraint.insets = insets;
	        add( peso, constraint );
	        
	        Tpes= new JTextField();
	        constraint = new GridBagConstraints( );
	        constraint.gridx = 0;//Aumenta el tamaña del espacio en que se en cuentra
	        constraint.gridy = 4;//
	        constraint.fill = GridBagConstraints.BOTH; //Modificar el tamaño con respecto al grid
	        insets = new Insets( 5, 10, 5, 10 );
	        constraint.insets = insets;	        
	        add( Tpes,constraint);
	        
	        
	        
	        
	        agregar = new JButton( "Agregar" );
	        agregar.addActionListener( this );
	        agregar.setActionCommand( "a" );
	        constraint = new GridBagConstraints( );
	        constraint.gridx = 0;
	        constraint.gridy = 10;
	        constraint.fill = GridBagConstraints.BOTH;
	        insets = new Insets( 5, 10, 5, 10 );
	        constraint.insets = insets;
	        add( agregar, constraint );
	    
	        
			
	
			
	}

	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
        if("a".equals(e.getActionCommand())) {
			
			//######### 4. envio los datos a la funcion agregarPersona(), que esta en mi clase JFrame a traves de mi referecnia  refe_princi
        	                                                                                                                              //Ttip,Tg                                en,Tcel,Tpes,Talt,Tdir  
			refe_princi.agregarPersona(Integer.parseInt(Tced.getText()),Tnom.getText(),Tape.getText(),Integer.parseInt(Tedad.getText()),Ttip.getText(),Tgen.getText(),Integer.parseInt(Tcel.getText()),Integer.parseInt(Tpes.getText()),Integer.parseInt(Talt.getText()),Tdir.getText());
			JOptionPane.showMessageDialog(null,"Persona agregada. ","Mensaje",JOptionPane.INFORMATION_MESSAGE);
		}
		
	}
			
	
	

}
