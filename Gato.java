public class Gato extends Mamifero {
    private String raça;

    Gato(String tipo, String especie, String habitat, String cor, String alimentacao, int pelo, String raça){
        super(tipo, especie,habitat,cor,alimentacao, pelo);
        this.raça= raça;
    }

    public String getRaça(){
        return this.raça;
    }
    public void setRaça(String raça){
        this.raça= raça;
    }
    @Override
    public void imprimiCaracteristica(){
        System.out.println("Tipo: " + getTipo());
        System.out.println("Especie: " + getEspecie());
        System.out.println("Habitat: " + getHabitat());
        System.out.println("Cor: " + getCor());
        System.out.println("Alimentação: " + getAlimentacao());
        System.out.println("Altura do pelo: " + getAltura());
        System.out.println("Raça: " + raça);
    }

    public void gatoMia(int quantMiados){
        System.out.println("Gato miando: ");
        for(int i=0; i <= quantMiados; i++){
            System.out.print(" Miau! ");
        }
    }
    
}
