
public class Nodo<T> {
	private T elem;
	private Nodo<T> siguiente;
	public Nodo(T elem) {
		this.elem = elem;
		siguiente = null;
	}
	public Nodo<T> getSiguiente() {
		return this.siguiente;
	}
	public void setSiguiente(Nodo<T> nodo) {
		siguiente = nodo;
	}
	public T getElem() {
		return this.elem;
	}
}
