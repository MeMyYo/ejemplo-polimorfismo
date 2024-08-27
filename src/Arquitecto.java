public class Arquitecto extends Trabajador{
    @Override
    public double calcularSueldo(double ganancia) {
        double iva = 0.19;
        double sueldoTotal = ganancia - iva*ganancia;
        return sueldoTotal;
    }

    @Override
    public String GetType() {
        return "Arquitecto";
    }
}
