package conversorMonedas;

import javax.swing.JOptionPane;

public class MenuDivisas {

	public static void Menu(double valor) {
		
		ConvertirDivisa conversor = new ConvertirDivisa();
		
		Object opciones = JOptionPane.showInputDialog(null, "Elije la moneda a la que deseas convertir tu dinero ",
				"Monedas", JOptionPane.QUESTION_MESSAGE, null,
				new Object[] { "De Soles a Dólar", "De Soles a Euro", "De Soles a Libras", "De Soles a Yen",
						"De Soles a Won Coreano", "De Dólar a Soles", "De Euro a Soles", "De Libras a Soles",
						"De Yen a Soles", "De Won Coreano a Soles" }, null);

		
		
		switch (opciones.toString()) {

		case "De Soles a Dólar":
			conversor.ConvertirSolesADolar(valor);
			break;

		case "De Soles a Euro":
			conversor.ConvertirSolesAEuros(valor);
			break;

		case "De Soles a Libras":
			conversor.ConvertirSolesALibrasEsterlinas(valor);
			break;

		case "De Soles a Yen":
			conversor.ConvertirSolesAYenJapones(valor);
			break;

		case "De Soles a Won Coreano":
			conversor.ConvertirSolesAWonSurCoreano(valor);
			break;

		case "De Dólar a Soles":
			conversor.ConvertirDolarASoles(valor);
			break;

		case "De Euro a Soles":
			conversor.ConvertirEurosASoles(valor);
			break;

		case "De Libras a Soles":
			conversor.ConvertirLibrasEsterlinasASoles(valor);
			break;

		case "De Yen a Soles":
			conversor.ConvertirYenJaponesASoles(valor);
			break;

		case "De Won Coreano a Soles":
			conversor.ConvertirWonSurCoreanoASoles(valor);
			break;

		}
	}

}
