
public class Main {
      public static void main(String args[]){
    	  Stack stack = new Stack(10);
    	  String expression = "1+2+6-7*(8-9)";
    	  int i = 0, index = 0;
    	  while(i < expression.length()){
    		  if(expression.charAt(i) == '('){
    			  stack.push(expression.charAt(i));
    			  index ++;
    	  } else if(expression.charAt(i) == ')'){
    		  stack.pop();
    		  index --;
    	  }
    		  i++;
      }
    	  if(stack.isEmpty() && index == 0){
    		  System.out.println("valid expression");
    	  }
    	  else{
    		  System.out.println("invalid expression");
    	  }
   }
}
