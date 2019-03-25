package ueb01;

class CharStackImpl implements CharStack {
   StringBuilder sb = new StringBuilder();

   public void push(char c){
        sb.append(c);
    }

    public char pop(){
        int last = sb.length()-1;
        char ch = sb.charAt(last);
        sb.setLength(last);
        return ch;
    }

    public int size(){
        return sb.length();
    }




}
