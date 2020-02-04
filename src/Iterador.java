import java.util.Iterator;

public class Iterador<T> implements Iterator{
	Nodo<T> current;
	public Iterador(Nodo<T> head) {
		current = head;
	}
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return current.getSiguiente()!=null;
	}

	@Override
	public Object next() {
		if(!hasNext()) {
			return null;
		}
		Object res = current.getSiguiente().getElem();
		current = current.getSiguiente();
		// TODO Auto-generated method stub
		return res;
	}
	
}
