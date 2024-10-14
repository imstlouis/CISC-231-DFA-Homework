public class Problem1 {
    public static void main(String[] args){
        // int j doesn't work because it's not being initialized. we can fix it by adding an equal signs and the value we want which is 1
        int j = 1;
        int i = 1;
        // float f1 = 0.1; // f1 is not an int, but a double. We can fix it by changing float into double
        double f1 = 0.1; float f2 = 123;
        long l1 = 12345678, l2 = 88888888;
        double d1 = 2e20, d2 = 124;
        // byte b1 = 1, b2 = 2, b3 = 129; Doesn't work because the provided type for b3 is an int not a byte. We could fix this by doing this:
        byte b1 = 1, b2 = 2, b3 = (byte) 129; //Casted b3 value as a byte
        j = j + 10;
        i = i / 10;
        // i = i * 0.1; Doesn't work because the value required is a double, not an int. We could fix this by doing this
        i = (int) (i * 0.1);
        char c1 = 'a', c2 = 125;
        //byte b = b1 - b2; Doesn't work because the value required is a byte, not an int. We could fix this by doing this
        byte b = (byte) (b1 - b2);
        // char c = c1 + c2 -1; Doesn't work because the value required is a char, not an int. We could fix this by doing this
        char c = (char) (c1 + c2 -1);
        // float f3 = f1 + f2; Doesn't work because the value required is a float, not a double. We could fix this by doing this
        float f3 = (float) (f1 + f2);
        // float f4 = f1 + f2 * 0.1; Doesn't work because the value required is a float, not a double. We could fix this by doing this
        float f4 = (float) (f1 + f2 * 0.1);
        double d = d1 + i + j;
        float f = (float)(d1 * 5 + d2);
    }
}
