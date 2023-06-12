package org.example;

public class InterfaceTest {
    public static void interfaceTest() {
        Tenta[] arr = new Tenta[]{
                new Svara(),
                new Svarar()
        };
        System.out.println(arr[1].answer());
    }
}

interface Tenta {
    String answer();
}

class Svara implements Tenta{
    public String answer(){
        String svar = "Svaret är 42";
        return svar;
    }
}

class Svarar extends Svara{
    public String answer(){
        String crypticSvar = "Svaret finns i snön";
        return crypticSvar;
    }
}