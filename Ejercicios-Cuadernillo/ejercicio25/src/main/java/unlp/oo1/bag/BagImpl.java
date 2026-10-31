package unlp.oo1.bag;

import java.util.AbstractCollection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.stream.Collectors;

public class BagImpl<T> extends AbstractCollection<T> implements Bag<T> {

    Map<T, Integer> elements;

    public BagImpl() {
        this.elements = new HashMap<>();
    }

    @Override
    public boolean add(T element) {
        if (elements.containsKey(element)){
        	elements.replace(element, elements.get(element)+1);
        } else {
        	elements.put(element,1);
        }
        return true;
    }

    @Override
    public int occurrencesOf(T element) {
        if (elements.containsKey(element)) {
        	return elements.get(element);
        }
        return 0;
    }

    @Override
    public void removeOccurrence(T element) {
        if (elements.containsKey(element)) {
        	int cardinalidadActual = elements.get(element);
        	if (cardinalidadActual > 1) {
        		elements.replace(element, cardinalidadActual - 1);
        	} else {
        		elements.remove(element);
        	}
        }
    }

    @Override
    public void removeAll(T element) {
    	if (elements.containsKey(element)) {
    		elements.remove(element);
    	}
    }

    @Override
    public int size() {
        return elements.values().stream().mapToInt(valor -> valor).sum();
    }
    
    public String toString() {
    	return elements.entrySet().stream()
    			.map(parValores -> parValores.getKey() + " - " + parValores.getValue())
    			.collect(Collectors.joining("\n"));
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private Iterator<Map.Entry<T, Integer>> entryIterator = elements.entrySet().iterator();
            private Map.Entry<T, Integer> currentEntry;
            private int remainingCount;

            @Override
            public boolean hasNext() {
                return remainingCount > 0 || entryIterator.hasNext();
            }

            @Override
            public T next() {
                if (remainingCount == 0) {
                    currentEntry = entryIterator.next();
                    remainingCount = currentEntry.getValue();
                }
                remainingCount--;
                return currentEntry.getKey();
            }

            @Override
            public void remove() {
                removeOccurrence(currentEntry.getKey());
            }
        };
    }
}
