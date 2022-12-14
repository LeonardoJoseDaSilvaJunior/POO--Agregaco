package estudo_Extra;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
public class AppViagem {
	static Scanner scan = new Scanner (System.in);
	static List<Veiculo> listaVeiculos = new ArrayList<Veiculo>();
	static SimpleDateFormat formatoData = new SimpleDateFormat ("DD/MM/YYYY");
	public static void main(String[] args) {
		
		listaVeiculos.add(new Veiculo (1, "ADM456",0));
		listaVeiculos.add(new Veiculo (2, "BRA123",0));
		listaVeiculos.add(new Veiculo (3, "SPA159",0));
		
		for(Veiculo veiculo : listaVeiculos) {
			System.out.println(veiculo);
		}
		Date dataInicial;
		do {
			try {
				System.out.print("Insira a data inicial : ");
				String data = scan.nextLine();
				dataInicial = formatoData.parse(data);

			}
			catch(Exception e) {
				System.out.println("\n__________ ERRO __________\n");
				System.out.println(e.getMessage());
				System.out.println("\nInsira uma data valida");
				System.out.println("\n°°°°°°°°°°°°°°°°°°°°°°°°°°°°\n");
				continue;
			}
			break;
		}while(true);
		
		Date dataFinal;
		do {
			try {
				System.out.print("Insira a data final : ");
				String data = scan.nextLine();
				dataFinal = formatoData.parse(data);
			}
			catch(Exception e) {
				System.out.println("\n__________ ERRO __________\n");
				System.out.println(e.getMessage());
				System.out.println("\nInsira uma data valida");
				System.out.println("\n____________________________\n");
				continue;
			}
			break;
		}while(true);
		
		Viagem viagem = new Viagem(45, "Coque", dataInicial, dataFinal, pesquisarVeiculoPorId(3) );
		System.out.println(viagem);
		System.out.println(pesquisarVeiculoPorId(3).getStatus());
		System.out.println("_____ INICIANDO VIAGEM  ____");
		viagem.iniciarViagem(pesquisarVeiculoPorId(3));
		System.out.println(viagem);
		for (Veiculo veiculo : listaVeiculos) {
			if (veiculo == pesquisarVeiculoPorId(3)) {
				System.out.println(veiculo);
			}
		}
		
		System.out.println("\n____ FINALIZANDO VIAGEM ____");
		viagem.finalizarViagem(45);
		System.out.println(viagem);
		System.out.println(pesquisarVeiculoPorId(2));
		System.out.println("\n____ REVISAO DO VEICULO ____");
		
		pesquisarVeiculoPorId(1).revisar();
		System.out.println(pesquisarVeiculoPorId(1));
	}	
	static Veiculo pesquisarVeiculoPorId(int id) {
		Veiculo veiculoEncontrado = null;
		for (Veiculo veiculo : listaVeiculos) {
			if(veiculo.getIdVeiculo() == id) {
				veiculoEncontrado = veiculo;
			}
		}
		return veiculoEncontrado;
	}
}
