/*package service;
public class EmpleadoServiceImpl {
public static void main(String[] args) {
// TODO Auto-generated method stub}}*/
package com.tuempresa.gestionempleados.service;

import java.util.ArrayList;
import java.util.List;
import com.tuempresa.gestionempleados.model.Empleado;

public class EmpleadoServiceImpl implements EmpleadoService {
    private List<Empleado> empleados = new ArrayList<>();

    @Override
    public void registrarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    @Override
    public List<Empleado> listarEmpleados() {
        return empleados;
    }

    @Override
    public void bajarEmpleado(int id) {
        empleados.removeIf(e -> e.getId() == id);
    }

    @Override
    public double calcularIgss(Empleado empleado) {
        return empleado.getSalarioBase() * 0.0483; // Ejemplo de cálculo
    }

    @Override
    public double calcularIrtra(Empleado empleado) {
        return empleado.getSalarioBase() * 0.01; // Ejemplo de cálculo
    }

    @Override
    public void agregarBono(int id, double bono) {
        for (Empleado e : empleados) {
            if (e.getId() == id) {
                e.setSalarioBase(e.getSalarioBase() + bono);
                break;
            }
        }
    }

    @Override
    public void agregarDescuento(int id, double descuento) {
        for (Empleado e : empleados) {
            if (e.getId() == id) {
                e.setSalarioBase(e.getSalarioBase() - descuento);
                break;
            }
        }
    }
}
