package teste1;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DataDeNascimento {

	public static void main(String[] args) {
		String dataminima = "01/01/1800";
		String datamaxima = "16/06/2023";
		
		DateFormat dateFormat = new SimpleDateFormat ("dd/MM/yyyy");
		Scanner scanner = new Scanner(System.in);
		
		try {
			
			Date dataMinimaString = dateFormat.parse(datamaxima);
			Date dataMaximaString = dateFormat.parse(datamaxima);
			
			System.out.println("Digite a data de nascimento(formato dd/mm/yyyy);");
			String dataString = scanner.nextLine();
			
			Date data = dateFormat.parse(dataString);
			if(data.before(dataMinimaString) || data.after(dataMaximaString)) {
				System.out.println("Data de nascimento inválida");
				
			}else {
				System.out.println("Data de nascimento válida");
						
			}
		}catch(ParseException e) {
			System.out.println("Formato de data inválido");
		}
			
				
}
	}
