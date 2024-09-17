import java.util.*; 
class Student { } 
class Lab775{ 
public static void main(String as[]){ 
List<String> mylist1 = new ArrayList<String>(); //1A 
List<String> mylist1 = new ArrayList<>(); //1B 
List<Integer> mylist2 = new ArrayList<>(Integer); //2A 
List<Integer> mylist2 = new ArrayList<>(); //2B 
List<List<String>> mylist3= new ArrayList<List<String>>(); //3A 
List<List<String>> mylist3= new ArrayList<>(); //3B 
List<List<List<String>>> mylist4= new ArrayList<List<List<String>>>(); //3A 
List<List<List<String>>> mylist4= new ArrayList<>(); //3B 
List<Student> mylist5 = new ArrayList<>(); //4B 
Map<String,List<Student>> mymap 1= new TreeMap<>(); //4B 
Map<String, Map<String,List<Student>>> mymap2= new HashMap<>();//4B 
} 
}