class Student implements Cloneable{
    int id;
    String name;
    Student(int id, String name){
        this.id = id;
        this.name = name;
    }
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}

public class icloneableprac {
    public static void main(String[] args) {
        try{
            Student s1 = new Student(41120025, "Archi Shaw");
            Student s2 = (Student)s1.clone();
            System.out.println("Orignal: "+ s1.id +' '+s1.name);
            System.out.println("Clone: "+ s2.id+" "+ s2.name);
        }
        catch(Exception e){
            System.out.println("Error: "+e);
        }
    }    
}
