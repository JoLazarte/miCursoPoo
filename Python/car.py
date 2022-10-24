from account import Account

class Car:
    id          = int
    license     = str
    driver      = Account("","")
    _passenger   = int

    def __init__(self, license, driver):
        self.license    = license
        self.driver     = driver
    
    #@property
    def get_passenger(self):
        return self._passenger

    #@passenger.setter
    def set_passenger(self, passenger):
        if passenger == 4:
            self._passenger = passenger
            print("El número de pasajeros es: {}.".format(self._passenger))
        else: 
            print("Necesitas asignar 4 pasajeros.")

    def printdataCar(self):
        print("La licencia es: " + self.license + ". \n" + "El conductor es: " + self.driver.name + ". \n" + "El documento es: " + self.driver.document + ".")

    
