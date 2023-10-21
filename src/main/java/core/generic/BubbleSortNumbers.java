package core.generic;

public class BubbleSortNumbers<T> {
    <T extends Number> T[] sortArray(T[] arrayToSort) {
        //A bubble sort algorithm. Will constantly set sorted between true and false until no more changes need to be made.
        boolean sorted = false;
        while (!sorted)
        {
            sorted = true;
            for(int i = 0; i < arrayToSort.length-1; i++)
            {
                //If the selected word is longer than the next one
                if (arrayToSort[i].longValue() > arrayToSort[i+1].longValue())
                {
                    //Save the selected string temporarily
                    T temp = arrayToSort[i];
                    //Move the next string back by one
                    arrayToSort[i] =  arrayToSort[i+1];
                    //replace the next string with the selected string
                    arrayToSort[i+1] = temp;
                    //Change has been made so the list is not yet sorted
                    sorted = false;
                }
            }
        }
        return arrayToSort;
    }
}
