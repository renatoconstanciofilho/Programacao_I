import java.time.LocalDate;

public class Funcionario extends Pessoa {
	
	private String cargo;
	private float valorHora;
	
	public Funcionario(String nome, LocalDate dataNasc, char genero, String cargo, float valorHora) throws Exception {
		super(nome, dataNasc, genero);
		setCargo(cargo);
		setValorHora(valorHora);
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public float getValorHora() {
		return valorHora;
	}

	public void setValorHora(float valorHora) {
		this.valorHora = valorHora;
	}
	
	public float pagamento(float horas){
		return valorHora * horas;
	}

}
