from car import Car

class UberVan(Car):
    typeCarAccepted = []
    seatsMaterial   = []
   
    
    def __init__(self, license, driver, typeCarAccepted, seatsMaterial):
        super().__init__(license,driver)
        self.typeCarAccepted = typeCarAccepted
        self.seatsMaterial = seatsMaterial

    #@Car.passenger.setter
    def set_passenger(self, passenger):
        if passenger == 6:
            self._passenger = passenger
            print("El número de pasajeros es: {}.".format(self._passenger))
        else: 
            print("Necesitas asignar 6 pasajeros.")
        #super().printdataCar()

    def printdataCar(self):
        print("La licencia es: " + self.license + ". \n" + "El conductor es: " + self.driver.name + ". \n" + "El documento es: " + self.driver.document + ". \n" + "El tipo de auto es: " + self.typeCarAccepted + ". \n" + "El tipo de asientos es: " + self.seatsMaterial + ".")
        #super().printdataCar()