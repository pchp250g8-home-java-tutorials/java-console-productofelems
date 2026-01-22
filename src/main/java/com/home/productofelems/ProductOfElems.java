/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.home.productofelems;
import java.io.*;
import java.util.*;
/**
 *
 * @author PC
 */
public class ProductOfElems 
{

    public static void main(String[] args) throws Exception
    {
        System.out.println("Input a count of elements in array");
        var bufStdIn = new BufferedReader(new InputStreamReader(System.in));
        var nElems = Integer.parseInt(bufStdIn.readLine());
        var iArray = new short[nElems];
        var nProduct = 1L;
        var oRnd = new Random();
        for(int i = 0; i < nElems; i++)
        {
            var nItem = (short)oRnd.nextInt(1, 10);
            iArray[i] = nItem;
        }
        System.out.println("Inputed array:");
        for(int i=0; i < nElems; i++)
        {
            nProduct *= iArray[i];
            System.out.print(iArray[i] + " ");
        }
        System.out.printf
        (
           "\r\nThe Product of %d elements of the array is:%d", 
           nElems, nProduct
        );
    }
}
