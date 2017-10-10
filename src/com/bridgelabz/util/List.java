package com.bridgelabz.util;


import java.util.Scanner;

/**
 *
 * @author Shritej
 */
class NodeList<E>{
    public E data;
    public NodeList link;
    NodeList() {
        //data=0;
        link=null;
    }
    NodeList(E value,NodeList link) {
        data=value;
        this.link=link;
    }
}
public class List<E>{
    NodeList start;
    NodeList end;
    public int size;

    public List() {
        start=null;
        size=0;
    }
    public boolean search(E value) {
    	NodeList traverse=start;
    	int position=0;
    	if(start==null) {
    		System.out.print("empty list");
    		return false;
    	}
    	if(start.data.equals(value)) {
    		
    		deletByPosition(position);
    		return true;
    	}
    	traverse=traverse.link;
    	while((traverse.link!=null)) {
    		position++;
    		if(traverse.data.equals(value))
    		{	deletByPosition(position);
    			return true;
    		}
    		traverse=traverse.link;
    		
    	}
    	if(traverse.data.equals(value)) {
    		position++;
    		deletByPosition(position);
    		return true;
    	}
    	return false;
    }
    
    public void insertAtFirst(E value) {
        NodeList ptr=new NodeList(value,null);
        size++;
        if(start==null) {
            start=ptr;
            
        }
        else {
            ptr.link=start;
            start=ptr;
        }
        
    }
    public void display() {
        System.out.println("linked list");
        NodeList nptr=start;
        if(size==0) {
            System.out.println("empty");
            return;
        }
        if(start.link==null) {
            System.out.print(start.data+" ->");
            return;
        }
        System.out.print(start.data+" -> ");
        nptr=nptr.link;
        while(nptr.link!=null) {
            System.out.print(nptr.data+" -> ");
            nptr=nptr.link;
        }
        System.out.print(nptr.data+" \n");
    }
    public void insertAtEnd(E value) {
        NodeList nnptr=new NodeList(value,null);
        size++;
        if(start==null) {
            start=nnptr;
            return;
        }
        else {
            NodeList travel=start;
            //travel=travel.link;
            while(travel.link!=null) {
                travel=travel.link;
            }
            
            travel.link=nnptr;
        }
    }
    public void deleteAtFirst() {
    	if(start==null) {
    		System.out.println("empty list");
    		return;
    	}
        start=start.link;
        size--;
        return;
    }
    public void deleteAtEnd() {
    	if(start==null) {
    		System.out.println("empty list");
    		return;
    	}
        NodeList delete=start;
        while(delete.link!=null) {
            end=delete;
            delete=delete.link;
        }
        size--;
        end.link=null;
    }
    public void deletByPosition(int pos) {
        
        if(pos==0) {
            deleteAtFirst();
           
            return;
        }
        if(pos==size) {
            deleteAtEnd();
            return;
        }
        NodeList deletePos=start;
       
        for (int j = 1; j <= size; j++) {
            
            if(j==pos) {
                NodeList temp=deletePos.link;
                temp=temp.link;
                deletePos.link=temp;
                break;
            }
            deletePos=deletePos.link;
        }
        size--;
    }
    public void insertAtPos(E value,int pos) {
        if(pos>size) {
            System.out.println("impossible");
            return;
        }
        if(pos==0) {
            insertAtFirst(value);
            return;
        }
        if(pos==size) {
            insertAtEnd(value);
            return;
        }
        NodeList ptr=start;
        NodeList nptr=new NodeList(value,null);
        for(int i=1;i<=size;i++) {
            if(i==pos) {
                
                NodeList temp=ptr.link;
                ptr.link=nptr;
                nptr.link=temp;
                break;
                
            }
            ptr=ptr.link;
            
        }
        size++;
       
    }
}

