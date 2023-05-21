

           //no. of ways too create thread in java  :-
                          // 1. by extending Thread class   
        

// class test
// {
//     public static void main(String[] args) 
//     {
//         for(int i=1;i<=10;i++)
//         System.out.println("hello");
//         for(int j=1;j<=10;j++)             //isme ek hii thread h main thread tooo kaam slow hoga 
//         System.out.println("hyeee");    
//     }
// }


// class Mythread extends Thread
// {
//     public void run()
//     {                              
//         for(int i=1;i<=10;i++)
//          System.out.println("hello"); 
//     }
// }
// class test
// {
//     public static void main(String[] args) 
//     {
//     Mythread mt=new Mythread();              //yha pr ek myhread class kia object createw kiya h jisko mt point krra h pr yha tk ek hii thread active h main thread 
//     mt.start();                           //yha se apan ne dusra thread active kiya h 
//     for(int j=1;j<=10;j++)                  //agar bhot sare thread active kiye hmne tooo konsa chlega konas nhi ye thtead sheduler decide krega processor allot krke hmare thread ko ye hmrare system pe depend klrta h ki hmara systrem kitne processor ka h quadcore,dualcore,octacore
//     System.out.println("hyee");         //thread sheduler k sath hmare thread ko register thread class ki start() krti h  
//     }                                      //thread class ki start() internally run() ko chlati h  
// }


// class Mythread extends Thread
// {
//     // ab empty implementation hoga kyuki start() ab thread class ki chlegi or start() ki run() m empty implementation hota h   
// }
// class test
// {
//     public static void main(String[] args) 
//     {
//     Mythread mt=new Mythread();              
//     mt.start();                            
//     for(int j=1;j<=10;j++)                  
//     System.out.println("hyee");           //isme sirf 10 baar hyee print  hoga kyki run() m too kuch likha wa h hii nhi
//     }                                         //agar nye wale thread se kuch kaam krana h too run() ko override krna jruri h 
// }


// class Mythread extends Thread
// {
//     public void start()
//     {
//         System.out.println("start");          //ye apni start() h naki thread class ki jo internal run() ko call krti h 
//     }
// }
// class test
// {
//     public static void main(String[] args) 
//     {
//     Mythread mt=new Mythread();              
//     mt.start();         //  yha se koi thread active nhi hoga kyuki active hone k liye thread sheduler se processor allot krana pdta h joo thread class ki start() krti h pr hmne start() ko override kr rkha h isliye wo ab ye kaam nhi krega                 
//     for(int j=1;j<=10;j++)                  
//     System.out.println("hyee");       ///isme hmesha start or firr 10 baar hyee hii ayega kyuki yha too ek hii thread h    
//     }                                    //agar multithreading krni h too hme start() ko override nho krnA CHAHIYE     
// }                                         //or agar multithreading krni h too run() kpo override krna chahiye 
 

// class Mythread extends Thread
// {
//     public void run()
//     {
//         System.out.println("start");         
//     }
// }
// class test
// {
//     public static void main(String[] args) 
//     {
//        Mythread mt=new Mythread();             //yha hmne thread ko active too kiya h nii isliye 10 baar hyee hii print hoga        
//        for(int j=1;j<=10;j++)                  
//        System.out.println("hyee");      
//     }                                   
// }


// class Mythread extends Thread
// {
//     public void run()
//     {
//         for(int j=1;j<=10;j++)                  
//         System.out.println("hello");         
//     }
// }
// class test
// {
//     public static void main(String[] args) 
//     {
//     Mythread mt=new Mythread();            
//     for(int j=1;j<=10;j++)                  
//     System.out.println("hyee"); //output 10 baar hyee ab iske baad 2 thread h too ab hello or main shuffle hoge
//     mt.start();
//     for(int j=1;j<=10;j++)                  
//     System.out.println("main"); 
//     }                                   
// }
   

                      // 2. BY implementing Runnable Interface

                //runnable interface m ek hii method hoti h 'public void run();'
            // isme too apn ko override krna hii pdega kyuki nhi too apni bhi class abstract bn jayegi
            //runnable se thread create krne ka fayda h apan multiple inheritance kr skte h 

// class myrunnable implements Runnable
// {
//     public void run()
//     {
//        for(int i=1;i<=10;i++)
//        System.out.println("hey"); 
//     }
// }
// class test
// {
//     public static void main(String[] args) 
//     {
//         myrunnable mr=new myrunnable();
//         // mr.start();                  //isse thread active nhi hoga infact error aayegi kyuki start() too thread class m hoti h yha jb JVM mythread class dhudega too usse milegi nhi  isse bchne k liye hme thread class ka bhi object bnana pdega   
//         // Thread t=new Thread();
//         // t.start();                    //yha se nya thtread active too ho gya lekin problem h jo start() internally run() ko call kregi too run() Thread class ki chlegi kyuki object Thread ka h 'override hoti hna' lekin apan ko too apni class ki run() chlani h iske liye jugaad h apan constructor m value denge 
//         Thread t=new Thread(mr);   //yha se run() mr ki chlegi 
//         t.start();
//         for(int j=1;j<=10;j++)
//         System.out.println("main");
//     }
// }



                               //Get & Set name of Thread


// class mythread extends Thread
// {
    
// }
// class test
// {
//     public static void main(String[] args) 
//     {
//         mythread mt=new mythread();               
//         System.out.println(mt.getName());                   //hr thread ko ya too naam JVM dega ya firr hm aise set kr skte h 
//         mt.setName("aakash");                 //ye dono method thread class m present hoti h kyuki sbhi thread ka naam set or get krne k liye kaam aayegi
//         System.out.println(mt.getName());
//     }
// }


// class mythread extends Thread
// {
    
// }
// class test
// {
//     public static void main(String[] args) 
//     {
//         mythread mt=new mythread(); 
//         Thread t=Thread.currentThread();          //isko kon chlayega main thread too isse hm main() ka naam get kr skte h       
//         System.out.println(mt.getName());                   //hr thread ko ya too naam JVM dega ya firr hm aise set kr skte h 
//         System.out.println(t.getName());
//         mt.setName("aakash");                 //ye dono method thread class m present hoti h kyuki sbhi thread ka naam set or get krne k liye kaam aayegi
//         t.setName("aakash1");
//         System.out.println(mt.getName());
//         System.out.println(t.getName());
//     }
// }



// class mythread extends Thread
// {
    
// }
// class test
// {
//     public static void main(String[] args) 
//     {
//         Thread t=Thread.currentThread();
//         t.setName("aakash");             //thread ka naamm aakash ho jayega
//         System.out.println(10/0);
//     }
// }


                               //Thread Priorities  :-


// class mythread extends Thread
// {
// }
// class test
// {
//     public static void main(String[] args) 
//     {
//         mythread mt=new mythread();
//         Thread t=Thread.currentThread();
//         System.out.println(mt.getPriority());       // 5
//         System.out.println(t.getPriority());         // 5
//     }    
// }



// class mythread extends Thread
// {
// }
// class test
// {
//     public static void main(String[] args) 
//     {
//         Thread t=Thread.currentThread();
//         t.setPriority(8);
//         mythread mt=new mythread();
//         System.out.println(mt.getPriority());  //8
//         System.out.println(t.getPriority());      //8   
//     }    
// }



// class mythread extends Thread
// {
// }
// class test
// {
//     public static void main(String[] args) 
//     {
//         Thread t=Thread.currentThread();
//         t.setPriority(8);
//         mythread mt=new mythread();
//         mt.setPriority(9);
//         System.out.println(mt.getPriority());    //9
//         System.out.println(t.getPriority());        //8 
//     }    
// }


                      //Methods to prevent thread execution
                                   // 1. join()
                                   
               
// class mythread extends Thread
// {
//     public void run()
//     {
//         for(int i=1;i<=10;i++)
//         System.out.println("hey");
//     }
// }
// class test
// {
//     public static void main(String[] args) throws InterruptedException 
//     {
//         mythread mt=new mythread();
//         mt.start();
//         mt.join();                //yha pr main thread wait krega mt thread kaa kaam pura hone tak ka  
//         for(int j=1;j<=10;j++)
//         System.out.println("main");  //output hmshsa phle 10 baar hyee firr 10 baar main 
//     }
// }



// class mythread extends Thread
// {
//     public void run()
//     {
//         for(int i=1;i<=10;i++)
//         try
//         {
//             System.out.println("hey");
//             Thread.sleep(2000);
//         }
//         catch(InterruptedException ie)
//         {

//         }
//     }
// }
// class test
// {
//     public static void main(String[] args) throws InterruptedException 
//     {
//         mythread mt=new mythread();
//         mt.start();
//         mt.join();                         //yha main thread waoit krega mythread ka kaam hone tak (is line ko main thread chlayega to wo join() ko cal;l krega or kisk liye wait krna h usko mt k liye islioye mt pr call krega)  
//         for(int j=1;j<=10;j++)
//         System.out.println("main");  //output hmshsa phle 10 baar hyee aayega 2second ka wait krkrke firr 10 baar main 
//     }
// }                                //yha hmne main thread ko wait kraya h ab hm aage example m child thread ko wait krayege




// class mythread extends Thread
// {
//     public void run()
//     {
//         for(int i=1;i<=10;i++)
//         try
//         {
//             System.out.println("hey");
//             Thread.sleep(2000);
//         }
//         catch(InterruptedException ie)
//         {

//         }
//     }
// }
// class test
// {
//     public static void main(String[] args) throws InterruptedException 
//     {
//         mythread mt=new mythread();
//         mt.start();
//         for(int i=1;i<=10;i++)
//         System.out.println("main-1");       //main-1 or hye too shuffle m print hoge
//         mt.join();                             //yha wait krega 
//         for(int j=1;j<=10;j++)
//         System.out.println("main-2");           //firr ye print honge 
//     }
// }


// class mythread extends Thread
// {
//     public void run()
//     {
//         for(int i=1;i<=10;i++)
//         try
//         {
//             System.out.println("hey");
//             Thread.sleep(2000);
//         }
//         catch(InterruptedException ie)
//         {

//         }
//     }
// }
// class test
// {
//     public static void main(String[] args) throws InterruptedException 
//     {
//         mythread mt=new mythread();
//         mt.start();
//         mt.join(5000);     //iska mtlb main thread maximum 5second wait krega mt thread ka chahe uska kaam ho ya na ho fir ye apna kaam krega agar uskka kaam 5sec se phle ho jata h tab too koi dikkat nhi h firr too ye krega hii apmna kaam  
//         for(int i=1;i<=10;i++)
//         System.out.println("main-2");
//     }
// }



// class mythread extends Thread
// {
//     public void run()
//     {
//         for(int i=1;i<=10;i++)
//         try
//         {
//             System.out.println("hey");
//             Thread.sleep(2000);
//         }
//         catch(InterruptedException ie)
//         {

//         }
//     }
// }
// class test
// {
//     public static void main(String[] args) throws InterruptedException 
//     {
//         mythread mt=new mythread();
//         mt.start();
//         mt.join(40000);                //ab iss case m hmne 40 sec wait daala h pr jese mt thread kaa kaam tooo yha 20 second kaa h too uskle main thread wait nhi krega 40 sec ka wo iskla kaam hote hii start ho jayega wo 40 sec maximum time hota h     
//         for(int i=1;i<=10;i++)
//         System.out.println("main-2");
//     }
// }



// class mythread extends Thread
// {
//     public void run()
//     {
//         for(int i=1;i<=10;i++)
//         try
//         {
//             System.out.println("hey");
//             Thread.sleep(2000);
//         }
//         catch(InterruptedException ie)
//         {

//         }
//     }
// }
// class test
// {
//     public static void main(String[] args) throws InterruptedException 
//     {
//         mythread mt=new mythread();
//         mt.start();
//         mt.join(40000);                
//         for(int i=1;i<=10;i++)
//         System.out.println("main-2");
//     }
// }


                                        // 2.  yeild() :-


// class mythread extends Thread
// {
//     public void run()
//     {
//         for(int i=1;i<=10;i++)
//         {
//              System.out.println("child thread");
//              Thread.yield();         //isse kya hoga child thread baar baar processor chodega pr koi or thread too h hii nhi isliye wapis isiko chance milega pr iss wajah se main thread phle khatam ho jayega 
//         }
//     }
// }
// class test
// {
//     public static void main(String[] args) 
//     {
//         mythread mt=new mythread();
//         mt.start();              
//         for(int i=1;i<=10;i++)
//         System.out.println("main-2");      //isme child thread mostly hmesha last m hii ayega kyuki ye wala thread processor chod ra h ek baar pprint krate hii
//     }
// }
                       

                               
                                          // 3. Sleep()  :-


// class mythread extends Thread
// {
   
// }
// class test
// {
//     public static void main(String[] args) throws InterruptedException 
//     {
//         for(int i=1;i<=10;i++)
//         {
//             System.out.println("image-"+i);
//             // Thread.sleep(2000);         //isse thread 2sec k liye wait pr jayega or interrupt ho sktra h isliye Interruted exceptionn ko handle krna pdega ya too tryt catcjh se ya throws se
//             Thread.sleep(2000,20);     //aise bhi time de skte h 
//         }
           
//     }
// }



                         // Daemon Thread  :-

// class mythread extends Thread
// {
   
// }
// class test
// {
//     public static void main(String[] args) throws InterruptedException 
//     {
//         mythread mt=new mythread();
//         Thread t=Thread.currentThread();                //false kyukli by default main thread ka nature non daemon hota h 
//         System.out.println(t.isDaemon());
//         System.out.println(mt.isDaemon());       //false kyuki isko main thread ne bnaya h or main thread non daemon h (foreground m chlta h) child thread ka nature vesa hii hoga jesa uskle parentr thtread ka h parent thread mtlb jisne usko bnaya h
//         mt.setDaemon(true);                        //yha pe bhi exception aati agar hm mt threadd ko start kr dete 'mt.start()' se upar hii 
//         System.out.println(mt.isDaemon());          //ab isko apna ne daemon set kr diya h isliye yha true aayega
//         t.setDaemon(true);                       //yha pe exception aayegi kyuki ek baar thread start ho gya too firr uska nature change nhi kr skte or main thread ko JVM start krta h 
//         System.out.println();
//     }
// }
                         



// class mythread extends Thread
// {
//     public void run()
//     {
//         try
//         {
//            for(int i=1;i<=10;i++)
//          {
//             System.out.println("daemon thread");
//             Thread.sleep(1000);
//          }
//        }
//        catch(InterruptedException ie)
//        {

//        }
//     }
// }
// class test
// {
//     public static void main(String[] args) throws InterruptedException 
//     {
//         mythread mt=new mythread();
//         mt.setDaemon(true);              //jese hiii hm iska nature daemon kr diye too iska kaam kya ho jayega nonn daemon threadd kko support krna too jese hii non daemon ka kaam khatam daemon bhi bnd ho jayega ye pura 10 baar print nhi krayega "daemon thread" kyuki ye daemon or ye sirf non daemon ke according chlta h wo chlega jbv tk chlega wo khatam too ye khatam 
//         mt.start();
//         for(int j=1;j<=5;j++)
//         {
//             System.out.println("mainn thread");
//             Thread.sleep(1000);
//         }    
//     }
// }




                              //Synchronization :-


// class codeplanet
// {
//      synchronized void wish(String name)
//     {
//         for(int i=1;i<=10;i++)
//         {
//              System.out.print("good morning : ");
//           try
//           {
//              Thread.sleep(2000);
//           }
//           catch(InterruptedException ie)
//           {

//           }
//             System.out.println(name);
//         }
//     }
// }
// class mythread extends Thread
// {
//     String name;
//     codeplanet cp;
//     mythread(codeplanet cp ,String name)
//     {
//         this.name=name;
//         this.cp=cp;
//     }
//     public void run()
//     {
//         cp.wish(name);
//     }
// }
// class test
// {
//     public static void main(String[] args) 
//     {
//         codeplanet cp=new codeplanet();                            //yha dono thread mt1 or mt2 codeplanet k object pe ek sath operate krre h too yha result expected nhi hoga race condition hogi isse rokne k liye hm wish method ko synchronized bna re h firr ab hme propr dikhega result  
//         mythread mt1=new mythread(cp,"csd");
//         mythread mt2=new mythread(cp,"cpt");   
//         mt1.start();
//         mt2.start(); 
//     }
// }





// class codeplanet
// {
//        void wish(String name)
//      {
//         for(int i=1;i<=10;i++)
//         {
//              System.out.print("good morning : ");
//           try
//           {
//              Thread.sleep(2000);
//           }
//           catch(InterruptedException ie)
//           {

//           }
//             System.out.println(name);
//         }
//     }
// }
// class mythread extends Thread
// {
//     String name;
//     codeplanet cp;
//     mythread(codeplanet cp ,String name)
//     {
//         this.name=name;
//         this.cp=cp;
//     }
//     public void run()
//     {                                                              //in this case data inconsistency not happen beacuse there are two objects and on each object one thread will be executed
//         cp.wish(name);
//     }                                                               //command prompt pe dekhne se lgega ki inconsistency hori h par aisa h nhi
// }
// class test
// {
//     public static void main(String[] args) 
//     {
//         codeplanet cp=new codeplanet();  
//         codeplanet cp1=new codeplanet();                         
//         mythread mt1=new mythread(cp,"csd");
//         mythread mt2=new mythread(cp1,"cpt");   //ab mt1 orr mt2 alag alag object ko pointr krre h (cp or cp1 wale koo) too ab koi problem nhi h
//         mt1.start();
//         mt2.start(); 
//     }
// }


                     // Synchronized block  :-


// class codeplanet
// {
//       void wish(String name)
//      {
//         for(int i=1;i<=10;i++)
//         System.out.println("welcome to codeplanet");
//         synchronized(this)
//         {
//         for(int i=1;i<=10;i++)
//         {
//              System.out.print("good morning : ");
//           try
//           {
//              Thread.sleep(2000);
//           }
//           catch(InterruptedException ie)
//           {

//           }
//             System.out.println(name);
//         }
//        }
//     }
// }
// class mythread extends Thread
// {
//     String name;
//     codeplanet cp;
//     mythread(codeplanet cp ,String name)
//     {
//         this.name=name;
//         this.cp=cp;
//     }
//     public void run()
//     {
//         cp.wish(name);
//     }
// }
// class test
// {
//     public static void main(String[] args) 
//     {
//         codeplanet cp=new codeplanet();  
//         mythread mt1=new mythread(cp,"csd");
//         mythread mt2=new mythread(cp,"cpt");   
//         mt1.start();
//         mt2.start(); 
//     }
// }



























xx