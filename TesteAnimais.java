public class TesteAnimais {
    public static void main(String[] args) {
        Cachorro dog= new Cachorro("Cachorro", "C. lupus", "Centros Urbanos", "Branco com preto", "Ração", 10, "Husk");
        System.out.println(" ");
        dog.imprimiCaracteristica();
        dog.vagar();
        dog.comer();
        dog.cachorroLate(3);
        dog.cachorroUiva(5);

        System.out.println(" ");
        Gato cat= new Gato("Gato", "Felis silvestris lybica", "Domestico", "Creme com marrom", "Ração", 4, "Siamês");
        System.out.println(" ");
        cat.imprimiCaracteristica();
        cat.comer();
        cat.vagar();
        cat.gatoMia(4);
        System.out.println(" ");

        Cobra snake= new Cobra("Cobra", "Coral", "Mata", "Vermelho com preto e amarelo", "Laragatos", true, 1.00);
        System.out.println(" ");
        snake.imprimiCaracteristica();
        snake.vagar();
        snake.comer();
    }
}
