class animales
{
    public void sonidoanimal()
    {
        System.out.println("sonido animales");
    }
}




class cerdos extends animales
{
    public void sonidoanimal()
    {
        System.out.println("sonido cerdo");
    }


}

class patos extends animales
{
    public void sonidoanimal()
    {
        System.out.println("sonido pato");
    }


}

class burro extends animales implements jony
{
    public void sonidoanimal()
    {
        System.out.println("sonido burro");
    }

    @Override
    public void pruebas() {
        System.out.println("salida");
        
    }

    


}

interface jony
{
    public void pruebas();
}

public class herencia1 {

   
   
    public static void main(String[] args) {

        animales pig = new cerdos();
        cerdos pig2=new cerdos();
        animales todos=new animales();
        burro unos=new burro();
        //cerdos prueba1=new animales();

        pig.sonidoanimal();
        pig2.sonidoanimal();
        todos.sonidoanimal();

        unos.pruebas();
    
        

    }
    
}



