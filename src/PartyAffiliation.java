import java.util.Scanner;

public class PartyAffiliation
{
    public static void main(String[] args)
            //class PartyAffiliation
            //main ()
            //    String affiliation
            //    output "Enter your party affiliation (R, D, or I): "
            //    input affiliation
            //    if affiliation == "D" then
            //      output "You get a Democratic Donkey."
            //    else if affiliation == "R" then
            //      output "You get a Republican Elephant."
            //    else if
            //      output "You get an Independent Person."
            //    else
            //      output "You get an Other."
            //   return
            //end class
    {
        Scanner in = new Scanner(System.in);
        String party;

        System.out.print("Enter your party affiliation (D, R, I): ");
        party = in.nextLine();

        if (party.equals("D"))
        {
            System.out.println("You get a Democratic Donkey.");
        }
        else if (party.equals("R"))
        {
            System.out.println("You get a Republican Elephant.");
        }
        else if (party.equals("I"))
        {
            System.out.println("You get an Independent Person.");
        }
        else
        {
            System.out.println("You get an Other.");
        }
    }
}