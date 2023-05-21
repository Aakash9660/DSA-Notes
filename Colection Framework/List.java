import java.util.ArrayList;
import java.util.Stack;
import java.util.Vector;

                                            // ArrayList :-

// class test
// {
//     public static void main(String[] args) {
//         ArrayList l = new ArrayList();
//         l.add(10);
//         l.add("csd");
//         l.add(20.5);
//         l.add(1,20);
//         System.out.println(l);
//         System.out.println(l.get(2));                                   //  methods of Arraylist 
//         l.set(1, "csd1");                                                  // Arraylist List Interface ka child h too uske method bhi use le skta h 
//         System.out.println(l);
//         l.remove(0);
//         System.out.println(l);
//         System.out.println(l.indexOf("csd"));
//         l.add("csd");
//         System.out.println(l.lastIndexOf("csd"));
//     }
// }





// class test
// {
//     public static void main(String[] args) {
//         ArrayList l = new ArrayList();
//         l.add(10);
//         l.add("csd");
//         l.add(20.5);
//         l.add(null);                             // null insertion is allowed 
//         l.add(1,20);
//         System.out.println(l);
//         ArrayList a= new ArrayList<>();
//         a.add("Apple");
//         a.add("Mango");
//         a.add("Ball");                                        // collectin too sbkla parent h too uski method too sb use le skte h 
//         System.out.println(a);
//         System.out.println(l.addAll(a));       // ye collection wali () h 
//         System.out.println(l.addAll(1, a));           // ye wo arraylist wali () ho gyi agar particular index pe krana h too 
//         System.out.println(l);
//     }
// }





                                 // vector class :-

// class test
// {
//     public static void main(String[] args) 
//     {
//         Vector v =  new Vector<>();
//         System.out.println(v.capacity());              // default capacity 10 hoti h too wo aayegi iss method se 
//         for(int i=1;i<=10;i++)
//         {
//             v.addElement(i);                                 // methods h vector class ki or bhi bhot sari h google se dekh lena samajh aa jayegi
//         }
//         System.out.println(v.capacity());           //ab 10 element h too bhoi 10 hi dikhayega 
//         v.addElement(11);
//         System.out.println(v.capacity());           // 20 capacity aayegi isme new capacity twice hoti h         
//         System.out.println(v);        
//     }
// }



                              // Stack Class :-

// class test
// {
//     public static void main(String [] args)
//     {
//         Stack s = new Stack<>();
//         s.push("A");                        // stack m last in forst out hota h na isliye "A" sbse niche chla gya  to usko nikalne k liye 3 baar pop krna hoga 
//         s.push("B");                         // search () find krti h klii wo object kitni baar pop krne se mill jayega 
//         s.push("C");
//         System.out.println(s);                         
//         System.out.println(s.search("A"));
//         System.out.println(s.search(10));
//         System.out.println(s.pop());
//         System.out.println(s);                                   // pop method sbse top element return krti h or usko remove kr deti h 
//     }
// }


