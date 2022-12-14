package estudo_Extra;

public class Veiculo {
	private int idVeiculo;
	private String placa;
	private char status;
	private int kmOdometro;
	public Veiculo(int idVeiculo, String placa, int kmOdometro) {
		
		this.idVeiculo = idVeiculo;
		this.placa = placa;
		this.kmOdometro = kmOdometro;	
		this.status = 'D';
	}
	public void registrarViagem() {
		this.status = 'V';
	}
	public void registrarRetorno (int kmOdometro) {
		this.status = 'D';
		this.kmOdometro = kmOdometro;
	}
	public void revisar () {
		this.status = 'M';
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public int getIdVeiculo() {
		return idVeiculo;
	}
	public char getStatus() {
		return status;
	}
	public int getKmOdometro() {
		return kmOdometro;
	}
	@Override 
	public String toString() {
	return "\n_________ VEICULO __________\n"       +
	       "\nID do veiculo : " + this.idVeiculo  +
	       "\nPlaca         : " + this.placa      +
	       "\nStatus        : " + this.status     +
	       "\nquilometragem : " + this.kmOdometro + "Km" +
		   "\n____________________________";
	}
}
