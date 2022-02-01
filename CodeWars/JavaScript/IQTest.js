function iqTest(numbers){
    let arrayNumbers=  numbers.split(" ")
    let before = arrayNumbers[1] % 2
    let after = arrayNumbers[2] % 2;

    for(let num of arrayNumbers) {
 
        result = num % 2
        if(arrayNumbers.indexOf(num) == 0) {
            if(result != after && result != before) {
                answer = arrayNumbers.indexOf(num) + 1;
            }else{
                after = num % 2;
            }
        }else if((result != after)) {
            answer = arrayNumbers.indexOf(num) + 1;
            
        }else {
            after = num % 2;
        }
    }
   return answer; 
}
