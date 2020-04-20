package com.uca.capas.ejemplo.controller;

import java.time.LocalDate;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
	
	@RequestMapping("/alumno")
	public @ResponseBody String ejemplo() {
		String nombre,apellido,carnet,carrera,yearCursado;
		nombre="Luis Fernando";
		apellido= "Anstirman Henriquez";
		carnet = "00024117";
		carrera = "Ingenieria Informatica";
		yearCursado = "Cuarto";
		String datos = "Nombre: " + nombre + " Apellidos: "+apellido+" Carnet: "+carnet+" Carrera: "+carrera+
						" Nivel: "+yearCursado;
		return datos;
	}
	
	@RequestMapping("/diasemana")
	public @ResponseBody String parametro(HttpServletRequest request) {
		Integer dia = Integer.parseInt(request.getParameter("dia"));
		Integer mes = Integer.parseInt(request.getParameter("mes"));
		Integer year = Integer.parseInt(request.getParameter("year"));
		
		LocalDate fecha = LocalDate.of(year, mes, dia);
		String diaSemana = "El dia para la fecha "+fecha+" es "+fecha.getDayOfWeek();
		return diaSemana;
	}
}
