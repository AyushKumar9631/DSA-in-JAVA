package InBuiltFxns;

public class DynamicStack extends CustomStack{
    public DynamicStack(){
        super();
    }
    public DynamicStack(int size){
        super(size);
    }

    @Override
    public boolean push(int Data) throws Stackexception {
        if(isFull()){
            //create nre arr
            int[] temp= new int[data.length*2];

            //copy elements into new array
            for(int i=0; i<data.length; i++) temp[i]=data[i];
            data=temp;
        }
        return super.push(Data);
    }
}
