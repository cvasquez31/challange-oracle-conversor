package principal;

import javax.swing.JOptionPane;

import conversorMonedas.*;
import conversorTemperaturas.*;

public class Display {

	public static void main(String[] args) {

		while (true) {
			
			 Object opciones = JOptionPane.showInputDialog(null, "Seleccione una opción de conversión", "Menu",
		                JOptionPane.PLAIN_MESSAGE, null, new Object[] { "Conversor de Moneda", "Conversor de temperatura"}, null);

		        if (opciones == null) {
		            // El usuario ha cerrado la ventana sin seleccionar ninguna opción
		            System.exit(0);
		        }
			
			
			switch (opciones.toString()) {

			case "Conversor de Moneda":
				
				String inputMoneda = JOptionPane.showInputDialog("Ingrese la cantidad de dinero que desea convertir: ");
				
				if (inputMoneda == null) 
					break;
				
				if (ConvertirDivisa.ValidarNumero(inputMoneda)) {
					
					double valor = Double.parseDouble(inputMoneda);
					
					try {
						MenuDivisas.Menu(valor);
					} catch (NullPointerException ex) {
						break;
					}
					
					int opcion = JOptionPane.showConfirmDialog(null, "¿Desea continuar?", "Seleccionar una opcion", JOptionPane.YES_NO_CANCEL_OPTION);

					if (JOptionPane.YES_OPTION == opcion) {
						System.out.println("Opcion afirmativa");
					} else {
						JOptionPane.showMessageDialog(null, "Programa terminado");
						System.exit(0);
					}

				} else {
					JOptionPane.showMessageDialog(null, "Valor inválido");
				}
					break;

				
			case "Conversor de temperatura": 
				
				String inputTemperatura = JOptionPane.showInputDialog("Ingrese temperatura: ");
				
				if (inputTemperatura == null) 
					break;
				
				if (ConvertirTemperatura.ValidarTemperatura(inputTemperatura)) {
					
					double valor = Double.parseDouble(inputTemperatura);
					
					try {
						MenuTemperaturas.MenuTemperatura(valor);
					} catch (NullPointerException ex) {
						break;
					}
					
					int opcion = JOptionPane.showConfirmDialog(null, "¿Desea continuar?", "Seleccionar una opcion", JOptionPane.YES_NO_CANCEL_OPTION);

					if (JOptionPane.YES_OPTION == opcion) {
						System.out.println("Opcion afirmativa");
					} else {
						JOptionPane.showMessageDialog(null, "Programa terminado");
						System.exit(0);
					}

				} else {
					JOptionPane.showMessageDialog(null, "Valor inválido");
				}
				
				break;
			

			}

		}

	}

}
