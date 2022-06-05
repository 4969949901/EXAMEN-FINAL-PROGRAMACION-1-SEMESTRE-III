
package examenfinalregdep;

import java.util.Scanner;


public class RegistroDepartamental {
    //atributos
    private String departamento;
    private int municipio;
    private String cabecera;
    private String [] vectorDep;
    private int contador;
    
    //contructor
    public RegistroDepartamental(){
    }
    
    public RegistroDepartamental(String cabe,int muni, String depa){
        this.cabecera=cabe;
        this.departamento= depa;
        this.municipio=muni;
        vectorDep=new String [22];
        this.contador=0;
        
    }
    
    //metodo registro
    Scanner intro =new Scanner (System.in);
    public void registrarDep (){
        System.out.println( "*************************************");
        System.out.println( "Ingrese el Nombre del Departamento:");
        departamento= intro.nextLine();
        System.out.println( "*************************************\n");
        
        System.out.println( "*************************************");
        System.out.println( "Ingrese la cantidad de Municipios:");
        municipio= intro.nextInt();
        System.out.println( "*************************************\n");
        
        System.out.println( "*************************************");
        System.out.println( "Ingrese la Cabecera departamental:");
        cabecera= intro.nextLine(); cabecera= intro.nextLine();
        System.out.println( "*************************************\n");
        this.mostrar( departamento, municipio, cabecera);
    }

    public void mostrar ( String registroUno, int registroDos, String procesoCab){
    contador=contador+1;
    vectorDep[contador]= " "+registroUno+" "+registroDos+" "+procesoCab;
    
    }
    
    public void mostrarDep(){
    try{       
            for (int i=1; i<vectorDep.length;i++){
                if(vectorDep[i] != null){
                    System.out.println(vectorDep[i]);
                }
            }
            System.out.println("\n // Mostrara  el vector en la pantalla// \n");
            for(String operacion : vectorDep){
                if(operacion != null){
                    System.out.println(operacion);
                }   
            } 
        }catch(Exception e){
            System.out.println(e.getMessage());       
        }
    }
    
    
    
    
    
    
}



