package ex_17_OOPs_Constructor;

public class Lab144_PC_Real {
    public static void main(String[] args)
    {
        person p1 = new person("John",98381838,"xxx");
        person p2 = new person("sanvi",98778338,"zzz");
        System.out.println(p1.name);

        person p3 = new person();
        p3.name = "sushanth";
        System.out.println(p3.name);

        person p4 = new person("LUCKY",823424242);
        System.out.println(p4.phone);

        p1.eat();
        p2.eat();
        p3.eat();
        p4.eat();
    }
}


class person {
    String name;
    long phone;
    String Address;

    person() {

    }

    person(String name_arg, long phone_arg, String address_arg) {
        this.name = name_arg;
      //  this.address = address_arg;
        this.phone = phone_arg;
    }

    person(String name_arg,long phone_arg)
    {
        this.name = name_arg;
        this.phone = phone_arg;

    }
    void eat()
    {
        System.out.println(this.name  + " is eating");
    }
}
