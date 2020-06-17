package collectionPackage;

import java.awt.Color;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

enum color{
	RED(255, 0, 0), GREEN(0, 255, 0), BLUE(0, 0, 255);
    private int r;
    private int g;
    private int b;
    private color(final int r, final int g, final int b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }
        public int getR() {
            return r;
        }

        public int getG() {
            return g;
        }

        public int getB() {
            return b;
        }
   }

public class EnumSet implements Set<Color> {
	
	public static void drawLine(final Set<Color> colors) {
        System.out.println("Requested Colors to draw lines : " + colors);
        for (final Color c : colors) {
            System.out.println("drawing line in color : " + c);
        }

	}

	public static void main(String[] args) {
		
              final EnumSet yellow = EnumSet.of(Color.RED,Color.GREEN);
              drawLine(yellow);
              final EnumSet white = EnumSet.of(Color.RED, Color.GREEN, Color.BLUE);
              drawLine(white);
        
              // RED + BLUE = PINK
              final EnumSet pink = EnumSet.of(Color.RED, Color.BLUE);
              drawLine(pink);
              
              
	}

	private static EnumSet of(Color red, Color green, Color blue) {
		// TODO Auto-generated method stub
		return null;
	}

	private static EnumSet of(Color red, Color green) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(Color arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection<? extends Color> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean contains(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator<Color> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(T[] arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
