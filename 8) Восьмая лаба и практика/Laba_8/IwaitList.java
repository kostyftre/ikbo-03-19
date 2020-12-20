package Ja;
import java.util.Collection;
public interface IwaitList <E> {

void add(E element);
E remove();
boolean contains( E element);
boolean containsAll(Collection <E> c);
boolean isEmpty();

}
