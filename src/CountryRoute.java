public class CountryRoute {
    static int[][] edge;
    static int[] charges;
    static int source;
    static int destination;
    int timeConstraint=14;
    CountryRoute(int[][] edge,int[] charges,int source,int destination){


    }

    public static void main(String[] args) {
        edge = new int[][]{{0, 1, 5}, {0, 3, 2}, {1, 2, 5}, {3, 4, 5}, {4, 5, 6}, {2, 5, 5}};
        charges = new int[]{10, 2, 3, 25, 25, 4};
        source=0;
        destination=0;
        new CountryRoute(edge,charges,source,destination);
    }
}
