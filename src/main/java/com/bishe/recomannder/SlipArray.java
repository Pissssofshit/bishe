package com.bishe.recomannder;

import java.util.Arrays;

public class SlipArray
{
    public static void main(String[] args)
    {
        int [] data = {1,2,3,4,5,6,7,8,9};
        int [] newData;
        newData = Arrays.copyOfRange(data, 2, 7);
        for(int i:newData)
            System.out.print(i+" ");
    }
}