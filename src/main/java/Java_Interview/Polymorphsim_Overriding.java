package Java_Interview;

public class Polymorphsim_Overriding {
    public static void main(String[] args) {
        Kurnool place = new Kurnool();
        place.sound();
    }
}

class Kurnool {
    public void sound() {
        System.out.println("Zakeer lives in kurnool");
    }
}

class Hyderabad extends Kurnool {
   @Override
    public void sound() {
        System.out.println("Zakeer hussain works in Hyderabad");
    }
}