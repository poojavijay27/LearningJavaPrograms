package ex_21_OOPs_AccessModifer;

public class Lab162
{

}

class Mother
{
    private int gold = 10;
    protected int bhk3 = 10;
    int car = 1;
}

class son extends Mother
{

    void getGold()
    {
//        System.out.println(gold);
        System.out.println(bhk3);
    }
}
