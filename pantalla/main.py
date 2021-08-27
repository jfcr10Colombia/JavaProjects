#code for esp32
# import time
#import utime
#from machine import UART

#uart1 = UART(1,baudrate=9600, bits = 8, parity = None, stop=1, timeout = 250)
#print(uart1)
#uart2 = UART(2,baudrate=9600, bits = 8, parity = None, stop=1, timeout = 250)

#print("starting")

#while True:
 #   uart1.write("send me something \r\n")
  #  b=utime.ticks_us()    
   # mensaje=str(uart1.readline())
    #print(mensaje)
    #a=utime.ticks_us()
    #uart2.write(mensaje)
    #print(utime.ticks_diff(a,b),"aqui")
    #time.sleep(3) """
    
# code for esp8266
#from machine import UART
#import pantalla
#uart0 = UART(0, baudrate=9600)

#uart0.init(9600, bits=8, parity=None, stop=1, timeout = 250)
#while True:
 #   mensaje=str(uart0.readline())
  #  print(mensaje)

   # if mensaje != 'None':
    #    uart0.write('verificado')
 

from time import sleep_ms
from machine import I2C, Pin 
import i2clcd

DEFAULT_I2C_ADDR = 0x39
i2c = I2C(scl=Pin(22), sda=Pin(21), freq=400000) 
lcd = i2clcd.I2cLcd(i2c, DEFAULT_I2C_ADDR, 2, 16)
lcd.clear()
lcd.putstr('Example # 2')
sleep_ms(1000)
count = 0

while True:
    print('Counter: {}'.format(count))
    lcd.clear() # Clears the LCD,
                # Sets the cursor position to 0,0 
    lcd.putstr('Counter: {}' .format(count))
    count = count + 1
    sleep_ms(1000)
    

