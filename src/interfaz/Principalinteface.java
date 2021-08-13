
public class Principalinteface {

    public static void main(String[] args) {/// clase principal
        Telefono tels[]=new Telefono[4];
        tels[0]=new iPhone("Apple","Iphone 7","VN4567","3100202020");
        tels[1]=new Samsung("Samsung","Galaxy 10");
        tels[2]=new Inalambrico("linx","lx102","lxx4567","30147540309");
        tels[3]=new iPhone("Apple","Iphone 12","ty5432","320567890");


        for (int i=0;i<tels.length;i++)
        {
            System.out.println("---------------------"+"\n"+"marca: "+tels[i].getMarca()+" "+tels[i].getModelo());

        

            if (tels[i] instanceof iPhone)
            {
                iPhone p=(iPhone) tels[i];//CASTING DE 
                p.obtenerCoordenadas();
                p.imprimirvelocidadluz();


            }
            else if(tels[i] instanceof Samsung)
            {
                Samsung s=(Samsung) tels[i];
                s.apagarFlash();
            }
            else
            {
               System.out.println("No es de la linea de telefono movil Samsung o Iphone");

            }
            System.out.println("----------------------------------------------------");
            System.out.println("Velocidad de la luz"+Gps.velocidadluz);
        }
    }
    
}
