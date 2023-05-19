public class RegistraAluno {
    private String nome;
    private String endereço;
    private int idade;
    private double nota1;
    private double nota2;
    private double nota3;
    

    // RegistraAluno(String nome, String endereço, int idade, double nota1, double nota2, double nota3){
    //     this.nome= nome;
    //     this.endereço= endereço;
    //     this.idade= idade;
    //     this.nota1= nota1;
    //     this.nota2= nota2;
    //     this.nota3= nota3;
    // }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome= nome;
    }
    public String getEndereço(){
        return endereço;
    }
    public void setEndereço(String endereço){
        this.endereço= endereço;
    }
    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        this.idade= idade;
    }
    public double getNota1(){
        return nota1;
    }
    public void setNota1(Double nota1){
        this.nota1= nota1;
    }
    public double getNota2(){
        return nota2;
    }
    public void setNota2(Double nota2){
        this.nota2= nota2;
    }
    public double getNota3(){
        return nota3;
    }
    public void setNota3(Double nota3){
        this.nota3= nota3;
    }


    public void imprimir(){
        System.out.println("Nome: " + nome);
        System.out.println("Endereço " + endereço);
        System.out.println("Idade: " + idade);
    }

    public void imprimir( String nome, double nota1, double nota2, double nota3){
        System.out.println("Nome: " + nome);
        System.out.println("Nota de Português: " + nota1);
        System.out.println("Nota de Matemática: " + nota2);
        System.out.println("Nota de História: " + nota3);
    }
}
