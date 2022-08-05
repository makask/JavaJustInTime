
public class ThreeWeights {
	public static void main(String[] args) {
		int weight1 = Integer.parseInt(args[0]);
		int weight2 = Integer.parseInt(args[1]);
		int weight3 = Integer.parseInt(args[2]);
		
		/*1*/System.out.println(-weight1 + (-weight2) + (-weight3));
		/*2*/System.out.println(-weight1 + (-weight2) + 0);
		/*3*/System.out.println(-weight1 + (-weight2) + weight3);
		/*4*/System.out.println(-weight1 + 0 + (-weight3));
		/*5*/System.out.println(-weight1 + 0 + 0);
		/*6*/System.out.println(-weight1 + 0 + weight3);
		/*7*/System.out.println(-weight1 + weight2 + weight3);
		/*8*/System.out.println(-weight1 + weight2 + 0);
		/*9*/System.out.println(-weight1 + weight2 + weight3);
		/*10*/System.out.println(0 + (-weight2) + (-weight3));
		/*11*/System.out.println(0 + (-weight2) + 0);
		/*12*/System.out.println(0 + (-weight2) + weight3);
		/*13*/System.out.println(0 + 0 + (-weight3));
		/*14*/System.out.println(0 + 0 + 0);
		/*15*/System.out.println(0 + 0 + weight3);
		/*16*/System.out.println(0 + weight2 + (-weight3));
		/*17*/System.out.println(0 + weight2 + 0);
		/*18*/System.out.println(0 + weight2 + weight3);
		/*19*/System.out.println(weight1 + (-weight2) + (-weight3));
		/*20*/System.out.println(weight1 + (-weight2) + 0);
		/*21*/System.out.println(weight1 + (-weight2) + weight3);
		/*22*/System.out.println(weight1 + 0 + (-weight3));
		/*23*/System.out.println(weight1 + 0 + 0);
		/*24*/System.out.println(weight1 + 0 + weight3);
		/*25*/System.out.println(weight1 + weight2 + (-weight3));
		/*26*/System.out.println(weight1 + weight2 + 0);
		/*27*/System.out.println(weight1 + weight2 + weight3);
	}
}
