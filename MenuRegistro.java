
package examenfinalregdep;

import java.util.Scanner;


public class MenuRegistro {
    Scanner leer=new Scanner (System.in);
    Scanner in=new Scanner(System.in);
    RegistroDepartamental met =new RegistroDepartamental();
    RegistroDepartamental met2 =new RegistroDepartamental();
    RegistroDepartamental met3 =new RegistroDepartamental();
    MetodoList obj=new MetodoList(); 
    
    
    
    public void menuRegistroDepartamentos(){
    
    String registroUno,registroDos;
    int procesoCab,opcion,opc;
    
       do{
            do{
        System.out.println("PROGRAMA PARA REGISTRAR LOS DEPARTAMENTOS DE ");
        System.out.println("-----------------GUATEMALA------------------ ");
        System.out.println("*******************************************"  );
        System.out.println("*  Bienvenido al Menu principal*"          );
        System.out.println("* 1.- Ingresar * Nombre del Departamento*" );
        System.out.println("* 2.- Mostrar Lista     *"                 );
        System.out.println("* 3.- Mostrar Historial por Array       *" );
        System.out.println("* 4.- Regresar                          *" );
        System.out.println("* 5.- Salir                             *" );
        System.out.println("********************************************" );

        System.out.println("__Elige una opcion del menu:__ ");

        opc = leer.nextInt();
       

            switch (opc) {
                    
            case 1:

                met.registrarDep(); 
                

                    System.out.println("************************************************");
                    System.out.println("**      ¿Deseas regresar al menu principal?   **");
                    System.out.println("**    --   4.- Regresar        6.- Salir    --  **");
                    System.out.println("************************************************");
                     opc=leer.nextInt();
                     


            break;

            case 2:
                System.out.println("--------------************************--------------");
                System.out.println("*  Submenu de:  listas                             *");
                System.out.println("*   1.- Mostrar los departamentos registrados      *");
                System.out.println("*   2.- Buscar un Departamento                     *");
                System.out.println("*   3.- Vaciar la lista                            *");
                System.out.println("*   4.- Regresar a menu                            *");
                System.out.println("*   5.- Salir                                      *");
                System.out.println("--------------************************--------------");

                opc = leer.nextInt();
                if (opc == 1) {

                    System.out.println("**********************************************");
                    System.out.println("**            Elegiste la opcion 1          **");
                    System.out.println("**   Mostrar los departamentos registrados  **");
                    System.out.println("**********************************************\n");
                    
                    
                    System.out.println("************************************************");
                    System.out.println("**      ¿Deseas regresar al menu principal?   **");
                    System.out.println("**         4.- Regresar        6.- Salir      **");
                    System.out.println("************************************************");
                     opc=leer.nextInt();                  

                }
                
                if (opc == 2) {

                    System.out.println("**********************************************");
                    System.out.println("**            Elegiste la opcion 2          **");
                    System.out.println("**          Buscar un departamento          **");
                    System.out.println("**********************************************");
                    
                    System.out.println("************************************************");
                    System.out.println("**      ¿Deseas regresar al menu principal?   **");
                    System.out.println("**         4.- Regresar        6.- Salir      **");
                    System.out.println("************************************************");
                     opc=leer.nextInt();                  

                }
                if (opc == 3) {

                    System.out.println("**********************************************");
                    System.out.println("**            Elegiste la opcion 3          **");
                    System.out.println("**              Vaciar la Lista             **");
                    System.out.println("**********************************************");
                    
                    System.out.println("************************************************");
                    System.out.println("**      ¿Deseas regresar al menu principal?   **");
                    System.out.println("**         4.- Regresar        6.- Salir      **");
                    System.out.println("************************************************");
                     opc=leer.nextInt();                  

                }

            break;



            case 3:
                System.out.println("-----------------************************-----------------");
                System.out.println("*  Submenu de:  Historial por medio de Arrays            *");
                System.out.println("*   1.- Mostrar los departamentos registrados            *");
                System.out.println("*   2.- Buscar un Departamento                           *");
                System.out.println("*   3.- Mostrar Cabecera Departamental                   *");
                System.out.println("*   4.- Mostrar Deptos.registrados en posiciones impares *");
                System.out.println("*   5.- Regresar                                         *");
                System.out.println("*   6.- Salir                                            *");
                System.out.println("-----------------************************-----------------");

                opc = leer.nextInt();
                
                 if (opc == 1) {

                    System.out.println("**********************************************");
                    System.out.println("**            Elegiste la opcion 1          **");
                    System.out.println("**   Mostrar los departamentos registrados  **");
                    System.out.println("**********************************************\n");
                    System.out.println("Los departamentos registrados son:"); met.mostrarDep();
                    System.out.println("************************************************");
                    System.out.println("**      ¿Deseas regresar al menu principal?   **");
                    System.out.println("**         5.- Regresar        6.- Salir      **");
                    System.out.println("************************************************");
                     opc=leer.nextInt();                  

                    }
                     if (opc == 2) {

                    System.out.println("**********************************************");
                    System.out.println("**            Elegiste la opcion 2          **");
                    System.out.println("**     Buscar un departamento registrado    **");
                    System.out.println("**********************************************\n");
                    System.out.println("El departamentos buscado es:");
                    System.out.println("************************************************");
                    System.out.println("**      ¿Deseas regresar al menu principal?   **");
                    System.out.println("**         5.- Regresar        6.- Salir      **");
                    System.out.println("************************************************");
                     opc=leer.nextInt();                  

                     }
                      if (opc == 3) {

                    System.out.println("**********************************************");
                    System.out.println("**            Elegiste la opcion 3          **");
                    System.out.println("**     Mostrar Cabecera departamental       **");
                    System.out.println("**********************************************\n");
                    System.out.println("La cabecera departamental:");
                    System.out.println("************************************************");
                    System.out.println("**      ¿Deseas regresar al menu principal?   **");
                    System.out.println("**         5.- Regresar        6.- Salir      **");
                    System.out.println("************************************************");
                     opc=leer.nextInt();                  

                     }
                     if (opc == 4) {

                    System.out.println("******************************************************");
                    System.out.println("**                Elegiste la opcion 4              **");
                    System.out.println("**Mostrar Deptos.registrados en posiciones impares  **");
                    System.out.println("**********************************************\n");
                    System.out.println("Los Departamentos en posiciones impares son :");
                    System.out.println("******************************************************");
                    System.out.println("**      ¿Deseas regresar al menu principal?   **");
                    System.out.println("**         5.- Regresar        6.- Salir      **");
                    System.out.println("*******************************************************");
                     opc=leer.nextInt();                  

                }
               
                     break;
                   
                   }
                   
            }while(opc==5);
   }while(opc!=6);
                    System.out.println("**********************************************");
                    System.out.println("**  Elegiste la opcion salir                **");
                    System.out.println("**  Gracias por utilizar este programa      **");
                    System.out.println("**********************************************");          
                                 
            }
   
    
    

    
    
}

