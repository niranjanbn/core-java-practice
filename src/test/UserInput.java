package test;
public class UserInput {
    
    public static class TextInput {
        
        String inputString;
        
        public TextInput(){
            inputString = "";
        }
        
        public void add(char c){
            
            inputString = inputString+ c;
            
        }
        
        public String getValue(){
            return inputString;
        }
    }

    public static class NumericInput extends TextInput {
        
        public NumericInput(){
            super();
        }
        
        public void add(char c){
            
            if(Character.isDigit(c))
                inputString = inputString+c;
            
        }
        
    }

    public static void main(String[] args) {
        TextInput input = new NumericInput();
        input.add('1');
        input.add('a');
        input.add('0');
        System.out.println(input.getValue());
    }
}