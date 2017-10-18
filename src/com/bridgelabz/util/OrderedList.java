
package com.bridgelabz.util;
class NodeOrdered<T>{
    public T data;
    public NodeOrdered link;
    NodeOrdered() {
        //data=0;
        link=null;
    }
    NodeOrdered(T value,NodeOrdered link) {
        data=value;
        this.link=link;
    }
}
public class OrderedList<T> {
	 NodeOrdered start;
	 NodeOrdered end;
	    public int size;

	    public OrderedList() {
	        start=null;
	        size=0;
	    }
	    public boolean search(T value) {
	    	NodeOrdered traverse=start;
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
	    
	    public void insertAtFirst(T value) {
	        NodeOrdered reference=new NodeOrdered(value,null);
	        size++;
	        if(start==null) {
	            start=reference;
	            
	        }
	        else {
	            reference.link=start;
	            start=reference;
	        }
	        
	    }
	    public void display() {
	        System.out.println("Ordered linked list");
	       NodeOrdered nptr=start;
	        if(size==0) {
	            System.out.println("empty");
	            return;
	        }
	        if(start==null) {
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
	    public void insertAtEnd(T value) {
	       NodeOrdered nnptr=new NodeOrdered(value,null);
	        size++;
	        if(start==null) {
	            start=nnptr;
	            return;
	        }
	        else {
	            NodeOrdered travel=start;
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
	        NodeOrdered delete=start;
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
	        NodeOrdered deletePos=start;
	       
	        for (int j = 1; j <= size; j++) {
	            
	            if(j==pos) {
	                NodeOrdered temp=deletePos.link;
	                temp=temp.link;
	                deletePos.link=temp;
	                break;
	            }
	            deletePos=deletePos.link;
	        }
	        size--;
	    }
	    public void insertAtPos(T value,int pos) {
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
	        NodeOrdered reference=start;
	        NodeOrdered newReference=new NodeOrdered(value,null);
	        for(int i=1;i<=size;i++) {
	            if(i==pos) {
	                
	                NodeOrdered temp=reference.link;
	                reference.link=newReference;
	               newReference.link=temp;
	                break;
	                
	            }
	            reference=reference.link;
	            
	        }
	        size++;
	    }
	
	    
	    public  <T extends Comparable<T>> void bubbleSort() {
			T temp;
			NodeOrdered travel=start;
			for(int i=0;i<size;i++) {
				for(int j=i+1;j<size-1;j++) {
					while(travel.link!=null) {
					if(((Integer) travel.data).compareTo((Integer) travel.link.data)>0) {
						temp=(T) travel.data;
						travel.data=travel.link.data;
						travel.link.data=temp;
					}
					travel=travel.link;
					}
					travel=start;
				}
			}
		}
	    public boolean isEmpty() {
	    	if(start==null) {
	    		return true;
	    	}
	    	return false;
	    }
	    
	   
}
