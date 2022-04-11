public class Comments {

    // Copyright (C) 2022 by CleanCode.
    // Released under the terms of the GNU General Public License version 2 or later.


    // this method delivers owner of testcase
    public Owner getTestcaseOwner(Testcase testcase){}; 


    // returns hours in month
    public Hours getHoursInQuarter(){}; 


    //public void checkXMLParser(){
    //   // some business logic here
    //}

    // TODO Este métod deve ser removido
    public void check(){
        return;
    }


    // 3. Too much information
    /*
     * This class evaluates the overview of testcases which are cancelled from client
     * the reasons of cancellation play a role in evaluation blablabla
     */


    /**
     * <p> this method publishes results based on date
     * </p>
     * @param date date from when results should be published
     * @return List of Result entities
     * @since 16.0
     */
    public List<Result> publishResults(Date date) {
        // some business logic here
    }
}