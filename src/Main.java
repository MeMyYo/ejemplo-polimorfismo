import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double sueldo = 100;
        Arquitecto ar1 = new Arquitecto();
        Arquitecto ar2 = new Arquitecto();
        Arquitecto ar3 = new Arquitecto();
        Ingeniero ing1 = new Ingeniero();
        Ingeniero ing2 = new Ingeniero();

//        Trabajador[] trabajadores = new Trabajador[2];
//        trabajadores[0] = ar1;
//        trabajadores[1] = ing1;
        ArrayList<Trabajador> trabajadores = new ArrayList<>();
        trabajadores.add(ar1);
        trabajadores.add(ing1);
        trabajadores.add(ar2);
        trabajadores.add(ar3);
        trabajadores.add(ing2);

        for (int i = 0; i < trabajadores.size() ; i++) {
            double sueldoTrabajador = trabajadores.get(i).calcularSueldo(sueldo);
            System.out.println("El sueldo del "+trabajadores.get(i).GetType()+" es: "+sueldoTrabajador);
        }

//        double sueldoArquitecto = ar1.calcularSueldo(sueldo);
//        System.out.println("El sueldo del arquitecto es: "+sueldoArquitecto);
//
//        double sueldoIngeniero = ing1.calcularSueldo(sueldo);
//        System.out.println("El sueldo del ingeniero es: "+sueldoIngeniero);
    }
}