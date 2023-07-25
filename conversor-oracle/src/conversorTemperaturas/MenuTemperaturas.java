package conversorTemperaturas;

import javax.swing.JOptionPane;

public class MenuTemperaturas {

	
	public static void MenuTemperatura(double valor) {
		
		ConvertirTemperatura conversor = new ConvertirTemperatura();
		
		Object opciones = JOptionPane.showInputDialog(null, "Elije una opcion para convertir",
				"Temperatura", JOptionPane.QUESTION_MESSAGE, null,
				new Object[] { "Grados Celsius a Grados Farenheit", "Grados Celsius a Kelvin", "Grados Farenheit a Grados Celsius",
						"Kelvin a Grados Celsius", "Kelvin a Grados Farenheit"}, null);

		switch (opciones.toString()) {

		case "Grados Celsius a Grados Farenheit":
			conversor.CelsiusAFarenheit(valor);
			break;

		case "Grados Celsius a Kelvin":
			conversor.CelsiusAKelvin(valor);
			break;

		case "Grados Farenheit a Grados Celsius":
			conversor.FarenheitACelsius(valor);
			break;

		case "Kelvin a Grados Celsius":
			conversor.KelvintACelsius(valor);
			break;

		case "Kelvin a Grados Farenheit":
			conversor.KelvinAFarenheit(valor);
			break;


		}	
	}
}
