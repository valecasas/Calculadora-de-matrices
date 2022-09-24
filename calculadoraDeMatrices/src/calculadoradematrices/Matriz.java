
package calculadoradematrices;

import javax.swing.JOptionPane;


public class Matriz extends CalculatorFrame{

    public int getFilas() {
        return filas;
    }

    /**
     * @param filas the filas to set
     */
    public void setFilas(int filas) {
        this.filas = filas;
    }

    /**
     * @return the columnas
     */
    public int getColumnas() {
        return columnas;
    }

    /**
     * @param columnas the columnas to set
     */
    public void setColumnas(int columnas) {
        this.columnas = columnas;
    }

    /**
     * @return the m
     */
    public double[][] getM() {
        return m;
    }

    /**
     * @param m the m to set
     */
    public void setM(double[][] m) {
        this.m = m;
    }
    private int filas;
    private int columnas;
    private double [][] m;
 
    public Matriz() {
        
    }
    
    public Matriz(int filas, int columnas){
        this.filas=filas;
        this.columnas=columnas;
        this.m = new double[filas][columnas];
        
    }
    
    public void Insertar(int filas, int columnas) {
       
        
        for (int k = 0; k < filas; k++) {
            for (int j = 0; j < columnas; j++) {
                 int dato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero en la posicion  [" + k + "][" + j +" ]  de la matriz"));
                 this.m[filas][columnas]=dato;   
            }
        }
 return ;
    }
        
    
    
    public String imprimir() {
        
        String s="";
        
        for(int f=0; f<this.filas; f++){
            s=s+"{ ";
            for(int c=0; c<this.columnas; c++){
            s = s + String.valueOf(m[f][c]) + "";
            }
            s=s+"}\n";
        }
        return s;
    }
    public String imprimir(double [][] matriz1) {
        
        String s="";
        
        for(int f=0; f<matriz1.length; f++){
            s=s+"[ ";
            for(int c=0; c<matriz1[0].length; c++){
                s=s+String.format("%.2f", matriz1[f][c] + " ");
            }
            s=s+"]\n";
        }
        return s;
        
    }
    public int matrizCuadrada() {
        if (this.filas==this.columnas)
            return this.filas;
        else
            return 0;
        
    }

    void Insertar(int i, int j, int dato) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

