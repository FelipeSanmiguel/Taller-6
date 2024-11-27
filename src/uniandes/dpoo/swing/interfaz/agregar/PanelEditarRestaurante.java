package uniandes.dpoo.swing.interfaz.agregar;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class PanelEditarRestaurante extends JPanel
{
    /**
     * El campo para que el usuario ingrese el nombre del restaurante
     */
    private JTextField txtNombre;

    /**
     * Un selector (JComboBox) para que el usuario seleccione la calificación (1 a 5) del restaurante
     */
    private JComboBox<String> cbbCalificacion;

    /**
     * Un selector (JComboBox) para que el usuario indique si ya visitó el restaurante o no
     */
    private JComboBox<String> cbbVisitado;

    public PanelEditarRestaurante( )
    {
    	setLayout(new GridLayout(3, 2));
    	
        // Crea el campo para el nombre con una etiqueta al frente
        // TODO completar

    	JLabel labelTexto = new JLabel("Nombre: ");
    	txtNombre = new JTextField();
    	
        // Crea el selector para la calificación con una etiqueta al frente
        // TODO completar

    	JLabel labelCalificacion = new JLabel("Calificación: ");
    	String [] calificaciones = {"1","2","3","4","5"};
    	cbbCalificacion = new JComboBox<String>(calificaciones);
    	
        // Crea el selector para indicar si ya ha sido visitado, con una etiqueta al frente
        // TODO completar

    	JLabel labelVisitado = new JLabel("Visitado: ");
    	String [] opcionesVisitado = {"Si","No"};
    	cbbVisitado = new JComboBox<String>(opcionesVisitado);
    	
        // Agregar todos los elementos al panel
        // TODO completar
    	this.add(labelTexto);
    	this.add(txtNombre);
    	
    	this.add(labelCalificacion);
    	this.add(cbbCalificacion);
    	
    	this.add(labelVisitado);
    	this.add(cbbVisitado);

    }

    /**
     * Indica si en el selector se seleccionó la opción que dice que el restaurante fue visitado
     * @return
     */
    public boolean getVisitado( )
    {
        // TODO completar
        return cbbVisitado.getSelectedItem().equals("Si");
    }

    /**
     * Indica la calificación marcada en el selector
     * @return
     */
    public int getCalificacion( )
    {
        String calif = ( String )cbbCalificacion.getSelectedItem( );
        return Integer.parseInt( calif );
    }

    /**
     * Indica el nombre digitado para el restaurante
     * @return
     */
    public String getNombre( )
    {
        // TODO completar
        return txtNombre.getText();
    }
}