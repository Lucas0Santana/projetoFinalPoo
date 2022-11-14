import java.io.IOException;
import java.util.ArrayList;

public class Professor extends Pessoa {
	private int idProf;
	private Float salario;
    private Disciplina disciplina;
    ArrayList<Professor> dadosProfessores = new ArrayList<>();

    public Professor(Float salario, Disciplina disciplina) {
        this.salario = salario;
        this.disciplina = disciplina;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }
    
    public void cadastrarProfessor(Professor cad) {
    	
	dadosProfessores.add(cad);
    	
    	System.out.println("salvo com sucesso!");
    	
    }
    
    public ArrayList<Professor> listarProfessor() {
    	return dadosProfessores;
    }
    
    public ArrayList<Professor> apagarProfessor(int idProfessor){
    	dadosProfessores.remove(idProfessor);
    	return dadosProfessores;
    }
    
    public ArrayList<Professor> alterarProfessor(int idPRofessor, Professor professorAtualizacao){
    	for (Professor prof : dadosProfessores) {
			if (prof.idProf == idProf) {
				prof.setNome(professorAtualizacao.getNome());
				prof.setEndereco(professorAtualizacao.getEndereco());
				prof.setDataNascimento(professorAtualizacao.getDataNascimento());
			}
		}
    	return dadosProfessores;
    }

}
