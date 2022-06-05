
package examenfinalregdep;

import java.util.Scanner;


public class RegistroDepartamental {
    
     Scanner intro =new Scanner (System.in);
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

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getMunicipio() {
        return municipio;
    }

    public void setMunicipio(int municipio) {
        this.municipio = municipio;
    }

    public String getCabecera() {
        return cabecera;
    }

    public void setCabecera(String cabecera) {
        this.cabecera = cabecera;
    }
    
    
    
    
   
    public void registrarDep (){
        System.out.println( "*************************************");
        System.out.println( "Ingrese el Nombre del Departamento:");
        departamento= intro.nextLine();this.mostrar("Nombre del Departamentos", departamento);
        System.out.println( "*************************************\n");
    }
    
    public void registrarMuni(){
        
        System.out.println( "*************************************");
        System.out.println( "Ingrese la cantidad de Municipios:");
        municipio= intro.nextInt();this.mostrarse("Cantidad de Municipios", municipio);
        System.out.println( "*************************************\n");
    }
    
    public void registrarCabe(){
        System.out.println( "*************************************");
        System.out.println( "Ingrese la Cabecera departamental:");
        cabecera= intro.nextLine(); cabecera= intro.nextLine();
        this.mostrar("Cabecera Departamental", cabecera);
        System.out.println( "*************************************\n");
    
    }

    public void mostrar ( String deta,String depa){
    contador=contador+1;
    vectorDep[contador]="  "+deta+"  "+depa;
    
    }
     public void mostrarse ( String deta,int depa){
    contador=contador+1;
    vectorDep[contador]="  "+deta+"  "+depa;
    
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



