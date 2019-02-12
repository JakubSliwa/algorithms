class RaindropConverter {

    String convert(int number) {
        int[] factors = new int[number + 1];
        String result = "";

        for (int i = 1; i <= number; ++i) {
            if (number % i == 0) {
                factors[i] = i;
            }
        }

        for (int i = 0; i < factors.length; i++) {
            result = setResult(factors, result);
        }

        if (result.equals("")) {
            return String.valueOf(number);
        } else {
            return result;
        }
    }

    private String setResult(int[] factors, String result) {
        if (isPling(factors, result)) {
            result = "Pling";
        } else if (isPlang(factors, result)) {
            result = result + "Plang";
        } else if (isPlong(factors, result)) {
            result = result + "Plong";
        }

        return result;

    }

    private boolean isPlong(int[] factors, String result) {
        return inArray(factors, 7) && !result.endsWith("Plong");
    }

    private boolean isPlang(int[] factors, String result) {
        return inArray(factors, 5) && !result.endsWith("Plang");
    }

    private boolean isPling(int[] factors, String result) {
        return inArray(factors, 3) && !result.startsWith("Pling");
    }


    private boolean inArray(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                removeElement(array, i);
                return true;
            }
        }
        return false;
    }

    private void removeElement(int[] arr, int removedIdx) {
        System.arraycopy(arr, removedIdx + 1, arr, removedIdx, arr.length - 1 - removedIdx);
    }


}
