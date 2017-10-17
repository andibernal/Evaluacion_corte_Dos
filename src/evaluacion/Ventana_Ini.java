package evaluacion;

import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class Ventana_Ini extends JFrame{


	Registro panelRegistro;
    Usuarios panelUsuarios;
    Usuario_Tab Usuario_Tab; 
    
    private DefaultTableModel ref_tab;

    private ArrayList<DatosPersona> personas;
	////######### 0. Creo mi arraList que va guardar todas las personas 
    
	Ventana_Ini(){
		 super("Ventana JFrame Principal");
		 iniciar();
		 componente();
		 setVisible(true);
		 pack();
		 // Centrar la ventana
         setLocationRelativeTo( null );
	}
	
	public Ventana_Ini iniciar(){  //configura el jframer
				
				Dimension dims = new Dimension(800, 600);
				this.setSize(dims);
				this.setPreferredSize(dims);
				/*
				 * Ordenamiento del Jframe
				 * */
				this.getContentPane( ).setLayout( new BorderLayout( ) );  //organiz el panel interno del j framer         BorderLayout: ventanas de los bordes 
				this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				return this;
	}
	
	
	public void componente() {
		
		
		// Creación de los paneles aquí   los agrega aljframer
		personas = new ArrayList<DatosPersona>( );
		
		

     // 1. Envío referencia de mi JFRAME a traves de  this
        panelRegistro = new Registro(this);   //this
        add( panelRegistro, BorderLayout.WEST );
        
        panelUsuarios = new Usuarios();
        add( panelUsuarios, BorderLayout.CENTER );
        
        //Usuario_Tab = new Usuario_Tab();
        //add( Usuario_Tab, BorderLayout.SOUTH );
        
	}
	
	
	// ######### 5. Metodo que crea los objetos tipo persona y lo agrega a mi arrayList
	public void agregarPersona(int ced, String nom, String ape, int edad, String tipo, String genero, int celular, int peso, int altura, String direccion  )
	   {
		 DatosPersona nuevoPerso = new DatosPersona(ced,nom,ape,edad,tipo,genero,celular,peso,altura,direccion);
		 personas.add( nuevoPerso );
		 actualizarTabla();
	   }
	
	// ######### 6. Metodo que me actualiza la tabla en mi clase PanelTabla
	public void actualizarTabla() {

		// ######### 7. panelTabla = es la referencia del panel  PanelTabla, linea 49, hace el llamado al metodo refrescarLista
		// Vamos a enviar el arrayList (personas) para poder pintarlo en mi tabla que esta en la clase PanelTabla
		Usuario_Tab.refrescarLista(personas);
	}
	
	
}

