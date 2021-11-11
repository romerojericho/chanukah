import java.io.*;
import java.util.*;

public class chanukah {
	public static void main(String[] args) throws Exception {

        BufferedReader In = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter Out = new BufferedWriter(new OutputStreamWriter(System.out));

        int cases = Integer.parseInt(In.readLine());
        while (cases-- > 0) {
            String[] tokens = In.readLine().split(" ");
            int n = Integer.parseInt(tokens[1]);
            Out.write(tokens[0] + " " + (n * (n + 1) / 2 + n) + "\n");
    }

        Out.close();
        In.close();
    }
}