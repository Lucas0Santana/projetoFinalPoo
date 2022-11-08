public class Professor extends Pessoa {
    private Float salario;
    private Disciplina disciplina;

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

}
