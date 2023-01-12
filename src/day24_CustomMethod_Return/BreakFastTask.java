package day24_CustomMethod_Return;

public class BreakFastTask {
    public static void main(String[] args) {


initialsOfPerson("rejna","agbal");

domain("rejnagbal@yahoo.com");


        System.out.println("--------------------");

        String [] emails= {"hssjxsa@gmail.com","wksdh@yahoo.com","qpwlid@cydeo.com","skjqgd@amazon.com","kajgs@icloud.com"};
        for (String email : emails) {

            domain(email);

        }

        System.out.println("----------------------------");

        nameOfTheMonth(8);

        System.out.println("-------------------");

        daysInMonth(5);




    }


    // dipslay the initials(first name)of the person

    public static void initialsOfPerson(String firstName,String lastName){

        String initial = firstName.charAt(0)+ "."+lastName.charAt(0);
        initial = initial.toUpperCase();
        System.out.println("Initial = "+ initial);


    }

// creat display the domain of the mail   domain()--String


    public static void domain(String email){

        String domain = email.substring(email.indexOf("@")+1,email.lastIndexOf("."));

        System.out.println("domain= "+ domain);

    }


    // can display the name of the month based on thr givrn number


    public static void nameOfTheMonth(int numberOftheMonth){

        String name = "";

        if(numberOftheMonth>=1 && numberOftheMonth<=12){

         name = (numberOftheMonth ==1)?"January":(numberOftheMonth==6)?"June":(numberOftheMonth == 7)?"July":(numberOftheMonth == 8)?
         "August":(numberOftheMonth == 9)?"September":(numberOftheMonth ==10)?"October":(numberOftheMonth==11)?
         "November":"December";
        }else{
            name = "Invalid";
        }

        System.out.println("Name of the month is :" + name);
    }

 // can print how many days a month has


    public static void daysInMonth(int numberOftheday){

        String name = "";

        if(numberOftheday>=1 && numberOftheday<=7){

            name = (numberOftheday==1)?"Monday":(numberOftheday==2)?"Teusday"
                    :(numberOftheday==3)?"Wednsday":(numberOftheday==4)?"Thursday":
                    (numberOftheday==5)?"Friday":(numberOftheday==6)?"Sunday":"Saturday";

        }else{
            System.out.println("Invalid.");}

        System.out.println("Today is :" + name);


    }


}
