public class Ingeniero extends Trabajador{

    @Override
    public double calcularSueldo(double ganancia) {
        double iva = 0.10;
        double sueldoTotal = ganancia - ganancia*iva;
        return sueldoTotal;
    }

    @Override
    public String GetType() {
        return "Ingeniero";
    }
}
