from machine import Pin
import utime



'''
    void inicializar_lcd ()
{
/*
LCD2X16
CONSTA DE DOS FILAS QUE SOPORTAN 16 CARACTERES CADA UNA DE 5X8 CADA ESPACIO PARA ESCRIBIR UN CARACTER CUENTA CON UNA DIRECCION ESPECIFICA
LA FILA SUPERIOR INICIA CON LA DIRECCION 128 Y FINALIZA CON LA DIRECCION 143
LA FILA INFERIOR INICIA CON LA DIRECCION 192 Y FINALIZA CON LA DIRECCION 207
*/

		__delay_ms(20);
		R_I(0x30);//funcion set        
		__delay_ms(5);
		R_I(0x30);//funcion set         
		__delay_ms(5);
		R_I(0x30);//funcion set    
		R_I(0x38); //Bus de datos de 8 bits,2 lineas,caracteres 5x7        
		R_I(0x0C);//display on, CURSOR OFF, BLICK OFF
		R_I(0X01); //display clear                      
		__delay_ms(15);//se adiciona este ultimo retardo para permitir que los votlajes Internos de la LCD se estabilizen y con ello evitar problemas de preconfiguracion
} 

void R_I(char dato)
{
	ENABLE=0;
	RS=0;
	LATD=dato;
	ENABLE=1;
	__delay_ms(10);
	ENABLE=0;
}
void R_D(char dato)
{
	ENABLE=0;//E
	RS=1;//RS
    LATD=dato;
	ENABLE=1;
	__delay_ms(10);
	ENABLE=0;	
    	
}

//..............escribir en lcd..........................
void write(unsigned char tam){
    
    unsigned char i;    
    for(i=0;i<tam;i++){
        R_D(buffer[i]);
    }


'''

class inicializar:

    def __init__(self,pinRS=34,pinEna=35):
        self.RS=pinRS
        self.ENA=pinEna
    
        
    def inicializar_lcd(self,lineas=1,tamano=1,bus=8,display_on=1,cursor=0,blink=0):
       
        self.display_on=display_on
        self.cursor=cursor
        self.blink=blink
        if bus==8 or bus!=4:
            utime.sleep_ms(20)
            self.instruccion(0b00110000)#funcion set    
            utime.sleep_ms(5)
            self.instruccion(0b00110000)#funcion set
            utime.sleep_ms(5)
            self.instruccion(0b00110000)#funcion set
            if lineas==1:
                if tamano==1:
                    self.instruccion(0b00111100)#8 bits, 2 lineas, tamaño caracter 5x10
                else:
                     self.instruccion(0b00111000)#8 bits, 2 lineas, tamaño caracter 5x8
            else:
                if tamano==1:
                    self.instruccion(0b00110100)#8 bits, 1 linea, tamaño caracter 5x10
                else:
                     self.instruccion(0b00110000)#8 bits, 1 linea, tamaño caracter 5x8
            if display_on==1:
                if cursor==1:
                    if blink==1:
                      self.instruccion(0b00001111)#display ON, CURSOR ON, BLICK ON
                    else:
                       self.instruccion(0b00001110)#display ON, CURSOR ON, BLICK OFF    
                else:
                    if blink==1:
                      self.instruccion(0b00001101)#display ON, CURSOR OFF, BLICK ON
                    else:
                       self.instruccion(0b00001100)#display ON, CURSOR OFF, BLICK OFF 
            else:
                if cursor==1:
                    if blink==1:
                      self.instruccion(0b00000111)#display OFF, CURSOR ON, BLICK ON
                    else:
                       self.instruccion(0b00000110)#display OFF, CURSOR ON, BLICK OFF  
                else:
                    if blink==1:
                      self.instruccion(0b00000101)#display OFF, CURSOR OFF, BLICK ON
                    else:
                       self.instruccion(0b00000100)#display OFF, CURSOR OFF, BLICK OFF 
            self.instruccion(0b00000001)#display clear 
            utime.sleep_ms(15)
        else:

            
        
   """  def instruccion(self,dato):
        self.ENA=0
        self.dato=dato """
        

