import java.util.List;
public class SimpleArrayList {
    String[] simpleArray;
    int listSize;
    boolean tfArg; //This holds a true or false value of true or false for anything that needs checking
    int nAnswer;
    String sAnswer;
    boolean bAnswer;
    int lastIndex = -1;
    public SimpleArrayList(){
        simpleArray = new String[0];
        int lastIndex = -1;
    }
    public SimpleArrayList(int initialCapacity){
        if(initialCapacity<0){
            throw new IllegalArgumentException("Illegal Capacity: -1");
        } else {
            simpleArray = new String[initialCapacity];
        }
    }
    public SimpleArrayList(List<String> list){
        simpleArray = new String[list.size()];
        System.out.println(simpleArray);
        simpleArray = list.toArray(simpleArray);
        System.out.println(simpleArray);
        lastIndex = simpleArray.length-1;
    }
    public void add(int index, String s){
        if(index<0 || index>lastIndex+1){
            throw new IndexOutOfBoundsException("Index: "+index+", Size: "+String.valueOf(lastIndex+1));
        }
        String[] tempArray = new String[lastIndex+2];
        tempArray[index]=s;
        for(int i=0; i<index; i++){
            tempArray[i] = simpleArray[i];
        }
        for(int i=index; i<=lastIndex; i++){
            tempArray[i+1] = simpleArray[i];
        }
        simpleArray = tempArray;
        lastIndex++;
    }
    public void add(String s){
        String[] tempArray = new String[lastIndex+2];
        for(int i=0; i<=lastIndex; i++){
            tempArray[i]=simpleArray[i];
        }
        tempArray[lastIndex+1]=s;
        simpleArray=tempArray;
        lastIndex++;
    }
    public void clear(){
        simpleArray = new String[0];
        lastIndex = -1;
    }
    public boolean contains(String s){
        int z = indexOf(s);
        if(z<0 || z>lastIndex){
            tfArg = false;
        } else {
            tfArg = true;
        }
        return tfArg;
    }
    public String get(int index){
        if(index<0 || index>lastIndex) {
            throw new IndexOutOfBoundsException("Index "+index+" out of bounds for length "+String.valueOf(lastIndex+1));
        } else {
            return simpleArray[index];
        }
    }
    public int indexOf(String s){
        tfArg = false;
        for(int i=0; i<lastIndex; i++){
            if(simpleArray[i]==s){
                nAnswer = i;
                tfArg = true;
            }
        }
        if(tfArg == false){
            nAnswer = -1;
        }
        return nAnswer;
    }
    public boolean isEmpty(){
        if(lastIndex<0){
            bAnswer = true;
        } else {
            bAnswer = false;
        }
        return bAnswer;
    }
    public boolean remove(String s){
        if(indexOf(s)==-1){
            bAnswer = false;
        } else {
            bAnswer = true;
        }
        int index = indexOf(s);
        for(int i=index+1; i<lastIndex+1; i++){
            simpleArray[i-1] = simpleArray[i];
        }
        //String[] tempArray = new String[lastIndex];
        // for(int i=0; i<lastIndex; i++){
        //    tempArray[i]=simpleArray[i];
        //}
        //simpleArray = tempArray;
        lastIndex--;
        return bAnswer;
    }
    public String remove(int index){
        if(index>lastIndex || index<0){
            throw new IndexOutOfBoundsException("Index "+index+" out of bounds for length " + String.valueOf(lastIndex+1));
        }
        sAnswer = simpleArray[index];
        for(int i=index+1; i<lastIndex+1; i++){
            simpleArray[i-1] = simpleArray[i];
        }
        //String[] tempArray = new String[lastIndex+1];
       // for(int i=0; i<=lastIndex; i++){
       //     tempArray[i]=simpleArray[i];
       // }
        lastIndex--;
        return sAnswer;
    }
    public String set(int index, String s){
        if(index<0 || index>lastIndex){
            throw new IndexOutOfBoundsException("Index "+index+" out of bounds for length " + String.valueOf(lastIndex+1));
        }
        String a = simpleArray[index];
        simpleArray[index]=s;
        return a;
    }
    public int size(){
        return lastIndex+1;
    }
    public void trimToSize(){
        String[] tempArray = new String[lastIndex+1];
        for(int i=0; i<=lastIndex; i++){
            tempArray[i]=simpleArray[i];
        }
        simpleArray = tempArray;
    }
    public String toString(){
        String a = "[";
        for(int i=0; i<=lastIndex; i++){
            a = a + simpleArray[i];
            if(i != lastIndex){
                a = a + ", ";
            }
        }
        a = a + "]";
        return a;
    }
}
