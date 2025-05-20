package Java_Interview;
/*
 * Created a parent class Kurnool
 * Created a child class Hyderabad
 * to return call override created method sound
 * extends the parent class and child class
 * created the parent class obj and child class objext in the main class
 * and override the child class to print in console
 * This method is called overriding
 * */

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