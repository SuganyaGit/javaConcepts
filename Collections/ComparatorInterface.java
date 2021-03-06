/*
Comparable provides single sorting sequence.sort the collection on the basis of single element such as id 
Comparator provides multiple sorting sequence

Comparable affects the original class
Comparator doesn't affect the original class i.e. actual class is not modified.

Comparable provides compareTo() method to sort elements.
Comparator provides compare() method to sort elements.

Comparable is found in java.lang package.
Comparator is found in java.util package.

sort the list elements of Comparable type by Collections.sort(List) method.
sort the list elements of Comparator type by Collections.sort(List,Comparator) method.

*/
import java.util.*;  
import java.io.*;
  
class Student{  
int rollno;  
String name;  
int age;  
Student(int rollno,String name,int age){  
this.rollno=rollno;  
this.name=name;  
this.age=age;  
}  
}  
class NameComparator implements Comparator{  

public int compare(Object o1,Object o2){  
Student s1=(Student)o1;  
Student s2=(Student)o2;  
  
return s1.name.compareTo(s2.name);  
}  
}

class AgeComparator implements Comparator{ 

public int compare(Object o1,Object o2){  
Student s1=(Student)o1;  
Student s2=(Student)o2;  
  
if(s1.age==s2.age)  
return 0;  
else if(s1.age>s2.age)  
return 1;  
else  
return -1;  
}  
}

class ComparatorInterface{  
public static void main(String args[]){  
  
ArrayList al=new ArrayList();  
al.add(new Student(1,"Vinod",25));  
al.add(new Student(5,"Sanjay",28));  
al.add(new Student(4,"Arya",22));  
  
System.out.println("Sorting by Name...");  
  
Collections.sort(al,new NameComparator());  
Iterator itr=al.iterator();  
while(itr.hasNext()){  
Student st=(Student)itr.next();  
System.out.println(st.rollno+" "+st.name+" "+st.age);  
}  
  
System.out.println("sorting by age...");  
  
Collections.sort(al,new AgeComparator());  
Iterator itr2=al.iterator();  
while(itr2.hasNext()){  
Student st=(Student)itr2.next();  
System.out.println(st.rollno+" "+st.name+" "+st.age);  
}  
  
  
}  
}  
