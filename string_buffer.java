public class string_buffer {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("Hello");
        sb.append(" "+"World");
        System.out.println("After append:"+sb);
        sb.insert(6,"JAVA");
        System.out.println("After insert:"+sb);
        sb.replace(6,10,"Beautiful");
        System.out.println("After Replace:"+sb);
        sb.delete(6,15);
        System.out.println("After delete:"+sb);
        sb.reverse();
        System.out.println("After Reverese:"+sb);
        System.out.println("Buffer capacity:"+sb.capacity());
        sb.setLength(5);
        System.out.println("After setting length:"+sb);

    }
    
}
