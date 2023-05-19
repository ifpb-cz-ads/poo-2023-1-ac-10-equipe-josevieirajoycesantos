public class Mamifero extends Animal {
    private int alturaPelo;


    Mamifero(String tipo, String especie, String habitat, String cor, String alimentacao, int pelo){
        super(tipo, especie,habitat,cor,alimentacao);
        this.alturaPelo= pelo;
    }

    public int getAltura(){
        return this.alturaPelo;
    }
    public void setAltura(int altura){
        this.alturaPelo= altura;
    }

    @Override
    public void imprimiCaracteristica(){
        System.out.println("Tipo: " + getTipo());
        System.out.println("Especie: " + getEspecie());
        System.out.println("Habitat: " + getHabitat());
        System.out.println("Cor: " + getCor());
        System.out.println("Alimentação: " + getAlimentacao());
        System.out.println("Altura do pelo: " + alturaPelo);
    }


    
}
