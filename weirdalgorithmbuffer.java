import java.io.*;
public class weirdalgorithmbuffer {
    public static void main(String[] args) throws IOException{
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        long n = Long.parseLong(r.readLine());
        while(n != 1){
            pw.print(n + " ");
            if(n % 2== 0){
                n /= 2;
            }
            else{
                n = 3 * n + 1;
			}
		}
		pw.println(n);
        pw.close();
	}
}