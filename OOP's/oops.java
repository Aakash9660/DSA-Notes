                                //CONSTRUCTOR//


/*16-07-2022 (constructor) Ex. 1
class student
{
    int rollno ;
    int age ;
    student(int rno, int ag)
    {
        rollno=rno;
        age=ag;
    }
     public static void main(String[] args) 
    {
        student s1=new student(20,46);
        student s2=new student(1,20);
        System.out.println(s1.age);  
    }

} */ 


// 16-07-2022 (constructor) Ex. 2

// class student
// {
//     int rollno;
//     int age;
//     student(int rollno,int age)
//     {
//         rollno=rollno;
//         age=age;
//     }
//     public static void main(String[] args)
//     {
//         student s1=new student(1,20);
//         student s2=new student(2,21);
//         System.out.println(s1.rollno);
//         System.out.println(s1.age);
//         System.out.println(s2.rollno);
//         System.out.println(s2.age);
//     }
// }
// output=0
//        0
//        0
//        0



// 16-07-2022 (constructor) Ex. 3

// class student
// {
//     int rollno;
//     int age;
//     student(int rollno, int age)
//     {
//         this.rollno=rollno;
//         this.age=age;
//     }
//     public static void main(String[] args)
//     {
//         student s1=new student(1,20);
//         student s2=new student(2,22);
//         System.out.println(s1.rollno);
//         System.out.println(s1.age);
//         System.out.println(s2.rollno);
//         System.out.println(s2.age);

//     }
// }
// output= 1
//         20
//         2
//         22


//Default constructor 16-07-2022
// class parent
// {
//     parent()
//     {
//         this (10);
//         System.out.println("parent-no-arg");
//     }
//     parent(int x)
//     {
//                 // yha pr  super(); aajayega        
//         System.out.println("parent-int-arg");
//     }
// }
// class child extends parent
// {
//     child()
//     {
//             //   yha pr super(); aajayega
//         System.out.println("child-no-arg");
//     }
//     child(int x)
//     {
//         this();
//         System.out.println("chid-int-arg");
//     }
//     public static void main(String[] args)
//     {
//         child c=new child(10);
//     }
// }
 
// // output = parent-int-arg
// //          parent-no-arg
// //          child-no-arg
// //          child-int-arg







