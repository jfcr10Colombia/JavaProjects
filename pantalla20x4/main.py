import utime
from machine import I2C,Pin
from lcd_api import LcdApi
from pico_i2c_lcd import I2cLcd

#creacion de caracteres especiales
#https://maxpromer.github.io/LCD-Character-Creator/
#crear listas para cada uno de los caracteres especiales creados

bateria_0=[0x0E,  0x0A,  0x11,  0x11,  0x11,  0x11,  0x11,  0x1F]
bateria_10=[ 0x0E,  0x0A,  0x11,  0x11,  0x11,  0x11,  0x1F,  0x1F]
bateria_45=[0x0E,  0x0A,  0x11,  0x11,  0x1F,  0x1F,  0x1F,  0x1F]
bateria_75=[ 0x0E,  0x0A,  0x11,  0x1F,  0x1F,  0x1F,  0x1F,  0x1F]
bateria_90=[0x0E,  0x0A,  0x1F,  0x1F,  0x1F,  0x1F,  0x1F,  0x1F]
bateria_100=[0x0E,  0x0E,  0x1F,  0x1F,  0x1F,  0x1F,  0x1F,  0x1F]


#Direccion de del modulo I2C y tamaño de la LCD

I2C_ADDR=0x27
I2C_NUM_ROWS=4
I2C_NUM_COLS=20


i2c=machine.I2C(0,scl=machine.Pin(22),sda=machine.Pin(21),freq=400000)#se crea objeto I2C POR DEFECTO EL MODULO I2C 0 Y SE ASIGNAN LOS PINES SDA Y SCL
lcd= I2cLcd(i2c, I2C_ADDR, I2C_NUM_ROWS, I2C_NUM_COLS)


def lcd_str(mensaje,columna,fila):
    lcd.move_to(columna,fila)
    lcd.putstr(mensaje)


def main():
   
    lcd.custom_char(0,bytearray(bateria_0))
    lcd.custom_char(1,bytearray(bateria_10))
    lcd.custom_char(2,bytearray(bateria_45))
    lcd.custom_char(3,bytearray(bateria_75))
    lcd.custom_char(4,bytearray(bateria_90))
    lcd.custom_char(5,bytearray(bateria_100))

    # lcd.clear()
    # lcd_str("Bateria",0,0)
    # lcd.move_to(0,1)
    # for i in range (0,6):
    #     lcd.putchar(chr(i))
    # lcd.backlight_off()

    lcd.clear()
    lcd.move_to(0,0)
    lcd.putstr("hola mundo")
    utime.sleep(1)
    lcd.move_to(0,1)
    lcd.putstr("solumek")
    utime.sleep(1)
    lcd_str("mensaje2   ",0,2)
    utime.sleep(1)
    lcd_str("jony carmona",0,3)
    utime.sleep(1)

    lcd.clear()

    lcd_str("1",0,0)
    utime.sleep(1)
    lcd_str("2",19,0)
    utime.sleep(1)

    lcd_str("3",0,1)
    utime.sleep(1)
    lcd_str("4",19,1)
    utime.sleep(1)

    lcd_str("5",0,2)
    utime.sleep(1)
    lcd_str("6",19,2)
    utime.sleep(1)

    lcd_str("7",0,3)
    utime.sleep(1)
    lcd_str("8",19,3)
    utime.sleep(1)


    lcd.clear()

    lcd_str("Borrado de pantalla",0,0)
    lcd_str("Dinamico",0,1)
    lcd.blink_cursor_on()#encender el parpadeo de la pantalla
    utime.sleep(1)

    ##limpieza dinamica de la pantalla
    for j in range(1,-1,-1): #conteo regresivo
        for i in range(19,-1,-1):
            lcd.move_to(i,j)
            lcd.putstr(' ')
            utime.sleep_ms(100)
    utime.sleep(1)
    lcd.hide_cursor()#ocultar el cursor

    ##apagar backlight de la pantalla
    lcd.clear()
    lcd.backlight_off()
    lcd_str("Backlight OFF",0,0)
    utime.sleep(3)

    ##encender backlight de la pantalla
    lcd.clear()
    lcd.backlight_on()
    lcd_str("Backlight ON",0,0)
    utime.sleep(3)

    lcd.clear()
    lcd_str("Bateria",0,0)
    lcd.move_to(0,1)
    for i in range (0,6):
        lcd.putchar(chr(i))

    #while True:
        # lcd.clear()
        # lcd.move_to(0,0)
        # lcd.putstr("hola mundo")
        # utime.sleep(1)
        # lcd.move_to(0,1)
        # lcd.putstr("solumek")
        # utime.sleep(1)
        # lcd_str("mensaje2   ",0,0)
        # utime.sleep(1)
        # lcd_str("jony carmona",0,1)
        # utime.sleep(1)

        # lcd.clear()

        # lcd_str("1",0,0)
        # utime.sleep(1)
        # lcd_str("3",15,0)
        # utime.sleep(1)
        # lcd_str("2",0,1)
        # utime.sleep(1)
        # lcd_str("4",15,1)
        # utime.sleep(1)


        # lcd.clear()

        # lcd_str("Borrado de pantalla",0,0)
        # lcd_str("Dinamico",0,1)
        # lcd.blink_cursor_on()#encender el parpadeo de la pantalla
        # utime.sleep(1)

        # ##limpieza dinamica de la pantalla
        # for j in range(1,-1,-1): #conteo regresivo
        #     for i in range(15,-1,-1):
        #         lcd.move_to(i,j)
        #         lcd.putstr(' ')
        #         utime.sleep_ms(100)
        # utime.sleep(1)
        # lcd.hide_cursor()#ocultar el cursor

        # ##apagar backlight de la pantalla
        # lcd.clear()
        # lcd.backlight_off()
        # lcd_str("Backlight OFF",0,0)
        # utime.sleep(3)

        # ##encender backlight de la pantalla
        # lcd.clear()
        # lcd.backlight_on()
        # lcd_str("Backlight ON",0,0)
        # utime.sleep(3)

        # lcd.clear()
        # lcd_str("Bateria",0,0)
        # lcd.move_to(0,1)
        # for i in range (0,7):
        #     lcd.putchar(chr(i))




if __name__=="__main__":
    main()



# from machine import I2C


# i2c=machine.I2C(0,scl=machine.Pin(22),sda=machine.Pin(21),freq=400000)#se crea objeto I2C POR DEFECTO EL MODULO I2C 0 Y SE ASIGNAN LOS PINES SDA Y SCL

# direccion=hex(i2c.scan()[0]) #LA FUNCION SCAN PERMITE LEER LAS DIRECCIONES DE LOS DIFERENTES DISPOSITIVOS CONECTADOS A LA RED I2C RECUERDE QUE LA REFERENCIA A TIERRA DE LOS 
#                              #DIFERENTES DISPOSITIVOS DEBE SER LA MISMA, LA FUNCION SCAN RETORNA UNA LISTA CON LAS DIRECCIONES EN DECIMAL POR ELLO SE USA EL CASTING Y SE CONVIERTE EN HEXADECIMAL
#                              # PARA ESTE CASO SOLO SE ESTA LEYENDO LA PRIMERA POSICION DE LA LISTA
# print('La direccion I2C es',direccion) # SE IMPRIME LA DIRECCION DEL DISPOSITIVO ENCONTRADO
 
# import machine
# from machine import I2C
# from lcd_api import LcdApi
# from pico_i2c_lcd import I2cLcd
# import utime

# I2C_ADDR     = 0x27
# I2C_NUM_ROWS = 4
# I2C_NUM_COLS = 20



# # i2c=machine.I2C(0,scl=machine.Pin(22),sda=machine.Pin(21),freq=400000)#se crea objeto I2C POR DEFECTO EL MODULO I2C 0 Y SE ASIGNAN LOS PINES SDA Y SCL
# # lcd= I2cLcd(i2c, I2C_ADDR, I2C_NUM_ROWS, I2C_NUM_COLS)

# def test_main():
#     #Test function for verifying basic functionality
#     print("Running test_main")
#     i2c=machine.I2C(0,scl=machine.Pin(22),sda=machine.Pin(21),freq=400000)#se crea objeto I2C POR DEFECTO EL MODULO I2C 0 Y SE ASIGNAN LOS PINES SDA Y SCL
#     lcd= I2cLcd(i2c, I2C_ADDR, I2C_NUM_ROWS, I2C_NUM_COLS)   
#     lcd.move_to(0,0)
#     lcd.putstr("hola mundo")
#     #utime.sleep(2)
#    # lcd.clear()
#     # count = 0
#     # while True:
#     #     lcd.clear()
#     #     time = utime.localtime()
#     #     lcd.putstr("{year:>04d}/{month:>02d}/{day:>02d} {HH:>02d}:{MM:>02d}:{SS:>02d}".format(
#     #         year=time[0], month=time[1], day=time[2],
#     #         HH=time[3], MM=time[4], SS=time[5]))
#     #     if count % 10 == 0:
#     #         print("Turning cursor on")
#     #         lcd.show_cursor()
#     #     if count % 10 == 1:
#     #         print("Turning cursor off")
#     #         lcd.hide_cursor()
#     #     if count % 10 == 2:
#     #         print("Turning blink cursor on")
#     #         lcd.blink_cursor_on()
#     #     if count % 10 == 3:
#     #         print("Turning blink cursor off")
#     #         lcd.blink_cursor_off()                    
#     #     if count % 10 == 4:
#     #         print("Turning backlight off")
#     #         lcd.backlight_off()
#     #     if count % 10 == 5:
#     #         print("Turning backlight on")
#     #         lcd.backlight_on()
#     #     if count % 10 == 6:
#     #         print("Turning display off")
#     #         lcd.display_off()
#     #     if count % 10 == 7:
#     #         print("Turning display on")
#     #         lcd.display_on()
#     #     if count % 10 == 8:
#     #         print("Filling display")
#     #         lcd.clear()
#     #         string = ""
#     #         for x in range(32, 32+I2C_NUM_ROWS*I2C_NUM_COLS):
#     #             string += chr(x)
#     #         lcd.putstr(string)
#     #     count += 1
#     #     utime.sleep(2)

# if __name__ == "__main__":
#     test_main()
