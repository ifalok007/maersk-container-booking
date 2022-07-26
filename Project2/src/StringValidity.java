import java.util.Arrays;
import java.util.Stack;

public class StringValidity {
    public static void main(String[] args) {
        //(((((a+[b]))))) valid
             //   (a+b+C)) invalid
             //   (a+b+c] invalid
        String result = checkValid("))((")? "valid": "invalid";
        System.out.println(result);
    }

    static boolean checkValid(String input){
        String[] str = input.split("");
        Stack<String> stack = new Stack<>();
        int par =0;
        int sq =0;
        int cur = 0;
        final String[] openening = {"{","(","["};
        for(String s: str ){
            stack.push(s);
        }
        while(!stack.empty()){
            String s = stack.pop();
            if(Arrays.stream(openening).anyMatch(in -> in.equals(s))){
                if(s.equals("{")){
                    cur++;
                }else if(s.equals("(")){
                    par++;
                } else if(s.equals("[")){
                    sq++;
                }
            }
            else{
                if(s.equals("}")){
                    cur = cur > 0 ? cur-- : -1;
                }else if(s.equals(")")){
                    par = par > 0? par-- : -1;
                } else if(s.equals("]")){
                    sq = sq > 0 ? sq--: -1;
                }
            }
        }
        return cur == 0 && par ==0 && sq==0;
    }
}
