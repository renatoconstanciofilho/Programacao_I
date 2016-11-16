
public abstract class Animais {

	protected String raca;
	protected String nomeIdentificacao;
	protected String porte;
	protected String habitat;
	protected String paisOrigem;
	
	public Animais(String raca, String nomeIdentificacao, String porte, String habitat, String paisOrigem) throws Exception{
		setRaca(raca);
		setNomeIdentificacao(nomeIdentificacao);
		setPorte(porte);
		setHabitat(habitat);
		setPaisOrigem(paisOrigem);
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) throws Exception {
		if(raca == null || raca.trim().length()<=0)
			throw new Exception("Raça não pode ser nulo.");
		this.raca = raca;
	}

	public String getNomeIdentificacao() {
		return nomeIdentificacao;
	}

	public void setNomeIdentificacao(String nomeIdentificacao) throws Exception {
		if(nomeIdentificacao == null || nomeIdentificacao.trim().length()<=0)
			throw new Exception("Nome de identificação não pode ser nulo.");
		this.nomeIdentificacao = nomeIdentificacao;
	}

	public String getPorte() {
		return porte;
	}

	public void setPorte(String porte) throws Exception {
		if(porte == null || porte.trim().length()<=0)
			throw new Exception("Porte deve ser informado.");
		this.porte = porte;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) throws Exception {
		if(habitat == null || habitat.trim().length()<=0)
			throw new Exception("Habitat deve ser informado.");
		this.habitat = habitat;
	}

	public String getPaisOrigem() {
		return paisOrigem;
	}

	public void setPaisOrigem(String paisOrigem) throws Exception {
		if(paisOrigem == null || paisOrigem.trim().length()<=0)
			throw new Exception("País de origem deve ser informado.");
		this.paisOrigem = paisOrigem;
	}
	
	public abstract String toString();
	
	
	
}
