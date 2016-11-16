import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import javax.swing.text.DateFormatter;

public abstract class Pessoa {
	
	private String nome;
	private LocalDate dataNasc;
	private char genero;
	
	public Pessoa(String nome, LocalDate dataNasc, char genero) throws Exception{
		setNome(nome);
		setDataNasc(dataNasc);
		setGenero(genero);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) throws Exception {
		if(!nome.equals(""))
			this.nome = nome;
		else
			throw new Exception("Nome não pode ser vazio.");
	}

	public LocalDate getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(LocalDate dataNasc) {
		this.dataNasc = dataNasc;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) throws Exception {
		if(genero == 'F' || genero == 'M')
			this.genero = genero;
		else
			throw new Exception("O gênero deve ser informado F para feminino ou M para masculino.");
	}
	
	public int idade(LocalDate dataNasc){
		LocalDate dataAtual = LocalDate.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyy");
        if ((dataNasc != null) && (dataAtual != null)) {
            return Period.between(dataNasc, dataAtual).getYears();
//            String text = date.format(formatter);
//            LocalDate parsedDate = LocalDate.parse(text, formatter);
//            https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
        } else {
            return 0;
        }
	}


}
