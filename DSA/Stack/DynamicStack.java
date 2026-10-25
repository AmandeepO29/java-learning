package myJava.Stack;

public class DynamicStack extends CustomStack{
    public DynamicStack() {
        super(); // it will call the constructor in parent class that doesn't take any argument i.e CustomStack()
    }

    public DynamicStack(int size) {
        super(size); // it will call CustomStack(int size)
    }

    @Override
    public boolean push(int item) {
        if(this.isFull()){
            // double the array size
            int[] temp=new int[data.length*2];
            //copy all previous data in new array
            for(int i=0;i<data.length;i++){
                temp[i]=data[i];
            }
            data=temp;
        }
        // now insert the item..
        return super.push(item);
    }
}
