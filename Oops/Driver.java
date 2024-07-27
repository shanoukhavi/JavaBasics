public class Driver {
    static int minAgeForDriving=18;
    //only for th clas onlt ynot the stauff it i s mate 
    //nwo car is created then tha ti si class  with the drive ris ther e who is new car he uses 
    String name;
   String dateOfLicense;
   int age;
   public boolean isAloowded()
   {
    return  this.age>=minAgeForDriving;
    //static coluld be accesed inside static and  slo nonn static method inseide u capture di t
    // return  this.age>=minAgeForDriving;
    //he u i is using it as thsi is somtehting mate ag e
   }
    public static void main(String[] args) {
        //main metod is sttic jvm object hsould nt create object driver.main he will calls 
        //we foing to create the Object  Constructor mate put i tinto myCar only object is idone myCar object is  ebebn getitng constructor i sbeen taken             
    //     Car myCar=new Car();
    //     //before edrriving add fuel he doess 
    //    // System.out.println("before adding the fuel "+myCar.getCurrentFuel());
    //     myCar.addFuel(6);
    //     //herr thr ful is added  the it si is 6 then he goes for dirve then minis of it 
    //   //  System.out.println("after ading the fuel "+myCar.getCurrentFuel());
    //     //then here elelse will be executed the n u will ge tutr ansrr as return ther us hould print otheriswse pto nneedded ot print 
    //    //agar car banaagyaga clas is the blueri t then u wan tto use the map and use it i si actual rela objects new is the buikder mate beign doing ti which is is isignificantly ur doing it instead of the objec t 
    //    //gadi hai baiji car s are many types objects are the same copy of them bhaiji s imilar type of the car architeut is the copy he did builder is the perosn who ha sdone it again 
    //    //u can change according to my objects instead of the same one mate which is been carefully doing ti  avtul u o and defone it ont he memeory mate otherwise u can dod it using driv me thod mate clas will ve caytual and colorly guy ate color u wnat to mate one color u want to see kepe it add har object ki properties no hindrance is required har object ko milaegi bhaii ahi toh nah i milegi 
    //    //in the same in the term of banking terms we can say account is there u open only u can do ut changes withdraw or drepoisti it oens affect the other thing s mate   
    //    //clas or the object uu us e it then c lalss ke andhar refernece karn hahi thenit si si thsi i 
    //    myCar.drive(); 
       
    //          myCar.drive(); 
    //          myCar.drive(); 
    //          myCar.addFuel(3);
    //     myCar.drive();
    //     //everythting ursing the objects mate otherwise its hter  product.price 
      
    //     System.out.println(myCar.getCurrentFuel());
    //     System.out.println(myCar.currentFuelInLiters);//it will gieve it as the 6 is athae nawee mate 
        //yes now u try to execut it wont happend if will work not drive --- so thats wahy u get it it ia s the smae answer mate which is i 0 beend eclared as the instance pat t
        //her i ti is initialized to 1 amte ji -1.0 by default everything is initialized to zero null is the absence of the any vlaue bhaiji 
        //current fuels is done here is gone mate two classes are been interacting mate     
        // myCar.drive();
        // myCar.addFuel(20.45f);
        // System.out.println(myCar.currentFuelInLiters); 
        //now the car ids drivinf mate 
        //arra i ai aba bjec mate otherwise it s not aray mate been foung it for long time 
    //isndie ddriver class we can use new car be made ads he reference 
        //objec ti sbeen created mate  evrythign is been create d amte new keyWord is it is i
        //the objects are ebene created in the heap mate  object ka variable ko reference he deffined the refernce nto the variable  object we put int o myCar mate 
//the code i s going to run in the jvm everythin is allocated dynamic memeory allocated 

//now i i fo gofor the swift car 
Car swift=new Car();
System.out.println(swift.color);
//thhsisis the black at 
//whic icj is sthe  car i ti is i amte so been looking ofo ri tso long time it isis a constructor it issi a class sabssed thing mate 
//swift.addFuel(6); //yes su u can drive mat e
swift.start().drive();
System.out.println(swift.color);
//we will ge tthe alue as the blac mate otheriwse it is is not bene possisnle to do it
// System.out.println(swift.getCurrentFuel());
//yes now ittll be caled as  1 mate noth the smaehting 
//car is is on the reserve mode bhaiji them u can drive is nte nchoice of urs 

//java by default u will be  added karenge to ho custom behaviour aoterwise before send ing to jvm comiler constructor mate  cosntructor initizalizes new object it initail States for the object atrtributes mate it doesnt have any return type mate  constructor is returnin the object itself not the main process mate 
//it  is is return typ is not defined or the object only will  be defined name is the  class ka namam hai same car hai bhaiji 
//parnathesis lagakr kar sakte hain bhaiji when thenew constructor is clalled mate yes mehtod u can calll bhaiji new Car constructor only iu will call hbbaiji state u eant to declare bydefault if he does it 
// Driver mydriver=new Driver();
// // mydriver.minAgeForDriving //
// // mydriver.dateOfLicense="122";
// System.out.println(minAgeForDriving);
// //System.out.println(mydriver.minAgeForDriving); not o a ggod appraoch mate 
// //eevrything is posisible mate her e it is is like u cn acces sbyt the class itself or direct can be called by the object not recommednded 

// System.out.println(Driver.minAgeForDriving);
//like thsi sialos posisle otherise by the  cass name ka dot laga ke mailnwame 
//he can acces si t mate but titht the other ppl he cananot go as the objects 
//thsi sii s alos not psossible amte 
//Driver.
// mydriver.he can acces si ti ame 
 
// swift.start().drive();
//swift.drive().start(); ths i si snot been possible mate 
//yes  u can call statrt twith that only ur driing mate withoyt fivein name it returns the sae class object so u can rrute any ways 
// swift.drive().start();
// swift.start().drive();
//the start is i the car class then drive u heleps  current instance mate use while callig the cosntrutor call mate 
//thsiis is the way methd cbahining can be oen  agian returning the same class Car then 
// Car startedCar=swift.start();
// startedCar.drive();
//for the fucrrent object hwich u created int start 
//it sthe reference mat e
// startedCar.start();
// swift.drive();
//System.out.println(swift.currentFuelInLiters);
//iti is 9sthe one mate 
    }          //program goes for the static to dynamic allocation zo cheez new dynamic allocation prgm hota hota ahi karthe hai  //total dnamic memeory allocation 
    //clas is the blueprint mate cr i s actuall y ther object are ther eal values 

}

//Class name Stuedent class Naaem strudent1refarance nam=new Strudent()  new which is tghe keyword and the student is the keyword amte ek refernece badh maein banta hai pa is the done clas sis there mate he is a pa he is i actual object reference clas new which is ithe keyword And another is the Constructor hai bhaaisaab and the two other brackets are needed to been done 
//int a  is declaeration initiaializetion decleration is the initializtion ha i bahiji reference has been declared we have instance have been done here to make actual copy of the class we do it  by the maeans of the object u go and  map isi the lueprint mate clas sis the blueprint u cant directly use it powe can aces it by te other means of the way otherise u an tyru to cvves sit mate instad of dojg ut 

//stati iic i si like u can acces shte varibale of the same calss hre static int a then u can acces swhil ecresting thr oebject so.jjjj i ntit ososbile but that a nto tru in the nons tatic also it snot possible 
//in the main method which i  smain it is is not possiisble mate directly u can do access by classname and onject nmat e