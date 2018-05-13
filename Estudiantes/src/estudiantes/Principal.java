package estudiantes;
 
/**
 *
 * @author Brayan Loachamin
 */
public class Principal {
     
    public static void main(String[] args){
     
    Estudiantes[] estudiantes = new Estudiantes[5];
     
        int acumulador1 = 0;
        int acumulador2 = 0;
        int acumulador3 = 0;
        int acumulador4 = 0;
        int acumulador5 = 0;
        
        System.out.println("\t\t\tInformacion Estudiantes");
        System.out.println();
        System.out.println("Estudiante 1");
    //2 materias
    estudiantes[0] = new Estudiantes("Brayan ","Loachamin ","1725480006");
        System.out.println("Nombre completo: " + estudiantes[0].getNombre() + 
                estudiantes[0].getApellido());
        System.out.println("Cedula: " + estudiantes[0].getCedula());
 
    String[] m = {"1. Calculo","2. Arquitectura"};
    estudiantes[0].setMaterias(m);
     
    String [] materiasEstudiantes = estudiantes[0].getMaterias();
    for(int i = 0; i<materiasEstudiantes.length; i++){
        System.out.println(materiasEstudiantes[i]);
    }
        System.out.println();
        System.out.println("Estudiante 2");
  
     //3 materias
    estudiantes[1] = new Estudiantes("Danny ","Paucar ","1728469723");
    System.out.println("Nombre completo: " + estudiantes[1].getNombre() + 
                estudiantes[1].getApellido());
        System.out.println("Cedula: " + estudiantes[1].getCedula());
     
    String[] n = {"1. Calculo","2. Programacion","3. Cad"};
    estudiantes[1].setMaterias(n);
     
    String [] materiasEstudiantes1 = estudiantes[1].getMaterias();
    for(int i = 0; i<materiasEstudiantes1.length; i++){
        System.out.println(materiasEstudiantes1[i]);
    }
     
        System.out.println();
        System.out.println("Estudiante 3");
    //4 materias
    estudiantes[2] = new Estudiantes("Lenin ","Loachamin ","1736458712");
    System.out.println("Nombre completo: " + estudiantes[2].getNombre() + 
                estudiantes[2].getApellido());
        System.out.println("Cedula: " + estudiantes[2].getCedula());
     
    String[] o = {"1. Calculo","2. Informatica","3. Cad","4. Electrotecnia"};
    estudiantes[1].setMaterias(o);
     
    String [] materiasEstudiantes2 = estudiantes[1].getMaterias();
    for(int i = 0; i<materiasEstudiantes2.length; i++){
        System.out.println(materiasEstudiantes2[i]);
    }
     
        System.out.println();
        System.out.println("Estudiante 4");
    //3 materias
    estudiantes[3] = new Estudiantes("Cristian ","Loachamin ","1745789631");
    System.out.println("Nombre completo: " + estudiantes[3].getNombre() + 
                estudiantes[3].getApellido());
        System.out.println("Cedula: " + estudiantes[3].getCedula());
    
    String[] p = {"1. Arquitectura","2. Cad","3. Programacion"};
    estudiantes[1].setMaterias(p);
     
    String [] materiasEstudiantes3 = estudiantes[1].getMaterias();
    for(int i = 0; i<materiasEstudiantes3.length; i++){
        System.out.println(materiasEstudiantes3[i]);
    }
     
        System.out.println();
        System.out.println("Estudiante 5");
    //2 materias
    estudiantes[4] = new Estudiantes("Wladimir ","Loachamin ","1745821679");
    System.out.println("Nombre completo: " + estudiantes[4].getNombre() + 
                estudiantes[4].getApellido());
        System.out.println("Cedula: " + estudiantes[4].getCedula());
     
    String[] q = {"1. Calculo","2. Cad"};
    estudiantes[1].setMaterias(q);
     
    String [] materiasEstudiantes4 = estudiantes[1].getMaterias();
    for(int i = 0; i<materiasEstudiantes4.length; i++){
        System.out.println(materiasEstudiantes4[i]);
    }
          
    for(int i = 0; i<materiasEstudiantes.length; i++){
        if(materiasEstudiantes[i].equals("Calculo")){
            acumulador1++;
        }else if(materiasEstudiantes[i].equals("Cad")){
            acumulador2++;
        }else if(materiasEstudiantes[i].equals("Programacion")){
            acumulador3++;
        }else if(materiasEstudiantes[i].equals("Arquitectura")){
            acumulador4++;
        }else if(materiasEstudiantes[i].equals("Electrotecnia")){
            acumulador5++;
        } 
                        
        }
    
        System.out.println();
        System.out.println("\t\tResumen Materias");
        
        System.out.println("Calculo: " + acumulador1 );
        System.out.println("Cad: " + acumulador2 );
        System.out.println("Programacion: " + acumulador3 );
        System.out.println("Arquitectura: " + acumulador4 );
        System.out.println("Electrotecnia: " + acumulador5 );
        
    }
    }

