
public class Primatas extends Animais{

	public Primatas(String raca, String nomeIdentificacao, String porte, String habitat, String paisOrigem)
			throws Exception {
		super(raca, nomeIdentificacao, porte, habitat, paisOrigem);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\nRaça: " + raca + "\nNome: " + nomeIdentificacao + "\nPorte: " + porte + "\nHabitat: " + habitat + "\nOrigem: " + paisOrigem;
	}
	
}
