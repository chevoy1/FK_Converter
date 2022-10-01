import java.text.DecimalFormat;
import java.util.Scanner;

class FK_Converter {
    double temp;
    DecimalFormat df = new DecimalFormat("#.##");

    double convert_f_to_k(double temp){
        return (temp + 459.67) * 5/9;
    }

    void converter_system(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter temperature you want converted to Kelvin?");
        temp = input.nextDouble();
        System.out.println(temp + " F is " + df.format(convert_f_to_k(temp)) + " Kelvin.");
    }

    void converter_console(){
        System.out.println("Enter temperature you want converted to Kelvin?");
        String in = System.console().readLine();
        System.console().writer().println(in + " F is " + df.format(convert_f_to_k(Double.parseDouble(in)))
                + " Kelvin.");
    }

    void converter_args(String[] args){
        if (args.length == 0) {
            System.console().printf("You forgot put a argument");
        }

        else{
        System.console().writer().println(args[0] + " F is " + df.format(convert_f_to_k(Double.parseDouble(args[0])))
                +" Kelvin.");
        }
    }

    public static void main(String[] args){

        System.out.println("Using args");
        FK_Converter temp = new FK_Converter();
        temp.converter_args(args);

        System.out.println("Using user input");
        temp.converter_console();

        args = null;
    }

}
