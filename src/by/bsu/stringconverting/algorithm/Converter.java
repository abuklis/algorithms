package by.bsu.stringconverting.algorithm;

/**
 * Created by anyab on 25.02.2017.
 */
public class Converter {

    static int findMin(int x, int y, int z)
    {
        return Math.min(x, Math.min(y, z));
    }

    public static int editDist(String str1, String str2, int firstStringLength, int secondStringLength)
    {
        if (firstStringLength == 0) return secondStringLength;

        if (secondStringLength == 0) return firstStringLength;

        if (str1.charAt(firstStringLength-1) == str2.charAt(secondStringLength-1))
            return editDist(str1, str2, firstStringLength-1, secondStringLength-1);

        return 1 + findMin( editDist(str1,  str2, firstStringLength, secondStringLength-1),
                editDist(str1,  str2, firstStringLength-1, secondStringLength),
                editDist(str1,  str2, firstStringLength-1, secondStringLength-1)
        );
    }
}
