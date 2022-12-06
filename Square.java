public class Square extends Polygon {
    int sides = 4;
    Square (int l){
        int[] side_length = new int[sides]; // defining and assigning the size of array.
        side_length[0]=l;
        side_length[1]=l;
        side_length[2]=l;
        side_length[3]=l;
    }
    @Override
    int perimeter(){
        int res;
        res=4*sides_length[0]; // all sides are of same length.
        return res;
    }    

    




    
}

