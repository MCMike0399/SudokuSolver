
public class Conjunto<T> {
	Nodo<T> head;
	Iterador iterator;
	public Conjunto() {
		head = new Nodo<T>(null);
	}
	public Conjunto(T elem) {
		head = new Nodo<T>(elem);
	}
	public boolean contains(T elem) {
		Nodo<T> aux = head;
		while(aux.getSiguiente()!=null) {
			if(aux.getSiguiente().getElem().equals(elem)) {
				return true;
			}
			aux = aux.getSiguiente();
		}
		return false;
	}
	public boolean add(T elem) {
		Nodo<T> aux = head;
		if(contains(elem)) {
			return false;
		}
		while(aux.getSiguiente()!=null) {
			aux = aux.getSiguiente();
		}
		aux.setSiguiente(new Nodo<T>(elem));
		return true;
	}
	public void remove(T elem) {
		Nodo<T> aux = head;
		while(aux.getSiguiente()!=null) {
			if(aux.getSiguiente().getElem().equals(elem)) {
				if(aux.getSiguiente().getSiguiente()!=null) {
					aux.setSiguiente(aux.getSiguiente().getSiguiente());
					return;
				}
				else {
					aux.setSiguiente(null);
					return;
				}
			}
			aux = aux.getSiguiente();
		}
	}
	public String toString() {
        StringBuilder sb = new StringBuilder();
        Nodo<T> aux = head;
        sb.append("Conjunto: ");
        while(aux.getSiguiente()!=null) {
            sb.append(aux.getSiguiente().getElem() + " ");
            aux = aux.getSiguiente();
        }
        return sb.toString();
    }
	public Conjunto<T> interseccion(Conjunto c1, Conjunto c2) {
		Conjunto resp = new Conjunto();
        Nodo aux = c1.head;
        while (aux.getSiguiente() != null) {
            if (c2.contains(aux.getSiguiente().getElem())) {
                resp.add(aux.getSiguiente().getElem());
            }
            aux = aux.getSiguiente();
        }
        return resp;
	}
	public Iterador iterator() {
		Iterador iterator = new Iterador(head);
		this.iterator = iterator;
		return iterator;
	}
	public static void main(String[] args) {
		Conjunto<Integer> c1 = new Conjunto<Integer>();
		c1.add(1);
		c1.add(2);
		c1.add(3);
		c1.add(3);
		c1.iterator();
		Iterador it = c1.iterator;
		
	}
}
