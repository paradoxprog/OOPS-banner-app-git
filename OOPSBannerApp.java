/**
 *  * OOPSBannerApp UC4 - Render OOPS as Banner using String Array and Loop
  * * This use case improves upon UC3 by using a String array to store banner lines
   * and iterating through them with a for-each loop, eliminating hardcoded print 
    * statements and improving modularity and reusability.
     * * @author Developer
      * @version 4.0
       */
       public class OOPSBannerApp {

           public static void main(String[] args) {
                   // Step 1: Define a String array with a size equal to the number of lines (7)
                           String[] lines = new String[7];

                                   // Step 2: Populate each index of the array using String.join()
                                           // Maintaining 7-line format and 9-character width for O, O, P, S
                                                   lines[0] = String.join(" ", "  *** ", "  *** ", "****** ", " ***** ");
                                                           lines[1] = String.join(" ", " ** ** ", " ** ** ", " ** ** ", "** ** ");
                                                                   lines[2] = String.join(" ", "** ** ", "** ** ", " ** ** ", "** ");
                                                                           lines[3] = String.join(" ", "** ** ", "** ** ", " ****** ", " ***** ");
                                                                                   lines[4] = String.join(" ", "** ** ", "** ** ", " ** ", "     ** ");
                                                                                           lines[5] = String.join(" ", " ** ** ", " ** ** ", " ** ", "** ** ");
                                                                                                   lines[6] = String.join(" ", "  *** ", "  *** ", " ** ", " ***** ");

                                                                                                           // Step 3: Use an enhanced for-loop to iterate and print each line
                                                                                                                   for (String line : lines) {
                                                                                                                               System.out.println(line);
                                                                                                                                       }
                                                                                                                                           }
                                                                                                                                           }

