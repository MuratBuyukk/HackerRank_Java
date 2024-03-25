package Advanced;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Flower {
    public String whatsYourName(){
        return "I have many names and types.";
    }
}

class Jasmine extends Flower {
    @Override
    public String whatsYourName() {
        return "Jasmine";
    }
}

class Lily extends Flower {
    @Override
    public String whatsYourName() {
        return "Lily";
    }
}

class Region {
    private Flower flower = new Flower();
    Flower yourNationalFlower(){
        return flower;
    }
}

class WestBengal extends Region {
    private Flower flower = new Jasmine();
    @Override
    Flower yourNationalFlower() {
        return flower;
    }
}

class AndhraPradesh extends Region{
    private Flower flower = new Lily();
    @Override
    Flower yourNationalFlower() {
        return flower;
    }
}


public class Java_Covariant_Return_Types {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine().trim();
        Region region = null;
        switch (s) {
            case "WestBengal":
                region = new WestBengal();
                break;
            case "AndhraPradesh":
                region = new AndhraPradesh();
                break;
        }
        Flower flower = region.yourNationalFlower();
        System.out.println(flower.whatsYourName());
    }
}
