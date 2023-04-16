public class HelloWorld

// Always class name should start with a capital letter which is a convention

// public is used for accessing class from any program..
{
    public static void main(String[] args) {

        // public -  public is specified because the contents should be shown to those who are accessing the class

        // static - static is used to run the main function without creating the instance of class HelloWorld

        // static variables does not depend on the objects


       


        //now we will see abt args, args are nothing but the arguements while execution

        //example

        System.out.println(args[0]);

        // while execution that for example $java HelloWorld.java 0001

        // as we know array index starts from zero 

        // it selects the 0Th argument 

        // let us see another example to dive deep

        System.out.println(args[2]);

        // execution command $java HelloWorld.java 001 002 003 004

        //and the output for the args[2] will be '003'

        //which is the 2 nd index of the argument

        System.out.println("Hello world !");

        //as name suggests System which starts with capital letter is a class 

        // out says to output

        // out is a type of printStream used for outputing different dataTypes

        //println is also a type of printstream

        //println is a function in System class that prints whatever inside it

        //print can be used insted og println when it should be executed in the same line
        }

}

