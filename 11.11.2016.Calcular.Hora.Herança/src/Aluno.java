import java.time.LocalDate;

public class Aluno extends Pessoa{
	
	private float nota1;
	private float nota2;
	private float nota3;

	public Aluno(String nome, LocalDate dataNasc, char genero, float nota1, float nota2, float nota3) throws Exception {
		super(nome, dataNasc, genero);
		setNota1(nota1);
		setNota2(nota2);
		setNota3(nota3);
	}

	public float getNota1() {
		return nota1;
	}

	public void setNota1(float nota1) {
		this.nota1 = nota1;
	}

	public float getNota2() {
		return nota2;
	}

	public void setNota2(float nota2) {
		this.nota2 = nota2;
	}

	public float getNota3() {
		return nota3;
	}

	public void setNota3(float nota3) {
		this.nota3 = nota3;
	}
	
	public float media(){
		return (nota1 + nota2 + nota3)/3;
	}
	

}
