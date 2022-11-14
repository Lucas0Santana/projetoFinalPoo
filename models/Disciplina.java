import java.util.ArrayList;

public class Disciplina {
    private String nome;
    private int cargaHoraria;
    ArrayList<Disciplina> dadosDisciplina = new ArrayList<>();
    
    
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
    public void cadastrarDisciplina(Disciplina cad) {
    	
    	dadosDisciplina.add(cad);
    	
    	System.out.println("salvo com sucesso!");
    	
    }
    
    public ArrayList<Disciplina> listarDisciplina() {
    	return dadosDisciplina;
    }
    
    public ArrayList<Disciplina> apagarDisciplina(int idDisciplina){
    	dadosDisciplina.remove(idDisciplina);
    	return dadosDisciplina;
    }
    
    public ArrayList<Disciplina> alterarAluno(int idAluno, Disciplina discAtualizacao){
    	for (Disciplina disc: dadosDisciplina) {
			if (disc.getNome() == discAtualizacao.getNome()) {
				disc.setCargaHoraria(discAtualizacao.getCargaHoraria());
			}
		}
    	return dadosDisciplina;
    }
}
