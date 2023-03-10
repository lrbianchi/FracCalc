package fracCalc;

public class Number {
    int w;
    int n;
    int d;
    public void parse(String s) {
        int underscore = s.indexOf("_");
        if(underscore == -1) {
            w = Integer.parseInt(s);
            d = 1;
            n = 0;
        }
        else {
            w = Integer.parseInt(s.substring(0,underscore));
            int slash = s.indexOf("/");
            n = Integer.parseInt(s.substring(underscore + 1, slash));
            d = Integer.parseInt(s.substring(slash + 1, s.length()));
        }
    }
    public void print() {
        System.out.println(Integer.toString(w) + "_" + Integer.toString(n) + "/" + Integer.toString(d));
    }
    public double value() {
        return (double)w + ((double)n)/((double)d);
    }
}