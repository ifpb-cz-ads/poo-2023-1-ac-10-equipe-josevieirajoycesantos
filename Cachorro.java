public class Cachorro extends Mamifero {
    private String raça;

    Cachorro(String tipo, String especie, String habitat, String cor, String alimentacao, int pelo, String raça){
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

    public void cachorroLate(int quantLatidos){
        System.out.println(" ");
        System.out.println("Cachorro latindo: ");
        for(int i=0; i <= quantLatidos; i++){
            System.out.print(" Woof! ");
        }
    }

    public void cachorroUiva(int quantUivos){
        System.out.println(" ");
        System.out.println("Cachorro uivando: ");
        for(int i=0; i <= quantUivos; i++){
            System.out.print(" Auuuuu! ");
        }
    }
    
}
