import java.util.Scanner;

public class TesteConversor {
    public static void main(String[] args) {
        Scanner lerArea= new Scanner(System.in);
        System.out.println("Informe a área:");
        int area= lerArea.nextInt();

        double x= ConversorDeUnidade.metroParaPes(area);
        System.out.println(area + " metro quadrado = " + x + " pés quadrados");

        double y= ConversorDeUnidade.pesParaCentimetro(area);
        System.out.println(area + " pé quadrado = " + y + " centímetros quadrados");    
        
        double w= ConversorDeUnidade.milhaParaAcre(area);
        System.out.println(area + " milha quadrada = " + w + " acres");

        double z= ConversorDeUnidade.acreParaPes(area);
        System.out.println(area + " acre = " + z + " pés quadrados");


    }
}
