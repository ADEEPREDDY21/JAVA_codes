class fibonacci{
    public static void main(String[] args) {
        int n = 5, firstTerm =0, secondTerm=1;
        System.err.println("Fibonacci series till"+n+"terms:");
        for (int i=1;i<=n;i++){
            System.err.println(firstTerm+"");
            int nextTerm=firstTerm+secondTerm;
            firstTerm=secondTerm;
            secondTerm=nextTerm;
        }
    }
}


