public class Multiple{
    public void cross(int x,int y){
        int z=x*y;
        System.out.println(z);
    }
    public static void main(String args[]){
        int x=38;
        int y=5;
        Multiple obj=new Multiple();
        obj.cross(x,y);

    }
}