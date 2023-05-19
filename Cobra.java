public class Cobra extends Reptil {
    private double comprimento;

    Cobra(String tipo, String especie, String habitat, String cor, String alimentacao, boolean venenoso, Double comprimento){
        super(tipo,especie,habitat,cor,alimentacao,venenoso);
        this.comprimento= comprimento;
    }

    public double getComprimento(){
        return this.comprimento;
    }
    public void setComprimento(Double comprimento){
        this.comprimento= comprimento;
    }

    @Override
    public void imprimiCaracteristica(){
        System.out.println("Tipo: " + getTipo());
        System.out.println("Especie: " + getEspecie());
        System.out.println("Habitat: " + getHabitat());
        System.out.println("Cor: " + getCor());
        System.out.println("Alimentação: " + getAlimentacao());
        System.out.println("Venenoso: " + getVenenoso());
        System.out.println("Comprimeto do corpo: " + comprimento);
    }
    
}
