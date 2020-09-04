public class MaxMin {
    
    public float[] posMaxMin(java.util.List<Float> vals) {
        
        java.util.Iterator<Float> iter = vals.iterator();

        float min = Float.MAX_VALUE;
        float max = 0;

        while (iter.hasNext()) {
            float current = iter.next();
            if (current > 0) {
                if (current < min) min = current;
                if (current > max) max = current;
            }
        }
        
        return (max > 0 && min > 0) 
            ? new float[] {max, min} 
            : new float[] {0,0};

    }

    public static void main(String[] args) {
        MaxMin app = new MaxMin();

        java.util.List<Float> vals = new java.util.ArrayList<Float>();
        vals.add(0,(float)-1.0);
        vals.add(1,(float)-2.0);
        vals.add(2,(float)-3.0);
        vals.add(3,(float)-4.0);
        vals.add(4,(float)-5.0);

        System.out.println("Max: "+ app.posMaxMin(vals)[0]);
        System.out.println("Min: "+ app.posMaxMin(vals)[1]);
    }
}