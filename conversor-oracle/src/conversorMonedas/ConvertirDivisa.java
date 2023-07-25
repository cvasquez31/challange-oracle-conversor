package conversorMonedas;

import javax.swing.JOptionPane;

public class ConvertirDivisa {
	
	//Conversion de Soles a diferentes monedas
	public void ConvertirSolesADolar(double valor) {
		double monedaDolar = valor / 3.60;
		monedaDolar = (double) Math.round(monedaDolar *100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaDolar + " Dolares");
	}
	
	public void ConvertirSolesAEuros(double valor) {
		double monedaEuro = valor / 3.973;
		monedaEuro = (double) Math.round(monedaEuro *100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaEuro + " Euros");
	}
	
	public void ConvertirSolesALibrasEsterlinas(double valor) {
		double monedaLibra = valor / 4.604;
		monedaLibra= (double) Math.round(monedaLibra *100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaLibra + " Libras");
	}
	
	public void ConvertirSolesAYenJapones(double valor) {
		double monedaYen = valor / 0.0254297;
		monedaYen = (double) Math.round(monedaYen *100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaYen + " Yenes");
	}
	
	public void ConvertirSolesAWonSurCoreano(double valor) {
		double monedaWon = valor / 0.00280497;
		monedaWon = (double) Math.round(monedaWon *100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaWon  + " Won");
	}
	
	
	// Conversion de monedas a Soles
	public void ConvertirDolarASoles(double valor) {
		double monedaSoles = valor * 3.60;
		JOptionPane.showMessageDialog(null, "Tienes $ " + String.format("%.2f", monedaSoles) + " Soles");
	}
	
	public void ConvertirEurosASoles(double valor) {
		double monedaSoles = valor * 3.973;
		JOptionPane.showMessageDialog(null, "Tienes $ " + String.format("%.2f", monedaSoles) + " Soles");
	}
	
	public void ConvertirLibrasEsterlinasASoles(double valor) {
		double monedaSoles = valor * 4.604;
		JOptionPane.showMessageDialog(null, "Tienes $ " + String.format("%.2f", monedaSoles) + " Soles");
	}
	
	public void ConvertirYenJaponesASoles(double valor) {
		double monedaSoles = valor * 0.0254297;
		JOptionPane.showMessageDialog(null, "Tienes $ " + String.format("%.2f", monedaSoles) + " Soles");
	}
	
	public void ConvertirWonSurCoreanoASoles(double valor) {
		double monedaSoles = valor * 0.00280497;
		JOptionPane.showMessageDialog(null, "Tienes $ " + String.format("%.2f", monedaSoles) + " Soles");
	}
	
	public static boolean ValidarNumero(String input) {
		
		// Se valida que el usuario solo ingrese numeros
		try { 

			double numero = Double.parseDouble(input);

			if (numero >= 0) {
				return true;
			} else
				return false;

		} catch (NumberFormatException err) {
			return false;
		}
	}

}
