public class Car {
    //car can heva how many tyres mate eevrything properties 
    int noOfWheels;
    String color;
    float maxSpeed;
    float currentFuelInLiters;
    int noOfSeats;
    Car(){
        //it should be same ss that of the class of car naame s mate so been done
        noOfWheels=4;
      //default alues hai bhaiji
      color="black";
      maxSpeed=150;
      currentFuelInLiters=2;
      noOfSeats=5;
      //default alues hai bhaiji  
    }
    //these are my instance variables 
    //i wanted to change ot the majke in the change in the car class ionly vhcnage in car class dont go and 
    //bank Acoutn ma ane eki class u do it saving s interes rint interset 
    //interess tis there hwil eo bject if u want ot to uinteret is thre u 
    //for everyone be thes mae for all the instances it shoudl ebe the same mate so eben carefulw hile doing ut  its a single copy  class ka behaviour not the ins
    public Car  start()//no acces ot non static method saor the memebers they cant be use d mate 
    //vodi was there mate return the Car it imate 
    //same uf u give vofi ws theretheey beleong to shared among the instances among the objects but keeping it i same mmate  so instead of that u can use it 
    //thie sis the way which is  given by void 
    //and the static method doesnt meeed the keyword to be called it can be called idirectly instead ofg dojgn t i u dornt call it i i is s ie ntjjhe same way bu clas sand inout array u iid itn mafte kuch rooicdedeurres cN BE SME WE DUMPED IT HAS A atatic keyword mate 
    {
        //verytig is  defined instance can eacces s the static mate int the red in th estatic he can he use  from thw dclass he cant acces from c1 c2 where it is i si ryt these c1 c2 can access which is there cclass car amte  no acces sot non static memebers mate 
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
