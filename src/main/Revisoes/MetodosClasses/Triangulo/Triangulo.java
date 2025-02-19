package MetodosClasses.Triangulo;

public class Triangulo {
    public double a;
    public double b;
    public double c;

    public double area() {
        if (a + b > c && a + c > b && b + c > a) {
            double p = (a + b + c) / 2.0;
            return Math.sqrt(p * (p - a) * (p - b) * (p - c));
        } else {
            System.out.println("Os lados não formam um triângulo válido");
        }
        return 0;
    }

    public static void areaTriangulo(double areaX, double areaY){
        if(areaX > areaY){
            System.out.printf("Maior área: %.2f%n", areaX);
        }else if (areaX < areaY){
            System.out.printf("Maior área: %.2f%n", areaY);
        }else {
            System.out.println("Os dois triângulos tem áreas iguais");
        }
    }
}
