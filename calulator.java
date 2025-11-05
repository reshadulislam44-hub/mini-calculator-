package practice.gui.final2;

public class calulator {

    String cal;

    calulator(String cal) {
        this.cal = cal;
        
    }
    int first ;
    int second;
    int result;

    void calculation (){

        String [] s ;
        s = cal.split("(?<=[+\\-*/])|(?=[+\\-*/])");

        int first = Integer.parseInt(s[0]);
        int second = Integer.parseInt(s[2]);
//        System.out.println("first = " + first);
//        System.out.println("second = " + second);
//        System.out.println(s[1]);

        if (s[1] .equals("+")){
            System.out.println(first+second);

        }
        else if (s[1].equals("-")){
            System.out.println(first-second);

        }
        else if (s[1].equals("*")){
            System.out.println(first*second);

        }
        else if (s[1].equals("/")){

            System.out.println(first/second);
        }

        else {
            System.out.println("invalid");
        }



            }
        }



