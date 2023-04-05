
import javax.swing.JOptionPane;

	public class Function {
		public void Converter(double Minput) {
	    	String opcion = (JOptionPane.showInputDialog(null, "Elija a que moneda quiere convertir su dinero ", "Monedas", JOptionPane.PLAIN_MESSAGE, null, new Object[] {"De Pesos Mexicanos a Dólares", "De Pesos Mexicanos a Euros", "De Pesos Mexicanos a Libras","De Pesos Mexicanos a Peso Argentino","De Pesos Mexicanos a Peso Chileno","De Dólares a Pesos Mexicanos", "De Euros a Pesos Mexicanos", "De Libras a Pesos Mexicanos","De Peso Argentino a Pesos Mexicanos","De Peso Chileno a Pesos Mexicanos"}, "Elija")).toString();
	        if(opcion == "De Pesos Mexicanos a Dólares") {
	        	double monedaDolar = Minput / 18.02;
	    		monedaDolar = (double) Math.round(monedaDolar *100d)/100;
	            JOptionPane.showMessageDialog(null, "Tienes $ " +monedaDolar+ " Dolares");
	        } else if (opcion == "De Pesos Mexicanos a Euros") {
	            double monedaEuro = Minput / 19.59;
	            monedaEuro = (double) Math.round(monedaEuro *100d)/100;
	            JOptionPane.showMessageDialog(null, "Tienes $ " +monedaEuro+ " Euros");
	        } else if (opcion == "De Pesos Mexicanos a Libras"){
	            double monedaLibra = Minput / 22.22;
	            monedaLibra = (double) Math.round(monedaLibra *100d)/100;
	            JOptionPane.showMessageDialog(null, "Tienes $ " +monedaLibra+ " Libras Esterlinas");
	        }  else if (opcion == "De Pesos Mexicanos a Peso Argentino"){
	            double monedaPesoArgentino = Minput / 0.0862;
	            monedaPesoArgentino = (double) Math.round(monedaPesoArgentino *100d)/100;
	            JOptionPane.showMessageDialog(null, "Tienes $ " +monedaPesoArgentino+ "Pesos Argentino");
	        } else if (opcion == "De Pesos Mexicanos a Peso Chileno"){
	            double monedaPesoChileno = Minput / 0.0227;
	            monedaPesoChileno = (double) Math.round(monedaPesoChileno *100d)/100;
	            JOptionPane.showMessageDialog(null, "Tienes $ " +monedaPesoChileno+ " Pesos Chileno");
	        } else if(opcion == "De Dólares a Pesos Mexicanos") {
	        	double monedaDolar = Minput * 18.02;
	    		monedaDolar = (double) Math.round(monedaDolar *100d)/100;
	            JOptionPane.showMessageDialog(null, "Tienes $ " +monedaDolar+ " Pesos Mexicanos");
	        } else if (opcion == "De Euros a Pesos Mexicanos") {
	            double monedaEuro = Minput * 19.59;
	            monedaEuro = (double) Math.round(monedaEuro *100d)/100;
	            JOptionPane.showMessageDialog(null, "Tienes $ " +monedaEuro+ " Pesos Mexicanos");
	        } else if (opcion == "De Libras a Pesos Mexicanos"){
	            double monedaLibra = Minput * 22.22;
	            monedaLibra = (double) Math.round(monedaLibra *100d)/100;
	            JOptionPane.showMessageDialog(null, "Tienes $ " +monedaLibra+ " Pesos Mexicanos");
	        }  else if (opcion == "De Peso Argentino a Pesos Mexicanos"){
	            double monedaPesoMxn = Minput * 0.0862;
	            monedaPesoMxn = (double) Math.round(monedaPesoMxn *100d)/100;
	            JOptionPane.showMessageDialog(null, "Tienes $" +monedaPesoMxn+ " Pesos Mexicanos");
	        } else if (opcion == "De Peso Chileno a Pesos Mexicanos"){
	            double monedaPesoChileno = Minput * 0.0227;
	            monedaPesoChileno = (double) Math.round(monedaPesoChileno *100d)/100;
	            JOptionPane.showMessageDialog(null, "Tienes $" +monedaPesoChileno+ " Pesos Mexicanos");
	        }      
	    }

	    public void ConverterTemperatura(double Minput) {
	    	String opcion = (JOptionPane.showInputDialog(null, "Elije una opción para convertir", "Temperatura", JOptionPane.PLAIN_MESSAGE, null, new Object[] {"Celcius a Grados Farenheit", "Celcius a Grados Kelvin", "Farenheit a Grados Celcius","Farenheit a Grados Kelvin","Kelvin a Grados Celcius","Kelvin a Grados Farenheit"}, "Seleccion")).toString();
	        if(opcion == "Celcius a Grados Farenheit") {
	        	double farenheit = Minput * 1.8 + 32;
	        	farenheit = (double) Math.round(farenheit *100d)/100;
	            JOptionPane.showMessageDialog(null, +Minput+ " Grados Celcius son " +farenheit+ " Grados Farenheit ");
	        } else if (opcion == "Celcius a Kelvin") {
	            double kelvin = Minput + 273.15;
	            kelvin = (double) Math.round(kelvin *100d)/100;
	            JOptionPane.showMessageDialog(null, +Minput+ " Grados Celcius son " +kelvin+ " Kelvin");
	        } else if (opcion == "Farenheit a Grados Celcius"){
	            double celcius = (Minput - 32) / 1.8;
	            celcius = (double) Math.round(celcius *100d)/100;
	            JOptionPane.showMessageDialog(null, +Minput+ " Grados Farenheit son " +celcius+ " Celcius");
	        }  else if (opcion == "Farenheit a Grados Kelvin"){
	            double kelvinfarenheit = (Minput - 32) * 5/9 + 273.15 ;
	            kelvinfarenheit = (double) Math.round(kelvinfarenheit *100d)/100;
	            JOptionPane.showMessageDialog(null, +Minput+ " Farenheit son " +kelvinfarenheit+  " Kelvin");
	        }  else if (opcion == "Kelvin a Grados Celcius"){
	            double kelvinCelcius = Minput - 273.15;
	            kelvinCelcius = (double) Math.round(kelvinCelcius *100d)/100;
	            JOptionPane.showMessageDialog(null, +Minput+ " Kelvin son " +kelvinCelcius+ " Celcius");
	        } else if (opcion == "Kelvin a Grados Farenheit"){
	            double kelvinfarenheit = (Minput - 273.15) * 9/5 + 32;
	            kelvinfarenheit = (double) Math.round(kelvinfarenheit *100d)/100;
	            JOptionPane.showMessageDialog(null, +Minput+ " Kelvin son " +kelvinfarenheit+  " Farenheit");
	        }   
	    }
	    
	    public void ConverterVelocidad(double Minput) {
	    	String opcion = (JOptionPane.showInputDialog(null, "Elije una opción para convertir", "Velocidad", JOptionPane.PLAIN_MESSAGE, null, new Object[] {"km/h a c","km/h a mph","km/h a kn","c a km/h","c a mph","c a kn","mph a c","mph a km/h","mph a kn","kn a c","kn a km/h","kn a mph"}, "Seleccion")).toString();
	        if(opcion == "km/h a c") {
	        	double km = Minput * 9.2656693110598e-10;
	        	km = (double) Math.round(km *100d)/100;
	            JOptionPane.showMessageDialog(null, +Minput+ " km/h son " +km+ " Velocidad de la luz ");
	        } else if (opcion == "km/h a mph") {
	            double km = Minput * 0.621371192;
	            km = (double) Math.round(km *100d)/100;
	            JOptionPane.showMessageDialog(null, +Minput+ " km/h son " +km+ " Millas");
	        } else if (opcion == "km/h a kn") {
	            double km = Minput * 0.539956803;
	            km = (double) Math.round(km *100d)/100;
	            JOptionPane.showMessageDialog(null, +Minput+ " km/h son " +km+ " Nudos");
	        } else if (opcion == "c a km/h") {
	            double c = Minput * 107925285;
	            c = (double) Math.round(c *100d)/100;
	            JOptionPane.showMessageDialog(null, +Minput+ " c son " +c+ " Kilometros por hora");
	        } else if (opcion == "c a mph") {
	            double c = Minput * 670616629;
	            c = (double) Math.round(c *100d)/100;
	            JOptionPane.showMessageDialog(null, +Minput+ " c son " +c+ " Millas");
	        } else if (opcion == "c a kn") {
	            double c = Minput * 582749918;
	            c = (double) Math.round(c *100d)/100;
	            JOptionPane.showMessageDialog(null, +Minput+ " c son " +c+ " Nudos");
	        } else if (opcion == "mph a c") {
	            double mph = Minput * 149116493;
	            mph = (double) Math.round(mph *100d)/100;
	            JOptionPane.showMessageDialog(null, +Minput+ " mph son " +mph+ " Velocidad de la luz");
	        } else if (opcion == "mph a km/h") {
	            double mph = Minput * 1.609344;
	            mph = (double) Math.round(mph *100d)/100;
	            JOptionPane.showMessageDialog(null, +Minput+ " mph son " +mph+ " Kilometros por hora");
	        } else if (opcion == "mph a kn") {
	            double mph = Minput * 0.868976242;
	            mph = (double) Math.round(mph *100d)/100;
	            JOptionPane.showMessageDialog(null, +Minput+ " mph son " +mph+ " Nudos");
	        } else if (opcion == "kn a c") {
	            double kn = Minput * 171600196;
	            kn = (double) Math.round(kn *100d)/100;
	            JOptionPane.showMessageDialog(null, +Minput+ " kn son " +kn+ " Velocidad de la luz");
	        } else if (opcion == "kn a km/h") {
	            double kn = Minput * 1.852;
	            kn = (double) Math.round(kn *100d)/100;
	            JOptionPane.showMessageDialog(null, +Minput+ " kn son " +kn+ " Kilometros por hora");
	        } else if (opcion == "kn a mph") {
	            double kn = Minput * 1.15077945;
	            kn = (double) Math.round(kn *100d)/100;
	            JOptionPane.showMessageDialog(null, +Minput+ " kn son " +kn+ " Millas");
	        }
	     }


	    public boolean check(String input) {
	        try {
	            double x = Double.parseDouble(input);
	            if(x >= 0 || x < 0);
	                return true;
	            } catch (NumberFormatException e) {
	                return false;
	            }
	    }
	
}
