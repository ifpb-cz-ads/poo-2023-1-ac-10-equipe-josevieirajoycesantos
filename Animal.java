public class Animal {
    private String tipo;
    private String especie;
    private String habitat;
    private String cor;
    private String alimentacao;

    Animal(){}
    Animal(String tipo, String especie, String habitat, String cor, String alimentacao){
        this.tipo= tipo;
        this.especie= especie;
        this.habitat= habitat;
        this.cor= cor;
        this.alimentacao= alimentacao;
    }
    public String getTipo(){
        return this.tipo;
    }
    public void setTipo(String tipo){
        this.tipo= tipo;
    }
    public String getEspecie(){
        return this.especie;
    }
    public void setEspecie(String especie){
        this.especie= especie;
    }
    public String getHabitat(){
        return this.habitat;
    }
    public void setHabitat(String habitat){
        this.habitat= habitat;
    }
    public String getCor(){
        return this.cor;
    }
    public void setCor(String cor){
        this.cor= cor;
    }
    public String getAlimentacao(){
        return this.alimentacao;
    }
    public void setAlimentacao(String alimentacao){
        this.alimentacao= alimentacao;
    }

    public void comer(){
        System.out.println("O(a)" + tipo + " está comendo");
    }

    public void vagar(){
        System.out.println("O(a)" + tipo + " está vagando por ai");
    }

    public void imprimiCaracteristica(){
        System.out.println("Tipo: " + tipo);
        System.out.println("Especie: " + especie);
        System.out.println("Habitat: " + habitat);
        System.out.println("Cor: " + cor);
        System.out.println("Alimentação: " + alimentacao);
    }
}
