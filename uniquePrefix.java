import java.util.*;

public class Trie{
    static class Node{
        Node children [] = new Node[26];
        boolean eow = false;

        Node(){
            for(int i=0;i<26;i++){
                children[i]=null;
            }
        }
    }

    public static Node root = new Node();

    public static void insert(String word){//O(L)  -->> L is the length of the largest word
        int level=0;
        int len=word.length();
        int idx=0;
        Node curr = root;  // Node curr initialized with root

        for(;level<len;level++){
            idx = word.charAt(level)-'a';
            if(curr.children[idx]==null){
                curr.children[idx]=new Node();
            }
            curr=curr.children[idx];
        }
        curr.eow=true;
    }

    public static boolean search(String key){ // O(L)
        int level=0;
        int len=key.length();
        int idx=0;

        Node curr = root;  // Node curr initialized with root

        for(;level<len;level++){
            idx = key.charAt(level)-'a';
            if(curr.children[idx]==null){
                return false;
            }
            curr=curr.children[idx];
        }
        return curr.eow==true;
    }
    
    public static int countNodes(Node root){
        if(root==null){
            return 0;
        }
        int count=0;
        for(int i=0;i<26;i++){
            if(root.children[i]!=null){
                count+=countNodes(root.children[i]);
            }
        }
        return count+1;
    }

    public static void main(String args[]){
        String str ="ababa";

            //suffix -> insert in Trie
        for(int i=0;i<str.length();i++){
            String suffix = str.substring(i);
            insert(suffix);
        }
        System.out.println(countNodes(root));
    }
}