import java.util.ArrayList;
import java.util.Date;
import java.io.IOException;

public class Aluno extends Pessoa {
	ArrayList<Aluno> dadosAlunos = new ArrayList<>();

    private int idAluno;
    private Boletim boletim;

	public Aluno(String nome, Date dataNascimento, Endereco endereco, String matricula) {
		super(nome, dataNascimento, endereco, matricula);
		// TODO Auto-generated constructor stub
	}
	

	public Aluno() {}


    public int getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(int idAluno) {
        this.idAluno = idAluno;
    }

    public Boletim getBoletim() {
        return boletim;
    }

    public void setBoletim(Boletim boletim) {
        this.boletim = boletim;
    }

    public void cadastrarAluno(Aluno cad) throws IOException {
    	
    	dadosAlunos.add(cad);
    	
    	System.out.println("salvo com sucesso!");
    	
    }
    
    public ArrayList<Aluno> listarAluno() {
    	return dadosAlunos;
    }
    
    public ArrayList<Aluno> apagarAluno(int idAluno){
    	dadosAlunos.remove(idAluno);
    	return dadosAlunos;
    }
    
    public ArrayList<Aluno> alterarAluno(int idAluno, Aluno alunoAtualizacao){
    	for (Aluno aluno : dadosAlunos) {
			if (aluno.idAluno == idAluno) {
				aluno.setNome(alunoAtualizacao.getNome());
				aluno.setEndereco(alunoAtualizacao.getEndereco());
				aluno.setDataNascimento(alunoAtualizacao.getDataNascimento());
				aluno.setBoletim(alunoAtualizacao.getBoletim());
			}
		}
    	return dadosAlunos;
    }



}
