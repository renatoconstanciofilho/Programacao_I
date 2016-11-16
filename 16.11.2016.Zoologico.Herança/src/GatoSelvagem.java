
public class GatoSelvagem extends Animais {
	
	private String corPelagem;
	private String tipoManchas;
	
	public GatoSelvagem(String raca, String nomeIdentificacao, String porte, String habitat, String paisOrigem, String corPelagem, String tipoManchas)
			throws Exception {
		super(raca, nomeIdentificacao, porte, habitat, paisOrigem);
		setCorPelagem(corPelagem);
		setTipoManchas(tipoManchas);
	}

	public String getCorPelagem() {
		return corPelagem;
	}

	public void setCorPelagem(String corPelagem) throws Exception {
		if (corPelagem == null || corPelagem.trim().length()<=0)
			throw new Exception("Cor da pelagem deve ser informado.");
		this.corPelagem = corPelagem;
	}

	public String getTipoManchas() {
		return tipoManchas;
	}

	public void setTipoManchas(String tipoManchas) throws Exception {
		if(tipoManchas == null || tipoManchas.trim().length()<=0)
			throw new Exception("Tipo de manchas deve ser informado.");
		this.tipoManchas = tipoManchas;
	}

	@Override
	public String toString() {
		return "\nRaça: " + raca + "\nNome: " + nomeIdentificacao + "\nPorte: " + porte + "\nHabitat: " + habitat + "\nOrigem: " + paisOrigem + "\nPelagem: " + corPelagem + "\nMachas: " + tipoManchas;
	}
	
	
	
	

}
