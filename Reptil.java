public class Reptil extends Animal {
    private boolean venenoso;

    Reptil(String tipo, String especie, String habitat, String cor, String alimentacao, boolean venenoso){
        super(tipo,especie,habitat,cor,alimentacao);
        this.venenoso= venenoso;
    }

    public boolean getVenenoso(){
        return this.venenoso;
    }
    public void setVenenoso(boolean venenoso){
        this.venenoso= venenoso;
    }

    @Override
    public void vagar(){
        System.out.println("O(a)" + getTipo() + " está rastejando por ai");
    }

    @Override
    public void imprimiCaracteristica(){
        System.out.println("Tipo: " + getTipo());
        System.out.println("Especie: " + getEspecie());
        System.out.println("Habitat: " + getHabitat());
        System.out.println("Cor: " + getCor());
        System.out.println("Alimentação: " + getAlimentacao());
        System.out.println("Venenoso: " + venenoso);
    }
    
}
