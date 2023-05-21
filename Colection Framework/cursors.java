

// Enumeration : --

// import java.util.Enumeration;
// import java.util.Vector;
// class test
// {
//     public static void main(String[] args) 
//     {
//         Vector v = new Vector<>();
//         for(int i=1;i<=10;i++)
//         v.addElement(i);
//         System.out.println(v);
//         Enumeration e = v.elements();
//         while(e.hasMoreElements())
//         {
//             Object o = e.nextElement();
//             Integer i = (Integer) o ;
//             if(i%2==0)
//             System.out.println(i);
//         }
//     }
// }



                            // Iterator :-

// import java.util.ArrayList;
// import java.util.Iterator ;

// class test
// {
//     public static void main(String[] args) 
//     {
//         ArrayList l = new ArrayList<>();
//         for(int i=1;i<=10;i++)
//         l.add(i);
//         System.out.println(l);
//         Iterator i = l.iterator();
//         while(i.hasNext())
//         {
//             // Object o = i.next();
//             // Integer i2 = (Integer) o ;           // isiko niche jese likha h vese bhi likh skte h 
//             Integer i1 = (Integer) i.next();
//             if(i1%2==0)
//             System.out.println(i1);
//             else
//             i.remove();                  // Iterator m remove() bhi hoti h isliye uske reference variable pr call kiya h 
//         }
//         System.out.println(l);              // ab sirf even hii bch gye colllection m 
//     }
// }



                                  //  List Iterator :- 

import java.util.ListIterator;
import java.util.ArrayList;

class test
{
    public static void main(String[] args) 
    {
        ArrayList l = new ArrayList<>();
        for(int i=1;i<=10;i++)
            l.add(i);
        System.out.println(l);   
        ListIterator i = l.listIterator(); 
        while(i.hasNext())
        {
            Integer i1 = (Integer) i.next();
            if(i1%2==0)
                i.remove();
            else if(i1==4)
                i.add(20);
            else if(i1==6)
                i.set(60);
        }
        System.out.println(l);
    }
}

