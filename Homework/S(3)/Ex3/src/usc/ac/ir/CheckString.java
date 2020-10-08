package usc.ac.ir;

public class CheckString {
    CheckString(){
        System.out.println("Enter A String :");
    }
    public static void getString(String st)throws Exception {
    int i;

        for (i=0; i<st.length() ; i++ ) {

            if (st.charAt(i) >= '0' && st.charAt(i) <= '9') {
                throw  new Exception("String Includes Numbers .");

            }

        }
        if  (i==st.length()) throw new Exception("string size :"+st.length());
    }
}
