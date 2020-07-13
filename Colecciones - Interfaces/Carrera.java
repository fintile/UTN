package tp2;

import java.util.ArrayList;

public class Carrera{

	
	public static void main(String[] args) {
	  
		Alumno alumnoBuscado;
		
		Curso curso = new Curso();
		
	    Alumno alumno1 = new Alumno ("Pedro", "Gomez", 32555, 0, 0);
		Alumno alumno2 = new Alumno ("Maria", "Vasquez", 23564, 0, 0);
		Alumno alumno3 = new Alumno ("Juan", "Perez", 30123, 0, 0);
		Alumno alumno4 = new Alumno ("Marcela", "Martinez", 32655, 0, 0);
		
	    alumno1.setNota(8);
	    alumno1.setNota2(8);
	    alumno2.setNota(6);
	    alumno2.setNota2(5);
	    alumno3.setNota(7);
	    alumno3.setNota2(9);
	    alumno4.setNota(4);
	    alumno4.setNota2(10);
		
		curso.inscribirAlumno(alumno1);
		curso.inscribirAlumno(alumno2);
		curso.inscribirAlumno(alumno3);
		curso.inscribirAlumno(alumno4);
		
		curso.mostrarInscriptos();
		
		System.out.println();
		
		curso.quitarAlumno(alumno1);
		
		if(curso.estaInscripto(alumno1)) {
			System.out.println("Está "+ alumno1.getNombre() + " " + alumno1.getApellido() + " inscripto ?? --> true");
		}
		else {
			System.out.println("Está "+ alumno1.getNombre() + " " + alumno1.getApellido() + " inscripto ?? --> false");
		}
		
		System.out.println();
		
		curso.mostrarInscriptos();
		
		System.out.println();
		
	    alumnoBuscado = curso.buscarAlumno(30123);
	    
	    alumnoBuscado.mostrar();
	    
	    System.out.println();
	    
	    curso.imprimirPromedioDelAlumno(23564);
      }
}