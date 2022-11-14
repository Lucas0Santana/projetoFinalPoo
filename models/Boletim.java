import java.util.ArrayList;

public class Boletim {
    final int QUANTIDADE_NOTAS = 6;
    private ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();
    private float notas;
    
	public float getNotas() {
		return notas;
	}
	public void setNotas(float notas) {
		this.notas = notas;
	}
	public ArrayList<Disciplina> getDisciplinas() {
		return disciplinas;
	}
	public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
}
