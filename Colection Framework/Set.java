

// HashSet : -

// import java.util.HashSet;
// class test
// {
//     public static void main(String[] args) 
//     {
//         HashSet s = new HashSet<>();
//         s.add(10);    
//         s.add("csd");    
//         s.add(null);    
//         s.add(10.5);                         // insertion order not fixed 
//         System.out.println(s); 
//     }
// }



                    // Linked HashSet  :-  

// import java.util.LinkedHashSet;

// class test
// {
//     public static void main(String[] args) 
//     {
//         LinkedHashSet s = new LinkedHashSet<>();
//         s.add(10);    
//         s.add("csd");    
//         s.add(null);    
//         s.add(10.5);                        
//         System.out.println(s);  
//     }
// }



                            // Tree Set Class :--


// import java.util.Comparator;
// import java.util.TreeSet;

// class MyComparator implements Comparator
// {
//     public int compare(Object obj1,Object obj2)
//     {
//         Integer i1 = (Integer) obj1 ;
//         Integer i2 = (Integer) obj2 ;
//         if(i1>i2)
//         return -1 ;
//         else if(i2>i1)
//         return 1 ;
//         else
//         return 0 ;
//     }
// }
// class test 
// {
//     public static void main(String[] args) 
//     {
//         MyComparator c = new MyComparator();
//         TreeSet t = new TreeSet<>(c);
//         t.add(10);    
//         t.add(30);                            // hmne customize krke decsending order kr diya 
//         t.add(5);    
//         t.add(40);    
//         System.out.println(t);
//     }
// }




// import java.util.Comparator;
// import java.util.TreeSet;

// class MyComparator implements Comparator
// {
//     public int compare(Object obj1,Object obj2)
//     {
//         Integer i1 = (Integer) obj1 ;
//         Integer i2 = (Integer) obj2 ;
//         return i1.compareTo(i2);                  // yha too ascending order m aayega result    
//     }                                          // (30,10)   obj1 =30  , obj 2 = 10 too aise chlega  
// }
// class test 
// {
//     public static void main(String[] args) 
//     {
//         MyComparator c = new MyComparator();
//         TreeSet t = new TreeSet<>(c);
//         t.add(10);    
//         t.add(30);                            
//         t.add(5);    
//         t.add(40);    
//         System.out.println(t);
//     }
// }
                        




// import java.util.Comparator;
// import java.util.TreeSet;

// class MyComparator implements Comparator
// {
//     public int compare(Object obj1,Object obj2)
//     {
//         Integer i1 = (Integer) obj1 ;
//         Integer i2 = (Integer) obj2 ;
//         return -i1.compareTo(i2);                   // yha descending order ho jayega kyuki result ka hm opposite krra re h 
//     }                                                // without if else kiye kr diya hmne 
// }
// class test 
// {
//     public static void main(String[] args) 
//     {
//         MyComparator c = new MyComparator();
//         TreeSet t = new TreeSet<>(c);
//         t.add(10);    
//         t.add(30);                            
//         t.add(5);    
//         t.add(40);    
//         System.out.println(t);
//     }
// }







// import java.util.Comparator;
// import java.util.TreeSet;

// class MyComparator implements Comparator
// {
//     public int compare(Object obj1,Object obj2)
//     {
//         Integer i1 = (Integer) obj1 ;
//         Integer i2 = (Integer) obj2 ;                         // aise bhi descending order kr skte h 
//         return i2.compareTo(i1);                 
//     }                                                
// }
// class test 
// {
//     public static void main(String[] args) 
//     {
//         MyComparator c = new MyComparator();
//         TreeSet t = new TreeSet<>(c);
//         t.add(10);    
//         t.add(30);                            
//         t.add(5);    
//         t.add(40);    
//         System.out.println(t);
//     }
// }







// import java.util.Comparator;
// import java.util.TreeSet;

// class MyComparator implements Comparator
// {
//     public int compare(Object obj1,Object obj2)
//     {
//         Integer i1 = (Integer) obj1 ;
//         Integer i2 = (Integer) obj2 ;                         
//         return -i2.compareTo(i1);                                 
//     }                                            // aise kr dege too ascending order m aajayega     
// }                                                  
// class test 
// {
//     public static void main(String[] args) 
//     {
//         MyComparator c = new MyComparator();
//         TreeSet t = new TreeSet<>(c);
//         t.add(10);    
//         t.add(30);                            
//         t.add(5);    
//         t.add(40);    
//         System.out.println(t);
//     }
// }




// import java.util.Comparator;
// import java.util.TreeSet;

// class MyComparator implements Comparator
// {
//     public int compare(Object obj1,Object obj2)
//     {
//         Integer i1 = (Integer) obj1 ;
//         Integer i2 = (Integer) obj2 ;                         
//         return 1 ;                                     // tree set m insertion order preserved nhi rhta na 
//     }                                                // lekin hmne logic lgake aise kr diya fixed
// }                                                      // ye kuch bhi compare kree sbko +ve return krra h 
// class test                                             //mtlb chota koi nhi h sb bde hii h too insertioj order jese dalenge vese aata jayega
// {
//     public static void main(String[] args) 
//     {
//         MyComparator c = new MyComparator();
//         TreeSet t = new TreeSet<>(c);
//         t.add(10);    
//         t.add(30);                            
//         t.add(5);    
//         t.add(40);    
//         System.out.println(t);
//     }
// }





// import java.util.Comparator;
// import java.util.TreeSet;

// class MyComparator implements Comparator
// {
//     public int compare(Object obj1,Object obj2)
//     {
//         Integer i1 = (Integer) obj1 ;
//         Integer i2 = (Integer) obj2 ;                         
//         return -1 ;                                   // hmesha chota hii h phle wala too reverse of insertion order aayega   
//     }                                                  
// }                                                     
// class test                                            
// {
//     public static void main(String[] args) 
//     {
//         MyComparator c = new MyComparator();
//         TreeSet t = new TreeSet<>(c);
//         t.add(10);    
//         t.add(30);                            
//         t.add(5);    
//         t.add(40);    
//         System.out.println(t);
//     }
// }






// import java.util.Comparator;
// import java.util.TreeSet;

// class MyComparator implements Comparator
// {
//     public int compare(Object obj1,Object obj2)
//     {
//         Integer i1 = (Integer) obj1 ;
//         Integer i2 = (Integer) obj2 ;                         
//         return 0 ;                                  // phle 10 aaya firr 30 aayega compare krega +ve aayega pr return 0 krra re h 
//     }                                                  // too mtlb duplicate or duplicate allow nhi h 
// }                                                     // mtlb sb dupicate dikhayega too sirf 10 print hoga   
// class test                                            
// {
//     public static void main(String[] args) 
//     {
//         MyComparator c = new MyComparator();
//         TreeSet t = new TreeSet<>(c);
//         t.add(10);    
//         t.add(30);                            
//         t.add(5);    
//         t.add(40);    
//         System.out.println(t);
//     }
// }






// import java.util.Comparator;
// import java.util.TreeSet;

// class MyComparator implements Comparator
// {
//     public int compare(Object obj1,Object obj2)
//     {
//         String s1 = (String) obj1 ;                               
//         String s2 = (String) obj2 ;        
//         return s1.compareTo(s2);                    // according to natural default sorting order           
//     }                                                   
// }                                                      
// class test                                            
// {
//     public static void main(String[] args) 
//     {
//         MyComparator c = new MyComparator();
//         TreeSet t = new TreeSet<>(c);
//         t.add("code"); 
//         t.add("csd");
//         t.add("csd1"); 
//         t.add("planet"); 
//         System.out.println(t);
//     }
// }





// import java.util.Comparator;
// import java.util.TreeSet;

// class MyComparator implements Comparator
// {
//     public int compare(Object obj1,Object obj2)
//     {
//         String s1 = (String) obj1 ;                               
//         String s2 = (String) obj2 ;        
//         return -s1.compareTo(s2);                    //   reverse in natural default sorting order         
//     }                                                   
// }                                                      
// class test                                            
// {
//     public static void main(String[] args) 
//     {
//         MyComparator c = new MyComparator();
//         TreeSet t = new TreeSet<>(c);
//         t.add("code"); 
//         t.add("csd");
//         t.add("csd1"); 
//         t.add("planet"); 
//         System.out.println(t);
//     }
// }





import java.util.Comparator;
import java.util.TreeSet;

class MyComparator implements Comparator
{
    public int compare(Object obj1,Object obj2)
    {
        StringBuffer sb1 = (StringBuffer) obj1 ;                
        StringBuffer sb2 = (StringBuffer) obj2 ;
        return sb1.compareTo(sb2);                       
    }                                            
}                                                      
class test                                            
{                                                           
    public static void main(String[] args) 
    {
        MyComparator c = new MyComparator();
        TreeSet t = new TreeSet(c);
        t.add(new StringBuffer("aakash")); 
        t.add(new StringBuffer("csd")); 
        t.add(new StringBuffer("csd1")); 
        t.add(new StringBuffer("planet")); 
        System.out.println(t);
    }
}




// import java.util.Comparator;
// import java.util.TreeSet;

// class MyComparator implements Comparator
// {
//     public int compare(Object obj1,Object obj2)
//     {
//         String s1 = obj1.toString();        
//         String s2 = obj2.toString();
//         return s1.compareTo(s2);        
//     }                                                   
// }                                                      
// class test                                            
// {
//     public static void main(String[] args) 
//     {
//         MyComparator c = new MyComparator();
//         TreeSet t = new TreeSet<>(c);
//         t.add(new StringBuffer("aakash")); 
//         t.add(new StringBuffer("csd")); 
//         t.add(new StringBuffer("csd1")); 
//         t.add(new StringBuffer("planet")); 
//         System.out.println(t);
//     }
// }









