class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> output_arr = new ArrayList();
        for(int i=1, fizz = 0, buzz =0; i<=n; i++) {
            fizz++;
            buzz++;
            if(fizz == 3 && buzz == 5) {
                fizz = 0;
                buzz = 0;
                output_arr.add("FizzBuzz");
            } else if(fizz == 3) {
                fizz = 0;
                    output_arr.add("Fizz");
            } else if(buzz == 5) {
                buzz = 0;
                output_arr.add("Buzz");
            } else {
                output_arr.add(Integer.toString(i));
            }
        }
        return output_arr;
    }
}