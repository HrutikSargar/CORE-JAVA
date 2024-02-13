package Arrays.TwoDArray;

public class PRoblem2DArray {
    public static void main(String[] args) {

        String [][] data=new String[4][2];
        data[0][0]="Adesh";
        data[0][1]="Tester";

        data[1][0]="Saurabh";
        data[1][1]="Dev";

        data[2][0]="Tushar";
        data[2][1]="Hr";

        data[3][0]="Sandesh";
        data[3][1]="TL";

        System.out.println("EmpName"+"\t\t"+"Designation");
        System.out.println();
        for (int a=0;a< data.length;a++){
            for (int b=0;b<data[a].length;b++){
                System.out.print(data[a][b]+ "\t\t");
            }
            System.out.println("");
        }


    }
}
