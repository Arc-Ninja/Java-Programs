import java.lang.*;
import java.io.*;
class node{
    int data;
    node left,right,par;
    node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
        this.par = null;

    }
}
public class BinSearchTree {
    node root = null;
    public void createTree(int data){
        node nn = new node(data);
        if(root == null){
            root = nn;
            return;
        }
        node temp = root;
        node temp1 = temp;
        while(temp!=null){
            temp1 = temp;
            if(nn.data>temp.data){
                temp = temp.right;
            }
            else{
                temp = temp.left;
            }
        }
        temp = nn;
        temp.par = temp1;
        if(temp1.data<temp.data){
            temp1.right = temp;
        }
        else{
            temp1.left = temp;
        }

    }
    public void inorder(node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.printf("%s <-- %d --> %s \n",root.left,root.data,root.right);
        inorder(root.right);
    }
    public void dispTree(){
        inorder(root);
    }
    public static void main(String[] args) {
        BinSearchTree BST = new BinSearchTree();
        int[] data = {34,23,56,98,12,35};
        for (int i : data) {
            BST.createTree(i);
        }
        BST.dispTree();

    }
}
