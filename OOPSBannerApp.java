/**
 *  * OOPSBannerApp UC5 - Render OOPS as Banner using Inline Array Initialization
  * * This use case extends UC4 by defining and populating the String array in a more
   * concise way at the time of declaration using String.join().
    * * @author Developer
     * @version 5.0
      */
      public class OOPSBannerApp {

          public static void main(String[] args) {
                  // Declaring and initializing the array in a single step
                          String[] lines = {
                                      String.join(" ", "  *** ", "  *** ", "****** ", " ***** "),
                                                  String.join(" ", " ** ** ", " ** ** ", " ** ** ", "** ** "),
                                                              String.join(" ", "** ** ", "** ** ", " ** ** ", "** "),
                                                                          String.join(" ", "** ** ", "** ** ", " ****** ", " ***** "),
                                                                                      String.join(" ", "** ** ", "** ** ", " ** ", "     ** "),
                                                                                                  String.join(" ", " ** ** ", " ** ** ", " ** ", "** ** "),
                                                                                                              String.join(" ", "  *** ", "  *** ", " ** ", " ***** ")
                                                                                                                      };

                                                                                                                              // Use a for-each loop to print the banner
                                                                                                                                      for (String line : lines) {
                                                                                                                                                  System.out.println(line);
                                                                                                                                                          }
                                                                                                                                                              }
                                                                                                                                                              }
