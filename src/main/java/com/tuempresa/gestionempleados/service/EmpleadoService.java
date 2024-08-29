/*package service;
public interface EmpleadoService {}*/
package com.tuempresa.gestionempleados.service;

import java.util.List;
import com.tuempresa.gestionempleados.model.Empleado;

public interface EmpleadoService {
    void registrarEmpleado(Empleado empleado);
    List<Empleado> listarEmpleados();
    void bajarEmpleado(int id);
    double calcularIgss(Empleado empleado);
    double calcularIrtra(Empleado empleado);
    void agregarBono(int id, double bono);
    void agregarDescuento(int id, double descuento);
}

