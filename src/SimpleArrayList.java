import java.util.List;
public class SimpleArrayList {
    String[] simpleArray;
    int listSize;
    boolean tfArg; //This holds a true or false value of true or false for anything that needs checking
    int nAnswer;
    String sAnswer;
    int lastIndex = -1;
    public SimpleArrayList(){
        simpleArray = new String[0];
    }
    public SimpleArrayList(int initialCapacity){
        if(initialCapacity<0){
            throw new IllegalArgumentException("Illegal Capacity: "+ initialCapacity);
        } else {
            simpleArray = new String[initialCapacity];
        }
    }
    public SimpleArrayList(List<String> list){
        listSize = list.size();
        simpleArray = new String[listSize];
        simpleArray = list.toArray(simpleArray);
        lastIndex = listSize - 1;
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

    }
    public String remove(int index){

    }
    public boolean remove(String s){

    }
    public String set(int index, String s){

    }
    public int size(){

    }
    public void trimToSize(){

    }
    public String toString(){

    }
}
