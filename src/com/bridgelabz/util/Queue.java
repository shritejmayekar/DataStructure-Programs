package com.bridgelabz.util;

/**
 *compile javac -d . TestQueue.java
* run  java com/que/TestQueue

 * @author Shritesh
 */

/**
*	NodeQueue Class to create the object reference 
*/
class NodeQueue<E> {
    E data;
    NodeQueue link;
    NodeQueue() {
        //data=0;
        link=null;
    }
    NodeQueue(E value,NodeQueue l) {
        data=value;
        link=l;
    }
}
/**
*	Generic type Queue  
*/
public class Queue<E> {
    NodeQueue front,rear;
    public int size;
    public Queue() {
        front=rear=null;
        size=0;
    }
  	/* Insertion of element in Queue*/
    public void Enqueue(E value) {
        NodeQueue<E> reference=new NodeQueue<E>(value,null);
         size++;
        if(front==null) {
            front=reference;
            return;
        }
        else {
            NodeQueue travel=front;
            //travel=travel.link;
            while(travel.link!=null) {
                travel=travel.link;
            }
            
            travel.link=reference;
        }
    }
    /* Display elements of Queue */
    public void display() {
        System.out.println("queue display");
        NodeQueue nptr=front;
        if(size==0) {
            System.out.println("empty");
            return;
        }
        if(front.link==null) {
            System.out.print(front.data+" \n");
            return;
        }
        System.out.print(front.data+" <- ");
        nptr=nptr.link;
        while(nptr.link!=null) {
            System.out.print(nptr.data+" <- ");
            nptr=nptr.link;
        }
        System.out.print(nptr.data+" \n");
        
    }
    /* Remove elements from the Queue */
    public void Dequee() {
	if(front==null) {
		System.out.println("queue is empty");
		return;
	}
        front=front.link;
        size--;
    }
    
}
