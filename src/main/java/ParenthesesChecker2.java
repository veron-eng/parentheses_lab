public class ParenthesesChecker2 {

    private String string;

    public boolean checkParentheses2(String str) {

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                String sub = str.substring(i, str.length());
                for (int j = str.indexOf(i)+1 ; j < sub.length(); j++) {
                    if (str.charAt(j) == ')') {
                        return true;
                    }
                    else if (str.charAt(j) == '(') {
                        String sub2 = str.substring(j, str.length());

                        /*for (int k = str.indexOf(j) + 1; k < sub2.length(); k++) {
                            if (str.charAt(k) == ')') {
                                //return true;
                                //work here
                                String sub3 = str.substring(k, str.length());
                                for (int l = str.indexOf(j) + 1; l < sub3.length(); l++) {
                                    if (str.charAt(l) == ')'){
                                        return true;
                                    }
                                } return true;
                            } return false;
                            //else if (str.charAt(k) == '(') {
                                //return true;
                            }

                         */
                        }
                        return true;
                    }
                }
                //return false;



            } //else if (str.charAt(i) == ')') {
                //return false;

            //}
        return true;

        }}
        //return false;
    //}return true;

    //}}

        /*

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '('){
                String sub = str.substring(i,str.length());
                for(int j =0; i < sub.length();j++){
                    if (str.charAt(i) == ')'){
                        return true;
                }
            } return false;

        } return false;

        }
        return false;
    }

         */



