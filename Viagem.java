package estudo_Extra;
import java.util.Date;

public class Viagem {
	
	private int idViagem;
	private String destino;
	private Date dataFinal;
	private Date dataInicial;
	private int kmPercorrido;
	static Veiculo veiculo;
	
	
	public Viagem(int idViagem, String destino, Date dataFinal, Date dataInicial,Veiculo veiculo) {
		this.idViagem = idViagem;
		this.destino = destino;
		this.dataFinal = dataFinal;
		this.dataInicial = dataInicial;
		this.kmPercorrido = kmPercorrido;
		this.veiculo = veiculo; 
	}
	public boolean iniciarViagem (Veiculo veiculo) {
		if(veiculo.getStatus() == 'V') {
			return false;
		}
		else {
			dataInicial = new Date();
			this.veiculo.registrarViagem();
			return true;
		}
	}
	public void finalizarViagem (int kmOdometro) {
		this.dataFinal = new Date();
		this.kmPercorrido = kmPercorrido -= kmOdometro;
		this.veiculo.registrarRetorno(kmOdometro);
	}
	public int  calcularKmPercorrido(int kmOdometro) {
		return this.kmPercorrido = kmPercorrido -= kmOdometro;
	}
	@Override
	public String toString() {
		return "\n__________ VIAGEM __________\n"     +
			   "\nID da Viagem : " + this.idViagem    +
			   "\nDestino      : " + this.destino     +
			   "\nData Inicial : " + this.dataInicial +
			   "\nData Final   : " + this.dataFinal   +
			   "\n____________________________";
			   
	}
}
