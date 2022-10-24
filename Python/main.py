from uberPool import UberPool
from uberVan import UberVan
from car import Car
from account import Account

if __name__ == "__main__":
    print("Hola, Bocha!") 
    
car = Car("OPGT567", Account("Maria Lopez", "MLP609"))
print(car.set_passenger(4), car.printdataCar())

uberPool = UberPool("AMS234", Account("Andres Herrera", "ANDA876"), "Dodge", "Attitude")
print(uberPool.set_passenger(3))
print(uberPool.printdataCar())


uberVan = UberVan("SAWO86", Account("Sandra Amino", "TVB5RT2"), "Chevy", "Sedan")
print(uberVan.printdataCar())
print(uberVan.set_passenger(7))