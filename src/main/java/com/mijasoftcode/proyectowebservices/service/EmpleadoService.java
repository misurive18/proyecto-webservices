/**
 * 
 */
package com.mijasoftcode.proyectowebservices.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.mijasoftcode.proyectowebservices.entity.Empleado;

/**
 * @author mijasoftcode
 *
 */
public class EmpleadoService {

	/**
	 * Metodo que permite consultar un empleado por su dni.
	 * @param dni {@link String} dni del empleado.
	 * @return {@link Empleado} empleado consultado.
	 */
	public Empleado consultarEmpleadoPorDni(String dni){
		
		List<Empleado> empleadosConsultados = this.consultarEmpleados();
		
		for (Empleado empleadoConsultado : empleadosConsultados) {
			if (empleadoConsultado.getDni().equals(dni)) {
				return empleadoConsultado;
			}
		}
		
		return null;
	}
	
	/**
	 * Metodo que simula la consulta de un empleado.
	 * @return {@link Empleado} empleado consultado.
	 */
	public Empleado consultarEmpleado() {
		Empleado empleado = new Empleado();
		empleado.setDni("48050596");
		empleado.setNombre("Josesito");
		empleado.setApellidoPaterno("Rojas");
		empleado.setApellidoMaterno("Rios");
		empleado.setEdad(15);
		empleado.setFechaCreacion(LocalDateTime.now());
		return empleado;
	}
	
	/**
	 *  Metodo que permite consultar la lista de empleados.
	 * @return {@link List} lista consultada.
	 */
	public List<Empleado> consultarEmpleados(){
		List<Empleado> empleados = new ArrayList();
		
		Empleado empleado = new Empleado();
		empleado.setDni("48050596");
		empleado.setNombre("Josesito");
		empleado.setApellidoPaterno("Rojas");
		empleado.setApellidoMaterno("Rios");
		empleado.setEdad(15);
		empleado.setFechaCreacion(LocalDateTime.now());
		
		
		Empleado empleadoNuevo = new Empleado();
		empleadoNuevo.setDni("20050591");
		empleadoNuevo.setNombre("Luis");
		empleadoNuevo.setApellidoPaterno("Martins");
		empleadoNuevo.setApellidoMaterno("Llorente");
		empleadoNuevo.setEdad(59);
		empleadoNuevo.setFechaCreacion(LocalDateTime.now());
		
		empleados.add(empleado);
		empleados.add(empleadoNuevo);
		return empleados;
	}
	
}
