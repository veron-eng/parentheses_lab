public class checkParentheses {


    public boolean checkParentheses(String str) {

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                //second loop
                String sub = str.substring(i, str.length());
                for (int j = str.indexOf(i)+1; j < sub.length(); j++) {
                    if (str.charAt(j) == ')') {

                        return true;
                    } else if (str.charAt(j) == '(') {
                        //third loop
                        String sub2 = str.substring(j, str.length());
                        for (int k = str.indexOf(j) + 1; k < sub2.length(); k++){
                            if (str.charAt(k) == ')') {
                                // need another loop lol
                                String sub3 = str.substring(k, str.length());
                                for (int l = str.indexOf(k) + 1; l < sub3.length(); l++){
                                    if (str.charAt(l) == '(') {
                                        return false;
                                    } else if (str.charAt(l) == ')'){
                                        return true;
                                    }

                                }
                                //return false;

                            }

                        } //return false;
                    }

                }
            } return false;

        } return true;


    }



}



