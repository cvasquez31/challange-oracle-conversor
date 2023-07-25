package conversorTemperaturas;

import javax.swing.JOptionPane;

public class ConvertirTemperatura {

	public void CelsiusAFarenheit(double valor) {
		double farenheit = (valor * (9/5) + 32);
		JOptionPane.showMessageDialog(null, valor + " Grados Celsius son: " + farenheit + " Grados Farenheit");
	}
	
	public void CelsiusAKelvin(double valor) {
		double kelvin = (valor + 273.15);
		JOptionPane.showMessageDialog(null, valor + " Grados Celsius son: " + kelvin + " Kelvin");
	}
	
	public void FarenheitACelsius(double valor) {
		double celsius = ((valor - 273.15) * 5/9);
		JOptionPane.showMessageDialog(null, valor + " Grados Farenheit son: " + celsius + " Grados celsius");
	}
	
	public void FarenheitAKelvin(double valor) {
		double kelvin = (((valor - 273.15) * 5/9) + 273.15);
		JOptionPane.showMessageDialog(null, valor + " Grados Farenheit son: " + kelvin + " Kelvin");
	}
	
	public void KelvintACelsius(double valor) {
		double celsius = valor - 273.15;
		JOptionPane.showMessageDialog(null, valor + " Kelvin son: " + celsius + " Grados Celsius");
	}
	
	public void KelvinAFarenheit(double valor) {
		double farenheit = (((valor - 273.15) * 9/5) + 32);
		JOptionPane.showMessageDialog(null, valor + " Grados Farenheit son: " + farenheit + " Grados Farenheit");
	}
	
	
public static boolean ValidarTemperatura(String input) {
		
		try { 

			double numero = Double.parseDouble(input);

			if (numero >= 0 || numero < 0) {
				return true;
			} else
				return false;

		} catch (NumberFormatException err) {
			return false;
		}
	}
	
	
}
