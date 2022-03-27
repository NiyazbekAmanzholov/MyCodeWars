package kyu7Arrays.task8;

//assertArrayEquals(new String[]{"codewars","picaniny","hubububo"},
//        Solution.dup(new String[]{"ccooddddddewwwaaaaarrrrsssss","piccaninny","hubbubbubboo"}));
//assertArrayEquals(new String[]{"abracadabra","alote","asese"},Solution.dup(new String[]{"abracadabra","allottee","assessee"}));
//assertArrayEquals(new String[]{"keles","kenes"},Solution.dup(new String[]{"kelless","keenness"}));

import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(dup(Solution.dup(new String[]{"ccooddddddewwwaaaaarrrrsssss", "piccaninny", "hubbubbubboo"}))));
    }

    public static String[] dup(String[] arr){
        for(int i = 0; i < arr.length; i++)
            arr[i] = arr[i].replaceAll("(.)\\1+", "$1");
        return arr;
    }
}

class Solution2 {
    public static String[] dup(String[] arr){
        return Arrays.stream(arr).map(x->x.replaceAll("(.)(?=\\1)","")).toArray(String[]::new);
    }
}

class Solution3 {
    public static String[] dup(String[] arr){
        for (int i = 0; i <arr.length; i++) {
            arr[i] = cut(arr[i]);
        }
        return arr;
    }
    public static String cut(String string){
        for (int j = 1; j < string.length() ; j++) {
            if(string.charAt(j) == string.charAt(j-1)){
                string = string.substring(0,j) + string.substring(j+1);
                j--;
            }
        }
        return string;
    }
}

