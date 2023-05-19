public class ConversorDeUnidade {
    private double area;

    public double getArea(){
        return area;
    }
    public void setArea(double area){
        this.area=area;
    }

    public static double metroParaPes( double area){
        double valor= 10.76;
        double resul= (area*valor);
        return resul;

    }
    public static double pesParaCentimetro( double area){
        double valor= 929;
        double resul= (area*valor);
        return resul;

    }
    public static double milhaParaAcre( double area){
        double valor= 640;
        double resul= (area*valor);
        return resul;
    }
    public static double acreParaPes( double area){
        double valor= 43.560;
        double resul= (area*valor);
        return resul;
    }
}
