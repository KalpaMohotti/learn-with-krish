package Chain_of;


import javax.swing.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Test{
    public static void main(String[] args) {
        Name n = new Name();
        Mobile m = new Mobile();
        Password p=new Password();
        Email e=new Email();
        n.setNext(m);
        m.setNext(p);
        p.setNext(e);

        Userdata u = new Userdata("Kalpa", "0750912018", "asQWWfs@fae3s", "kalpa@gmail.com", "Sri Lanka");
        n.process(u);
    }
}


class Userdata {

    String name;
    String mobile;
    String password;
    String email;
    String country;

    public Userdata(String name, String mobile, String password, String email, String country) {
        this.name = name;
        this.mobile = mobile;
        this.password = password;
        this.email = email;
        this.country = country;
    }

}

abstract class Validation {

    protected Validation v;

    public void setNext(Validation v) {
        this.v = v;
    }

    public abstract void process(Userdata u);
}

class Name extends Validation {

    @Override
    public void process(Userdata u) {
        String name = u.name;
        if (name.equals("")) {
            System.out.println("Name is Blank");
            JOptionPane.showMessageDialog(null, "Please enter your name");
        } else {
            System.out.println("Name is Fill");
            this.v.process(u);
        }

    }

}

class Mobile extends Validation {

    @Override
    public void process(Userdata u) {
        String mobile = u.mobile;
        if (mobile.equals("")) {
            System.out.println("Error with mobile number");
            JOptionPane.showMessageDialog(null, "Enter your mobile number");
        } else {
            if (mobile.length() == 10) {
                System.out.println("Mobile number is OK");
                this.v.process(u);
            } else {
                System.out.println("Mobile numbers count is with error");
                JOptionPane.showMessageDialog(null, "Your mobile number invalid. please enter correct mobile number.");
            }
        }

    }
}

class Password extends Validation {

    @Override
    public void process(Userdata u) {
        String password = u.password;
        String regex = "^(?=.*[0-9])"
                + "(?=.*[a-z])(?=.*[A-Z])"
                + "(?=.*[@#$%^&+=])"
                + "(?=\\S+$).{8,20}$";

        // Compile the ReGex
        Pattern p = Pattern.compile(regex);

        // If the password is empty
        // return false
        if (password == null) {
            System.out.println("Password is null");
        }

        Matcher m = p.matcher(password);

        if (m.matches()) {
            System.out.println("Password ok");
            this.v.process(u);
        } else {
            System.out.println("Password error");
            JOptionPane.showMessageDialog(null, "Please enter valid password");
        }
    }

}
class Email extends Validation{

    @Override
    public void process(Userdata u) {
        String email=u.email;
        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        if(matcher.matches()){
            System.out.println("Email valid");
            JOptionPane.showMessageDialog(null, "Signup Success \n"
                    + "Name :"+u.name+"\n"
                    + "Mobile :"+u.mobile+"\n"
                    + "Password :"+u.password+"\n"
                    + "Email :"+u.email+"\n"
                    + "Country :"+u.country+"\n");
        }else{
            System.out.println("Email Invalid");
            JOptionPane.showMessageDialog(null, "Your email invalid. Please enter correct email");
        }
    }

}
