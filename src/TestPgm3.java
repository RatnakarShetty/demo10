

public class TestPgm3 {

	public static void main(String[] args) {
		
		int r,c,m=7,n=4;
		
		for(r=1;r<=m;r++)
		{
			if(r<4)
			{
				for(c=1;c<=n;c++)
				{
					if(r==c)
						System.out.print("*");
					else if(r<c)
						System.out.print("**");
					else
						System.out.print(" ");
					
				}
			}
			
			for(c=1;c<=n;c++)
			{
				if(r+c==8)
					System.out.print("*");
				else if(r+c>8)
					System.out.print("**");
				else
					System.out.print(" ");
				
			}
			System.out.println();
		}

	}

}
