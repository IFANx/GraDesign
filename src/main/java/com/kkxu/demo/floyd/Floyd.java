package com.kkxu.demo.floyd;

public class Floyd extends allsort {
    static int[] pathp = new int[20];
    static int[] distant = new int[5000];

    {
        for (int k = 0; k < 720; k++)
            distant[k] = 0;
    }

    static int a = Integer.MAX_VALUE;
    static int[][] C = {
            {0, a, 1, a, 2, 6},
            {a, 0, 5, a, 4, a},
            {1, 5, 0, 5, a, a},
            {a, a, 5, 0, 2, 2},
            {2, 4, a, 2, 0, 3},
            {6, a, a, 2, 3, 0}
    };
    //				int [][]C={{0,a,1,a,20,15,a,4,1,45,12},
//					{a,0,5,a,4,a,a,33,2,a,34},
//					{1,5,0,50,a,a,33,1,a,a,5},
//					{a,a,50,0,2,10,a,5,5,4,1},
//					{20,4,a,2,0,60,1,a,4,5,66},
//					{a,0,5,11,4,0,a,33,2,a,34},
//					{1,3,5,a,4,a,0,33,2,a,34},
//					{a,6,5,a,4,a,a,0,2,a,34},
//					{12,8,5,1,4,23,a,33,0,a,34},
//					{a,a,5,33,4,1,a,33,2,0,34},
//					{15,a,a,10,60,0,a,12,a,11,0}};
    static int n = C.length;
    static int[][] dis = floyd(C, n);

    {

    }

    static int p = 0, k = 0;

    //打印路径
    public static void printpath(int path[][], int a, int b, int diss[]) {
        pathp[p++] = a;
        if (path[a][b] != -1) {
            distant[k] = distant[k] + dis[path[a][b]][b];
            printpath(path, path[a][b], b, distant);
        } else
            distant[k] = dis[a][b] + distant[k];
    }


    //形成floyd矩阵，点到点之间的最短路径长度
    public static int[][] path;

    public static int[][] floyd(int[][] C, int n) {
        path = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                path[i][j] = -1;
            }
        }
        for (int k = n-1; k >=0; k--) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (C[i][k] != Integer.MAX_VALUE && C[k][j] != Integer.MAX_VALUE && C[i][k] + C[k][j] < C[i][j]) {
                        C[i][j] = C[i][k] + C[k][j];//构建两两节点之间的最短距离矩阵
                        path[i][j] = k;//构建path矩阵
                    }
                }
            }
        }
        return C;
    }


    //展示从起始节点到终端节点的路径
    static void form_path(int res[][], int length, int width) {
        int shortest = 0;
        int[] shortestpath = new int[100];
        int j;
        int i;

        for (i = 0; i < width; i++) {
            for (j = 0; j < 20; j++) {
                pathp[j] = -1;
            }


            //形成最短路径长度矩阵
            //int n=C.length;
            //	int[][] route=floyd(C,n);
            for (j = 0; j < length - 1; j++) {
                //形成路径
                printpath(path, res[i][j], res[i][j + 1], distant);
            }
            pathp[p++] = res[i][j];
            p = 0;
            int d = 0;
            for (int i1 = 0; i1 < pathp.length; i1++) {
                if (pathp[i1] != -1)
                    System.out.print(pathp[i1] + "  ");
            }
            System.out.print(" 此序列最短路径长度为：" + distant[k]);
            k++;
            System.out.println();
//			for(int j1=0;j1<pathp.length;j1++)
//				if(pathp[j1]!=-1)
//				System.out.print(pathp[j1]+"->");
        }
    }


    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int a = Integer.MAX_VALUE;
        int[][] C = {
                {0, a, 1, a, 20, 15},
                {a, 0, 5, a, 4, a},
                {1, 5, 0, 50, a, a},
                {a, a, 50, 0, 2, 10},
                {20, 4, a, 2, 0, 60},
                {15, a, a, 10, 60, 0}
        };
//		int [][]C={{0,a,1,a,20,15,a,4,1,45,12},
//			{a,0,5,a,4,a,a,33,2,a,34},
//			{1,5,0,50,a,a,33,1,a,a,5},
//			{a,a,50,0,2,10,a,5,5,4,1},
//			{20,4,a,2,0,60,1,a,4,5,66},
//			{a,0,5,11,4,0,a,33,2,a,34},
//			{1,3,5,a,4,a,0,33,2,a,34},
//			{a,6,5,a,4,a,a,0,2,a,34},
//			{12,8,5,1,4,23,a,33,0,a,34},
//			{a,a,5,33,4,1,a,33,2,0,34},
//			{15,a,a,10,60,0,a,12,a,11,0}};
        int n = C.length;
        int[][] route = floyd(C, n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) continue;
                else if (route[i][j] == a)
                    System.out.println(i + "到" + j + "之间没路径");
                else
                    System.out.println(i + "到" + j + "之间的最短路径长度为：" + route[i][j]);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(route[i][j]+"-");
            }
            System.out.println();
        }

        //打印path数组
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(path[i][j] + " ");
                if (j == n - 1)
                    System.out.println();
            }
        }


        for (int j = 0; j < 20; j++) {
            pathp[j] = -1;
        }



        int num[] = {0, 1, 2, 3, 4, 5};
        int length = num.length;
        int width = allsort.jiecheng(length);
        int[][] res = form_array(width, length, num);
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print(res[i][j] + "->");
            }
            System.out.println();
        }
        //res[][]是全排列产生的序列组，每次便利每一行，产生一个从起始点到结尾点的路径
        form_path(res, length, width);

        int s=100;
        for(int l=0;l<jiecheng(n);l++){
            if(s>distant[l])
                s=distant[l];
        }
        System.out.println("此经过此指定节点集合最短路径长度为"+s);
    }


}
