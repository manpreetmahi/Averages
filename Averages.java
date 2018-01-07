public class Averages
{
 public static void main (String args [])
 {
 new Averages ();
 }
 public Averages ()
 {
   System.out.println("  .d888888                                                                ");
   System.out.println("d8'    88                                                                 ");
   System.out.println("88aaaaa88a dP   .dP .d8888b. 88d888b. .d8888b. .d8888b. .d8888b. .d8888b. ");
   System.out.println("88     88  88   d8' 88ooood8 88'  `88 88'  `88 88'  `88 88ooood8 Y8ooooo. ");
   System.out.println("88     88  88 .88'  88.  ... 88       88.  .88 88.  .88 88.  ...       88 ");
   System.out.println("88     88  8888P'   `88888P' dP       `88888P8 `8888P88 `88888P' `88888P' ");
   System.out.println("                                                    .88                   ");
   System.out.println("                                                d8888P                    ");

 int mark1 = IBIO.inputInt ("Enter student 1's mark average");
 int mark2 = IBIO.inputInt ("Enter student 2's mark average");
 int mark3 = IBIO.inputInt ("Enter student 3's mark average");
 int mark4 = IBIO.inputInt ("Enter student 4's mark average");
 int mark5 = IBIO.inputInt ("Enter student 5's mark average");
 int mark6 = IBIO.inputInt ("Enter student 6's mark average");
 int average = (mark1+mark2+mark3+mark4+mark5+mark6);
 double total = (average/6.0);
 System.out.println ("There are 6 in the class. The average mark was "+(total)+"%1");
 }
}