package sort;

/**
 * 선택 정렬 : 가장 작은 것을 선택해서 제일 앞으로 보낸다
 * O(n) = n ^ 2
 * 기초적인 알고리즘이나 연산 데이터가 증가 할수록 연산 속도가 급격하게 느려지는 단점이 있다.
 */
public class SelectionSort {
    /**
     * 문제
     * 다음의 숫자들을 오름차순으로 정렬하시오.
     * 1 10 5 8 7 6 4 3 2 9
     */

    public void Test () {
        int n = 10;
        int [] array = {1,10,5,8,7,6,4,3,2,9};

        for (int i = 0; i < n; i++) {
            int minIndex = i; // 가장 작은 원소의 인덱스
            for (int j = i + 1; j < n; j++) {
                if (array[minIndex] > array[j]) {
                    minIndex = j;

                }
            }
            // 스와프 (가장 앞에 있는 값과 가장 작은 값의 위치를 변경함)
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");

        }

    }

    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.Test();

        }

    }

