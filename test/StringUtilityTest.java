import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class StringUtilityTest {

    @Test
    public void test(){
        //given
        MergeSort mergeSort = new MergeSort();

        //when
        int[] list = {2, 56, 23, 4, 6};
        mergeSort.mergeSort(list, 5);

        //then
        Arrays.stream(list).forEach(value -> System.out.print(value + ", "));
    }
}
