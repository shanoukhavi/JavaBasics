public class Car {
    //car can heva how many tyres mate eevrything properties 
    int noOfWheels;
    String color;
    float maxSpped;
    float currentFuelInLiters;
    int noOfSeats;
    //these are my instance variables 
    //i wanted to change ot the majke in the change in the car class ionly vhcnage in car class dont go and 
    public Car  start()
    //vodi was there mate return the Car it imate 
    //same uf u give vofi ws there so instead of that u can use it 
    //thie sis the way which is  given by void 
    {
        //inside the strt itme only u hekc it 
        if(currentFuelInLiters==0){ 
            System.out.println("Car is  sbeen out of the fuel mate so been caredul tot do it it cannot be dstarted   ");
            }
            else if(currentFuelInLiters<5){
                System.out.println("Car is ion the reserve mode mate ");
            }
            else{
            System.out.println("Car is  started  bruuhhhh.......");
            // currentFuelInLiters--;
            }
            //return it which is the currecnnt object mate 
            return this;
            //current object ha bhaiji
            //alag allg uw ill call it mare mein current objec ti si stheis 
    }
    public void  drive(){
        //thsiis si also void mate 
        // if(currentFuelInLiters==0){ 
        // System.out.println("Car is  sbeen out of the fuel mate so been caredul tot do it  ");
        // }
        // else if(currentFuelInLiters<5){
        //     System.out.println("Car is ion the reserve mode mate ");
        // }
        // else{
            currentFuelInLiters--;
        System.out.println("Car is i drviing ");
        // return this;
   
        // }
        //then the gone 
    }
    //unlimited cheeze u cn ao it  no static is  written mate 

    public void addFuel(float currentFuelInLiters){
        this.currentFuelInLiters+=currentFuelInLiters;
        //if ther eis snay conflict itll resolve it   thsi si is used fo the current objexct mate 
        //here the same which is simy current object whoch i want ot od  oit in the same way is the  same way u want to adcces s by  giving current fuell which  is main in white mate 
        //see the currentfuel is 2 then u add it ra 5 it is is 6 ryt u wont keep it izero otherwise gaddi bandh 
        //whatever fuel is there u add it 
        //thsis s i like iniitializing it mate //propertyt i wnat to ue thsi is.i is suse d mate it is is i given as soon as they say it k neooth ben doing it for long time 
    }
    //chezzo ka accesisble bana bhai
    public float getCurrentFuel()
    {
        return currentFuelInLiters;

    }
    // public static void main(String[] args) {
    //    //thsis is i the public static vodi amin i want to use the car  
    // }
    //inside the clas the methoda  and the other ways are given tot degfine like current fuel while u drive fuel decarease then u add fuell u dod the current furle mate 
//now class is defind hwo to odefine the object  new instanttiats a  nee wobject o fthe class  
//inseid the class if a perosn wants to see or likr in to the object he goes for thsi i si keyword 
//first car is start then the driv eiit is is mate so been doig it 
}
