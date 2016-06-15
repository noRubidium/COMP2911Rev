import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListSet<E extends Comparable<E>> implements Set<E>{

	private ArrayList<E> array;
	
	public ArrayListSet(){
		this.array = new ArrayList<E>();
	}
	@Override
	public void addElement(E e) {
		if(!this.has(e)){
			this.array.add(e);
		}
	}

	@Override
	public void removeElement(E e) {
		if(this.has(e)){
			this.array.remove(e);
		}
	}

	@Override
	public boolean has(Object e) {
		return this.array.contains(e);
	}

	@Override
	public Set<E> union(Set<E> other) {
		ArrayListSet<E> r = new ArrayListSet<E>();
		for(E e: this){
			r.addElement(e);
		}
		for(E e: other){
			r.addElement(e);
		}
		return r;
	}

	@Override
	public Set<E> intersection(Set<E> other) {
		ArrayListSet<E> r = new ArrayListSet<E>();
		for(E e: this){
			if(other.has(e)){
				r.addElement(e);
			}
		}
		return r;
	}

	@Override
	public boolean equals(Object other) {
		if(other == null) return false;
		if(! (other instanceof Set)) return false;
		Set<?> s = (Set<?>) other;
		for(Object e: s){
			if(!this.has(e)) return false;
		}
		for(Object e: this){
			if(!s.has(e)) return false;
		}
		return true;
	}
	
	@Override
	public Iterator<E> iterator() {
		return this.array.iterator();
	}
	
	
	public static void main(String[] s){
		Set<String> string = new ArrayListSet<>();
		Set<String> integer = new ArrayListSet<>();
		string.addElement("a121");
		integer.addElement("12");
		System.out.println(integer.equals(string));
		
	}
	@Override
	public int compareTo(Set<E> external) {
		return this.getSmallest().compareTo(external.getSmallest());
	}
	@Override
	public E getSmallest() {
		return this.array.get(0);
	}

}
