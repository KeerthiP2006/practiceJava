public class Multi{
    /*
    1)add method
    2)printouy the value of that method
    */
    public void add(int x,int y){
        int z=x+y;//
        System.out.println(z);
    }
    public static void main(String args[]){
        int x=55;
        int y=45;
        Multi obj=new Multi();
        obj.add(x,y);
    }
}