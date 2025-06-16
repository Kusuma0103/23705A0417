class Main {
    public static void main(String[] args) {
        System.out.println(nPowerX(5,5));
    }

    public static int nPowerX(int n,int x){
         if(x+1==1){
            return 1 ;
        }
        int val = n*nPowerX(n,x-1);
        return val;
        
    }
}