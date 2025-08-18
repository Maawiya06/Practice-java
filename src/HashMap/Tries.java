package HashMap;

public class Tries {

    // Node creations
    Character val;
    Tries[] children = new Tries[26];
    boolean isTerminal;

    // constructor with character
    Tries(Character val){
        this.val = val;
        for(int i = 0; i < 26; i++){
            children[i] = null;
        }
        this.isTerminal = false;
    }

    // default constructor (for root)
    Tries(){
        this.val = null;
        for(int i = 0; i < 26; i++){
            children[i] = null;
        }
        this.isTerminal = false;
    }

    // insertion
    static void insertWord(Tries root, String word){
        System.out.println("received word " + word + " For insertion");

        // base case
        if(word.length() == 0){
            root.isTerminal = true;
            return;
        }

        char ch = Character.toLowerCase(word.charAt(0));
        int index = ch - 'a';
        Tries child;

        if(root.children[index] != null){
            // present
            child = root.children[index];
        }
        else{
            child = new Tries(ch);
            root.children[index] = child;
        }

        // recursion
        insertWord(child, word.substring(1));
    }

    // Serching in tries
    static boolean SearchWord(Tries root, String word){
        // base case
        if(word.length() == 0){
            return root.isTerminal;
        }

        char ch = Character.toLowerCase(word.charAt(0));
        int index = ch - 'a';
        Tries child;

        if(root.children[index] != null){
            // present
            child = root.children[index];
        }
        else{
            // not found
            return false;
        }

        //recursion
        boolean recursionkaAns = SearchWord(child, word.substring(1));
        return recursionkaAns;
    }


    static void deletion(Tries root, String word){

        // base case
        if(word.length() == 0){
            root.isTerminal = false;
            return;
        }

        char ch = Character.toLowerCase(word.charAt(0));
        int index = ch - 'a';
        Tries child;

        if(root.children[index] != null){
            //present
            child = root.children[index];
        }
        else{
            return;
        }
        //resursion
        deletion(child, word.substring(1));
    }
    public static void main(String args[]){
        Tries root = new Tries('-');

        //root.insertWord(root, "Donation");

        insertWord(root, "cater");
        insertWord(root, "care");
        insertWord(root, "com");
        insertWord(root, "lover");
        insertWord(root, "loved");
        insertWord(root, "load");
        insertWord(root, "lov");
        insertWord(root, "bat");
        insertWord(root, "cat");
        insertWord(root, "car");

        System.out.println("Insertion Done");

        // call search function
        if(SearchWord(root, "loved")){
            System.out.println("Found");
        }
        else{
            System.out.println("Not Found");
        }

        // call deletion
        deletion(root, "loved");

        if(SearchWord(root, "loved")){
            System.out.println("Found");
        }
        else{
            System.out.println("Not Found");
        }
        // no return needed
    }
}
