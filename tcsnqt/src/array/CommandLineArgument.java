package array;

public class CommandLineArgument {

	public static void main(String[] args) {
		/*
		 * How to provide command line argument: 1.click on the program 2.run as=>run as
		 * confuguration 3.select Argument option in the toplist 4.give the command line
		 * arguments.
		 */
		                                     
		for(int i=0;i<args.length;i++)
		{
			System.out.println(args[i]);
		}
         System.out.println(args[4]);

	}

}
