
package student;


public class School {
    Student s1 = new Student();
    
    public static void main(String[] args) {
        doClassRoom(); 
        doCalGpa();
    }
    
    public static void  doClassRoom(){
        try{
        Student s1 = new Student();
        s1.setName("pang");
        System.out.println("My Name  " + s1.getName());
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
    
    public static void doCalGpa(){
        Student s1 = new Student();
        double score = 89.5;
        s1.setGpa(score);
        System.out.println("My Score  " + s1.getGpa());
    }
}
