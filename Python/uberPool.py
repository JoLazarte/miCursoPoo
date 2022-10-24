from car import Car

class UberPool(Car):
    brand = str
    model = str

    def __init__(self, license, driver, brand, model):
        super().__init__(license,driver)
        self.brand = brand
        self.model = model

    def printdataCar(self):
        print("La licencia es: " + self.license + ". \n" + "El conductor es: " + self.driver.name + ". \n" + "El documento es: " + self.driver.document + ". \n" + "La marca es: " + self.brand + ". \n" + "El modelo es: " + self.model + ".")
        #super().printdataCar()