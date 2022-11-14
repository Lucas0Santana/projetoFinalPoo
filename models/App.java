public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Boletim bole = new Boletim();
        
        Aluno aluno = new Aluno();
        Aluno cad = new Aluno();
        
        cad.setNome("lucas");
        cad.setIdAluno(1);
        cad.setBoletim(bole);
        cad.setDataNascimento(null);
        cad.setEndereco(null);
        cad.setMatricula("10255");
        cad.setBoletim(bole);
        
        aluno.cadastrarAluno(cad);
        
    }
}
