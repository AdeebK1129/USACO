import java.io.*;
import java.util.*;
public class missingnumber {
    public static void main(String[] args) throws IOException {
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    StringTokenizer st = new StringTokenizer(r.readLine());
    long n = Long.parseLong(st.nextToken());
    long sum = ((n*(n+1)) / 2);
    long missing = 0;
    st = new StringTokenizer(r.readLine());
    for(int i = 0; i < n-1; i++){
        missing += Long.parseLong(st.nextToken());
    }
    pw.print(sum - missing);
      

    r.close();
    pw.close();
    }
}
