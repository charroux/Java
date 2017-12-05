package tp5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class PolyLigne implements Set<Point>{
	
	ArrayList<Point> points = new ArrayList<Point>();
	
	/**
	 * Adds the specified element to this set if it is not already present (optional operation).
	 */
	@Override
	public boolean add(Point e) {
		// si l'element e n'est pas déjà dans le tableau points
		if(points.contains(e) == false) {
			// on l'ajoute
			points.add(e);
			return true;
		}	
		return false;
	}

	@Override
	public boolean addAll(Collection c) {
		// boucle sur la collection de points
		// si un point de la collection n'est pas présent dans le tableau points
		// on l'ajoute au tableau point
		return points.addAll(c);
	}

	/**
	 * Removes all of the elements from this set (optional operation)
	 */
	@Override
	public void clear() {
		points.clear();
	}

	/**
	 * Returns true if this set contains the specified element.
	 */
	@Override
	public boolean contains(Object o) {
		return points.contains(o);
	}

	/**
	 * Returns true if this set contains all of the elements of the specified collection.
	 */
	@Override
	public boolean containsAll(Collection c) {
		
/*		Iterator<Object> iterator = c.iterator();
		while(iterator.hasNext()) {
			if(points.contains(iterator.next()) == false){
				return false;
			}			
		}
		return true;*/
		
		Object[] tabCollection = c.toArray();
		// Pour tous les éléments de la collection c
		// Vérifier s'ils sont tous présents dans l'ArrayList points
		for(int i=0; i<tabCollection.length; i++) {
			// Si, ne serait-ce, qu'un élément est absent on retourne false 
			if(points.contains(tabCollection[i]) == false){
				return false;
			}
		}		
		return true;
	}

	@Override
	public boolean isEmpty() {
		return points.isEmpty();
	}

	@Override
	public Iterator iterator() {
		return points.iterator();
	}

	@Override
	public boolean remove(Object o) {
		return points.remove(o);
	}

	@Override
	public boolean removeAll(Collection c) {
		return points.removeAll(c);
	}

	@Override
	public boolean retainAll(Collection c) {
		return points.retainAll(c);
	}

	@Override
	public int size() {
		return points.size();
	}

	@Override
	public Object[] toArray() {
		return points.toArray();
	}

	@Override
	public Object[] toArray(Object[] a) {
		return points.toArray(a);
	}

	@Override
	public String toString() {
		return "PolyLigne [points=" + points + "]";
	}


}
