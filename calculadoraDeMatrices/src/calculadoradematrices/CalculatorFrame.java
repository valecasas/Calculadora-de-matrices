
package calculadoradematrices;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.math.BigDecimal;


 public class CalculatorFrame extends JFrame{
 
	private JTextField jt_matriz1;
        private JTextField jt_matriz2;
	private JTextField jt_binario;
	private JButton bt_Sumar;
        private JButton bt_Restar;
        private JButton bt_Traza;
        private JButton bt_Determinante;
         private JButton bt_llenar;
      
        
	public CalculatorFrame () {
 
		JPanel panelPrincipal = new JPanel();
		panelPrincipal.setBorder(BorderFactory.createEmptyBorder(45, 105, 45, 105));
		panelPrincipal.setLayout(new BoxLayout(panelPrincipal, BoxLayout.Y_AXIS));
		panelPrincipal.add(panelDecimal());
		panelPrincipal.add(panelBoton());
		panelPrincipal.add(panelBinario());
 
		setContentPane(panelPrincipal);
 
		setTitle("CALCULADORA MATRICES");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
                
	}
        
        public void guardar(){
             int dimenciones = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las dimenciones de la matriz"));
              Matriz mati=new Matriz(dimenciones, dimenciones);
             for(int i = 0; i<=dimenciones;i++){
                   for (int j=0;j<=dimenciones; j++){
                       int dato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero en la posicion  [" + i + "][" + j +" ]  de la matriz"));
                        mati.Insertar(i, j, dato);
                   }
               }
               
               mati.imprimir(); 
           }
 
	private JPanel panelDecimal() {
            
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		panel.add(new JLabel("MATRIZ 1"));
		jt_matriz1 = new JTextField();
		jt_matriz1.setEditable(false); //Aquí agregamos nuestro KeyListener
		panel.add(jt_matriz1);
                
                
                panel.add(new JLabel("MATRIZ 2"));
                jt_matriz2 = new JTextField();
                jt_matriz2.setEditable(false); //Aquí agregamos nuestro KeyListener
		panel.add(jt_matriz2 );
		return panel;
                
                
                
	}
        
        
 
	private JPanel panelBoton() {
		bt_Sumar = new JButton("SUMAR");
		bt_Sumar.addActionListener(new AccionConvertir()); //Aquí agregamos nuestro ActionListener
		JPanel panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(25, 0, 25, 0));
		panel.add(bt_Sumar);
                
                bt_llenar = new JButton("LLENAR");
		bt_llenar.addActionListener(new AccionConvertir()); //Aquí agregamos nuestro ActionListener
		panel.setBorder(BorderFactory.createEmptyBorder(25, 0, 25, 0));
		panel.add(bt_llenar);
                
                bt_Restar = new JButton("RESTAR");
		bt_Restar.addActionListener(new AccionConvertir()); //Aquí agregamos nuestro ActionListener
		panel.setBorder(BorderFactory.createEmptyBorder(25, 0, 25, 0));
		panel.add(bt_Restar);
                
                bt_Traza = new JButton("TRAZA");
		bt_Traza.addActionListener(new AccionConvertir()); //Aquí agregamos nuestro ActionListener
		panel.setBorder(BorderFactory.createEmptyBorder(25, 0, 25, 0));
		panel.add(bt_Traza);
                
                bt_Determinante = new JButton("DETERMINANTE");
		bt_Determinante.addActionListener(new AccionConvertir()); //Aquí agregamos nuestro ActionListener
		panel.setBorder(BorderFactory.createEmptyBorder(25, 0, 25, 0));
		panel.add(bt_Determinante);
                
		return panel;
	}
 
	private JPanel panelBinario() {
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		panel.add(new JLabel("RESULTADO"));
		jt_binario = new JTextField();
		jt_binario.setEditable(false); //Aquí el usuario no puede escribir
		panel.add(jt_binario);
		return panel;
	}
 /** 
	private class EscuchaTeclado implements KeyListener {
 
		@Override
		public void keyTyped(KeyEvent e) {
			/*
			 * Primero comprobamos si ya tenemos 2 caracteres
			 * en el campo de texto. Si ya los tenemos, rechazaremos
			 * cualquier cosa que estén tecleando.
		7	 */
		//	if (jt_matriz1.getText().length() == 2) {
				//Rechazamos lo tecleado
		//		e.consume();
				//Y hasta hacemos sonar una campanita de aviso
		//		java.awt.Toolkit.getDefaultToolkit().beep();
	//		}
	//		else { //Aún no tenemos 2 caracteres, solo aceptaremos caracters entre 0 y 9
	//			char caracter = e.getKeyChar();
	//			if (caracter < '0' || caracter > '9') {
					//No es un caracter entre 0 y 9, rechazamos
	//				e.consume();
	//			}
	//		}
	//	}
 
	//	@Override
	//	public void keyPressed(KeyEvent e) { /Nada que hacer aquí/}
 
	//	@Override
	//	public void keyReleased(KeyEvent e) { /Nada que hacer aquí/}
 
	//}*/
 
	private class AccionConvertir implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
               int dimenciones = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las dimenciones de la matriz"));
             
               Matriz mati=new Matriz(dimenciones, dimenciones);
             for(int i = 0; i<=dimenciones;i++){
                   for (int j=0;j<=dimenciones; j++){
                       int dato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero en la posicion  [" + i + "][" + j +" ]  de la matriz"));
                
                        mati.Insertar(i, NORMAL);
                   }
               }
               
              // mati.imprimir(); 
		}
	}
 
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new CalculatorFrame ();
			}
		});
	}
 
} 

