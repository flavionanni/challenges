function sumTwoSmallestNumbers(numbers) { 
    let firstNumber = Math.min(...numbers);
    numbers.splice(numbers.indexOf(firstNumber), 1);

    let secondNumber = Math.min(...numbers);
    return firstNumber + secondNumber  
  }
