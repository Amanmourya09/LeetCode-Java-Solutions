class Solution {
    public boolean backspaceCompare(String s, String t) {
        int it=t.length()-1;//current character pointer to string t
        int is=s.length()-1;// current character pointer to string s
        int flag=0;
        while(it>=0 || is>=0){//check till both strings are exhausted.
            if(is>=0 && s.charAt(is)=='#'){//Backspace in string s
                flag=1;
                is--;
                while(is>=0 && (flag>0 || s.charAt(is)=='#')){
                    if(s.charAt(is)=='#')//increase number of backspaces
                        flag++;
                    else//its a letter, we have backspaced it so decement flag.
                        flag--;
                    is--;
                }
            }
            if(it>=0 && t.charAt(it)=='#'){//backspace in string t
                flag=1;
                it--;
                while(it>=0 && (flag>0 || t.charAt(it)=='#')){
                    if(t.charAt(it)=='#')//increment backspace
                        flag++;
                    else//as its a letter we can consider that we have backspaced once, so decrement flag.
                        flag--;
                    it--;
                }
            }
            if((it>=0 && is>=0 && s.charAt(is)==t.charAt(it))){// characters match, move to next iteration
                it--;
                is--;
            }
            else if((it>=0 && is>=0 && s.charAt(is)!=t.charAt(it)) ||(it>=0 && is<0) || (it<0 && is>=0))//either theres a letter mismatch or one of the strings has exhausted.
                return false;
        }
        return true;//all characters matched and length is also same
    }
}