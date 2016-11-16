
public class Aves extends Animais{
	
	private String corPredominante;
	private String tipoAlimentacao;

	public Aves(String raca, String nomeIdentificacao, String porte, String habitat, String paisOrigem, String corPredominante, String tipoAlimentacao)
			throws Exception {
		super(raca, nomeIdentificacao, porte, habitat, paisOrigem);
		setCorPredominante(corPredominante);
		setTipoAlimentacao(tipoAlimentacao);
	}

	public String getCorPredominante() {
		return corPredominante;
	}

	public void setCorPredominante(String corPredominante) throws Exception {
		if(corPredominante == null || corPredominante.trim().length()<=0)
			throw new Exception("Cor predominante deve ser informada.");
		this.corPredominante = corPredominante;
	}

	public String getTipoAlimentacao() {
		return tipoAlimentacao;
	}

	public void setTipoAlimentacao(String tipoAlimentacao) throws Exception {
		if(tipoAlimentacao == null || tipoAlimentacao.trim().length()<=0)
			throw new Exception("Tipo de alimentação deve ser informada.");
		this.tipoAlimentacao = tipoAlimentacao;
	}

	@Override
	public String toString() {
		return "\nRaça: " + raca + "\nNome: " + nomeIdentificacao + "\nPorte: " + porte + "\nHabitat: " + habitat + "\nOrigem: " + paisOrigem + "\nCor: " + corPredominante + "\nAlimentação: " + tipoAlimentacao;
	}
	
	

}
