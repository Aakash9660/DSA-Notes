                           // string example

// class test 
// {
//     public static void main(String[] args) 
//     {
//         String s=new String("code");
//         System.out.println(s);                     //code               
//         s.concat("planet");              
//         System.out.println(s);                     //code     (string ka object immutable hota h mtlb nya object bnane ki koshish klrenge to nya object too bn jayega pr purana referecne variable usee ko point krega nye wale ko nhui krne lg jayega  isliye 's' pr call krre h too code hii ara h kyuki  )
//   }
// }

                              // string buffer example

// class test
// {
//     public static void main(String[] args) {
//         StringBuffer sb=new StringBuffer("code");                
//         System.out.println(sb);                                //code
//         sb.append("planet");
//         System.out.println(sb);                        //codeplanet   (iska object mutable hota h isme reference variable khudke object ko chodke dusre object ko hold krn lg jata h  )
//     }
// }                              

                             // example
// class test
// {
//     public static void main(String[] args) {
//         String s1=new String("csd");
//         String s2=new String("csd");
//         System.out.println(s1==s2);                      //false (kyuki equal equal operator reference comparison krta h mtlb reference variable object kpo holad krta h or s1ors2 alag alag object hold krre h string k case m)
//         System.out.println(s1.equals(s2));              //true   (kyuki string ne equals metrhod ko override kr rkha h or contyent comparison krra rkha h nhi too equals method bhi reference comparison krti h )
//     }
// }                              
                                    
                              // example

// class test
// {
//     public static void main(String[] args) {
//         StringBuffer s1=new StringBuffer("csd");
//         StringBuffer s2=new StringBuffer("csd");
//         System.out.println(s1==s2);                    //false
//         System.out.println(s1.equals(s2));            //false  (kyuki string buffer ne equals method ko override nhi kr rkha or equals method reference comparison krti h )
//     }
// }           

                            //  SCP  (String Constant Pool)

// class test
// {
//     public static void main(String[] args) {
//         String s1=new String("csd");
//         String s2="csd";
//         String s3=new String("csd");
//         String s4="csd";
//         System.out.println(s1==s2);
//         System.out.println(s1==s3);
//         System.out.println(s2==s4);
//     }
// }

                                    // example
                  
// class test
// {
//     public static void main(String[] args) {
//         String s1=new String("csd");
//         s1.concat("xyz");                             //ab isme concat k karan nya object bnega(csdxyz) kyuki s1 too csd ko point krra h ,jb hm new operatror se ya method call klrte h too heap or 'SCP' dono m store hota h . 
//     }
// }
                                    
                                   //WRAPPER CLASSES//

// class test
// {
//     public static void main(String[] args) 
//     {
//         int x=10;
//         Integer i=new Integer(x);                             //ek too ese direct convert kr skte h primitive se wraper class m
//         char ch='a';
//         Character c=new Character(ch);
           
//     }
// }                              

                        //example yha hm primitive se wrapper class object m convert krre h
// class test
// {
//     public static void main(String[] args) {
//         int x=10;
//         Integer i=Integer.valueOf(x);                           // ek hm ese kr skte h "valueOF" method se ye static method h  isliye clas k naam se krre h call.
//     }
// }

                     //wrapper class ke object se primitive me aana h too "XxxValue()" or ye instance hoti h //
 
// class test
// {
//     public static void main(String[] args) 
//     {
//         Integer i=new Integer(10);
//         int x=i.intValue();                           //XxxValue() instance h isliye reference variable pr krre h
//     }
// }                     

                        // string se primitive me aana h too parseXxx() or ye static hoti h 

// class test
// {
//     public static void main(String[] args) 
//     {
//         String s="10";
//         int x=Integer.parseInt(s);                   //ye bhi static method h 'parseXxx'    
//     }
// }                        

                          //primitive se string m jane k liye toString() or ye static hoti h 

//  class test
//  {
//     public static void main(String[] args) 
//     {
//         int x=10;
//         String i=Integer.toString(x);    
//     }
//  }                          

                        //string se wrapper k object m aane k liye valueOf() ye static hoti h 

// class test
// {
//     public static void main(String[] args) 
//     {
//         string s="10";
//         Integer i=Integer.valueOf(s);    
//     }
// }                        

                          //wrapper class se string too toString() or ye instance h 

// class test
// {
//     public static void main(String[] args) 
//     {
//         Integer i=new Integer(10);
//         String s=i.toString(i);  
//         System.out.println(s);  
//     }
// }            

                       // stringbuffer se string m convert krne ka tarika 

class test
{
    public static void main(String[] args) 
    {
        StringBuffer sb=new StringBuffer("csd");
        String s=new String(sb);       //iski jagah hm aise bhi jaa skte h String s=sb.toString();                  
        System.out.println(s);  
        System.out.println(sb);  
    }
}

                                     //Autoboxing and Autounboxing
                                    
// class test
// {
//     public static void main(String[] args) 
//     {
//         int x=10;                                      
//         Integer i=x;                              //hm yha primitive ko direct wrapper class m convert krre h abhi tk hm ya too 'new' operator se ya ValueOf() se krre the .
//         System.out.println(i);                    //agar ye hm 1.4 version krte too error aati  
//     }                                             //isiko autoboxing khte h 1.5 version m introduce hua tha . 
// }                                     
                        //autoboxing primitive se wrapper class k object m convert kr deta h direct but ye internal ussi ValueOf() ko hi call krta h 
                        //jese Integer i=Integer.valueOf(x);


// class test
// {
//     public static void main(String[] args) 
//     {
//         Integer i=new Integer(20);
//         int z=i;                                      //isiko autounboxing khte h wraper class k object se direct primitive me 
//         System.out.println(z);                                   
//     }
// }                        
                   //ye bhi internal wrapper se primitive XxxValue(); ko hi call krta h
                   //jese int z=i.intValueOf(); 

               
                                //SOME SPECIAL CONCEPT// 
                   //wrapper class k object bhi immutable hota h pr yha 'SCP' wala kaam nhi h
                    //yha range -127to128 hoti h na uske karan immutablity h jese kuch multiple 
                    // reference variable ek hi value ko point krre h jese +10 ko or unme se kisi
                    //ek ne content change kiya too sbka content change ho jayega isliye yha bhi wo dusre
                    //naye object ko point krne lg jayega purane k chod k 
                    // baar baar nya object nhi bnega same content ka sb usi ko point krenge
                    //same String ke SCP wala concept h bs yha range se samjhenge.
                    //jb tak iss range m rhenge jb tk hii nya aobject nhi bnega range se bahar
                    //jate hii nya object bnnne lg jayega chahe content same hoo jese niche ek
                    //example h x=1000or y=1000 wala . 
                    //buffer sirf autoboxing ko support krta h

// class test
// {
//     public static void main(String[] args) 
//     {
//         Integer x=10;
//         Integer y=10;
//         System.out.println(x==y);          //true         
//         x=11;
//         System.out.println(x==y);               //false
//     }
// }


// class test
// {
//     public static void main(String[] args) 
//     {
//         Integer x=1000;
//         Integer y=1000;
//         System.out.println(x==y);           //ab ye tooo range se bahar h too ab too dono alag alag object point krre h 
//                                            //jese x=1000 ko krra h or y alag 1000 ko krra h 
//                                             //isliye yha false aayega
//     }
// }


// class test
// {
//     public static void main(String[] args) 
//     {
//         Integer x=new Integer(10);    
//         Integer y=new Integer(10);   
//         System.out.println(x==y);                  //false aayega kyuki new operator se too nya object hii bnta h whi String Ki jese
//     }
// }


// class test{
//     public static void main(String[] args) {
//         Integer x=Integer.valueOf(10);
//         Integer y=Integer.valueOf(10);
//         System.out.println(x==y);                     //true ayega kyuki autoboxing hori h buffer support krega 
//     }                                                 //upar wale example m new se bnaya h or yha valueof se too ye difference h dono m dono se nya object bn too jayega pr new se do nye object bnege or value of se whi story same content ka object h too ussi ko point klrme lg jayega 
// }



// class test
// {
//         static void m1(long x)                            //int se long m convert ho jayega ye bhi ho skta h
//         {
//             System.out.println("widening");
//         }   
//         static void m1(Integer x)                        //primitive se wrapper class ke object m ye bhi ho skta h    
//         {
//             System.out.println("autoboxing");            //isse ambiguity nhi aayegi kyuki priority widening mtlb conversion  ko milegi 
//         }
//         public static void main(String[] args) 
//         {
//             test.m1(10);                        //output widening aayega                                 
//         }
// }



// class test
// {
//     static void m1(long x)                        //isme bhi promote ho skta h 
//     {
//         System.out.println("widening");
//     }
//     static void m1(int... x)                        //isme bhi aa skta h 
//     {
//         System.out.println("var-arg");            //pr ambiguity nhi aayegi lyuli priority widening ko milegi 
//     }
//     public static void main(String[] args) 
//     {
//         test.m1(10);                            //output widening aayega
//     }
// }

            //priority order { widening(promotion) > autoboxing > var-arg }

// class test
// {
//     static void m1(Integer x)              //primitives se wrapper class ka object m jaa skta h 
//     {
//         System.out.println("autoboxing");
//     }
//     static void m1(int... x)                   //isme too jaa hiii skta h
//     {
//         System.out.println("var-arg");       //pr again ambiguity nhi hogi kyuki priority autoboxing ko milegi   
//     }
//     public static void main(String[] args) {
//         test.m1(10);                           //output autoboxing aayga 
//     }
// }


                        //Taking Input From User


// import java.util.Scanner;
// class test
// {                                              //user se input lene k liye next() ko call krna pdta h
//     public static void main(String[] args)     //or next() Scanner class m present hoti h or instance method hoti h  
//     {                                           //isliye scanner ka object bnana pdega callkrne k liye 
//         Scanner s=new Scanner(System.in);       //ab scanner class java.util package m h isliye phle usswe import krna pdega
//         String name=s.next();
//         System.out.println(name);              //isme compile krte hii cursor wait krega hmare inputr ka    
//     }                                          //but ab as a user hme kya pta kya mang ra h wo is liyue niche wala example h  
// }          



// import java.util.Scanner;
// class test{
//     public static void main(String[] args) {
//         Scanner s=new Scanner(System.in);
//         System.out.print("enter name");       //YHA PR YE print ho jayega 
//         String name=s.next();                      //or yha cursor wait krega hmare input ka       
//         System.out.println(name);                   //next() ka yhi kaam h user se input lene ka 
//     }                                                //isme problem kya h kii jese mene aakash sharma daala input too ye aakash hii print krayega puri line k liye nyi method use leni hogi nextline()
// }


// import java.util.Scanner;
// class test
// {
//     public static void main(String[] args) {
//         Scanner s=new Scanner(System.in);
//         System.out.print("enter name : ");
//         String name=s.nextLine();                    //nextLine() hmare enter tak ka wait kregi mtlb jitna hm ek line m likhmna chahte h utta likh skte h firr enter dabate hii type ho jayega. 
//         System.out.println(name);
//      }
// }


// import java.util.Scanner;
// class test
// {
//     public static void main(String[] args) 
//     {
//         Scanner s=new Scanner(System.in);
//         System.out.print("enter name : ");
//         String name=s.nextLine();
//         System.out.print("enter cname : ");
//         String cname=s.nextLine();
//         System.out.println(cname); 
//         System.out.print("age : ");
//         String age=s.nextLine();
//         System.out.println(age); 
          
          
//     }
// }