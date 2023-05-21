// import in.co.codeplanet.modifiers.calculator;
// class test1                                           //ye public wale ka example h hm pacakge calculator m likh re h or usko use yha import krke krre h
// {
//     public static void main(String[] args) 
//     {                                          //compile (javac modifier.java)
//         calculator c=new calculator();         //run (java test1)
//         c.add(10,20);                   //output 30;
//     }
// }

                         // <default> modifier

// import in.co.codeplanet.modifiers.calculator;          //yhi compile error aajayegi kyuki calculator kese nikalega wo public nhi h 
// class test1                                           
// {
//     public static void main(String[] args) 
//     {                                          //compile (javac modifier.java)
//         calculator c=new calculator();        //run (java test1)
//         c.add(10,20);                   
//     }
// }


                           // protected Modifier  :-

// import in.co.codeplanet.modifiers.calculator;          
// class test1                                        // abhi too error aayegi kyuki test1 child honi chahiye calcultor ki      
// {                                                  //kyuki hm protected ko access krre h  non child class of different package 
//     public static void main(String[] args) 
//     {                                          
//         calculator c=new calculator();           // protected same package m too kese hi ho skta h child, non-child 
//         c.add(10,20);                             //pr outside of package access krna h too class ko child hona pdega
//     }
// }



// import in.co.codeplanet.modifiers.calculator;          
// class test1 extends calculator                                              
// {                                             
//     public static void main(String[] args) 
//     {                                          
//         calculator c=new calculator();       //abhi bhi error aayegi kyuki bhar k package m hmne child to bna diya pr
//         c.add(10,20);                   //reference variable too parent ka h 
//     }                                        // isme hm protected ko outside package child bna ke access kr too skte h pr reference variable child ka hona compulsory h 
// }

        //same package m tooo koi problem nii h reference variable kisi ka bhi ho or child ho na hoo 

// import in.co.codeplanet.modifiers.calculator;          
// class test1 extends calculator                                              
// {                                             
//     public static void main(String[] args) 
//     {                                          
//         test1 c=new test1();       
//         c.add(10,20);                    //ye okk h kyuki reference variable child ka h 
//     }                                        
// }

