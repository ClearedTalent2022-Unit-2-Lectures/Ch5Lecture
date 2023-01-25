package org.launchcode;

public class Main {

    public static void main(String[] args) {
        // Let's now call the printAffirmation method here
        // and run our code
        // Since at the moment printAffirmation is not a static
        // method, we need to create a new instance of the Methods
        // class before we can call it
//        Methods methods = new Methods();
//        methods.printAffirmation();
        // We just refactored printAffirmation to be a static
        // method, so we no longer need to create an instance
        // of the Methods class before we can use it
        Methods.printAffirmation();
    }
}
