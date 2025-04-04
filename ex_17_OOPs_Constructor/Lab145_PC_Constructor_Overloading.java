package ex_17_OOPs_Constructor;

public class Lab145_PC_Constructor_Overloading {
    public static void main(String[] args)
    {
        person p1 = new person("AMIT",97654321,"abc");
        person p2 = new person("PRAMOD",98989898,"XYZ");

        person p3  = new person();
        p3.name = "Shikha";
        System.out.println(p3.name);

        person p4 = new person("LUCKY",823424242);
        System.out.println(p4.Address);


        p1.eat();
        p2.eat();
        p3.eat();
        p4.eat();
    }
}


class Person1{

    String name;
    long phone;
    String address;

    Person1(){

    }

    Person1(String name_arg,long phone_arg, String address_arg){
        this.name = name_arg;
        this.address = address_arg;
        this.phone = phone_arg;

    }

    Person1(String name_arg,long phone_arg){
        this.name = name_arg;
        this.phone = phone_arg;

    }

    void eat(){
        System.out.println(this.name + " is eating!");
    }


}

