

public interface Set<E extends Comparable<E>> extends Iterable<E>, Comparable<Set<E >> {
	public void addElement(E e);
	
	/**
	 * @precondition this.has(e)
	 * @param e
	 */
	public void removeElement(E e);
	
	/**
	 * @postcondition @return == 
	 * @param e
	 * @return
	 */
	public boolean has(Object e);
	
	public Set<E> union(Set<E> other);
	
	public Set<E> intersection(Set<E> other);
	
	public boolean equals(Object o);

	public E getSmallest();
}
