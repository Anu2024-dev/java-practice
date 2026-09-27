package OopsPrac;

public class Inheritance {
    static class Animal{
        String name;
        void eat(){
            System.out.println(name+" "+"eat");
        }
        public Animal(String name){
            this.name=name;
        }
    }
    static class Dog extends Animal{
        public Dog(String name){
           super(name);
        }
       void barks(){
        System.out.println(name+" "+"barking");
        }
    }
    static class Cat extends Animal{
        public Cat(String name){
            super(name);
        }
        public void mews(){
            System.out.println(name+" "+"mews");
        }
    }
    static class Puppy extends Dog{
        public Puppy(String name){
            super(name);
        }
        void play(){
            System.out.println(name+" " +"Puppy Plays");
        }
    }
    public static void main(String[] args) {
        Dog d=new Dog("rocky");
        d.barks();
        d.eat();
        Puppy p=new Puppy("tommy");
        p.eat();
        p.barks();
        p.play();
        Cat c=new Cat("pushy");
        c.eat();
        c.mews();
    }
}
