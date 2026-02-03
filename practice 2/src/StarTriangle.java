public class StarTriangle {
    private int width;
    
   
    public StarTriangle(int width) {
        this.width = width;
    }
    
   
    @Override
    public String toString() {
        StringBuilder triangle = new StringBuilder();
        
        for (int i = 1; i <= width; i++) {
            for (int j = 0; j < i; j++) {
                triangle.append("[ ]");
            }
            if (i < width) {
                triangle.append("\n");
            }
        }
        
        return triangle.toString();
    }
}