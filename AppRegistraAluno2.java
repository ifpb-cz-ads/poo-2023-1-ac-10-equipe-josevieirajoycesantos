public class AppRegistraAluno2 {
    public static void main(String[] args) {
        RegistraAluno jose= new RegistraAluno();
        jose.setNome("José Vieira");
        jose.setNota1(9.1);
        jose.setNota2(9.8);
        jose.setNota3(9.0);
        
        jose.imprimir(jose.getNome(), jose.getNota1(), jose.getNota2(), jose.getNota3());
    }
}
