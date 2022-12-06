public  class Rectangle extends Polygon {
    int num_sides = 4;
    int[] side_length;
    Rectangle(int l, int w) {
        sides_length = new int[num_sides];
        sides_length[0] = l;
        sides_length[1] = w;
        sides_length[2] = l;
        sides_length[3] = w;
        
    }
    @Override
     int perimeter(){
        
        int res=2*(sides_length[0]+sides_length[1]);
        return res;
     }    
    


    
    }
    

