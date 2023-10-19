
padmavathi muliki <padmavathi.muliki@sasi.ac.in>
Mon, Sep 25, 12:52 PM
to Padmavathi

import java.io.*;
 class Bank {
    int getRateOfInterset ()
    {
        return 0;
    }
}
class SBI extends Bank {
    int getRateOfInterest ()
    {
        return 8;
    }
}
class HDFC extends Bank {
    int getRateOfInterest()
    {
        return 9;
    }
}
class UNIONBank extends Bank {
    int getRateOfInterset()
    {
        return 10;
    }
}
 public class MethodOverRidingDemo {
    public static void main(String args[]) {
        SBI s = new SBI();
        HDFC h = new HDFC();
        UNIONBank u=new UNIONBank();
        System.out.println("SBI rate of interest is"+s.getRateOfInterset());
        System.out.println("HDFC Bank rate of interset is"+h.getRateOfInterset());
        System.out.println("Union Bank rate of Interset is"+u.getRateOfInterset());
    }
}

