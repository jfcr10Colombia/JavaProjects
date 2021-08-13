//package prueba_condicionales;

import java.util.*;//para usar Scanner

public class DiasSemana 
{
    public static void main(String[] args) 
    {
        Scanner DatoDia=new Scanner(System.in);//creo el objeto dia y al constructur de la clase le envio el metodo in
        System.out.println("Ingrese la poscion de un dia de la semana entre el dia 1 al dia 7"); 
        int dia=DatoDia.nextInt();//a travez del metodo enviado al constructor se capta lo que se ingrese por teclado
                                  //para este caso se espera recibir un entero
        DatoDia.close();//cierro el scanner
        switch(dia)
        {
            case 1:
                System.out.printf("El dia ingresado %d corresponde al Domingo",dia);            
                break;
            case 2:
                System.out.printf("El dia ingresado %d corresponde al Lunes",dia);            
                break;                
            case 3:
                System.out.printf("El dia ingresado %d corresponde al Martes",dia);            
                break;            
            case 4:
                System.out.printf("El dia ingresado %d corresponde al Miercoles",dia);            
                break;           
            case 5:
                System.out.printf("El dia ingresado %d corresponde al Jueves",dia);            
                break;            
            case 6:
                System.out.printf("El dia ingresado %d corresponde al Viernes",dia);            
                break;            
            case 7:
                System.out.printf("El dia ingresado %d corresponde al Sabado",dia);            
                break;           
            default:
                System.out.printf("El dia ingresado %d no es valido",dia);            
                break;           
        }
    }    
}
