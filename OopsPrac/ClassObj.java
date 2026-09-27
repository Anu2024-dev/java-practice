package OopsPrac;

public class ClassObj {
     static class Students{
        String name;
        int age;

        public Students(String name,int age) {
            this.name=name;
            this.age=age;
        }
        public Students(String name){
            this.name=name;
            age=5;
        }
        Students(){
            name="unknown";
            age=0;
        }
        void display(){
            System.out.println(name);
            System.out.println(age);
        }
        
    }
    public static void main(String[] args) {
        Students s1=new Students("chetana",22);
        s1.display();
        Students s2=new Students();
        s2.display();
        Students s3=new Students("chetana");
        s3.display();
    }

}
