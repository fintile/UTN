package tp2;

import java.util.ArrayList;

public class Curso implements Interface{

	
	private  ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
	
	
	public Curso() {
		
	}
	
	
	public void inscribirAlumno(Alumno alumno) {
	     alumnos.add(alumno);
	}
	
	public void quitarAlumno(Alumno alumno) {
		alumnos.remove(alumno);
		System.out.println("****-- Se da de baja a " + alumno.getNombre() + " " + "porque abandona el curso --****");
	}
	
	public int cantidadDeAlumnos() {
		return alumnos.size();
	}
	
	public boolean estaInscripto(Alumno alumno) {
		return alumnos.contains(alumno);
	}
	
    public boolean estaInscripto(int lu) {
		for( Alumno alumno : alumnos) {
		  if(alumno.getLu() == lu) {
			  return true;
		  }
		}
		return false;
	}
    
    public Alumno buscarAlumno(int lu) {
    	System.out.println("****-- Busca y muestra el alumno con número de libreta " + lu +" --****");
    	for( Alumno alumno : alumnos) {
  		  if(alumno.getLu() == lu)   {
  			  return alumno;
          }
        }
    	return null;
    }
     
      public void imprimirPromedioDelAlumno(int lu) {
    	  for( Alumno alumno : alumnos) {
      		  if(alumno.getLu() == lu){
      			  System.out.println("****-- Mostrar promedio de Alumno " + lu + " --****");
      			  System.out.println("Promedio: " + alumno.promedio());
              }
            }
     }
      
      public void mostrarInscriptos() {
    	  System.out.println("****-- Alumnos inscriptos actualmente: " + alumnos.size());
    	  for( Alumno alumno : alumnos) {
    		  System.out.println(alumno.getLu()+ " " + alumno.getNombre() + " " + alumno.getApellido());
    		  
    	  }
      }
}

		
	
	
	
