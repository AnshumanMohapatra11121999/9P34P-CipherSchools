public class PolyMorphism {
    
}
//Dynamic Polymorphism: overriding

abstract class Doctor {
    abstract void treatPatient();
}
class Physician extends Doctor{

    @Override
    void treatPatient() {

        System.out.println("Hi! I am Physician \nI Treat Patients using Medicines.");

    }

}

class Surgeon extends Doctor{ 
    void treatPatient() {

    

            System.out.println("Hi! I am Surgeon \n I Treat Patients using Surgery!");

}

}



class Dentist extends Doctor{ 
    

    void treatPatient() {
        System.out.println("Hi! I am Dentist \nI Treat Patients Teeth");
    }

}