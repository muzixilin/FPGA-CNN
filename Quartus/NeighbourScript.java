import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int size = 16;
		for(int i=1;i<size^2;i++) {
			// four corners
			if(i==1) {
				System.out.println(
				  "\n    U1 <= `WIDTH'b0;"
				+ "\n    U2 <= `WIDTH'b0;" + "\n    U3 <= `WIDTH'b0;"
				+ "\n    U4 <= `WIDTH'b0;" + "\n    U5 <= U"+(i)+"_in;"
				+ "\n    U6 <= U"+(i+1)+"_in;" + "\n    U7 <= `WIDTH'b0;"
				+ "\n    U8 <= U"+(i+size)+"_in;" + "\n    U9 <= U"+(i+size+1)+"_in;\n"
				
				+ "\n    Y1 <= {(2 * `WIDTH){1'b0}};"
				+ "\n    Y2 <= {(2 * `WIDTH){1'b0}};" + "\n    Y3 <= {(2 * `WIDTH){1'b0}};"
				+ "\n    Y4 <= {(2 * `WIDTH){1'b0}}" + "\n    Y5 <= Y"+(i)+"_in;"
				+ "\n    Y6 <= Y"+(i+1)+"_in;" + "\n    Y7 <= {(2 * `WIDTH){1'b0}};"
				+ "\n    Y8 <= Y"+(i+size)+"_in;" + "\n    Y9 <= Y"+(i+size+1)+"_in");				
				}				
			} else if(i==size) {
				System.out.println(
				  "\n    U1 <= `WIDTH'b0;"
				+ "\n    U2 <= `WIDTH'b0;" + "\n    U3 <= `WIDTH'b0;"
				+ "\n    U4 <= U"+(i-1)+"_in;" + "\n    U5 <= U"+(i)+"_in;"
				+ "\n    U6 <= `WIDTH'b0;" + "\n    U7 <= U"+(i+size-1)+"_in;"
				+ "\n    U8 <= U"+(i+size)+"_in;" + "\n    U9 <= `WIDTH'b0;\n"
				
				+ "\n    Y1 <= {(2 * `WIDTH){1'b0}};"
				+ "\n    Y2 <= {(2 * `WIDTH){1'b0}};" + "\n    Y3 <= {(2 * `WIDTH){1'b0}};"
				+ "\n    Y4 <= Y"+(i-1)+"_in;" + "\n    Y5 <= Y"+(i)+"_in;"
				+ "\n    Y6 <= {(2 * `WIDTH){1'b0}};" + "\n    Y7 <= Y"+(i+size-1)+"_in;"
				+ "\n    Y8 <= Y"+(i+size)+"_in;" + "\n    Y9 <= {(2 * `WIDTH){1'b0}}");				
			} else if(i==size*(size-1)+1) {
				System.out.println(
				  "\n    U1 <= `WIDTH'b0;"
				+ "\n    U2 <= U"+(i-size)+"_in;" + "\n    U3 <= U"+(i-size+1)+"_in;"
				+ "\n    U4 <= `WIDTH'b0;" + "\n    U5 <= U"+(i)+"_in;"
				+ "\n    U6 <= U"+(i+1)+"_in;" + "\n    U7 <= `WIDTH'b0;"
				+ "\n    U8 <= `WIDTH'b0;" + "\n    U9 <= `WIDTH'b0;\n"
				
				+ "\n    Y1 <= {(2 * `WIDTH){1'b0}};"
				+ "\n    Y2 <= Y"+(i-size)+"_in;" + "\n    Y3 <= Y"+(i-size+1)+"_in;"
				+ "\n    Y4 <= {(2 * `WIDTH){1'b0}};" + "\n    Y5 <= Y"+(i)+"_in;"
				+ "\n    Y6 <= Y"+(i+1)+"_in;" + "\n    Y7 <= {(2 * `WIDTH){1'b0}};"
				+ "\n    Y8 <= {(2 * `WIDTH){1'b0}};" + "\n    Y9 <= {(2 * `WIDTH){1'b0}};\n");				
			}else if(i==size*size) {
				System.out.println(
				  "\n    U1 <= U"+(i-size-1)+"_in;"
				+ "\n    U2 <= U"+(i-size)+"_in;" + "\n    U3 <= `WIDTH'b0;"
				+ "\n    U4 <= U"+(i-1)+"_in;" + "\n    U5 <= U"+(i)+"_in;"
				+ "\n    U6 <= `WIDTH'b0;" + "\n    U7 <= `WIDTH'b0;"
				+ "\n    U8 <= `WIDTH'b0;" + "\n    U9 <= `WIDTH'b0;\n"
				
				+ "\n    Y1 <= Y"+(i-size-1)+"_in;"
				+ "\n    Y2 <= Y"+(i-size)+"_in;" + "\n    Y3 <= {(2 * `WIDTH){1'b0}};"
				+ "\n    Y4 <= Y"+(i-1)+"_in;" + "\n    Y5 <= Y"+(i)+"_in;"
				+ "\n    Y6 <= {(2 * `WIDTH){1'b0}};" + "\n    Y7 <= {(2 * `WIDTH){1'b0}};"
				+ "\n    Y8 <= {(2 * `WIDTH){1'b0}};" + "\n    Y9 <= {(2 * `WIDTH){1'b0}};\n");				
			} else if(i>=2&i<=size-1) {
				
			} else if(i>=size*(size-1)+2&i<=size*size-1) {
				
			} else if() {
				
			} else if() {
				
			} else if(i<=size) {
				System.out.println("\n    Y"+(i-1)+"_next <= onebyoneout;\n"
				+ "\n    U1 <= U"+(i-17)+"_in;"
				+ "\n    U2 <= U"+(i-16)+"_in;" + "\n    U3 <= U"+(i-15)+"_in;"
				+ "\n    U4 <= U"+(i-1)+"_in;" + "\n    U5 <= U"+(i)+"_in;"
				+ "\n    U6 <= U"+(i+1)+"_in;" + "\n    U7 <= U"+(i+15)+"_in;"
				+ "\n    U8 <= U"+(i+16)+"_in;" + "\n    U9 <= U"+(i+17)+"_in;\n"
				
				+ "\n    Y1 <= Y"+(i-17)+"_in;"
				+ "\n    Y2 <= Y"+(i-16)+"_in;" + "\n    Y3 <= Y"+(i-15)+"_in;"
				+ "\n    Y4 <= Y"+(i-1)+"_in;" + "\n    Y5 <= Y"+(i)+"_in;"
				+ "\n    Y6 <= Y"+(i+1)+"_in;" + "\n    Y7 <= Y"+(i+15)+"_in;"
				+ "\n    Y8 <= Y"+(i+16)+"_in;" + "\n    Y9 <= Y"+(i+17)+"_in;\n");				
			}
			System.out.println("\n    Y"+(i-1)+"_next <= onebyoneout;\n"
			+ "\n    U1 <= U"+(i-17)+"_in;"
			+ "\n    U2 <= U"+(i-16)+"_in;" + "\n    U3 <= U"+(i-15)+"_in;"
			+ "\n    U4 <= U"+(i-1)+"_in;" + "\n    U5 <= U"+(i)+"_in;"
			+ "\n    U6 <= U"+(i+1)+"_in;" + "\n    U7 <= U"+(i+15)+"_in;"
			+ "\n    U8 <= U"+(i+16)+"_in;" + "\n    U9 <= U"+(i+17)+"_in;\n"
			
			+ "\n    Y1 <= Y"+(i-17)+"_in;"
			+ "\n    Y2 <= Y"+(i-16)+"_in;" + "\n    Y3 <= Y"+(i-15)+"_in;"
			+ "\n    Y4 <= Y"+(i-1)+"_in;" + "\n    Y5 <= Y"+(i)+"_in;"
			+ "\n    Y6 <= Y"+(i+1)+"_in;" + "\n    Y7 <= Y"+(i+15)+"_in;"
			+ "\n    Y8 <= Y"+(i+16)+"_in;" + "\n    Y9 <= Y"+(i+17)+"_in;\n");
		}
	}
}