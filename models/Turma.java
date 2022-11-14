import java.util.ArrayList;

public class Turma {
    private Disciplina disciplina;
    private Professor professor;
    private ArrayList<Aluno> alunos = new ArrayList<Aluno>();
    
    ArrayList<Turma> dadosTurmas = new ArrayList<>();
    
	public Disciplina getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public ArrayList<Aluno> getAlunos() {
		return alunos;
	}
	public void setAlunos(ArrayList<Aluno> alunos) {
		this.alunos = alunos;
	}
	
    public void cadastrarTurma(Turma cad){
    	
    	dadosTurmas.add(cad);
    	
    	System.out.println("salvo com sucesso!");
    	
    }
    
    public ArrayList<Turma> listarTurma() {
    	return dadosTurmas;
    }
    
    public ArrayList<Turma> apagarTurma(Turma turma){
    	dadosTurmas.remove(turma);
    	return dadosTurmas;
    }
    
   /* public ArrayList<Turma> alterarTurma(int idAluno, Aluno alunoAtualizacao){
    	for (Aluno aluno : dadosAlunos) {
			if (aluno.idAluno == idAluno) {
				aluno.setNome(alunoAtualizacao.getNome());
				aluno.setEndereco(alunoAtualizacao.getEndereco());
				aluno.setDataNascimento(alunoAtualizacao.getDataNascimento());
				aluno.setBoletim(alunoAtualizacao.getBoletim());
			}
		}
    	return dadosAlunos;
    }*/

}
