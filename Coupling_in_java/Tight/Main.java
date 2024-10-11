package Coupling_in_java.Tight;

public class Main {

    public static void main(String[] args) {
        
        // now the thing here is that we are making an oject of a Car Class 
        // and from Car Class we are calling move() function which is calling start() function of DieselCar or PetrolCar 
        // But here when I am making an object of Car Class which then is dependant on DieselEngine or PetrolEngine but only depends on one object. 
        //The thing is that now car can implements only DieselEngine or PetrolEngine not both at same time. Maybe in near future I wants to depand on some other engine which will cause conflicts leading to -> TIGHT COUPLING. 
        // And we want to implement anyone when requirements changes -> LOOSE COUPLING  

        Car car = new Car();
        car.move();
    }
    
}