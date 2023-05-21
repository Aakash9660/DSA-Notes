

                                       //Selection statement :-
                     //     if,           if-else,                 if-elseif-else                                 


// class test
// {
//     public static void main(String[] args) {
//         System.out.println("start");             //start
//         if(true)
//         {
//             System.out.println("if");           //if
//         }
//         System.out.println("end");              //end
//     }
// }                                   





                              //example
// class test
// {
//     public static void main(String[] args) {
//         System.out.println("start");             //start
//         if(false)
//         {
//             System.out.println("if");           //ab if print nhi hoga kyuki condition false h 
//         }
//         System.out.println("end");              //end
//     }
// }               




                                       //example

// class test
// {
//     public static void main(String[] args)
//     {
//         System.out.println("start");             //start
//         int x=10;
//         if(x==10)
//         {
//             System.out.println("if");            //if
//         }
//         else
//         {
//             System.out.println("else");
//         }
//         System.out.println("end");                //end
//     }
// }   




                                //example

//  class test
// // {
// //     public static void main(String[] args)
// //     {
// //         System.out.println("start");             //start
// //         int x=10;
// //         if(x==20)
// //         {
// //             System.out.println("if");            
// //         }
// //         else
// //         {
// //             System.out.println("else");             //else
// //         }
// //         System.out.println("end");                //end
// //     }
// // } 
 



                                 //example


// class test
// {
//     public static void main(String[] args) 
//     {
//         System.out.println("start");
//         int x=10;
//         if(x==10)
//              int y=20;                                  //yha pr if ka local variable declare krre h r apan ne {} nhi lgaye mtlb ek hii stmt h r firr too ye kbhi kaam nhi aayega isliye error aayega.
//         System.out.println("end");    
//     }
// }                                



                                     //same example


// class test
// {
//     public static void main(String[] args) 
//     {
//         System.out.println("start");
//         int x=10;
//         if(x==10){
//              int y=20;                                  //ab error nhi aayega above reason
//         }                                  
//         System.out.println("end");    
//     }
// }                  



                              // example


// class test
// {
//     public static void main(String[] args) 
//     {
//         int x=Integer.parseInt(args[0]);  
//         if(x==10)
//         System.out.println("ten"); 
//         else if(x==20)
//         System.out.println("twenty");
//         else if(x==30)
//         System.out.println("thirty"); 
//         else
//         System.out.println("invalid");
//     }
//  }  




                                    //ITERATIVE STMT.  :-

                 // for loop     //while loop       //do while loop      //for each loop


// class test
// {
//     public static void main(String[] args) 
 //     {
//         for( int i=1;i<=5;i++)
//         {
//             System.out.println("hello");
//         }    
//     }
// }




                            // for each loop


// class test
// {
//     public static void main(String[] args) 
//     {
//         int arr[]={10,20,30,40};
//         for(int i=0;i<=arr.length;i++)
//         {
//             System.out.println(arr[i]);
//         }    
//     }
// }




                           //example


// class test
// {
//     public static void main(String[] args) 
//     {
//         int arr[]={10,20,30,40};
//         for(int i=1;i<=arr.length;i++)
//         {
//             System.out.println(arr[i-1]);
//         }    
//     }
// }


                                //example


// class test
// {
//     public static void main(String[] args) 
//     {
//         int arr[]={10,20,30,40};
//         for(int i=100;i<=arr.length;i++)
//         {
//             System.out.println(arr[i-100]);
//         }    
//     }
// }



                              //for each loop// IMPORTANT


// class test
// {
//     public static void main(String[] args) 
//     {
//         int arr[]={10,20,30,40};
//         for(int i=100;i<=arr.length;i++)
//         {
//             System.out.println(arr[i-100]);
//         } 
//         for(int ele:arr)
//         {
//             System.out.println(ele);
//         }   
//     }
// }



                               //example


// class test
// {
//     public static void main(String[] args)
//     {
//         int arr[]={10,20,30,40};
//         for(int i=arr.length-1;i>=0;i--)
//         {
//             System.out.println(arr[i]);
//         }    
//     }
// }  



                               // while loop//


// class test
// {
//     public static void main(String[] args) 
//     {
//         int i=1;
//         while(i<=5)                             //isko hm jb use m lete h jb hme pta nhi hota h iteration kitni baar krana h 
//         {                                          
//             System.out.println("hello");         //hm isme sb alag alag dere h initial, condition , increment-decrement,isliye agar hme pta na hoo k klitni condition deni h kitna increment wagarah krana h too ise use lenge.  
//             i++;
//         }    
//     }
// }                           



                                // do while loop//

                              
// class test
// {
//     public static void main(String[] args) 
//     {
//         int i=1;
//         do
//         {
//             System.out.println("hello");
//             i++;
//         }while(i>3);
//         System.out.println("end");    
//     }
// }                               


                                  // TRANSFER STATEMENT//

                       // BREAK                                //CONTINUE

// class test
// {
//     public static void main(String[] args) 
//     {
//         int[] arr={100,150,250,300,500,700};
//         int total=0;
//         for(int i=0;i<arr.length;i++)
//         {                                                // iska sum 2000 h suppose hmare pass itee paise nhi h too hm 400 se upar ka jo bhi item h usse aise chodenge break ka use leke.   
//             if(arr[i]>400)
//             {
//                break;
//             }                                 // condition false hogi jb tk break nhi chlega or true hote hii break chlega or control bhar firr total ho jayega. 
//             total=total+arr[i];
//         }
//         System.out.println(total);              // agar hme kbhi loop ko kisi condition ke base pe rokna hoo too hm break ko use krte h .      
//     }
// }                              

                               //example 


// class test
// {
//     public static void main(String[] args) 
//     {
//         int[] arr={500,150,700,300,100,250};
//         int total=0;
//         for(int i=1;i<arr.length;i++)
//         {
//             if(arr[i]>400)
//             {
//                  break;                     //iss case m total=0 aayega break ki wajah se 
//             }
//             total=total+arr[i];
//         }
//         System.out.println(total);       
//     }
// }                       



// class test
// {
//     public static void main(String[] args) 
//     {
//         int[] arr={500,150,700,300,100,250};
//         int total=0;
//         for(int i=1;i<arr.length;i++)
//         {
//             if(arr[i]>400)
//             {
//                  continue;                     //continue wapis iterartion m bhej deta h isliye agar order aisa hoo too hme continue ko aise use le skte h 
//             }
//             total=total+arr[i];
//         }
//         System.out.println(total);       
//     }
// }                       