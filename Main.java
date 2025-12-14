import java.util.Scanner;
 public class Main 
 {
    public static void main(String []args) 
    {
       System.out.println("Starting a new adventure...\n");
       String command = ""; // stores the user's choices
       //step 1: describe current scenario
       command = getCommand("You have just been offered a free all expenses trip to north korea, do you accept?(y/n)");
       //select path based on user command

       if(command.equals("y")){
         System.out.println("The flight is long, but after 11 hours, you arrive at the pyongyang airport");
        command = getCommand("Your first stop is the Mansu Hill grand monument, do you pay respects to Kim il Sung and Kim Jong Il, Eternal leaders of True Korea?(y/n)");
        if(command.equals("y")){
          System.out.println("You pay respects to the eternal leaders. Did you know Kim il sung could turn pine cones into hand grenades?");
          command = getCommand("Just then, Eternal leader Kim Il-Sung Rises from the grave. This is due to his soul feeling extreme rage of an american imperialist paying honor to him while serving the great satan. Do you surrender, or fight him? (s/f)");
          if(command.equals("s")){
          System.out.println("You are sent to a reeducation camp to understand the awesomeness of the eternal leaders");
          }
          if(command.equals("f")){
            System.out.println("The Eternal Leader one shots you out of existence. Do not disrespect the glorious leader.");
          }
          
        
      
  
          if(command.equals("n")){
            System.out.println("you are sent to a reeducation camp to understand the awesomeness of the eternal leaders");
          }
        }
          else{
            System.out.println("You  have made a mistake, try again");
          }
       }
       else if(command.equals("n")){
         System.out.println("You must have misclicked, try again");
          command = getCommand("You have just been offered a free all expenses trip to north korea, do you accept?(y/n)");
       //select path based on user command

       if(command.equals("y")){
         System.out.println("The flight is long, but after 11 hours, you arrive at the pyongyang airport");
        command = getCommand("Your first stop is the Mansu Hill grand monument, do you pay respects to Kim il Sung and Kim Jong Il, Eternal leaders of True Korea?(y/n)");
        if(command.equals("y")){
          System.out.println("You pay respects to the eternal leaders. Did you know Kim il sung could turn pine cones into hand grenades?");
          command = getCommand("Just then, Eternal leader Kim Il-Sung Rises from the grave. This is due to his soul feeling extreme rage of an american imperialist paying honor to him while serving the great satan. Do you surrender, or fight him? (s/f)");
          if(command.equals("s")){
          System.out.println("You are sent to a reeducation camp to understand the awesomeness of the eternal leaders");
          }
          if(command.equals("f")){
            System.out.println("The Eternal Leader one shots you out of existence. Do not disrespect the glorious leader.");
          }
          
        
      
  
          if(command.equals("n")){
            System.out.println("you are sent to a reeducation camp to understand the awesomeness of the eternal leaders");
          }
        }
          else{
            System.out.println("You  have made a mistake, try again");
          }
       }
       else if(command.equals("n")){
         System.out.println("You must have misclicked, try again");
          command = getCommand("You have just been offered a free all expenses trip to north korea, do you accept?(y/n)");
       }
       else{
         System.out.println("You must have made a mistake, try again");
       }
      
      
       }
       else{
         System.out.println("You must have made a mistake, try again");
       }
      
      
          
    } // END OF MAIN METHOD
    
    /** Method to prompt & process input for the next command
      * @param prompt to display to user, asks for specific input
      * @return user's input command as a lowercase String
    */
    public static String getCommand(String prompt) 
    {
       System.out.println("\n▶︎▶︎▶︎ " + prompt);
       Scanner scan = new Scanner(System.in);
       String command = scan.nextLine().toLowerCase();
       return command;
    } // END OF METHOD
 } // END OF CLASS