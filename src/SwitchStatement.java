public class SwitchStatement {

    public static void main(String args[]){
        String day = "MON";
        switch (day)
        {
            case "MON":
                System.out.println("it is a valid day");
                break;

            case "TUE":
                System.out.println("It is also a valid day");
                break;

            default:
                System.out.println("Invalid case");
        }
    }
}
