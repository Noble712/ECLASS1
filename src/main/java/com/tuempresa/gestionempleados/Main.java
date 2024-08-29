//package com.tuempresa.gestionempleados;
//public class Main {
//public static void main(String[] args) {
// TODO Auto-generated method stub}}
package com.tuempresa.gestionempleados;

import java.time.LocalDate;
import com.tuempresa.gestionempleados.model.Empleado;
import com.tuempresa.gestionempleados.service.EmpleadoService;
import com.tuempresa.gestionempleados.service.EmpleadoServiceImpl;

public class Main {
    public static void main(String[] args) {
        EmpleadoService empleadoService = new EmpleadoServiceImpl();

        Empleado emp1 = new Empleado(1, "Smitty Werben Man Jensen", "Desarrollador (El número 1)", 5000, LocalDate.of(2020, 1, 15), "IT");
        Empleado emp2 = new Empleado(2, "Lola Flames Lights", "Analista", 4500, LocalDate.of(2019, 3, 10), "Finanzas");

        empleadoService.registrarEmpleado(emp1);
        empleadoService.registrarEmpleado(emp2);

        System.out.println("Lista de empleados:");
        for (Empleado e : empleadoService.listarEmpleados()) {
            System.out.println(e.getNombre());
        }

        empleadoService.agregarBono(1, 500);
        empleadoService.agregarDescuento(2, 200);

        System.out.println("IGSS de Smitty Werben Man Jensen: " + empleadoService.calcularIgss(emp1));
        System.out.println("IRTRA de Lola Flames Lights: " + empleadoService.calcularIrtra(emp2));

        empleadoService.bajarEmpleado(1);
        System.out.println("Lista de empleados después de dar de baja a Juan Perez:");
        for (Empleado e : empleadoService.listarEmpleados()) {
            System.out.println(e.getNombre());
        }
    }
}
