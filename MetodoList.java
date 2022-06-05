
package examenfinalregdep;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class MetodoList extends RegistroDepartamental {
    List<MetodoList> listaDeptos=new ArrayList<MetodoList>();
    
    Scanner scaner=new Scanner(System.in);
    
    int[]vector;
    private double []matrizUno;
    private int indiceVector;
    String listaDepto;
    int listaDep;
    
    String departamentos,cabeceras;
    int municipios;
    
    //constructor
    public MetodoList (){}
    
    public MetodoList (String departamentos){
    this.departamentos=departamentos;

    }

    public String getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(String departamentos) {
        this.departamentos = departamentos;
    }
    
    public void listaDepartamento (){
    System.out.println("*********************************************************************");
    System.out.println("----Ingrese el nombre de los departamentos que desea ingresar:----");
    departamentos= scaner.nextLine();
    System.out.println("*********************************************************************");
    
    listaDeptos.add(new MetodoList(departamentos));
   
}
    public void lista(){
    System.out.println("*********************************************************************");
    for (int i=0;i<listaDeptos.size(); i++){
        System.out.println("Los departamentos registrados son:"+listaDeptos.get(i).getDepartamentos());
    }
    System.out.println("");
    }
}