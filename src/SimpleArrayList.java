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
            throw new IllegalArgumentException("Illegal Capacity: "+ initialCapacity);
        } else {
            simpleArray = new String[initialCapacity];
        }
        int lastIndex = -1;
    }
    public SimpleArrayList(List<String> list){
        listSize = list.size();
        simpleArray = new String[listSize];
        simpleArray = list.toArray(simpleArray);
        int lastIndex = listSize - 1;
    }
    public void add(int index, String s){

    }
    public void add(String s){
        String[] tempArray = new String[lastIndex+1];
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
            throw new IndexOutOfBoundsException("Index is out of bounds for this array.");
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
            bAnswer = true;
        }
        return bAnswer;
    }
    public String remove(int index){
        if(index>lastIndex || index<0){
            throw new IndexOutOfBoundsException("Index is out of bounds for this array");
        }
        sAnswer = simpleArray[index];
        for(int i=index; i<lastIndex; i++){
            simpleArray[index] = simpleArray[i+1];
        }
        lastIndex--;
        String[] tempArray = new String[lastIndex];
        for(int i=0; i<=lastIndex; i++){
            tempArray[i]=simpleArray[i];
        }
        return sAnswer;
    }
    public boolean remove(String s){
        if(indexOf(s)<0){
            bAnswer = false;
        } else {
            bAnswer = true;
        }
        int z = indexOf(s);
        for(int i=z; i<lastIndex; i++){
            simpleArray[z] = simpleArray[i+1];
        }
        lastIndex--;
        String[] tempArray = new String[lastIndex];
        for(int i=0; i<=lastIndex; i++){
            tempArray[i]=simpleArray[i];
        }
        return bAnswer;
    }
    public String set(int index, String s){
        if(index<0 || index>lastIndex){
            throw new IndexOutOfBoundsException("Index is out of bounds for this array");
        }
    }
    public int size(){

    }
    public void trimToSize(){

    }
    public String toString(){

    }
}
