package dsa01_Warmup;

public class W07_AreaPerimeter {
    
    public static double[] areaAndPerimeter(String shape, double[] dims) {
        double area;
        
        if(shape.equalsIgnoreCase("rectangle"))
        {
            return new double[]{Math.round((dims[0]*dims[1])*100.0)/100.0,Math.round((2*(dims[0]+dims[1]))*100.0)/100.0};
        }
        else if(shape.equalsIgnoreCase("square"))
        {
            return new double[]{Math.round((dims[0]*dims[0])*100.0)/100.0,Math.round((4*dims[0])*100.0)/100.0};
        }
        else if(shape.equalsIgnoreCase("circle"))
        {
            
            return new double[]{Math.round((3.14159*dims[0]*dims[0])*100.0)/100.0,Math.round((2*3.14159*dims[0])*100.0)/100.0};
        }
        else if(shape.equalsIgnoreCase("triangle"))
        {
            if(dims[0]+dims[1]>dims[2] && dims[0]+dims[2]>dims[1] && dims[1]+dims[2]>dims[0])
            {
        
            double s;
            s=(dims[0]+dims[1]+dims[2])/2;
            area=Math.sqrt((s*(s-dims[0])*(s-dims[1])*(s-dims[2])));
            return new double[]{Math.round((area)*100.0)/100.0,Math.round((dims[0]+dims[1]+dims[2])*100.0)/100.0};
            }
            else
            {
                throw new IllegalArgumentException("Not a valid triangle");
            }
        }
        else
        {
            throw new IllegalArgumentException("This shape is not supported");
        }
    }


        public static void main(String args[]){
            String shape="triangle";
            double[] dims={3,4,5};

            double[] result=areaAndPerimeter(shape,dims);
            for(double m:result)
            {
                System.out.println(m);
            }
        }
    }

    

