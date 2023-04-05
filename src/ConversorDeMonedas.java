

import javax.swing.*; 

public class ConversorDeMonedas {
	 public static void main (String[] args) {

	Function f = new Function();


    while(true) {

    	String opciones = (JOptionPane.showInputDialog(null, "Seleccione una opcion de conversor ", "Menu", JOptionPane.PLAIN_MESSAGE, null, new Object[] {"Conversor de Moneda", "Conversor de Temperatura","Conversor de Velocidad"}, "Seleccion")).toString();

    	if (opciones == "Conversor de Moneda") {
        String input = JOptionPane.showInputDialog("Ingresa un valor: ");
        if(f.check(input) == true) {
            double Minput = Double.parseDouble(input);
            f.Converter(Minput);

            int respuesta = 0;
            respuesta = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");
            if((respuesta == 0) && (f.check(input) == true)) { 
            } else {
                JOptionPane.showMessageDialog(null, "Programa finalizado");
                break;
            }

        } else {
            JOptionPane.showMessageDialog(null, "Valor inválido");                
        }
    } else if (opciones == "Conversor de Temperatura") {
    	 String input = JOptionPane.showInputDialog("Ingrese la temperatura a convertir");
         if(f.check(input) == true) {
             double Minput = Double.parseDouble(input);
             f.ConverterTemperatura(Minput);

             int respuesta = 0;
             respuesta = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");
             if((respuesta == 0) && (f.check(input) == true)) { 
             } else {
                 JOptionPane.showMessageDialog(null, "Programa finalizado");
                 break;
             }

         } else {
             JOptionPane.showMessageDialog(null, "Valor inválido");                
         }
    	
    
	 } else if (opciones == "Conversor de Velocidad") {
	 String input = JOptionPane.showInputDialog("Ingrese la velocidad a convertir");
     if(f.check(input) == true) {
         double Minput = Double.parseDouble(input);
         f.ConverterVelocidad(Minput);

         int respuesta = 0;
         respuesta = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");
         if((respuesta == 0) && (f.check(input) == true)) { 
         } else {
             JOptionPane.showMessageDialog(null, "Programa finalizado");
             break;
         }

     } else {
         JOptionPane.showMessageDialog(null, "Valor inválido");
     }
	}
   }
  }
}
     
	
	


