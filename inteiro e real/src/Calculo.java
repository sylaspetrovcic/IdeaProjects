import static java.lang.Math.pow;

public class Calculo {
    int x,y;
    double z;

      float itemA(){
          float calculoA = (float)(2 * x) * (y/2);
       return calculoA;
    }
    double itemB(){

        float calculoB = (float) (3 * x + z);
        return calculoB;
    }
    double itemC(){
        double calculoZ = pow(z,3);
        return calculoZ;
    }


}
