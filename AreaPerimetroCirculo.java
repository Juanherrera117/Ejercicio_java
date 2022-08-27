// Calcular el área y el perímetro de un círculo 

package modelo;

import javax.swing.JOptionPane;

public class AreaPerimetroCirculo 
{
    public static void name(String[] args) 
    {
        int radio;
        double pi = Math.PI;
        double perimetro;
        double area;
        radio = Integer.parseInt(JOptionPane.showInputDialog(" Digite el radio: "));
        perimetro = 2 * pi * radio;
        area = pi * Math.pow(radio, 2);
        JOptionPane.showMessageDialog(null, "El perimetro del circulo con radio " +
        radio + " es " + String.format("%.2f", perimetro) + "!", "Perimetro del circulo", 
        JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "El area del circulo con radio " + 
        radio + " es " + String.format("%.2f", area) + "!", "Area del circulo", 
        JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
